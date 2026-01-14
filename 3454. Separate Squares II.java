class Solution {
    static class Event {
        long y;
        int delta;     // +1 add, -1 remove
        int l, r;      // indices in compressed xs, on elementary intervals [l, r)
        Event(long y, int delta, int l, int r) {
            this.y = y;
            this.delta = delta;
            this.l = l;
            this.r = r;
        }
    }

    static class SegTree {
        long[] xs;       // compressed coordinates
        int n;           // number of elementary intervals = xs.length - 1
        int[] cnt;
        double[] len;    // covered length on this node

        SegTree(long[] xs) {
            this.xs = xs;
            this.n = xs.length - 1;
            this.cnt = new int[n * 4];
            this.len = new double[n * 4];
        }

        double coveredLen() {
            return len[1];
        }

        void update(int ql, int qr, int delta) {
            update(1, 0, n, ql, qr, delta);
        }

        private void update(int idx, int l, int r, int ql, int qr, int delta) {
            if (ql >= r || qr <= l) return;
            if (ql <= l && r <= qr) {
                cnt[idx] += delta;
                pushUp(idx, l, r);
                return;
            }
            int mid = (l + r) >>> 1;
            update(idx << 1, l, mid, ql, qr, delta);
            update(idx << 1 | 1, mid, r, ql, qr, delta);
            pushUp(idx, l, r);
        }

        private void pushUp(int idx, int l, int r) {
            if (cnt[idx] > 0) {
                len[idx] = (double) (xs[r] - xs[l]);
            } else if (r - l == 1) {
                len[idx] = 0.0;
            } else {
                len[idx] = len[idx << 1] + len[idx << 1 | 1];
            }
        }
    }

    public double separateSquares(int[][] squares) {
        int m = squares.length;
        if (m == 0) return 0.0;

        // 1) Collect x coordinates
        long[] x0 = new long[m];
        long[] x1 = new long[m];
        long[] y0 = new long[m];
        long[] y1 = new long[m];

        long[] allX = new long[m * 2];
        for (int i = 0; i < m; i++) {
            long x = squares[i][0];
            long y = squares[i][1];
            long L = squares[i][2];
            x0[i] = x;
            x1[i] = x + L;
            y0[i] = y;
            y1[i] = y + L;
            allX[i * 2] = x0[i];
            allX[i * 2 + 1] = x1[i];
        }

        Arrays.sort(allX);
        long[] xs = unique(allX);
        if (xs.length <= 1) return (double) y0[0]; // degenerate

        // map coordinate -> index
        HashMap<Long, Integer> xid = new HashMap<>(xs.length * 2);
        for (int i = 0; i < xs.length; i++) xid.put(xs[i], i);

        // 2) Build events
        ArrayList<Event> events = new ArrayList<>(m * 2);
        for (int i = 0; i < m; i++) {
            int l = xid.get(x0[i]);
            int r = xid.get(x1[i]);
            if (l < r) {
                events.add(new Event(y0[i], +1, l, r));
                events.add(new Event(y1[i], -1, l, r));
            }
        }
        events.sort(Comparator.<Event>comparingLong(e -> e.y));

        // 3) First sweep: total union area
        double total = sweepArea(events, xs);
        double half = total / 2.0;

        // 4) Second sweep: locate y where prefix reaches half
        return sweepFindY(events, xs, half);
    }

    private double sweepArea(ArrayList<Event> events, long[] xs) {
        if (events.isEmpty()) return 0.0;
        SegTree st = new SegTree(xs);
        double area = 0.0;

        int i = 0;
        long curY = events.get(0).y;

        while (i < events.size()) {
            long y = events.get(i).y;
            long dy = y - curY;
            if (dy != 0) {
                area += st.coveredLen() * (double) dy;
                curY = y;
            }
            while (i < events.size() && events.get(i).y == y) {
                Event e = events.get(i);
                st.update(e.l, e.r, e.delta);
                i++;
            }
        }
        return area;
    }

    private double sweepFindY(ArrayList<Event> events, long[] xs, double half) {
        if (events.isEmpty()) return 0.0;
        SegTree st = new SegTree(xs);
        double prefix = 0.0;

        int i = 0;
        long curY = events.get(0).y;

        while (i < events.size()) {
            long y = events.get(i).y;
            long dy = y - curY;
            double coverX = st.coveredLen();

            if (dy != 0 && coverX > 0.0) {
                double strip = coverX * (double) dy;
                if (prefix + strip >= half) {
                    // inside this strip
                    return (double) curY + (half - prefix) / coverX;
                }
                prefix += strip;
            }

            curY = y;
            while (i < events.size() && events.get(i).y == y) {
                Event e = events.get(i);
                st.update(e.l, e.r, e.delta);
                i++;
            }
        }
        // total=0 or numerical edge: return last y
        return (double) curY;
    }

    private long[] unique(long[] a) {
        int n = a.length;
        if (n == 0) return new long[0];
        int k = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) k++;
        }
        long[] res = new long[k];
        res[0] = a[0];
        int idx = 1;
        for (int i = 1; i < n; i++) {
            if (a[i] != a[i - 1]) res[idx++] = a[i];
        }
        return res;
    }
}
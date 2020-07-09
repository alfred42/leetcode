/**
 * // This is the HtmlParser's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface HtmlParser {
 *     public List<String> getUrls(String url) {}
 * }
 */

class Solution {
    List<String> result = new ArrayList<>();

    public List<String> crawl(String startUrl, HtmlParser htmlParser) {
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();

        queue.offer(startUrl);

        final String hostName = startUrl.substring(0, 
        startUrl.substring(7, startUrl.length()).indexOf("/") > 0 ? startUrl.substring(7, startUrl.length()).indexOf("/") + 7 : startUrl.length());

        while (!queue.isEmpty()) {
            String temp = queue.poll();

            if (temp.indexOf(hostName) == 0) {
                if (!visited.contains(temp)) result.add(temp);

                for (String url : htmlParser.getUrls(temp)) {
                    if (!visited.contains(url)) queue.offer(url);
                }
            }

            visited.add(temp);
        }

        return result; 
    }
}
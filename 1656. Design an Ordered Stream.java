class OrderedStream {
    private String[] array;
    private int pointer;

    public OrderedStream(int n) {
        array = new String[n];
        pointer = 0;
    }
    
    public List<String> insert(int idKey, String value) {
        array[idKey - 1] = value;

        List<String> result = new ArrayList<>();
        while (pointer < array.length && array[pointer] != null) {
            result.add(array[pointer++]);
        }

        return result;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
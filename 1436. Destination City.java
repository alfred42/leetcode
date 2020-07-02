class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> map = new HashMap<>();

        for (List<String> path : paths) {
            map.put(path.get(0), path.get(1));
        }

        String city = paths.get(0).get(0);

        while (true) {
            if (!map.containsKey(city)) {
                return city;
            }

            city = map.get(city);
        }
    }
}

//New York Lima
//Newyork London, Lima New York,
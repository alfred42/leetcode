/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < employees.size(); i++) {
            map.put(employees.get(i).id, i);
        }

        
        int sum = 0;

        Deque<Integer> deque = new LinkedList<>();

        deque.push(id);

        while (deque.size() != 0) {
            Integer temp = deque.pop();

            Employee e = employees.get(map.get(temp));
            sum += e.importance;

            for (Integer i : e.subordinates) {
                deque.push(i);
            }
        }

        return sum;
    }
}

/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        HashMap<Integer, Employee> map = new HashMap<>();
        
        for (Employee e : employees) {
            map.put(e.id, e);
        }
        
        Stack<Employee> stack = new Stack<>();
        
        stack.push(map.get(id));
        
        int answer = 0;
        
        while (!stack.isEmpty()) {
            Employee temp = stack.pop();
            
            answer += temp.importance;
            
            for (Integer i : temp.subordinates) {
                stack.push(map.get(i));
            }
        }
        
        return answer;
    }
}
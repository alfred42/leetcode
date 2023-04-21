class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int sandwichIndex = 0;

        int studentIndex = 0;

        boolean ifNotFound = true;

        while (sandwichIndex < sandwiches.length) {
            if (studentIndex == students.length) {
                if (ifNotFound) {
                    return sandwiches.length - sandwichIndex;
                } else {
                    studentIndex = 0;
                    ifNotFound = true;
                    continue;
                }
            } 

            if (students[studentIndex] == -1) {
                studentIndex++;
                continue;
            } else {
                if (students[studentIndex] == sandwiches[sandwichIndex]) {
                    ifNotFound = false;
                    students[studentIndex] = -1;
                    studentIndex++;
                    sandwichIndex++;
                } else {
                    studentIndex++;
                }
            }
        }

        return 0;
    }
}
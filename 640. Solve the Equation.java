class Solution {
    public String solveEquation(String equation) {
        int xCount = 0;
        int digitValue = 0;

        String formatedEquation = equation.substring(0, equation.indexOf("=")).replace("-","+-");
        String formatedEquationRight = equation.substring(equation.indexOf("=") + 1).replace("+", "*").replace("-", "+").replace("*", "+-");

        if (formatedEquationRight.charAt(0) != '+') formatedEquationRight = "+-" + formatedEquationRight;

        formatedEquation += formatedEquationRight; 
        
        String[] values = formatedEquation.split("\\+");

        for (String value : values) {
            if(value.length() == 0) continue;
            if (value.endsWith("x")) {
                if (value.equals("x")) xCount++;
                else if (value.equals("-x")) xCount--;
                else {
                    xCount += Integer.valueOf(value.substring(0, value.length() - 1));
                }
            } else {
                digitValue += Integer.valueOf(value);
            }
        }

        if (xCount == 0 && digitValue == 0) return "Infinite solutions";
        else if (xCount == 0 && digitValue != 0) return "No solution";
        return "x=" + String.valueOf(-(digitValue / xCount));
    }
}
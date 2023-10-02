package EmployeeSalary;
// Java code​​​​​​‌​‌​​‌​‌​​​‌​​‌‌​​‌​​​‌‌​ below
// Write your answer here, and then test your code.
// Your job is to implement the calculateYearlySalary() method.

class Answer {

    // Change these boolean values to control whether you see 
    // the expected result and/or hints.
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    static double calculateYearlySalary(double hoursPerWeek, double amountPerHour) {
        // Calculate the yearly salary by multiplying hours per week, amount per hour, and weeks in a year (52).
        double yearlySalary = hoursPerWeek * amountPerHour * 52;
        
        // Make sure the result is non-negative; if negative, return 0.
        if (yearlySalary < 0) {
            return 0;
        }
        
        return yearlySalary;
    }

}

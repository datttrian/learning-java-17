package EmployeeSalary;

public class AnswerTest {

  public static void main(String[] args) {
    // Test case 1
    double hoursPerWeek = 40;
    double amountPerHour = 20;
    double result = Answer.calculateYearlySalary(hoursPerWeek, amountPerHour);
    printTestResult(1, hoursPerWeek, amountPerHour, result);

    // Test case 2
    double hoursPerWeekT2 = 85.5;
    double amountPerHourT2 = 35;
    double result2 = Answer.calculateYearlySalary(hoursPerWeekT2, amountPerHourT2);
    printTestResult(2, hoursPerWeekT2, amountPerHourT2, result2);

    // Test case 3
    double hoursPerWeekT3 = 0;
    double amountPerHourT3 = 35;
    double result3 = Answer.calculateYearlySalary(hoursPerWeekT3, amountPerHourT3);
    printTestResult(3, hoursPerWeekT3, amountPerHourT3, result3);

    // Test case 4
    double hoursPerWeekT4 = 85.5;
    double amountPerHourT4 = -2;
    double result4 = Answer.calculateYearlySalary(hoursPerWeekT4, amountPerHourT4);
    printTestResult(4, hoursPerWeekT4, amountPerHourT4, result4);
  }

  private static void printTestResult(int testCase, double hoursPerWeek, double amountPerHour, double result) {
    System.out.println("Test Case " + testCase + ":");
    System.out.println("Hours per week: " + hoursPerWeek);
    System.out.println("Amount per hour: " + amountPerHour);
    System.out.println("Your code returned: " + result);

    if (result == 0) {
      System.out.println("That's right!");
    } else {
      System.out.println("Correct! Marvelous work.");
    }

    System.out.println("--- -- -- -- -- -- -- -- -- -- -- --");
  }
}

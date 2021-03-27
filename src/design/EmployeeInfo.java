package design;

import java.time.LocalDate;
import java.time.Period;
import java.util.Random;
import java.util.Scanner;

import static design.SupportClass.isLeapYear;
import static design.SupportClass.validateString;

public class EmployeeInfo extends Department implements Employee {

    /*
    This class should implement the Employee interface. You can do that by directly implementing it, however you must
        also implement the Employee interface into an abstract class. So create an Abstract class then inherit that
        abstract class into this EmployeeInfo class. Once you're done with designing EmployeeInfo class,
        go to FortuneEmployee class to apply all the fields and attributes.
    Important: YOU MUST USE:
        - OOP (Abstraction, Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
        - Use all kind of keywords (super, this, static, final, etc)
        - Composition
        - Implement nested class below (DateConversion)
        - Use Exception Handling
     */

    /*
     * Make sure to declare and use static, non-static & final fields
     */
    static final String COMPANY_NAME = "Mitre";
    String employeeFullName;
    private int employeeID;
    private int biWeeklyGross;
    private int salary;
    TimeOff timeOff;
    PC pc;
    SmartPhone smartPhone;


    /*
     You must implement the logic for below 2 methods and
        following 2 methods are prototype as well for other methods need to be design,
        as you will come up with the new ideas.
     */

    /*
     You must have/use multiple constructors
     */
    public EmployeeInfo() {
    }

    public EmployeeInfo(int employeeID) {
        this.employeeID = employeeID;
    }

    public EmployeeInfo(String employeeFullName, int employeeId) {
        this.employeeFullName = employeeFullName;
        this.employeeID = employeeId;
    }

    public EmployeeInfo(TimeOff timeOff, PC pc, SmartPhone smartPhone) {
        this.pc = pc;
        this.timeOff = timeOff;
        this.smartPhone = smartPhone;
    }

    public EmployeeInfo(String employeeFullName, int employeeID, TimeOff timeOff) {
        this.employeeFullName = employeeFullName;
        this.employeeID = employeeID;
        this.timeOff = timeOff;
    }


    public void setBiWeeklyGross(int biWeeklyGross) {
        this.biWeeklyGross = biWeeklyGross;
    }

    public int getBiWeeklyGross() {
        return biWeeklyGross;
    }

    public int getSalary() {
        return salary;
    }

    public String inputEmployeeName() {
        String firstName;
        String lastName;
        Scanner scanner = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        firstName = sc.next();
        while (!validateString(firstName)) {
            System.out.print("Please enter valid name: ");
            firstName = scanner.next();
        }
        System.out.print("Enter your last name: ");
        lastName = scanner.next();
        while (!validateString(lastName)) {
            System.out.print("Please enter valid name: ");
            lastName = scanner.next();
        }
        System.out.println("Welcome to " + COMPANY_NAME + ", " + firstName + " " + lastName + ".");
        return employeeFullName = firstName + lastName;
    }

    /*
     You need to implement the logic of this method as such:
        It should calculate Employee bonus based on salary and performance.
        It should return the total yearly bonus.
            Example: 10% of salary for best performance, 8% of salary for average performance and so on.
            You can set arbitrary number for performance, so you probably need to send 2 arguments.
     *
     */
    public int calculateEmployeeBonus(String performance, int salary) {
        int total = 0;
        switch (performance) {
            case "Best":
                total = salary / 100 * 10;
                System.out.println("Your bonus is $" + total);
                break;
            case "Average":
                total = salary / 100 * 8;
                System.out.println("Your bonus is $" + total);
                break;
            case "Bellow Average":
                total = salary / 100 * 3;
                System.out.println("Your bonus is $" + total);
                break;
            default:
                System.out.println("Keep working. You're not qualified for a bonus at this time.");
        }
        return total;
    }

    /*
     You need to implement the logic of this method as such:
        It should calculate Employee pension based on salary and numbers of years with the company.
        It should return the total pension amount.
            Example: Employee will receive 5% of salary as pension for every year they are with the company
     *
     */
    public int calculateEmployeePension() {
        int total = 0;
        int numOfYears;
        numOfYears = calculateNumOfYearsWorked();
        if (getSalary() == 0) {
            System.out.println("Please configure the salary");
        }
        if (numOfYears >= 15) {
            total = getSalary() / 100 * 60;
            System.out.println("\nYour pension is $" + total);
        }
        if (numOfYears < 15 && numOfYears >= 10) {
            total = getSalary() / 100 * 50;
            System.out.println("\nYour pension is $" + total);
        }
        if (numOfYears < 10 && numOfYears >= 5) {
            total = getSalary() / 100 * 40;
            System.out.println("\nYour pension is $" + total);
        }
        if (numOfYears < 5) {
            total = getSalary() / 100 * 30;
            System.out.println("\nYour pension is $" + total);
        }
        return total;
    }

    // Figure out how to extract the number of years the employee has been with the company, using the above 2 dates
    // Calculate pension

    public int setEmployeeID() {
        Random rand = new Random();
        int num = rand.nextInt(10000);
        System.out.println("Your employee ID is " + num);
        return num;
    }

    @Override
    public int employeeId() {
        setEmployeeID();
        return employeeID;
    }

    @Override
    public String employeeName() {
        inputEmployeeName();
        return employeeFullName;
    }

    @Override
    public int calculateSalary(int year, int biWeeklyGross) {
        int salary;
        if (!isLeapYear(year)) {
            salary = biWeeklyGross / 14 * 365;
            this.salary = salary;
        } else {
            salary = biWeeklyGross / 14 * 366;
            this.salary = salary;
        }
        System.out.println("The yearly salary is $" + salary);
        return salary;
    }

    @Override
    public void benefitLayout() {
        System.out.println("****** Your benefits include: ****** \n\t*Student Loan Repayment\n\t*Commuter Benefits\n\t" +
                "*Flexible health care plans\n\t*Between 15 and 20 vacation days\n\t*401(k) savings plan");
    }

    @Override
    public String assignDepartment(String dept) {
        String deptName;
        switch (dept) {
            case "HR":
                deptName = hr;
                System.out.println("You are working in " + deptName + " department.");
                break;
            case "Marketing":
                deptName = marketing;
                System.out.println("You are working in " + deptName + " department.");
                break;
            case "Sales":
                deptName = sales;
                System.out.println("You are working in " + deptName + " department.");
                break;
            case "IT":
                deptName = it;
                System.out.println("You are working in " + deptName + " department.");
                break;
            case "Accounting":
                deptName = accounting;
                System.out.println("You are working in " + deptName + " department.");
                break;
            default:
                deptName = null;
                System.out.println("Department is not identified.");
        }
        return deptName;
    }

    public int findNumYearDifference(LocalDate startDate, LocalDate endDate) {
        int difference;

        Period diff = Period.between(startDate, endDate);
        System.out.print("Your have worked with the company ");
        difference = diff.getYears();
        System.out.printf("%d years", difference);
        return difference;
    }

    public int calculateNumOfYearsWorked() {
        int dif = 0;
        try {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter start year in format (example 2021): ");
            int year = scanner.nextInt();
            System.out.print("Enter start month in format (example 3): ");
            int month = scanner.nextInt();
            System.out.print("Enter start day in format (25): ");
            int day = scanner.nextInt();
            System.out.print("Enter end year in format (example 2021): ");
            int endYear = scanner.nextInt();
            System.out.print("Enter end month in format (5): ");
            int endMonth = scanner.nextInt();
            System.out.print("Enter end day in format (4): ");
            int endDay = scanner.nextInt();

            LocalDate startDate = LocalDate.of(year, month, day);
            LocalDate endDate = LocalDate.of(endYear, endMonth, endDay);
            dif = findNumYearDifference(startDate, endDate);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dif;
    }
}

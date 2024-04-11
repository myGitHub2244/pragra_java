package assignment4.Contructor;

public class EmployeePayroll {

    int employeeID;
    String employeeName;
    double basicSalary;
    String designation;

    //Following attributes are common for all employees hence defined as static
    static double bonusPercent = 10;    //  % of Basic Salary
    static double pfPercent = 12;       // % of Basic Salary
    static double taxPercent = 25;      // % of Gross Salary

    public EmployeePayroll(int employeeID, String employeeName, double basicSalary, String designation) {
        this.employeeID = employeeID;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        this.designation = designation;
    }

    public double grossSalary(){
        return basicSalary*(1+bonusPercent/100);        //Gross Salary = Basic Salary + Bonus
    }

    public double deductions(){
        return basicSalary*pfPercent/100+grossSalary()*taxPercent/100;  //Deductions = PF + Tax
    }

    public double netSalary(){              //Net Salary = Gross Salary - Deductions
        return grossSalary()-deductions();
    }

    public static void main(String[] args) {
        EmployeePayroll emp=new EmployeePayroll(101,"Jack Astor",25000.50,"Developer");
        System.out.println("Gross Salary = " + emp.grossSalary());
        System.out.println("Deductions = " + emp.deductions());
        System.out.println("Net Salary = " + emp.netSalary());
    }


}

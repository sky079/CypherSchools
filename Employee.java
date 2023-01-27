public class Employee {
  int employeeID; 
  int salary;
  String dept;

  Employee(int emoid,int Sal, String d){

    employeeID=emoid; 
    Salary=sal;
    dept=d;
}
  public static void main(String args[]){


    Employee harsha = new Employee(101,1000,"Testing");

    Employee varsha = new Employee(102,5000,"Engineering");


    System.out.println(harsha.employeeID+" Salary"+harsha.Salary+" dept"+harsha.dept); 

    System.out.println(varsha.employeeID+"Salary" +varsha.Salary+"befit" + varsha.dept);
  }
}

package Assignments;

class Employee{
	int id;
	String name;
	double basicSalary;
	double Bonus;
	double TotalSalary;


 Employee(int id,String name,double basicSalary ){
	this.id= id;
	this.name =name;
	this.basicSalary = basicSalary;
	
}
  double claculateSalary(){
	
	double HRA = 0.2*this.basicSalary;
	double Bonus = 0.1*this.basicSalary;
	double TotalSalary = this.basicSalary+ HRA + Bonus ;
	
	return TotalSalary;
  }
  
  void display()
	{
		System.out.println("Employee ID:"+this.id+"\n"+"Employee Name:"+this.name+"\n"+"Basic Salary:"+this.basicSalary+"\n"+ "Calculated Total Salary:"+claculateSalary());
		System.out.println("----------------------------------------");
		
	}
}
public class Salary_Calculation_10_4_2026 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee emp = new Employee(101,"Mounika",10000);
    emp.display();
    
	}

}

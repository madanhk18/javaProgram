package Madan;

	class employee
	{
		private String name;
		private int salary;
		private int id;
	
	
	//now we need a constructor//
	employee(String name, int salary ,int id)
		{
			this.name=name;
			this.salary=salary;
			this.id=id;
		}
	
	void printdata() 
		{
			System.out.println("Name = "+name);
			System.out.println("Salary = "+salary);
			System.out.println("ID = "+id);
		}
	
	void raise_salary(float per) {
			salary=(int)( salary + salary * per/100);
		}
	
	}

public class pro {
	public static void main(String args[]) {
		
		employee e = new employee("Madan",50000, 75);
		System.out.println("Salary before hike \n");
		e.printdata();
		
		e.raise_salary(10);
		System.out.println("Salary after hike \n");
		e.printdata();

		
		
	}

}

package Class_Study;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Employee [] emps = new Employee[4];
		emps[0] = new Employee (1001,5000.0);
		
		for(int i = 0; i<emps.length; i++)
		{
			emps[i] = new Employee(1000+i, 5000.0);
		}*/
		Employee[] emps = {new Employee(), new Employee(1001, 3000.00), new Employee (1002, 4000.00)};
		
		for(Employee emp:emps) {
			System.out.println(emp);
			//System.out.println(emp.toString()); // only if i initialize all objects;
		}
		
		//linear search for exercises!!!!
		//while (i<arr.length && isFoun == true)
		
		//java doesnt let u primitive type being passed by reference 
		
		

}

}

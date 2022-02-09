package Class_Study;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
     ArrayList<String> names = new ArrayList<String>();
     
     //to add
     names.add("Christian");
     names.add("Anu");
     names.add("Leo");
     names.add("Jane");
    
     
     System.out.println(names);
     
     
     
     //to remove
     names.remove(1);
     names.set(0, "Mary");//it sets instead of the data thats in this spot
     System.out.println(names);
     
     //to get the size
     System.out.println("The size of this ArrayList is "+ names.size());
     //to get the a specific value of ArrayList
     System.out.println("The element at 2 is "+names.get(2));
     
     ArrayList aList = new ArrayList();
     aList.add(1);
     aList.add("Gabby");
     aList.add(100);
     aList.add("!");
     
     System.out.println(aList);
     
     for(Object value:aList) {
    	 System.out.print(value + "\s");
     }
     
     
	}

}

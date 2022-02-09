package Class_Study;

public class Sorting {

	public static void main(String[] args) {
		//bubble sort
		
        int [] num = {5,15,2,1};
        System.out.println("Before sorting:");
        for(int nums:num) {
        	System.out.print(nums +"\s");
        }
        System.out.println();
        for(int i =0; i<num.length-1; i++) { //number of rounds/passes
        	for (int j = 0; j<num.length-1-i; j++) { //number of comparisons
        		
        		if (num[j]>num[j+1]){
        			int temp = num[j];
        			num[j]=num[j+1];
        			num[j+1] = temp;
	
        		}
        	}
        }
        System.out.println("After sorting:");
        for(int nums:num) {
        	System.out.print(nums +"\s");
        }
	
	}
}

//implement sorting in array of string
//implement in a array of objects 


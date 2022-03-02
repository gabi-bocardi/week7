package classStudy;

import javax.swing.JOptionPane;

public class FinalExam extends GradedActivity {
	private int numQuestions; 
	private double pointsEach;
	private int numMissed;
	public FinalExam(int numQuestions, int numMissed) {
		
		this.numQuestions = numQuestions;
		this.numMissed = numMissed;
		
		pointsEach = 100.0/numQuestions;
		
		double score = 100 - (numMissed*pointsEach);
		setScore(score);
		
	}
	public void foo() {
		System.out.println(score); //when data type is protected the data is availavle by parent and child , if it was private, only accessed by parent or getter
	//this.display(); //call the local display
	//super.display(); //call parent method;
	}
	@Override //study more about it!!!!  and overload
	public void display() {
		JOptionPane.showMessageDialog(null, "Each questions counts "+ pointsEach + "\nYour score is "+getScore() + "\nYour letter grade is: "+ getGrade());
	}
	
	

}

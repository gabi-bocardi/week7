package classStudy;

import javax.swing.JOptionPane;

public class GradedActivity {

	protected double score;
	private char grade;
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public char getGrade() {
		if(score>=90)
			grade = 'A';
		else if (score>=80 && score <90)
			grade = 'B';
		else if (score<80)
			grade = 'C';
		
		return grade;
		
		
	}
	
	// if this method was static it means it can't be override, the child method can shadow this one by making it also static and delete @Override
	public void display() {
		JOptionPane.showMessageDialog(null, "Your score is "+getScore() + "\nYour letter grade is: "+ getGrade());
	}
	
	//final in the method means can't be overridden or shadowed
	
	
}

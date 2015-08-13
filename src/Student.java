import java.util.ArrayList;
import java.util.List;


public class Student {
	
	private int studentID;
	private List<String> answers = new ArrayList<String>();  // Program to interface
	
	//possibly not unique
	public Student(){
		setStudentID((int)(Math.random()*System.currentTimeMillis()/(Math.random()*1000000)));
	}
	
	public int getStudentID() {
		return studentID;
	}
	
	//student ID is current time in milliseconds
	public void setStudentID(int d) {		
		this.studentID = d;
	}
	public List<String> getAnswers() {
		return answers;
	}
	
	public void addAnswers(String answers) {
		this.answers.add(answers);
	}
	
	public void printAnswers(){
		for(String answer : this.answers){
			System.out.print(answer);
		}
	}
	
}

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class Student {
	
	private UUID studentID;
	private List<String> answers = new ArrayList<String>();  // Program to interface
	
	public Student(){
		setStudentID(UUID.randomUUID());
	}
	
	public UUID getStudentID() {
		return studentID;
	}
	
	public void setStudentID(UUID uuid) {		
		this.studentID = uuid;
	}
	public List<String> getAnswers() {
		return answers;
	}
	
	public void addAnswers(String answers) {
		this.answers.add(answers);
	}
	
	public void printAnswers(){
			System.out.print(getAnswers());
	}
	
}

import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.UUID;


public class IVoteService {
	
	private Map<UUID, List<String>> studentAnswers = new Hashtable<UUID,List<String>>();
	Questions q;
	
	IVoteService(Questions q){
		this.q = q;
	}
	
	public void addStudentAnswers(UUID studentID ,List<String> answers){
		this.studentAnswers.put(studentID, answers);
	}
	
	public void askQuestion(){
		this.q.displayQuestion();
		this.q.displayChoices();
	}
	
	//print # of Right and Wrong
	public void displayStats(){
		List<String> answers = this.q.answers;
		int right = 0;
		int wrong = 0;
		for(List<String> studAnswers : studentAnswers.values()){
			if(studAnswers.equals(answers)){
				right++;				
			} else {
				wrong++;
			}
		}
		
		System.out.println("The correct answer is: " + q.getAnswers());
		System.out.println("Right : " + right + " Wrong  : " + wrong);
		
	}
	
}

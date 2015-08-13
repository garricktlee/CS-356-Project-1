import java.util.List;


public class SimulationDriver {
	public static void main(String[] args) {
		
		//number of students
		final int NUM_STUDENTS = 20;
		
		Questions q1 = new SingleChoiceQuestion();
		//Questions q1 = new MultipleChoiceQuestion();
		
		q1.setQuestion("What is the correct answer?");
		q1.addChoices("A", false);
		q1.addChoices("B", false);
		q1.addChoices("C", true);
		q1.addChoices("D", true);
		
		IVoteService iVote = new IVoteService(q1);
		
		//generate students
		Student[] students = generateStudents(NUM_STUDENTS);
		
		//generate answers
		students = generateAnswers(students, q1.choices);
		
		students[2].printAnswers();
					
		
	}
	
	private static Student[] generateAnswers(Student[] students, List<String> choices) {
		for(int i = 0; i<students.length; i++){
			for(String choice : choices){
				if((Math.floor((Math.random()*100)%3) == 0))
				students[i].addAnswers(choice);
			}
		}
		return students;
		
	}

	private static Student[] generateStudents(int numStudents){

		Student students[] = new Student[numStudents];
		for(int i = 0; i < numStudents; i++){
			students[i] = new Student();
		}
		return students;
		
	}
	
	
	
}

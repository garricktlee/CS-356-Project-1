public class SimulationDriver {
	public static void main(String[] args) {

		// number of students
		final int NUM_STUDENTS = 100;

		//Questions q1 = new SingleChoiceQuestion();
		Questions q1 = new MultipleChoiceQuestion();

		q1.setQuestion("What is the correct answer?");
		q1.addChoices("A", false);
		q1.addChoices("B", false);
		q1.addChoices("C", true);
		q1.addChoices("D", false);
		q1.addChoices("E", false);
		q1.addChoices("F", true);

		// generate students
		Student[] students = generateStudents(NUM_STUDENTS);

		// generate answers
		students = generateAnswers(students, q1);

		runIVoteService(q1, students);

	}

	private static void runIVoteService(Questions q1, Student[] students) {

		IVoteService iVote = new IVoteService(q1);
		
		iVote.askQuestion();

		// submit answers
		for (int i = 0; i < students.length; i++) {
			//print out student ID and Answer
			//System.out.println(students[i].getStudentID() + "  " + students[i].getAnswers());
			
			//submit answer to iVoteService
			iVote.addStudentAnswers(students[i].getStudentID(),	students[i].getAnswers());
		}

		iVote.displayStats();

	}

	private static Student[] generateAnswers(Student[] students, Questions q) {
		if (q.getClass().toString().contains("SingleChoiceQuestion")) {
			for(int i = 0; i < students.length; i++){
				students[i].addAnswers(q.choices.get((int)(Math.floor((Math.random()*q.choices.size())))));
			}
			
		} else if (q.getClass().toString().contains("MultipleChoiceQuestion")) {
			for (int i = 0; i < students.length; i++) {
				for (String choice : q.getChoices()) {
					if ((Math.floor((Math.random() * 100) % 3) == 0))
						students[i].addAnswers(choice);
				}
			}

		}
		return students;

	}

	private static Student[] generateStudents(int numStudents) {

		Student students[] = new Student[numStudents];
		for (int i = 0; i < numStudents; i++) {
			students[i] = new Student();
		}
		return students;

	}

}

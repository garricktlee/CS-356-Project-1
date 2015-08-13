import java.util.ArrayList;
import java.util.List;

public abstract class Questions {

	public String question;
	public List<String> choices = new ArrayList<String>();
	public List<String> answers = new ArrayList<String>();

	public void setQuestion(String question) {
		this.question = question;
	}

	public abstract void addChoices(String choices, boolean isAnswer);

	public void displayQuestion() {
		System.out.println(question);
	}

	public void displayChoices() {
		for (String choice : this.choices) {
			System.out.println(choice);
		}
	}

	// compares answers returns bool
	public boolean isCorrect(List<String> studentAnswer) {
		if (getAnswers().equals(studentAnswer)) {
			return true;
		} else {
			return false;
		}
	}

	public List<String> getChoices() {
		return this.choices;
	}

	public List<String> getAnswers() {
		return this.answers;
	}

}

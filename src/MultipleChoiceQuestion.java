
public class MultipleChoiceQuestion extends Questions{

	@Override
	public void addChoices(String choices, boolean isAnswer) {
		this.choices.add(choices);
		if(isAnswer)
			this.answers.add(choices);
	}

}

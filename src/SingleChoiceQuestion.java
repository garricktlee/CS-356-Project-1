
public class SingleChoiceQuestion extends Questions {
	
	@Override
	public void addChoices(String choices, boolean isAnswer) {
		this.choices.add(choices);
		if(isAnswer && answers.isEmpty()){
			this.answers.add(choices);
		} else if (isAnswer && !answers.isEmpty()){
			System.out.println("Error: Single choice questions may only have one answer.");
		}
		
	}

}

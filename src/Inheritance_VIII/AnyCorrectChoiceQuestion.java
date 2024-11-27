package Inheritance_VIII;

public class AnyCorrectChoiceQuestion extends Question{
    public AnyCorrectChoiceQuestion(String text, String answer) {
        super(text, answer);
    }
    @Override
    public boolean checkAnswer(String response){
        String normalized = response.trim().toLowerCase().replaceAll("\\s+","");
        String[] correctChoices = answer.trim().toLowerCase().split("\\s+");
        for( String choices : correctChoices){
            if(normalized.equals(choices)){
                return true;
            }
            }
        return false;
        }
    }


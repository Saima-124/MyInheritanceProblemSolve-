package Inheritance_VII;

public class Question {
    public String text;
    public String answer;
    public Question(String answer){
        this.answer=answer;
    }

    public String getAnswer() {
        return answer;
    }
    public boolean checkAnswer(String resonse){
        String normalizeResponse = resonse.trim().toLowerCase().replaceAll("\\s+","");
        String normalizeAnswer = answer.trim().toLowerCase().replaceAll("\\s+","");
        return normalizeResponse.equals(normalizeAnswer);
    }
}

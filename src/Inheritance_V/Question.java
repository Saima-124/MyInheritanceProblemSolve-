package Inheritance_V;

public class Question {
    public String text;
    public String answer;
    /*public Question(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }*/

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getText() {
        System.out.println("This is text = ");
        return text;
    }

    public String getAnswer() {
        return answer;
    }
    public boolean checkAnswer(String response){
        return response.equals(answer);
    }
}

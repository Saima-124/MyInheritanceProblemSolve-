package Inheritance_VIII;

public class Question {
    public String text;
    public String answer;

    public Question(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public String getAnswer() {
        return answer;
    }
    public boolean checkAnswer(String response){
        return false;
    }
}

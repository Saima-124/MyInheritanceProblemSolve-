package Inheritance_V;

public class NumericQuestion extends Question{
    public double correctAnswer;

   /* public NumericQuestion(String text, String answer, double correctAnswer) {
        super(text, answer);
        this.correctAnswer = correctAnswer;
    }*/

    public void setCorrectAnswer(double correctAnswer) {
        this.correctAnswer = correctAnswer;
    }


    @Override
    public boolean checkAnswer(String response){
        double userAnswer = Double.parseDouble(response);
        if(Math.abs(userAnswer-correctAnswer)<=0.01){
            return true;
        }else{
            return false;
        }
    }
}

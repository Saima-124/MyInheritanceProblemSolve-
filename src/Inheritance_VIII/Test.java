package Inheritance_VIII;

public class Test {
    public static void main(String[] args) {
        AnyCorrectChoiceQuestion anyCorrectChoiceQuestion = new AnyCorrectChoiceQuestion("Who is the founder of java?",
                "James Josh"
               );
        System.out.println(anyCorrectChoiceQuestion.getText());
        System.out.println("Answer1 : " + anyCorrectChoiceQuestion.checkAnswer("Josh"));//true
        System.out.println("Answer2 : " + anyCorrectChoiceQuestion.checkAnswer("James"));//true
        System.out.println("Answer3 : " + anyCorrectChoiceQuestion.checkAnswer("Someone"));//false
    }
}

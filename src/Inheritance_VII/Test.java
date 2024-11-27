package Inheritance_VII;

public class Test {
    public static void main(String[] args) {
        Question question = new Question("James Gosling");
        System.out.println(question.checkAnswer("JAMES gosling"));
        System.out.println(question.checkAnswer("james Gosling"));
        System.out.println(question.checkAnswer("JAMES GOSlING"));
        System.out.println(question.checkAnswer("Gosling james"));
    }
}

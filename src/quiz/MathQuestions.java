package quiz;

public class MathQuestions {
    private static LinkedList questions;

   public static LinkedList getQuestions(){
        questions = new LinkedList();

        questions.insertFront(new String[]{"What is three fifth of 100?", "A. 3", "B. 20", "C. 60", "C. 60    "});
        questions.insertFront(new String[]{"If David's age is 27 years old in 2011. What was his age in 2003?", "A. 19 years", "B. 37 years", "C. 17 years", "A. 19 years"});
        questions.insertFront(new String[]{"What is the remainder of 21 divided by 7?", "A. 7", "B. 21", "C. None of these", "C. None of these"});
        questions.insertFront(new String[]{"What is 7% equal to?", "A. 0.07", "B. 0.007", "C. 0.007", "A. 0.07"});   
        questions.insertFront(new String[]{"How many years are there in a decade?", "A. 10", "B. 5", "C. 1", "A. 10"});   
        questions.insertFront(new String[]{"What is the square of 15?", "A. 212", "B. 225", "C. 30", "B. 225"});   
        questions.insertFront(new String[]{"What is the reciprocal of 17/15?", "A. 1/13", "B. 15/17", "C. 17/15", "B. 15/17"});   
        questions.insertFront(new String[]{"What is the value of x if x2 = 169", "A. 1", "B. 13", "C. 338", "B. 13"});   
        questions.insertFront(new String[]{"In a century how many months are there?", "A. 12", "B. 120", "C. 1200", "C. 1200"});   
        questions.insertFront(new String[]{"8 in Roman Numerals", "A. III", "B. IX", "C. XIII", "C. XII"});   

        return questions;
   } 
}

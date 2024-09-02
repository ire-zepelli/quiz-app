package quiz;

public class MathQuestions {
    private static LinkedList questions;

   public static LinkedList getQuestions(){
        questions = new LinkedList();

        questions.insertFront(new String[]{"Which digit in the number 245 is in the hundreds place?", "a. 2", "b. 4", "c. 5", "a. 2"});
        questions.insertFront(new String[]{"Which digit in the number 245 is in the ones place?", "a. 2", "b. 4", "c. 5", "c. 5"});
        questions.insertFront(new String[]{"Which digit in the number 245 is in the tens place?", "a. 2", "b. 4", "c. 5", "b. 4"});

        return questions;
   } 
}

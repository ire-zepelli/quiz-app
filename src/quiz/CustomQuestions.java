package quiz;

public class CustomQuestions {
   private static LinkedList questions = new LinkedList();

   public static void addQuestion(String question, String choice_1, String choice_2, String choice_3, String answerKey){
         System.out.println("Question added");
         questions.insertFront(new String[]{question, choice_1, choice_2, choice_3, answerKey});
   }

    public static LinkedList getQuestions(){
           return questions;
   } 
   public static int getSize(){
      return questions.size();
   }
}

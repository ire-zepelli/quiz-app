package quiz;

public class PopQuestions {
       private static LinkedList questions; 
    public static LinkedList getQuestions(){
        questions = new LinkedList();
            questions.insertFront(new String[]{"What did Marlon Brando have \"In Paris\", in his X-rated film?", "A. Last Goodbye", "B. April","C. Last Tango", "C. Last Tango"});
            questions.insertFront(new String[]{"Which film won the Oscar for Best Picture in 1972?", "A. Cabaret", "B. Taxi Driver","C. The Godfather", "C. The Godfather"});
            questions.insertFront(new String[]{"What world-famous movie monster turned 50 in 2005?", "A. Frankenstein", "B. King Kong","C. Godzilla", "C. Godzilla"});
            questions.insertFront(new String[]{"What film had its first private screening at the 39 room hotel Melhana Plantation in Georgia?", "A. The Godfather", "B. From Here To Eternity","C. Gone With The Wind", "C. Gone With The Wind"});
            questions.insertFront(new String[]{"Jack and Rose are the main characters from which film?", "A. Lost In Translation", "B. The Titanic","C. Punch-Drunk Love", "B. The Titanic"});
            questions.insertFront(new String[]{"On which classic story is the 1998 movie \"Ever After\" based?", "A. Cinderella", "B. Beauty And The Beast","C. Snow White", "A. Cinderella"});
            questions.insertFront(new String[]{"What was the name of Patrick Swayze's character in \"Ghost\"?", "A. Sam", "B. Bob","C. Tom", "A. Sam"});
            questions.insertFront(new String[]{"Which film was promoted with the line \"Someone's got a zoo loose\"?", "A. Bewitched", "B. War Of The Worlds","C. Madagascar", "C. Madagascar"});
            questions.insertFront(new String[]{"Which film was promoted with the line \"Prepare for the fantastic\"?", "A. Are We There Yet?", "B. Fantastic Four","C. Diary Of A Mad Black Woman", "B. Fantastic Four"});
            questions.insertFront(new String[]{"What film had the tagline \"For the women of Europe... The price of love just got a lot cheaper\"?", "A. Kicking & Screaming", "B. Deuce Bigalow: European Gigolo","C. Constantine", "B. Deuce Bigalow: European Gigolo"});
           return questions;
   } 
}

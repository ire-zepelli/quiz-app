package quiz;

public class HistoryQuestions {
        private static LinkedList questions;
       public static LinkedList getQuestions(){
        questions = new LinkedList();

        questions.insertFront(new String[]{"How many colonies were there in the United States?", "A. 12", "B. 13","C. 14", "B. 13"});
        questions.insertFront(new String[]{"During what period did the title of Dictator originate?", "A. Roman Republic", "B. Napoleonic Europe","C. Soviet Union", "A. Roman Republic"});
        questions.insertFront(new String[]{"What was Michelangelo's last name?", "A. Brunelleschi", "B. Buonarroti","C. Botticelli", "B. Buonarroti"});
        questions.insertFront(new String[]{"The Louisiana Purchase took place in what year?", "A. 1803", "B. 1813","C. 1823", "A. 1803"});
        questions.insertFront(new String[]{"5. Which of the following was NOT Greek?", "A. Homer", "B. Herodotus","C. Virgil", "C. Virgil"});
        questions.insertFront(new String[]{"6. In Japanese history, what was a Ronin?", "A. A banished Samurai", "B. A young Samurai","C. A Samurai with no lord or master", "C. A Samurai with no lord or master"});
        questions.insertFront(new String[]{"7. Who was in power the longest?", "A. Franklin D. Roosevelt", "B. Winston Churchill","C. Margaret Thatcher", "A. Franklin D. Roosevelt"});
        questions.insertFront(new String[]{"8. Which conflict was the shortest?", "A. WWII", "B. American War of Independence","C. American Civil War", "A. WWII"});
        questions.insertFront(new String[]{"Sweden was neutral in WWII", "A. True", "B. False","C. Maybe", "A. True"});
        questions.insertFront(new String[]{"When did the Berlin Wall fall?", "A. 1900", "B. 1990","C. 1989", "C. 1989"});

        return questions;
   } 
}

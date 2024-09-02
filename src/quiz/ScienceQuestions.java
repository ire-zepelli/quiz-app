package quiz;

public class ScienceQuestions {
    private static LinkedList questions;

   public static LinkedList getQuestions(){
        questions = new LinkedList();

        questions.insertFront(new String[]{"The concept of gravity was discovered by which famous physicist?", "A. Albert Einstein", "B. Galileo Galilei","C. Sir Isaac Newton", "C. Sir Isaac Newton"});
        questions.insertFront(new String[]{"How many colors are in the rainbow?", "A. 5", "B. 6","C. 7", "C. 7"});
        questions.insertFront(new String[]{"True or False? Electrons are smaller than atoms.", "A. True", "B. False","C. Maybe", "A. True"});
        questions.insertFront(new String[]{"What is the name of the tallest grass on earth?", "A. Wheat", "B. Bamboo","C. Sugarcane", "B. Bamboo"});
        questions.insertFront(new String[]{"Which is the most abundant element in the universe?", "A. Oxygen", "B. Carbon","C. Hydrogen", "C. Hydrogen"});
        questions.insertFront(new String[]{"What is the hardest natural substance on Earth?", "A. Gold", "B. Iron","C. Diamond", "C. Diamond"});
        questions.insertFront(new String[]{"Can an airplane go in reverse?", "A. Yes", "B. No","C. Maybe", "A. Yes"});
        questions.insertFront(new String[]{"Does sound travel faster in the air or in water?", "A. Air", "B. Water","C. Land", "B. Water"});
        questions.insertFront(new String[]{"Which oath of ethics taken by doctors is named after an Ancient Greek physician?", "A. The Socratic Oath", "B. The Hippocratic Oath","C. The Galenic Oath", "B. The Hippocratic Oath"});
        questions.insertFront(new String[]{"Which freezes faster, hot water or cold water?", "A. Hot water", "B. Cold water","C. They freeze at the same time", "A. Hot water"});

        return questions;

   } 
}
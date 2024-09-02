package quiz;

public class EnglishQuestions {
     private static LinkedList questions;

   public static LinkedList getQuestions(){
        questions = new LinkedList();

        questions.insertFront(new String[]{"It is a way of expressing thoughts and ideas by means of articulate vocal sounds?", "A. Tone", "B. Voice","C. Speech", "C. Speech"});
        questions.insertFront(new String[]{"This can be found in newspapers and their purpose is to inform readers of what is happening in the world around them?", "A. News Reports", "B. Editorial Cartooning","C. Manuscript", "A. News Reports"});
        questions.insertFront(new String[]{"News reports have a certain structure. This is structure has three parts such as lead, body and tail. What do you call this structure?", "A. Converted Pyramid", "B. Inverted Pyramid","C. Both A and B", "B. Inverted Pyramid"});
        questions.insertFront(new String[]{"This speech does not require critical thinking. It allows the speaker to write and memorize his speech ahead of time before the actual delivery.", "A. Impromptu Speech", "B. Extemporaneous Speech","C. Memorized Speech", "D. Memorized Speech"});
        questions.insertFront(new String[]{"This type of speech is basically unplanned.", "A. Impromptu Speech", "B. Extemporaneous Speech","C. Eulogy Speech", "A. Impromptu"});
        questions.insertFront(new String[]{"It is a person or sometimes even an animal who takes part in the action of a short story or other literary work?", "A. Actor", "B. Theme","C. Character", "C. Character"});
        questions.insertFront(new String[]{"It tells how a story was narrated.", "A. Point of View", "B. Plot","C. Conflict", "A. Point of View"});
        questions.insertFront(new String[]{"It is the central idea in a short story that appeals to all races in the world.", "A. Exposition", "B. Theme","C. Plot", "B. Theme"});
        questions.insertFront(new String[]{"Oldest English epic poem.", "A. Dante's Inferno", "B. Aking Kaibigan","C. Beowulf", "C. Beowulf"});
        questions.insertFront(new String[]{"Who wrote the book Aeneid?", "A. Dante", "B. Virgil","C. Nero", "B. Virgil"});

        return questions;
   } 
}

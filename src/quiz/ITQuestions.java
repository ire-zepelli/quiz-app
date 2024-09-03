package quiz;

public class ITQuestions {
   private static LinkedList questions; 
    public static LinkedList getQuestions(){
        questions = new LinkedList();
        questions.insertFront(new String[]{"What is the primary function of a router?", "A. Connectivity", "B. Storage","C. Processing", "A. Connectivity"});
        questions.insertFront(new String[]{"Which language is commonly used for web development?", "A. Python", "B. Java","C. JavaScript", "C. JavaScript"});
        questions.insertFront(new String[]{"What does 'HTTP' stand for?", "A. HyperText Transfer Protocol", "B. High Text Transfer Protocol","C. Hyper Tech Transmission Protocol", "A. HyperText Transfer Protocol"});
        questions.insertFront(new String[]{"Which device is used primarily for data storage?", "A.Switch", "B. Router","C. Hard Drive", "C. Hard Drive"});
        questions.insertFront(new String[]{"What is cybersecurity focused on protecting?", "A. Hardware", "B. Software","C. Information", "C. Information"});
        questions.insertFront(new String[]{"Which protocol ensures secure data transmission?", "A. HTTP", "B. FTP","C. HTTPS", "C. HTTPS"});
        questions.insertFront(new String[]{"What technology is used to create virtual machines?", "A. Docker", "B. Kubernetes","C. VMware", "C. VMware"});
        questions.insertFront(new String[]{"Which component is essential for a computer's processing power?", "A. GPU", "B. CPU","C. SSD", "B. CPU"});
        questions.insertFront(new String[]{"What format is primarily used for structured data interchange?", "A. HTML", "B. XML","C. JPEG", "B. XML"});
        questions.insertFront(new String[]{"What is cloud computing primarily used for?", "A. Gaming", "B. Data Storage","C. Web Browsing", "B. Data Storage"});
           return questions;
   } 
}

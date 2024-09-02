import java.util.*;

public class insertToList {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String list = "";

        for(int i = 0; i < 10; i++){
            list = list + "questions.insertFront(new String[]{\"" + sc.nextLine() + "\", \"" + sc.nextLine() + "\", \"" + sc.nextLine()+ "\",\"" + sc.nextLine() + "\", \"" + sc.nextLine() + "\"});" + "\n";
        }

        System.out.println(list);
        
   } 
}

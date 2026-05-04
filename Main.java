import utils.*;
import users.*;
import java.util.*;

public class Main{

    static  Scanner sc = new Scanner(System.in);

    public static void welcomeScreen(ArrayList<Questions> questionList){
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("------------------------------");
        System.out.println("SELECT ROLE");
        System.out.println("1. Admin");
        System.out.println("2. Player");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = sc.nextInt();
        System.out.println("------------------------------");
        if(choice == 1){
            Admin admin = new Admin();
            admin.enterTeacher();
        }
        else if(choice == 2){
            Player player = new Player();
            player.enterPlayer(questionList);
        }
        else{
            System.out.println("INVALID CHOICE");
        }
    }

    public static void main(String[] args) {
        String path = "questionList.csv";

        Questions question = new Questions();
        ArrayList<Questions> questionList = question.getQuestionList(path);

        Collections.shuffle(questionList);

        welcomeScreen(questionList);
    }

    
}

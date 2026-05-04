package users;

import java.util.*;

import utils.*;

public class Admin extends Questions {
    static Scanner sc = new Scanner(System.in);

    public Admin() {
    };

    public void enterTeacher() {
        System.out.println("_______________________");
        System.out.println("HELLO ADMINNNNNNNN");
        System.out.print("Enter admin's password : ");
        String password = sc.nextLine();

        if (!(password.equals("JIIT SUCKS"))) {
            System.out.println("INVALID PASSWORD");
            return;
        }
        int choice;
        System.out.println("ACCESS GRANTED");

        System.out.println("HELLO ADMIN WHAT WOULD YOU LIKE TO DO?");
        do {
            System.out.println("1. ADD QUESTION");
            System.out.println("2. DELETE QUESTION");
            System.out.println("3. UPDATE QUESTION");
            System.out.println("4. update options");
            System.out.println("5. update answer");
            System.out.println("6. show all questions");
            System.out.println("7. EXIT");
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    super.addQuestion();
                    break;
                case 2:
                    super.deleteQuestion();

                    break;
                case 3:
                    super.updateQuestion();
                    System.out.println("UPDATE QUESTION");
                    break;
                case 4:
                    super.updateOptions();
                    System.out.println("UPDATE OPTIONS");
                    break;
                case 5:
                    super.updateAnswer();
                    System.out.println("UPDATE ANSWER");
                    break;
                case 6:
                    super.showAllQuestions();
                    System.out.println("SHOW ALL QUESTIONS");
                    break;
                case 7:
                    System.out.println("EXITING...");
                    return;
                default:
                    System.out.println("INVALID CHOICE");
            }
        } while (choice != 7);

    };
}

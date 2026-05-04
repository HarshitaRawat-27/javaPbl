package users;

import java.util.*;
import utils.*;

public class Player {
    static Scanner sc = new Scanner(System.in);

    public Player() {
    };

    void showResult(int count, long timeTaken) {
        System.out.println("YOUR SCORE : " + count + "/10");
        if (count >= 7) {
            System.out.println("CONGRATS YOU PASSED THE QUIZ!!");
        } else {
            System.out.println("BETTER LUCK NEXT TIME!!");
        }
        System.out.println("accuracy : " + (count / 10.0) * 100 + "%");

        System.out.println("time taken = " + timeTaken/1000.0 + " seconds");
        System.out.println("average time = " + (timeTaken / 10000.0) + " seconds");

    }

    public void enterPlayer(ArrayList<Questions> questionList) {
        System.out.println("HELLO PLAYERRRRRRRRR");

        for (int i = 5; i >= 0; i--) {
            System.out.println("YOUR TIME STARTS IN : " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Collections.shuffle(questionList);
        System.out.println("let's goooooooo!!");

        long start = System.currentTimeMillis();
        int count = 0;
        for (int i = 1; i < 10; i++) {
            System.out.println("QUESTION " + i);
            System.out.println(questionList.get(i - 1).question);
            System.out.println("OPTIONS : ");
            System.out.println('a' + ". " + questionList.get(i - 1).options.get('a'));
            System.out.println('b' + ". " + questionList.get(i - 1).options.get('b'));
            System.out.println('c' + ". " + questionList.get(i - 1).options.get('c'));
            System.out.println('d' + ". " + questionList.get(i - 1).options.get('d'));
            System.out.print("Enter your answer : ");
            char answer = sc.next().charAt(0);

            String userInput = questionList.get(i - 1).options.get(answer);
            if (userInput.equals(questionList.get(i - 1).correctAnswer)) {
                System.out.println("CORRECT ANSWER");
                count++;
            }

        }
        sc.nextLine();
        long end = System.currentTimeMillis();
        long timeTaken = end - start;
        showResult(count, timeTaken);
    };

}

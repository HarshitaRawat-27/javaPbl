package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class CSVParser {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Questions> que = new ArrayList<>();
    
    public ArrayList<Questions> parse(String path) {

        try {

            BufferedReader br = new BufferedReader(new FileReader(path));

            String line = br.readLine();

            while ((line = br.readLine()) != null) {
                String[] temp = line.split(",");
                HashMap<Character, String> options = new HashMap<>();
                options.put('a', temp[1]);
                options.put('b', temp[2]);
                options.put('c', temp[3]);
                options.put('d', temp[4]);
                String correctAnswer = temp[5];

                Questions tempQue = new Questions(temp[0], options, correctAnswer);
                que.add(tempQue);
            }

            br.close();

        } catch (Exception e) {
            System.out.println("unknown error occur while parsing csv file.");
        }
        return que;
    }

    void addQuestion() {
        System.out.println("enter question : ");
        String question = sc.nextLine();
        System.out.println("enter option a : ");
        String a = sc.nextLine();
        System.out.println("enter option b : ");
        String b = sc.nextLine();
        System.out.println("enter option c : ");
        String c = sc.nextLine();
        System.out.println("enter option d : ");
        String d = sc.nextLine();
        System.out.println("enter correct answer : ");
        String correct = sc.nextLine();

        HashMap<Character, String> options = new HashMap<>();
        options.put('a', a);
        options.put('b', b);
        options.put('c', c);
        options.put('d', d);
        Questions newQuestion = new Questions(question, options, correct);
        que.add(newQuestion);
        System.out.println("QUESTION ADDED SUCCESSFULLY");
    }

    void deleteQuestion() {
        showAllQuestions();
        System.out.println("enter question number to delete : ");
        int num = sc.nextInt();
        if (num < 1 || num > que.size()) {
            System.out.println("invalid question number");
            return;
        }
        que.remove(num - 1);
        System.out.println("QUESTION DELETED SUCCESSFULLY");
    }

    void updateQuestion() {
        showAllQuestions();
        System.out.println("enter question number to update : ");
        int num = sc.nextInt();
        sc.nextLine();
        if (num < 1 || num > que.size()) {
            System.out.println("invalid question number");
            return;
        }
        System.out.println("enter new question : ");
        String question = sc.nextLine();
        que.get(num - 1).question = question;
        System.out.println("QUESTION UPDATED SUCCESSFULLY");
    }

    void updateOptions() {
        showAllQuestions();
        System.out.println("enter question number to update options : ");
        int num = sc.nextInt();
        sc.nextLine();
        if (num < 1 || num > que.size()) {
            System.out.println("invalid question number");
            return;
        }
        System.out.println("enter new option a : ");
        String a = sc.nextLine();
        System.out.println("enter new option b : ");
        String b = sc.nextLine();
        System.out.println("enter new option c : ");
        String c = sc.nextLine();
        System.out.println("enter new option d : ");
        String d = sc.nextLine();

        que.get(num - 1).options.put('a', a);
        que.get(num - 1).options.put('b', b);
        que.get(num - 1).options.put('c', c);
        que.get(num - 1).options.put('d', d);
        System.out.println("OPTIONS UPDATED SUCCESSFULLY");
    }

    void updateAnswer() {
        showAllQuestions();
        System.out.println("enter question number to update answer : ");
        int num = sc.nextInt();
        sc.nextLine();
        if (num < 1 || num > que.size()) {
            System.out.println("invalid question number");
            return;
        }
        System.out.println("enter new correct answer : ");
        String correct = sc.nextLine();
        que.get(num - 1).correctAnswer = correct;
        System.out.println("ANSWER UPDATED SUCCESSFULLY");
    }

    void showAllQuestions() {
        for (int i = 0; i < que.size(); i++) {
            System.out.println((i + 1) + ". " + que.get(i).question);
            System.out.println("a. " + que.get(i).options.get('a'));
            System.out.println("b. " + que.get(i).options.get('b'));
            System.out.println("c. " + que.get(i).options.get('c'));
            System.out.println("d. " + que.get(i).options.get('d'));
            System.out.println("correct answer : " + que.get(i).correctAnswer);
            System.out.println();
        }
    }
}

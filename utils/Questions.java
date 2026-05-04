package utils;

import java.util.*;

public class Questions extends CSVParser{

    public Questions(){};

    public HashMap<Character, String> options = new HashMap<>(); // option id: option
    public String question;
    public String correctAnswer;

    Questions(String question, HashMap<Character, String> options, String correct) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correct;
    }

    public void addQuestion() {
        super.addQuestion();
    }   
        public void deleteQuestion() {
            super.deleteQuestion();
        }

    public void updateQuestion() {
        super.updateQuestion();     
    }
    public void updateOptions() {
        super.updateOptions();
    }

    public void updateAnswer() {
        super.updateAnswer();
    }

    public void showAllQuestions() {
        super.showAllQuestions();
    }

    

    public ArrayList<Questions> getQuestionList(String path) {
        return super.parse(path);

    }
}

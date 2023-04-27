import java.util.ArrayList;

public class Desert extends Environment {


    /*This details the characteristics of
     * the Sahara desert, which is a
     * Hot and Dry desert
     */


    private static final String environmentName = "Desert";
    private static final double avgTemp = 18.75; //in degree Celsius
    private static final double rainfall = 101.6; //in millimeters
    private final ArrayList<Question> questionBank;

    public Desert() {
        super(environmentName, avgTemp, rainfall);
        questionBank = new ArrayList<>();
        loadQuestions("DesertQuestions.csv");
        questionBank.add(q0);
        questionBank.add(q1);
        questionBank.add(q2);
        questionBank.add(q3);


    }


    public Question getQuestion(int index) {
        return questionBank.get(index);
    }

    //Questions Backup
    final Question q0 = new Question("Which of these is essential for desert restoration",
            "Trains", "Cars", "Camels", "C", "A");

    final Question q1 = new Question("Which of these is essential for desert restoration",
            "Trains", "Cars", "Camels", "C", "A");
    final Question q2 = new Question("Which of these is essential for desert restoration",
            "Trains", "Cars", "Camels", "C", "A");
    final Question q3 = new Question("Which of these is essential for desert restoration",
            "Trains", "Cars", "Camels", "C", "A");
}

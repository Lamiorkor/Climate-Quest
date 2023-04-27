import java.util.ArrayList;

public class Temperate extends Environment {

    /* Temperate regions are found between the
     * Tropic of Cancer and Tropic of Capricorn
     */
    private static final String environmentName = "Temperate";
    private static final double avgTemp = 10; //in degree Celsius
    private static final double rainfall = 800; //in millimeters

    private ArrayList<Question> questionBank;

    public Temperate() {
        super(environmentName, avgTemp, rainfall);
        questionBank=new ArrayList<>();
        loadQuestions("TemperateQuestions.csv");
        questionBank.add(q0);
        questionBank.add(q1);
        questionBank.add(q2);
        questionBank.add(q3);


    }

    public Question getQuestion(int index){
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
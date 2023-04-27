import java.util.ArrayList;

public class Tundra extends Environment{

    /* Referring to the Arctic Tundra
     * located in the northern hemisphere
     */

    private static final String environmentName = "Tundra";
    private static final double avgTemp = (-13.25); //in degree Celsius
    private static final double rainfall = 200; //in millimeters
    private ArrayList<Question> questionBank;
    public Tundra() {
        super(environmentName, avgTemp, rainfall);
        questionBank=new ArrayList<>();
        loadQuestions("TundraQuestions.csv");
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
            "Trains","Cars","Camels","C","A");

    final Question q1 = new Question("Which of these is essential for desert restoration",
            "Trains","Cars","Camels","C","A");
    final Question q2 = new Question("Which of these is essential for desert restoration",
            "Trains","Cars","Camels","C","A");
    final Question q3 = new Question("Which of these is essential for desert restoration",
            "Trains","Cars","Camels","C","A");
}
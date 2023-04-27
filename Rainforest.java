import java.util.ArrayList;

public class Rainforest extends Environment {
   
    /* This class depicts a tropical rainforest 
     * as found in West and Central Africa,
     * 
     */
    private static final String environmentName = "Tropical Rainforest";
    private static final double avgTemp = 25; //in degree Celsius
    private static final double rainfall = 2150; //in millimeters
    private ArrayList<Question> questionBank;

    public Rainforest() {
        super(environmentName, avgTemp, rainfall);
        questionBank=new ArrayList<>();
        loadQuestions("TemperateQuestions.csv");
        questionBank.add(q0);
        questionBank.add(q1);
        questionBank.add(q2);
        questionBank.add(q3);

        loadQuestions("RainforestQuestions.csv");
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

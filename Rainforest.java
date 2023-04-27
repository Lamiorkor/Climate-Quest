import java.util.ArrayList;

public class Rainforest extends Environment {
   
    /* This class depicts a tropical rainforest 
     * as found in West and Central Africa,
     * 
     */
    protected static final String environmentName = "Tropical Rainforest";
    protected static final double avgTemp = 25; //in degree Celsius
    protected static final double avgWaterLevel = 2150; //in millimeters
    private ArrayList<Question> questionBank;

    public Rainforest() {
        super(environmentName, avgTemp, avgWaterLevel);
        questionBank=new ArrayList<>();
        loadQuestions("RainforestQuestions.csv");
        questionBank.add(q0);
        questionBank.add(q1);
        questionBank.add(q2);
        questionBank.add(q3);
        questionBank.add(q4);
        questionBank.add(q5);
        questionBank.add(q6);
        questionBank.add(q7);
        questionBank.add(q8);
        questionBank.add(q9);
        questionBank.add(q10);

    }

    public Question getQuestion(int index){
        return questionBank.get(index);
    }

    //Questions
    final Question q0 = new Question("Which of these is essential for desert restoration",
            "Trains","Cars","Camels","C","A");

    final Question q1 = new Question("Which of these is essential for desert restoration",
            "Trains","Cars","Camels","C","A");
    final Question q2 = new Question("Which of these is essential for desert restoration",
            "Trains","Cars","Camels","C","A");
    final Question q3 = new Question("Which of these is essential for desert restoration",
            "Trains","Cars","Camels","C","A");
    final Question q4 = new Question("Which of these is essential for desert restoration",
            "Trains","Cars","Camels","C","A");
    final Question q5 = new Question("Which of these is essential for desert restoration",
            "Trains","Cars","Camels","C","A");
    final Question q6 = new Question("Which of these is essential for desert restoration",
            "Trains","Cars","Camels","C","A");
    final Question q7 = new Question("Which of these is essential for desert restoration",
            "Trains","Cars","Camels","C","A");
    final Question q8 = new Question("Which of these is essential for desert restoration",
            "Trains","Cars","Camels","C","A");
    final Question q9 = new Question("Which of these is essential for desert restoration",
            "Trains","Cars","Camels","C","A");
    final Question q10 = new Question("Which of these is essential for desert restoration",
            "Trains","Cars","Camels","C","A");

}

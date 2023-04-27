import java.util.ArrayList;

public class Tropical extends Environment{

    /* This depicts a tropical monsoon climate
     * typically found in countries in the
     * south and southeast Asia region.
     */

    private static final String environmentName = "Tropical Monsoon";
    private static final double avgTemp = 27.05; //in degree Celsius
    private static final double rainfall = 3409.2; //in millimeters

    private ArrayList<Question> questionBank;

    public Tropical() {
        super(environmentName, avgTemp, rainfall);
        questionBank=new ArrayList<>();
        loadQuestions("TropicalQuestions.csv");
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

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
    final Question q0 = new Question("In this research, for more efficiency in the work, your colleagues and you location in Greenland. Where you are, you have been noticed of the existence of wildlife population which is a conflict with humans and other species. How do you keep yourself safe during your stay? ","Try to know more about wildlife and their habitats.","When visiting natural areas, follow the principles of Leave No Trace to minimize your impact on the environment. ","Engage yourself in local and national conversation organizations that work to protect wildlife populations. ","B","A");
    final Question q1 = new Question("How caring you are!!! As in any temperate country, heat waves can occur and pose a risk to people’s health in Greenland. What will be the best option for protecting yourself against heat waves during your stay? ","Avoid checking on your elderly vulnerable neighbors like mister Mike to ensure that they are okay.","Stay indoors during the hottest part of the day and keep cool with air conditioning or fans. Wear light-colored, loose-fitting clothing and drink plenty water. ","Do strenuous activities because you also have to explore the country during your stay. ","B","C");
    final Question q2 = new Question("Which of these is essential for desert restoration",
            "Trains", "Cars", "Camels", "C", "A");
    final Question q3 = new Question("Which of these is essential for desert restoration",
            "Trains", "Cars", "Camels", "C", "A");

}
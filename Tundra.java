public class Tundra extends Environment{

    /* Referring to the Arctic Tundra
     * located in the northern hemisphere
     */

    protected static final String environmentName = "Tundra";
    protected static final double avgTemp = (-13.25); //in degree Celsius
    protected static final double avgWaterLevel = 200; //in millimeters
    private static final int numQuestions=14;

    protected static final Question[] questionBank = new Question[numQuestions];
    public Tundra() {
        super(environmentName, avgTemp, avgWaterLevel,numQuestions);
        questionBank[0]=q0;
        questionBank[1]=q1;
        questionBank[2]=q2;
        questionBank[3]=q3;
        questionBank[4]=q4;
        questionBank[5]=q5;
        questionBank[6]=q6;
        questionBank[7]=q7;
        questionBank[8]=q8;
        questionBank[9]=q9;
        questionBank[10]=q10;
        questionBank[11]=q11;
        questionBank[12]=q12;
        questionBank[13]=q13;

    }

    public Question getQuestion(int index){
        return questionBank[index];
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
    final Question q11 = new Question("Which of these is essential for desert restoration",
            "Trains","Cars","Camels","C","A");
    final Question q12 = new Question("Which of these is essential for desert restoration",
            "Trains","Cars","Camels","C","A");
    final Question q13 = new Question("Which of these is essential for desert restoration",
            "Trains","Cars","Camels","C","A");
}
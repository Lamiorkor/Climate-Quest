public class Tundra extends Environment{

    /* Referring to the Artic Tundra 
     * located in the northern hemisphere
     */

    protected static final String environmentName = "Tundra";
    protected static final double avgTemp = (-13.25); //in degree Celcius
    protected static final double avgWaterLevel = 200; //in millimeters

    public Tundra() {
        super(environmentName, avgTemp, avgWaterLevel);
    }
    
    public String getQuestions() {
        String answer = "whoo";
        //Ben puts his code here
        return answer;
    }
}

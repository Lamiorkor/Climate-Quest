public class Temperate extends Environment{

    /* Temperate regions are found between the
     * Tropic of Cancer and Tropic of Capricorn
     */
    protected static final String environmentName = "Temperate";
    protected static final double avgTemp = 10; //in degree Celcius
    protected static final double avgWaterLevel = 800; //in millimeters

    public Temperate() {
        super(environmentName, avgTemp, avgWaterLevel);
    }
    
    public String getQuestions() {
        String answer = "whoo";
        //Ben puts his code here
        return answer;
    }
    
}

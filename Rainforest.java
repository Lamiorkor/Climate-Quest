public class Rainforest extends Environment {
   
    /* This class depicts a tropical rainforest 
     * as found in West and Cental Africa,
     * 
     */
    protected static final String environmentName = "Tropical Rainforest";
    protected static final double avgTemp = 25; //in degree Celcius
    protected static final double avgWaterLevel = 2150; //in millimeters

    public Rainforest() {
        super(environmentName, avgTemp, avgWaterLevel);
    }
    
    public String getQuestions() {
        String answer = "whoo";
        //Ben puts his code here
        return answer;
    }
}

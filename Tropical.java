public class Tropical extends Environment{

    /* This depicts a tropical monsoon climate
     * typically found in countries in the
     * south and southeast Asia region.
     */

    protected static final String environmentName = "Tropical Monsoon";
    protected static final double avgTemp = 27.05; //in degree Celcius
    protected static final double avgWaterLevel = 3409.2; //in millimeters

    public Tropical() {
        super(environmentName, avgTemp, avgWaterLevel);
    }
    
    public String getQuestions() {
        String answer = "whoo";
        //Ben puts his code here
        return answer;
    }
    
}

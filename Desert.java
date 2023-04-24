public class Desert extends Environment {

    /*This details the characteristics of 
    * the Sahara desert, which is a 
    * Hot and Dry desert
    */

    protected static final String environmentName = "Desert";
    protected static final double avgTemp = 18.75; //in degree Celcius
    protected static final double avgWaterLevel = 101.6; //in millimeters

    public Desert() {
        super(environmentName, avgTemp, avgWaterLevel);
    }
    
    public String getQuestions() {
        String answer = "whoo";
        //Ben puts his code here
        return answer;
    }
}

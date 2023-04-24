/* This is an abstract class called Environment that 
 * simulates the Environment of our game. 
 * It will have 5 sub-classes; Desert, Rainforest, Tropical, 
 * Temperate, and Tundra.
 */

public abstract class Environment {

    protected String environmentName; //this entails the name of the environment
    protected double averageTemperature;
    protected double averageWaterLevel;

    public Environment(String environName, double avgTemp, double avgWaterLevel) {

        this.environmentName = environName;
        this.averageTemperature = avgTemp;
        this.averageWaterLevel = avgWaterLevel;
    }

    public String getEnvironmentName() {
        return environmentName;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public double getAverageWaterLevel() {
        return averageWaterLevel;
    }

    public abstract String getQuestions();
}
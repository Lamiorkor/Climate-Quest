/* This is an abstract class called Environment that 
 * simulates the Environment of our game. 
 * It will have 5 subclasses; Desert, Rainforest, Tropical,
 * Temperate, and Tundra.
 */

public abstract class Environment {

    protected final String environmentName; //this entails the name of the environment
    protected final double averageTemperature;
    protected final double averageWaterLevel;
    protected static int numQuestions;

    public Environment(String environName, double avgTemp, double avgWaterLevel,int numQuestions) {

        this.environmentName = environName;
        this.averageTemperature = avgTemp;
        this.averageWaterLevel = avgWaterLevel;
        Environment.numQuestions =numQuestions;
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

    public static int getNumQuestions() {
        return numQuestions;
    }

    public abstract Question getQuestion(int index);
}
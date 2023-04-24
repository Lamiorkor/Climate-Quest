/* This is an abstract class called Environment that 
 * simulates the Environment of our game. 
 * It will have 5 sub-classes; Desert, Rainforest, Tropical, 
 * Temperate, and Tundra.
 */

public abstract class Environment {

    protected String description; //this entails the name of the environment and the continent it's located in
    protected int temperature;
    protected int waterLevel;

    public Environment(String description, int temp, int waterLevel) {

        this.description = description;
        this.temperature = temp;
        this.waterLevel = waterLevel;
    }

    public String getDescription() {
        return description;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getWaterLevel() {
        return waterLevel;
    }

    public abstract String getEffect();
}
/* This is an abstract class called Environment that 
 * simulates the Environment of our game. 
 * It will have 5 subclasses; Desert, Rainforest, Tropical,
 * Temperate, and Tundra.
 */

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Environment {

    protected final String environmentName; //this entails the name of the environment
    protected final double averageTemperature;
    protected final double averageWaterLevel;
    protected ArrayList<Question> questionBank;

    public Environment(String environName, double avgTemp, double avgWaterLevel) {

        this.environmentName = environName;
        this.averageTemperature = avgTemp;
        this.averageWaterLevel = avgWaterLevel;
    }

    public int getNumQuestions() {
        return questionBank.size();
    }

    public void loadQuestions(String filename){
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            while (br.readLine()!=null)
            {
                String line = br.readLine();
                if (line != null && !line.isEmpty()) {
                    String[] parts = line.split(",");
                    Question question = new Question(parts[0],parts[1],parts[2],parts[3],parts[4],parts[5]);
                    questionBank.add(question);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Error parsing number: " + e.getMessage());
        }
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



    public abstract Question getQuestion(int index);
}
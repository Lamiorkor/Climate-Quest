/* This is an abstract class called Environment that 
 * simulates the Environment of our game. 
 * It will have 5 subclasses; Desert, Rainforest, Tropical,
 * Temperate, and Tundra.
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class Environment {

    protected final String environmentName; //this entails the name of the environment
    protected final double averageTemperature;
    protected final double rainfall;
    protected ArrayList<Question> questionBank;

    public Environment(String environName, double avgTemp, double avgWaterLevel) {

        this.environmentName = environName;
        this.averageTemperature = avgTemp;
        this.rainfall = avgWaterLevel;
        this.questionBank=new ArrayList<>();
    }

    public int getNumQuestions() {
        return questionBank.size();
    }

    public boolean loadQuestions(String filename) {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.isEmpty()) {
                    String[] parts = line.split(",");
                    Question question = new Question(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5]);
                    questionBank.add(question);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            System.out.println("Loading Backup Questions");
            return false;
        }
        return true;
    }

    public String getEnvironmentName() {
        return environmentName;
    }

    public double getAverageTemperature() {
        return averageTemperature;
    }

    public double getrainfall() {
        return rainfall;
    }



    public abstract Question getQuestion(int index);
}
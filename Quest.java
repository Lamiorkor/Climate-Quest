/**
 * A class representing the Quest game.
 */
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Quest {
    private int score;
    private int health;
    private int numberOfRounds;
    /**
     * Constructs a Quest object with a given Player object. The Quest starts with a score of zero and the health of the player.
     *
     * @param player The Player object that will be playing the game.
     */
    public Quest ( Player player){
        this.score = 0;
        this.health = player.getHealth();
    }

    /**
     * Returns the health of the player.
     * @return The health of the player.
     */
    public int getHealth() {
        return health;
    }

    /**
     * Adds points to the player's score.
     * @param points The number of points to be added to the player's score.
     */
    public void addPoints(int points){
        score += points;
    }

    /**
     * Returns the number of rounds that have been played.
     * @return The number of rounds that have been played.
     */
    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    /**
     * Returns the score of the player.
     * @return The score of the player.
     */
    public int getScore() {
        return score;
    }

    /**
     * Subtracts the specified amount of health from the player's current health. If the player's health drops below the minimum health,
     * the health is set to zero.
     * @param amount The amount of health to be subtracted from the player's current health.
     */
    public void subtractHealth ( int amount){
        if ((this.health-amount)<Player.MINHEALTH)
            this.health = 0;
        else
            this.health-=amount;
    }

    /**
     * Adds the specified amount of health to the player's current health.
     * @param health The amount of health to be added to the player's current health.
     */
    public void addHealth(int health){
        this.health += health;
    }


    /**
     * Starts a new round of the game in the given environment.
     * @param environment the environment to play the round in
     * @return the score earned in the round
     */
    public int beginRound(Environment environment){
        int questionsLeft= environment.getNumQuestions();
        ArrayList<Question> usedQuestions = new ArrayList<>();
        int bonusHealth=0;
        do
        {
            Question question;
            Random r = new Random();
            int index = r.nextInt(0, questionsLeft);
            question = environment.getQuestion(index);
            System.out.println(question.getQuestion());
            Scanner scan = new Scanner(System.in);
            String Response = scan.next().toUpperCase();
            if (question.isAnswer(Response))
            {
                this.addPoints(10);
                bonusHealth++;
                System.out.println("Correct ! +10 points");
            }
            if (question.isWrong(Response))
            {
                this.subtractHealth(50);
                System.out.println("Wrong! -50 health");
                bonusHealth=0;
            }
            if (bonusHealth>=3){
                addHealth(15);
                System.out.println("Bonus Health Added! +15 health ");
            }
            System.out.println("--------------------");
            System.out.println("Health Remaining:" + getHealth());
            System.out.println("\n");
            questionsLeft--;
        }while(questionsLeft != 0 && !(Player.outOfHealth(health)));
        numberOfRounds++;
        System.out.println("-------END-OF-ROUND------");
        System.out.println("Score:" + getScore());
        System.out.println("--------\n");
        return getScore();
    }
    /**
     * Main method to start and run the Climate Quest game.
     * Prompts the user to enter their name, displays the game menu and help information.
     * Runs the game loop allowing the user to play multiple rounds.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("""
                ===========================
                Welcome to Climate Quest!!!
                            
                =============Menu===============
                Use the numbers to select
                0 - Exit
                1 - Start
                2 - Help""");
        Scanner scan = new Scanner(System.in);
        int response, totalScore = 0;
        int roundNumber = 0;
        try {
        response = scan.nextInt();
         if (response != 1 && response != 2)
         {
             System.out.println("Goodbye");
             System.exit(0);
         }
         if (response == 2)
         {
             System.out.println("""
                     Welcome to Climate Quest! \\o/
                     In this game you will navigate a world affected by Climate change
                     Answer as many questions correctly as possible to undo as much
                     damage as possible
                     You have 5 environments to choose from,
                     Each environment has its own unique questions
                     For every question there is:
                     - A right answer which rewards you with points
                     - A neutral answer which gains you no points
                     - A wrong answer which takes some health away
                     Health can be regained by having a streak of 3 or more characters...
        
                     Can you survive the longest?
                     Use the corresponding letters to answer the questions
                     A or b or c or B are all right answer inputs
                                        
                     Wrong inputs at any point will get you kicked from the game
                     ;)
                                        
                     Good Luck!
                     ====================================================""");
         }
        String Name = "";
        System.out.println("Enter your Name...");
        while (Name.equals(""))
        {

            Name = scan.nextLine();
        }
        Quest currentQuest;
        while (true)
        {
            System.out.println("Press 1 to play another round or 0 to wrap up");
            int play = scan.nextInt();
            if (play == 1)
            {
                System.out.println("""
                        Use 1 to 5 to select an environment...
                        1.Tropical
                        2.Desert
                        3.Rainforest
                        4.Temperate
                        5.Tundra""");
                int choice = scan.nextInt();
                while (choice != 1 && choice != 2 && choice != 3 && choice != 4 && choice != 5)
                {
                    System.out.println("Invalid input.Enter a number...");
                    choice = scan.nextInt();
                }
                Environment environment;
                if (choice == 1)
                    environment = new Tropical();
                else if (choice == 2)
                    environment = new Desert();
                else if (choice == 3)
                    environment = new Rainforest();
                else if (choice == 4)
                    environment = new Temperate();
                else environment = new Tundra();
                Player currentPlayer = new Player(Name, environment);
                System.out.println("Your Environment is  " + environment.getEnvironmentName());
                System.out.println("Average Temperature(*C) : " + environment.getAverageTemperature());
                System.out.println("Average WaterLevel(ml) : " + environment.getrainfall() + "\n");
                currentQuest = new Quest(currentPlayer);
                totalScore += currentQuest.beginRound(environment);
                roundNumber = currentQuest.getNumberOfRounds();
            } else
                break;
        }
        } catch (InputMismatchException e)
        {
            System.out.println("Error in Input..." + e.getMessage());
        }
        System.out.println("End of Game");
        System.out.println("Score:" + totalScore);
        System.out.println("Rounds:" + roundNumber);
        System.out.println("Goodbye!");
        scan.close();
    }
}
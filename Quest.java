import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Quest {
    private int score;

    private int health;
    private int numberOfRounds;

    public Quest ( Player player){
        this.score = 0;
        this.health = player.getHealth();
    }


    public int getHealth() {
        return health;
    }


    public void addPoints(int points){
        score += points;
    }

    public int getNumberOfRounds() {
        return numberOfRounds;
    }

    private int getScore() {
        return score;
    }

    public void subtractHealth ( int amount){
        if ((this.health-amount)<Player.MINHEALTH)
            this.health = 0;
        else
            this.health-=amount;
    }

    public void addHealth(int health){
        this.health += health;
    }

    public int beginRound(Environment environment){
        int questionsLeft= environment.getNumQuestions();
        ArrayList<Question> usedQuestions = new ArrayList<>();
        int bonusHealth=0;
        do
        {
            Question question;
            do
            {
                Random r = new Random();
                int index;
                if (questionsLeft<=0){
                     index = r.nextInt(0, 10);
                }
                else {
                     index = r.nextInt(0, questionsLeft);
                }
                question = environment.getQuestion(index);
            } while (usedQuestions.contains(question));
            usedQuestions.add(question);
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
                System.out.println("Bonus Health Added!  +15 health ");
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
        return  getScore();
    }


    public static void main(String[] args) {
        System.out.println("""
                ===========================
                                
                Welcome to Climate Quest!!! 🌍
                                
                =============Menu===============
                Use the numbers to select
                0 - Exit  🚫
                1 - Start 💫
                2 - Help  💡""");

        Scanner scan = new Scanner(System.in);
        int response, totalScore = 0;
        int roundnumber = 0;
        try
        {
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
                        damage as possible 👷‍♂️🏗️
                        You have 5 environments to choose from,
                        🌨️🏜️🌴🌾🍃
                        Each environment has its own unique questions
                                            
                        For every question there is:
                        - A right answer which rewards you with points ✅
                        - A neutral answer which gains you no points ⚠️
                        - A wrong answer which takes some health away ❌
                                            
                        Health(❤️‍🩹) can be regained by having a streak of 3 or more characters(🔥)...

                        Can you survive the longest?⌛
                        Use the corresponding letters to answer the questions
                        A or b or c or B are all right answer inputs
                                            
                        Wrong inputs at any point will get you kicked from the game
                        ;)
                                            
                        Good Luck🍀!
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
                    System.out.println("Average WaterLevel(ml) : " + environment.getAverageWaterLevel() + "\n");
                    currentQuest = new Quest(currentPlayer);
                    totalScore += currentQuest.beginRound(environment);
                    roundnumber = currentQuest.getNumberOfRounds();
                } else
                    break;

            }
        } catch (InputMismatchException e)
        {
            System.out.println("Error in Input..." + e.getMessage());
        }
        System.out.println("End of Game");
        System.out.println("Score:" + totalScore);
        System.out.println("Rounds:" + roundnumber);
        System.out.println("Goodbye!");
        scan.close();

    }

}
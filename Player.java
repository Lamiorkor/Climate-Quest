public class Player {
    private String name;
    private Environment currentLocation;
    private int health;
    private int highScore;
    private static final int  MAXHEALTH = 100;
    protected static final int MINHEALTH = 0;

    public Player(String name,Environment currentLocation){
        setName(name);
        setCurrentLocation(currentLocation);
        resetHealth();
        setHighScore(0);
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public static boolean outOfHealth(int health){
        return (health<=MINHEALTH);
    }

    public void resetHealth() {
        this.health = MAXHEALTH;
    }

    public void setHighScore(int highscore) {
        this.highScore = highscore;
    }

    public Environment getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Environment currentLocation) {
        this.currentLocation = currentLocation;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", currentLocation=" + currentLocation +
                ", health=" + health +
                ", highscore=" + highScore +
                '}';
    }
}

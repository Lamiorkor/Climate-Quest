public class Player {
    private String name;
    private Environment currentLocation;
    private int health;
    private int highscore;
    private static final int  MAXHEALTH = 100;

    public Player(String name,Environment currentLocation){
        setName(name);
        setCurrentLocation(currentLocation);
        resetHealth();
        setHighscore(0);
    }

    private Item[] inventory;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void resetHealth() {
        this.health = MAXHEALTH;
    }

    public int getHighscore() {
        return highscore;
    }

    public void setHighscore(int highscore) {
        this.highscore = highscore;
    }

    public Environment getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Environment currentLocation) {
        this.currentLocation = currentLocation;
    }
}

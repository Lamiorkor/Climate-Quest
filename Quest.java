public class Quest {
    private int score;
    private int points;
    private int health;

    public Quest ( int score, int points, int health ){
        this.score = score;
        this.points = points;
        this.health = health;
    }

    public int getObstacle(){
    }

    public void addPoints(int points){
        score += points;
    }

    public void subtractPoints( int points){
        score -= points ;
    }

    public void subtractHealth ( int health){
        this.health -= health;
    }

    public void addHealth(int health){
        this.health += health;
    }

    public boolean beginRound(){

        return false;
    }

}
public class Enemy {
    
    protected int health;
    protected String name;

    public Enemy(int health, String name){
        this.health = health;
        this.name = name;



    }

    public void setHealth(int energy){
        health = energy;

    }

    public void setName(String named){
        name = named;
    }

    public String getName(){
        return name;
    }

    public int getHealth(){
        return health;
    }



}

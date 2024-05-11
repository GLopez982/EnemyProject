public class Boss extends ElevatedEnemy {
    
    protected int toughness;
    protected int stages; 
    protected String[] treasure = new String[5];

    public Boss(int health, String name,int attackPower, String type, int defense, int tough, int stage){
        super( health, name, attackPower, type, defense);
        this.toughness = tough;
        this.stages = stage;
        setTreasure(treasure);


    }

    public void setToughness(int tough){
        toughness = tough;

    }

    public void setStages(int stage){
        stages = stage;
    }
    
    public void setTreasure(String[] drops){

        for(int i = 0; i < drops.length; ++i){
            treasure[i] =  drops[i];
        }
    }

    public int getToughness(){
        return toughness;
    }

    public int getStages(){
        return stages;
    }

    public String[] getTreasure(){
        return treasure;
    }


    
}

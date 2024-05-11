public class ElevatedEnemy extends Enemy{

    protected int attackPower;
    protected String type;
    protected String skills;
    protected int defense;

    public ElevatedEnemy(int health, String name,int attackPow, String typed, int def){
        super(health, name);
        this.attackPower = attackPow;
        this.type = typed;
        this.defense = def;
               

    }

    public void setAttackPower(int attackPow){
        attackPower = attackPow;

    }

    public void setType(String types){
        type = types;
    }

    public void setDef(int defenses){
        defense = defenses;
    
    }

    public void setSkills(String skilled){
        skills = skilled;
    }

    public String getSkills(){
        return skills;
    }
    
    public int getAttackPower(){
        return attackPower;
    }

    public String getType(){
        return type;
    }

    public int getDefense(){
        return defense;
    }

    

}

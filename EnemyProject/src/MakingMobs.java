
import java.util.*;

public class MakingMobs {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int health;
        String name;
        int attackPower;
        String type;
        int defense;
        int toughness;
        int stages;
        String[] treasure = new String[5];
        boolean isRunning = true;

        do {

            // STARTING ENEMY OBJECT

            System.out.println("Welcome, we are making an enemy ");
            System.out.println("Please enter your enemy's health >>");
            health = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Please enter your enemy's name >>");
            name = keyboard.nextLine();
            Enemy weakMob = new Enemy(health, name);
            System.out.println("Your enemy has " + health + " and is named " + name + ".");

            // STARTING ELEVATED ENEMY OBJECT

            System.out.println("Next we will make an elevated enemy ");
            System.out.println("Please enter your enemy's health >>");
            health = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Please enter your enemy's name >>");
            name = keyboard.nextLine();
            System.out.println("Please enter your enemy's attack Power >>");
            attackPower = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Please enter your enemy's defensive Power >>");
            defense = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Please enter your enemy's type (Goblin, Orc, Skeleton, ect. >>");
            type = keyboard.nextLine();

            ElevatedEnemy strongMob = new ElevatedEnemy(health, name, attackPower, type, defense);

            // STARTING BOSS ENEMY

            System.out.println("Next we will make a Boss");
            System.out.println("Please enter your enemy's health >>");
            health = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Please enter your enemy's name >>");
            name = keyboard.nextLine();
            System.out.println("Please enter your enemy's attack Power >>");
            attackPower = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Please enter your enemy's defensive Power >>");
            defense = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Please enter your enemy's type (Goblin, Orc, Skeleton, ect. >>");
            type = keyboard.nextLine();
            System.out.println("Please enter your boss' toughness multiplier");
            toughness = keyboard.nextInt();
            keyboard.nextLine();
            System.out.println("Please enter your boss' number of stages");
            stages = keyboard.nextInt();
            keyboard.nextLine();

            for (int i = 0; i < treasure.length; ++i) {
                System.out.println("Please enter your treasure item");
                treasure[i] = keyboard.nextLine();

            }

            Boss bigBoss = new Boss(health, name, attackPower, type, defense, toughness, stages);
            bigBoss.setTreasure(treasure);

            for (String treas : treasure) {
                System.out.println(treas);

            }

            // CHOICE TO QUIT OR CONTINUE

            String makeMob;

            System.out.println("Would you like to create another mob? Press Q to quit, or any other key to continue");
            makeMob = keyboard.nextLine();
            char quit = makeMob.charAt(0);

            if (quit == 'q' || quit == 'Q') {
                isRunning = false;
            }

        } while (isRunning);

    }

}
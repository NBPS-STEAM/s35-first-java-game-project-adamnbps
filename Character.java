import java.lang.Math;
import java.util.Scanner;

public class Character{
        int health = 0;
        String name;
        int damage = 0;
        Boolean isDefending = false;

        Scanner scanner = new Scanner(System.in);

        public Character(String theName){
        health = 20;
        name = theName;
        } 

        public Character(){
          health = (int)(Math.random() * (15 - 9) + 8);
        }

        public int enemyAttack(){
          if (isDefending == true){
            damage = (int)(Math.random() * (5 - 2) + 1);
          health = health - damage;
          isDefending = false;
          System.out.println("Defended and took less damage!");
          return health;
          }
          else{
          damage = (int)(Math.random() * (7 - 4) + 3);
          health = health - damage;
          return health;
          }
          
        }

        public int damageDone(){
          return damage;
        }

        public String toString()
    {
        return health + "";
    }
    }
  
import java.lang.Math;
import java.util.Scanner;

public class Character{
        int health = 0;
        String name;
        int damage = 0;

        Scanner scanner = new Scanner(System.in);

        public Character(String theName){
        health = 20;
        name = theName;
        } 

        public Character(){
          health = (int)Math.random() * (20 - 11) + 10;
        }

        public int enemyAttack(){
          damage = (int)(Math.random() * (7 - 4) + 3);
         // damage = Math.round(damage);
          health = health - damage;
          return health;
        }

        public int damageDone(){
          return damage;
        }

        public String toString()
    {
        return health + "";
    }
    }
  
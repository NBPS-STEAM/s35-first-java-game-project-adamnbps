import java.lang.Math;

public class Player{
        int health;
        String name;

        public Player(String theName){
        health = 20;
        name = theName;
        } 

        public Player(){
          health = Math.Random() * (20 - 10) + 10;
        }

        public String toString()
    {
        return health + " is the current health!";
    }
    }
  
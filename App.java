import java.util.Scanner;
public class App {
    public static void main(String[] args) {
         System.out.println("Type in a name for your character!");
         Scanner scanner = new Scanner(System.in);
         String name = scanner.nextLine();
         Character player1 = new Character(name);

          System.out.println("\nAn enemy approaches! \n");
    
         Character enemy1 = new Character();
         System.out.println(enemy1 + " is the current enemy health!");

      

      while(enemy1.health >= 0){
      String directions = "\nYour options: Attack, Heal, Defend \nType in your move!";
      System.out.println(directions);
      String move = scanner.nextLine();
      while(!move.equals("Attack") && 
            !move.equals("Heal") && 
            !move.equals("Defend")) {
        System.out.println("That is not a valid move! Try again!");
        System.out.println(directions);
        move = scanner.nextLine();
      }


      if (move.equals("Attack")){
        int attack = (int)Math.random() * (7 - 4) + 3;
        enemy1.health = enemy1.health - attack;
        System.out.println("\nThe enemy took " + attack + " damage!");
        if (enemy1.health > 0){
          System.out.println(enemy1 + " is the current enemy health!");

          System.out.println("\n" + name + " now has " + player1.enemyAttack() + " hearts after taking " + player1.damage + " damage!");
        }
        else{
          System.out.println("The enemy is dead! GG");
        }
        
        
      }
      else if (move.equals("Heal")){
        int heal = (int)Math.random() * (9 - 4) + 3;
        player1.health = player1.health + heal;
        System.out.println(name + " Healed 5 hearts!\n");
        System.out.println(player1 + " is your current health!");
        if (enemy1.health > 0){
          System.out.println(enemy1 + " is the current enemy health!");

          System.out.println("\n" + name + " now has " + player1.enemyAttack() + " hearts after taking " + player1.damage + " damage!");
        }
        else{
          System.out.println("The enemy is dead! GG");
        }
      }

      else if (move.equals("Defend")){
        System.out.println("Defended!");
        if (enemy1.health > 0){
          System.out.println(enemy1 + " is the current enemy health!");

          System.out.println("\n" + name + " now has " + player1.enemyAttack() + " hearts after taking " + player1.damage + " damage!");
        }
        else{
          System.out.println("The enemy is dead! GG");
        }
      }

    }
}
}






/* if statements DONE
if-else statements DONE
else if statements DONE
compound boolean expressions DONE
comparing objects DONE
while loop DONE
for loop
nested iteration DONE */
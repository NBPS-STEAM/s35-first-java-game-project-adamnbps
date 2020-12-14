import java.util.Scanner;
public class App {
    public static void main(String[] args) {
         System.out.println("Type in a name for your character!");
         Scanner scanner = new Scanner(System.in);
         String name = scanner.nextLine();
         Player player1 = new Player(name);
         Player enemy1 = new Player();
         System.out.println(enemy1);
    }
}






/* if statements
if-else statements
else if statements
compound boolean expressions
comparing objects
while loop
for loop
nested iteration */
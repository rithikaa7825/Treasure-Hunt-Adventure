import java.util.Scanner;

public class days {
    public static void main(String agrs[]) {
        int health = 100;
        int coins = 0;
        boolean gameover = false;
        System.out.println("===Treasure Hunt Adventure===");
        System.out.println("health" + health);
        System.out.println("coins" + coins);
        Scanner sc = new Scanner(System.in);
        while (!gameover) {
            System.out.println("1.fight a monster(-20 health,+10 coins)");
            System.out.println("2.search for treasure(=10 health,+20 coins);");
            System.out.println("3.rest(+15 health,-5coins)");
            System.out.println("4.check status");
            System.out.println("5.quit");
            System.out.println("Enter your choice(1-5):");
            int choice = sc.nextInt();
            if (choice == 1) {
                health = health - 20;
                coins = coins + 10;
            } else if (choice == 2) {
                health = health - 10;
                coins = coins + 20;
            } else if (choice == 3) {
                health = health + 15;
                coins = coins - 5;
            } else if (choice == 4) {
                System.out.println("check status");
            } else if (choice == 5) {
                System.out.println("quit");
                gameover = true;
            } else {
                System.out.println("invalid choice");
            }
            if (coins >= 100) {
                System.out.println("win");
            } else {
                System.out.println("you loss");
            }
        }

    }
}

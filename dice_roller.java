import java.util.Scanner;
import java.util.Random;
public class dice_roller {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        char choice = 'y';
        
        do {
            int roll = random.nextInt(1,7);
            System.out.println("your roll gave : " + roll);

            System.out.println("roll dice again? : ");
            choice = scanner.next().charAt(0);
        }while(choice == 'y');

    }
}

import java.util.Scanner;
public class user_input {
    public static void main(String[] args){

        // Username input prompt
        System.out.println("Enter you name : ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        // age input prompt
        System.out.println("Enter your age : ");
        int age = scanner.nextInt();

        // output
        System.out.println("your name is " + name + " your age is " + age);
    }
}

import java.util.Scanner;

public class input {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = scan.nextLine();
        System.out.println("Enter your age : ");
        int age = scan.nextInt();

        System.out.println(name);
        System.out.println(age);
        scan.close();
    }
}
package wahajplayz;

import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        //Output

        System.out.println("Hello Welcome to my script");

        int progress = 19;

        System.out.println(progress);

        int Grade = 90;

        System.out.println("Your Grade is " + Grade);

        //Input
        Scanner scanner = new Scanner(System.in);
        int Number = scanner.nextInt();
        System.out.println("You have typed this as your number " + Number);

        scanner.nextLine();
        String input = scanner.nextLine();
        System.out.println("You have typed in this as your String " + input);

        System.out.println("What is your Grade Number Please Type it out");
        int GradeInput = scanner.nextInt();

        scanner.nextLine();
        System.out.println("What is your name please type it out");
        String Name = scanner.nextLine();
        System.out.println("Your Grade Number is " + GradeInput + " Your grade is under your name " + Name);
    }
}

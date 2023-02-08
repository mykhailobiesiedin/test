import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner text = new Scanner(System.in);
        System.out.println("Enter the text : ");
        String a = text.nextLine();

        String substring = a.substring(0, 21);

        System.out.println("Your text to upper case : " + a.toUpperCase());

        System.out.println("Your string length : " + a.length());

        System.out.println("Your first 20 symbols : " + substring + "...");






    }
}
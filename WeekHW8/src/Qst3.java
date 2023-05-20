import java.util.Scanner;

public class Qst3 {
    public static void main(String[] args) {
        lett();
    }

    public static void lett() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Character: ");
        String let = sc.next();

        if (sc.hasNext())
        {
            let = let.toLowerCase();
            if (let.equals("a") || let.equals("e") || let.equals("i") || let.equals("o") || let.equals("u"))
            {
                System.out.println("Vowel");
            }
            else if (let.length() > 1)
            {
                System.out.println("Error");
            }
            else
            {
                System.out.println("Consonant");
            }
        }
        else
        {
            System.out.println("Error");
        }
    }
}





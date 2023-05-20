import java.util.Scanner;

public class FirstAndLastnumberSum {

    public static void main(String[] args) {
        FirstAndLastnumberSum ff = new FirstAndLastnumberSum();
        ff.num();
    }

    public void num() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int number = sc.nextInt();

        int mod = 0;
        int firstdivide = 0;
        int seconddivide = 0;
        int sum = 0;

        while (number > 0) {
            if (number < 0) {
                System.out.println("Invalid Number");
            } else if (number > 0 && number < 10) {
                System.out.println(number);
            } else if (number >= 10 && number < 100) {
                mod = number % 10;
                firstdivide = number / 10;
                sum = mod + firstdivide;

                System.out.println(sum);
            } else if (number >= 100 && number < 999) {
                mod = number % 10;
                firstdivide = number / 100;
                sum = mod + firstdivide;
                System.out.println(sum);
                
            }

            break;
            }


        }
    }



import java.util.Scanner;

public class Qst14 {
    //14. Write a program in Java to display the pattern like a diamond.
    //While loop
    public static void main(String[] args) {
        dia();
    }
    public static void dia(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows : ");
        int n=sc.nextInt();

        int i=1;
        int j;
        while(i<=n)
        {
            j=1;
            while(j++<=n-i){
                j=1;
                while(j++<=n-i)
                {
                    System.out.print(" ");
                }
                j=1;
                while(j++<=i*2-1)
                {
                    System.out.print("*");
                }
                System.out.println();
                i++;
            }
            i=n-1;
            while(i>0){
                j=1;
                while(j++<=n-i)
                {
                    System.out.print(" ");
                }
                j=1;
                while(j++<=i*2-1)
                {
                    System.out.print("*");
                }
                System.out.println();
                i--;
            }
            break;
        }

    }
    }


import java.util.Scanner;

public class Qst6 {

    public static void main(String[] args) {
        Qst6 aa = new Qst6();
        aa.num();
    }
    public void num(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The number of line you want :");
        int i = sc.nextInt();

        for (int j =1;j<=i;j++){
            for(int n=1;n<=j;n++){
                System.out.print(n);

            }
            System.out.println("");

        }
    }
}

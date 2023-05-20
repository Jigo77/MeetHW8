import java.util.Scanner;

public class Qst8 {
    public static void main(String[] args) {
        Qst8 nn = new Qst8();
        nn.pat();
    }
    public void pat(){
        Scanner sc = new Scanner(System.in);
        System.out.println("How many line you want :");
        int n = sc.nextInt();

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print("@");
            }
            System.out.println(" ");

        }
    }
}

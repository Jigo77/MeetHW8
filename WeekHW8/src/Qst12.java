import java.util.Scanner;

public class Qst12 {
    public static void main(String[] args) {
        prime();
    }
    public static void prime(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number :");
        int a = sc.nextInt();
        double ab=a/2;
        int f=0;
        for(int i=2;i<=ab;i++){
            if(a%i==0){
                System.out.println(a+" is not prime number");
                f=1;
                break;
            }
        }
        if(f==0)  { System.out.println(a+" is prime number"); }
    }
}

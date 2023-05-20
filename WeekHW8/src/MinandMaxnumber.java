import java.util.Scanner;

public class MinandMaxnumber {
    public static void main(String[] args) {
        num();
    }
    public static void num(){
        Scanner sc = new Scanner(System.in);
        int i=1,ans=0,ans1=0;
        while(i<=3){
            System.out.print("Enter Number "+i+" :");
            int a = sc.nextInt();

            if(a>ans){
                ans=a;
                i++;
            }
            else {
                ans1=a;
                i++;
            }

        }
        System.out.println("Max :"+ans);
        System.out.println("Min :"+ans1);


    }
}

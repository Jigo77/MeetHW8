package Qst1;

import java.util.Scanner;

public class Sumofnumber {
    public static void main(String[] args) {
        hasNextInt();
    }
    public static void hasNextInt(){
        Scanner sc = new Scanner(System.in);
        int i=1;
        int sum=0,num;
        while(i<=10){
            System.out.print("Enter Number "+i+" :");

            if(sc.hasNextInt()){
                 num = sc.nextInt();
                sum=sum+num;
                i++;

            }
            else {
                System.out.println("Invalid Number");
                System.out.println("Enter Number "+i+" :");
                num = sc.nextInt();
                i=i;

            }


        }
        sc.close();
        System.out.println(sum);

        /*for(int i=1;i<=10;i++){
            System.out.println("Enter Number "+i);
            int num = sc.nextInt();

            if(num>=0 || num<0){
                sum=sum+num;
            }
            else {

            }
        }*/

    }
}

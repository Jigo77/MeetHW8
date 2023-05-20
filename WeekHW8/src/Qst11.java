public class Qst11 {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(-2));
    }
    public static int getEvenDigitSum(int num){
        int digit,ans=0,f=-1;
        if(num<0){
           System.out.println("Invalid Number ");
           return f;
        }else {
        while(num!=0) {
            digit = num % 10;

            if (digit % 2 == 0)

                ans = ans + digit;

                num = num / 10;


        }
        return ans;
    }}

}

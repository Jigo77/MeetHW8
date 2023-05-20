public class Qst9 {
    //9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
    public static void main(String[] args) {
        Qst9 jj = new Qst9();
        jj.fib();
    }
    public void fib(){
        int i=0,j=1,num,n=10;
        for(int t=2;t<n;t++){
            num=i+j;
            System.out.print(num+" ");
            i=j;
            j=num;
        }

    }
}

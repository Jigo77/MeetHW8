public class Qst13 {
    public static void main(String[] args) {
        System.out.println(num(55,16));
    }
    public static boolean num(int a,int b){
        if( a>= 10 && a <= 99 && b >= 10 && b <=99){
            return true;
        }else {
            return false;
        }
    }
}

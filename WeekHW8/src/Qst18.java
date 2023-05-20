public class Qst18 {
    double firstNumber;
    double secondNumber;

    public static void main(String[] args) {
        Qst18 ca = new Qst18();
        ca.setFirstNumber(5.0);
        ca.setSecondNumber(4);
        System.out.println("add= " + ca.getAdditionResult());
        System.out.println("subtract= " + ca.getSubtractionResult());
        ca.setFirstNumber(5.25);
        ca.setSecondNumber(0);
        System.out.println("multiply= " + ca.getMultiplicationResult());
        System.out.println("divide= " + ca.getDivisionResult());
    }
    public double getFirstNumber(){
        return firstNumber;
    }

    public double getSecondNumber(){
        return secondNumber;
    }

    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult(){
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult(){
        return firstNumber * secondNumber;
    }

    public double getDivisionResult () {

        if (secondNumber == 0) {

            return this.secondNumber = 0;

        } else {

            return firstNumber / secondNumber;

        }

    }
}

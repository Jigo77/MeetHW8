package methodoverriding24;

class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI();
        System.out.println("SBI Rate :"+s.getRateOfInterest());
        ICICI i = new ICICI();
        System.out.println("ICICI Rate :"+i.getRateOfInterest());
        AXIX a = new AXIX();
        System.out.println("AXIX Rate :"+a.getRateOfInterest());
    }
}

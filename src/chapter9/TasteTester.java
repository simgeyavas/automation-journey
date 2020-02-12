package chapter9;

public class TasteTester {

    public static void main(String args[]) {

        Cake cake = new Cake("vanilla");
        cake.setPrice(15);
        System.out.println("Cake flavor: " + cake.getFlavor());
        System.out.println("Cake price: " + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setPrice(35);
        birthdayCake.setCandles(10);
        System.out.println("Birthday cake flavor: " + birthdayCake.getFlavor());
        System.out.println("Birthday cake price: " + birthdayCake.getPrice());
        System.out.println("Candle: " + birthdayCake.getCandles());

        WeddingCake weddingCake = new WeddingCake();
        weddingCake.setTiers(4);
        System.out.println("Wedding cake flavor: " + weddingCake.getFlavor());
        System.out.println("Wedding cake price: " + weddingCake.getPrice());
        System.out.println("Tiers: " + weddingCake.getTiers());
    }
}

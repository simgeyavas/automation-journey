package chapter6;

public class PhoneBill {
    private int id;
    private double baseCost;
    private int allottedMinutes;
    private int usedMinutes;

    public PhoneBill(){
        id = 1;
        baseCost = 50.10;
        allottedMinutes = 25;
        usedMinutes = 30;
    }

    public PhoneBill(int id){
        this.id = id;
        baseCost = 50.10;
        allottedMinutes = 25;
        usedMinutes = 30;
    }

    public PhoneBill(int id, double baseCost, int allottedMinutes, int usedMinutes){
        this.id = id;
        this.baseCost = baseCost;
        this.allottedMinutes = allottedMinutes;
        this.usedMinutes =usedMinutes;
    }

    public int getId(){
        return  id;
    }

    public void setId(int id){
        this.id = id;
    }

    public double getBaseCost(){
        return baseCost;
    }

    public void setBaseCost(double baseCost){
        this.baseCost = baseCost;
    }

    public int getAllottedMinutes(){
        return allottedMinutes;
    }

    public void setAllottedMinutes(int allottedMinutes){
        this.allottedMinutes = allottedMinutes;
    }

    public int getUsedMinutes(){
        return usedMinutes;
    }

    public void setUsedMinutes(int usedMinutes){
        this.usedMinutes = usedMinutes;
    }

    public double calculateOverage(){
        if(usedMinutes <= allottedMinutes) {
            return 0;
        }

        double overageRate = 0.25;
        double overage = (usedMinutes - allottedMinutes) * overageRate;
        return overage;
    }

    public double calculateTax(){
        double tax = 0.15;
        return tax * (baseCost + calculateOverage());
    }

    public double calculateTotal(){
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printItemizedBill(){
        System.out.println("Id: " + id);
        System.out.println("Base Cost: " + baseCost);
        System.out.println("Overage: " + calculateOverage());
        System.out.println("Tax: " + calculateTax());
        System.out.println("Total: " + calculateTotal());
    }
}

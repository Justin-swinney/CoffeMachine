package machine;

public class Machine {

    //Private attributes
    private int water;
    private int milk;
    private int coffeeBeans;
    private int cups;
    private int money;


    //Constructor

    public Machine() {
        this.water = 400;
        this.milk = 540;
        this.coffeeBeans = 120;
        this.cups = 9;
        this.money = 550;
    }



    //Getters

    public int getWater() {
        return water;
    }
    public int getMilk() {
        return milk;
    }
    public int getCoffeeBeans() {
        return coffeeBeans;
    }
    public int getCups() {
        return cups;
    }
    public int getMoney() {
        return money;
    }

    //SETTERS
    public void setWater(int water) {
        this.water = water;
    }
    public void setMilk(int milk) {
        this.milk = milk;
    }
    public void setCoffeeBeans(int coffeeBeans) {
        this.coffeeBeans = coffeeBeans;
    }
    public void setCups(int cups) {
        this.cups = cups;
    }
    public void setMoney(int money) {
        this.money = money;
    }


    public void DisplayMachine() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(coffeeBeans + " g of coffee beans");
        System.out.println(cups + " disposable cups");
        System.out.println("$" + money + " of money");
    }




}

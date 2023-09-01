package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void makeCoffee(int water, int milk, int coffeeBeans, int money, int cups, Machine coffeeMachine) {
        if (hasResources(coffeeMachine) > 0) {
            System.out.println("I have enough resources, making you a coffee!");
            System.out.println();
            coffeeMachine.setWater(coffeeMachine.getWater() - water);
            coffeeMachine.setMilk(coffeeMachine.getMilk() - milk);
            coffeeMachine.setCoffeeBeans(coffeeMachine.getCoffeeBeans() - coffeeBeans);
            coffeeMachine.setMoney(coffeeMachine.getMoney() + money);
            coffeeMachine.setCups(coffeeMachine.getCups() - cups);
        } else {
            System.out.println("Sorry, not enough water!");
        }


    }

    public static void makeEspresso(Machine coffeeMachine) {
        makeCoffee(250, 0, 16, 4, 1, coffeeMachine);
    }

    public static void makeLatte(Machine coffeeMachine) {
        makeCoffee(350, 75, 20, 7, 1, coffeeMachine);
    }

    public static void makeCappuccino(Machine coffeeMachine) {
        makeCoffee(200, 100, 12, 6, 1, coffeeMachine);
    }


    public static void fillMachine(Machine coffeeMachine, int water, int milk, int coffeeBeans, int cups) {
        coffeeMachine.setWater(coffeeMachine.getWater() + water);
        coffeeMachine.setMilk(coffeeMachine.getMilk() + milk);
        coffeeMachine.setCoffeeBeans(coffeeMachine.getCoffeeBeans() + coffeeBeans);
        coffeeMachine.setCups(coffeeMachine.getCups() + cups);

    }

    public static void takeMachine(Machine coffeeMachine) {
        int withdraw = coffeeMachine.getMoney();
        System.out.println("I gave you $ " + withdraw);
        coffeeMachine.setMoney(coffeeMachine.getMoney() - withdraw);
        System.out.println();
    }

    public static int hasResources(Machine coffeeMachine) {
        if (coffeeMachine.getWater() < 200) {
            return 0;
        } else {
            return 1;
        }
    }


        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Machine coffeeMachine = new Machine();
        boolean exit = false;
        System.out.println("Write action (buy, fill, take):");
        while (!exit) {
            String input = scanner.nextLine();

            switch (input) {
                case ("buy") -> {
                    System.out.println();
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu");
                    String subInput = scanner.nextLine();
                    switch (subInput) {
                        case "1" -> makeEspresso(coffeeMachine);
                        case "2" -> makeLatte(coffeeMachine);
                        case "3" -> makeCappuccino(coffeeMachine);
                        case ("back") ->{}
                    }
                    scanner.reset();
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                }
                case ("fill") -> {
                    System.out.println("Write how many ml of water you want to add:");
                    int water = scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add: ");
                    int milk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    int coffeeBeans = scanner.nextInt();
                    System.out.println("Write how many disposable cups you want to add:");
                    int cups = scanner.nextInt();
                    fillMachine(coffeeMachine,water, milk, coffeeBeans, cups);
                    System.out.println();
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                }
                case ("take") -> {
                    takeMachine(coffeeMachine);
                    System.out.println("Write action (buy, fill, take, remaining, exit):");
                }

                case ("remaining") -> coffeeMachine.DisplayMachine();
                case ("exit") -> exit = true;
            }
        }


    }
}

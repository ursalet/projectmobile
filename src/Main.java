public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int replenishmentAmount = 1100;
        int bonus;
        int totalAmount;

        if (replenishmentAmount > 1000) {
            bonus = replenishmentAmount / 100;
        } else {
            bonus = 0;
        }

        totalAmount = balance + replenishmentAmount + bonus;
        System.out.println(totalAmount);
        System.out.println(bonus);
    }
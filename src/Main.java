public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int replenishmentАmount = 2000;
        int bonus = 0;
        if (replenishmentАmount > 1000) {
            bonus = replenishmentАmount / 100;
        }
        int endBalance = startBalance + replenishmentАmount + bonus;
        System.out.println("Итоговый счет: " + endBalance );
        System.out.println("Бонусные рубли: " + bonus);
    }

}





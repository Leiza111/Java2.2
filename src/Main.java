public class Main {
    public static void main(String[] args) {
        int initialAccount = 100; // начальный счет
        int depositAmount = 1500; // сумма пополнения

        int bonus;

        if (depositAmount > 1000) {
            bonus = depositAmount / 100;
        } else {
            bonus = 0;
        }


        int totalAmount = initialAccount + depositAmount + bonus;
        System.out.println("Итоговая сумма на счету клиента - " + totalAmount + " рублей");
        System.out.println("Бонус равен - " + bonus + " рублей");
    }
}


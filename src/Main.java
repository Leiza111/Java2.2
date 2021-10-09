public class Main {
    public static void main(String[] args) {
        int initialAccount = 100; // начальный счет
        int depositAmount = 50; // сумма пополнения
        int bonus;
        bonus = depositAmount / 100; //как считает бонус
        int totalAmount;
        if (depositAmount >= 1000) { //если сумма пополнения >=1000
           totalAmount = initialAccount + depositAmount + bonus;
            System.out.println("Итоговая сумма на счету клиента - " + totalAmount + " рублей");
            System.out.println("Бонус равен - " + bonus + " рублей");
        } else { //иначе
            totalAmount = initialAccount + depositAmount;
            System.out.println("Итоговая сумма на счету клиента - " + totalAmount + " рублей");
            System.out.println("Бонусов нет"); //вывести на консоль бонусов нет
        }
    }
}

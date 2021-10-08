public class Main {
    public static void main(String[] args) {
        int initialАccount = 100;
        int depositАmount = 3000;
        int bonus = initialАccount + (depositАmount / 100) + depositАmount ;
        int noBonus = initialАccount + depositАmount ;
        if (depositАmount>=1000){
            System.out.println (bonus);
        } else System.out.println (noBonus);
    }
}


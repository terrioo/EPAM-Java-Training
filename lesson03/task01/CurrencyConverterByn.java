package lesson03;

// Task1;

public class CurrencyConverterByn {
    public static void main(String[] args) {
        int byn = 500;
        double usd, eur, rub;
        usd = byn / 2.086;
        eur = byn / 2.333;
        rub = byn / 3.24 * 100;
        System.out.println("Конвертация белорусского рубля в доллары, евро, российские рубли");
        System.out.printf("BYN --> USD = %.4f (доллара)\nBYN --> EUR = %.4f (евро)\nBYN --> RUB = %.4f (росс. рублей)",
                usd, eur, rub);
    }
}



package lesson04.task03;

public class NumberCheck {
    public static void main(String[] args) {
        int a = 1368;
        System.out.printf("Образуют ли цифры числа %d возрастающую(или убывающую) последовательность? --> %s\n", a,
                (Check.checkNumbers(a)) == true ? "Да" : "Нет");
    }
}

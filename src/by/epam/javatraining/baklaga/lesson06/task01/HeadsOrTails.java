package by.epam.javatraining.baklaga.lesson06.task01;


public class HeadsOrTails {
    public static void main(String[] args) {
        int count = 1000;
        int countHeads = RandomCoin.throwCoinFindHeads(count);
        int countTails = RandomCoin.FindTails(count, countHeads);
        Info.print(count, countHeads, countTails);
    }
}

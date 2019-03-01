package lab3.task6;

public class ATM {
    private int twenties;
    private int fifty;
    private int hundreds;

    public ATM(int twenties, int fifty, int hundreds) {
        this.twenties = twenties;
        this.fifty = fifty;
        this.hundreds = hundreds;
    }

    public void insertMoney(int twenties, int fifty, int hundreds) throws Exception {
        if (twenties < 0 || fifty < 0 || hundreds < 0) {
            throw new Exception("some argument < 0");
        }
        this.twenties += twenties;
        this.fifty += fifty;
        this.hundreds += hundreds;
        System.out.println("Money was added!");
    }

    public boolean giveMoney(int money) {
        int giveTwenties = 0;
        int giveFifty = 0;
        int giveHundreds = 0;

        giveHundreds = money / 100;
        money -= giveHundreds * 100;
        giveFifty = money / 50;
        money -= giveFifty * 50;
        giveTwenties = money / 20;
        money -= giveTwenties * 20;
        System.out.println(
                "Выдача:\n" +
                "\nСотни: " + giveHundreds +
                "\nПятидесятки: " + giveFifty +
                "\nДвадцатки:" + giveTwenties +
                "\nНе отдали:" + money
        );
        return true;
    }
}

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

    public int haveMoney(){
        return twenties * 20 + fifty * 50 + hundreds * 100;
    }

    public void insertMoney(int twenties, int fifty, int hundreds) throws Exception {
        if (twenties < 0 || fifty < 0 || hundreds < 0) {
            throw new Exception("Some argument < 0");
        }

        this.twenties += twenties;
        this.fifty += fifty;
        this.hundreds += hundreds;
        System.out.println("Money was added!");
    }

    public boolean giveMoney(int money) throws Exception {
        if (money < 0) {
            throw new Exception("Some argument < 0");
        }

        if (money > haveMoney()) {
            System.out.println("Cannot give money! There is not enough money in the ATM");
            return false;
        }

        if (money % 10 != 0) {
            System.out.println("ATM does not issue coins!");
            return false;
        }

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

        twenties -= giveTwenties;
        fifty -= giveFifty;
        hundreds -= giveHundreds;

        return true;
    }
}

package lab8.task1;

public class Encoder {

    private Pair<Integer, String> pair;

    public Encoder(Integer integer, String string) {
        pair = new Pair<>(integer, string);
    }

    public String encodeToInt() {
        String[] str = pair.secondElement.split("");
        StringBuilder finalStr = new StringBuilder();
        for (String iter : str) {
            for (Pair<Integer, String> iter2 : Alphabet.pairs) {
                if (iter.equals(iter2.secondElement)) {
                    finalStr.append(iter2.firstElement);
                }
            }
        }
        return finalStr.toString();
    }

    public String encodeToString() {
        String[] str = String.valueOf(pair.firstElement).split("");
        StringBuilder finalStr = new StringBuilder();
        for (String iter : str) {
            for (Pair<Integer, String> iter2 : Alphabet.pairs) {
                if (Integer.parseInt(iter) == iter2.firstElement) {
                    finalStr.append(iter2.secondElement);
                }
            }
        }
        return finalStr.toString();
    }
}

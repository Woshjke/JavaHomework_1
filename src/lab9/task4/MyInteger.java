package lab9.task4;

public class MyInteger {
    private Integer num;

    public MyInteger(Integer num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "MyInteger{" +
                "num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return this.num.equals(((MyInteger) o).num);
    }

    @Override
    public int hashCode() {
        return num;
    }
}

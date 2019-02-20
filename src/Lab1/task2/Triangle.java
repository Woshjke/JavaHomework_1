package Lab1.task2;

public class Triangle {
    private double side1, side2, side3;
    private double perimetr;
    private double area;

    Triangle(double x1, double x2, double y1, double y2, double z1, double z2) {
        side1 = calculateSide(x1, x2, y1, y2);
        side2 = calculateSide(y1, y2, z1, z2);
        side3 = calculateSide(x1, x2, z1, z2);
        perimetr = side1 + side2 + side3;
        area = calculateArea((perimetr / 2), side1, side2, side3);
    }

    private double calculateSide(double a1, double a2, double b1, double b2) {
        return Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
    }

    private double calculateArea(double halfPerimetr, double side1, double side2, double side3) {
        return Math.sqrt(halfPerimetr * (halfPerimetr - side1) * (halfPerimetr - side2) * (halfPerimetr - side3));
    }

    public double getPerimetr() {
        return perimetr;
    }

    public double getArea() {
        return area;
    }
}

package lab7.task3;

public enum MathOperator {
    ADD {
        public double execute(double a, double b) {
            return a + b;
        }
    },
    SUBSTRACT {
        public double execute(double a, double b) {
            return a - b;
        }
    },
    MULTIPLY {
        public double execute(double a, double b) {
            return a * b;
        }
    },
    DIVIDE {
        public double execute(double a, double b) {
            return a / b;
        }
    };

    abstract public double execute(double a, double b);
}

package OOPs_Again.Inheritance.Learning;

class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

// inheritance using extends . it is getting the behaviour of Calc

class AdvCalc extends Calc {
    int mul(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        return a / b;
    }
}

// it is multi level inheritance

class More extends AdvCalc {
    int mod(int a, int b) {
        return a % b;
    }

    double pow(int a, int b) {
        return Math.pow(a, b);
    }
}

public class Inher {
    public static void main(String[] args) {
        More c = new More();
        System.out.println(c.add(5, 6));
        System.out.println(c.sub(8, 5));
        System.out.println(c.mul(4, 5));
        System.out.println(c.div(4, 5));
        System.out.println(c.mod(8, 5));
        System.out.println(c.pow(8, 5));
    }
}

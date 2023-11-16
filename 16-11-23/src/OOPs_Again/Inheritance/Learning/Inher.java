package OOPs_Again.Inheritance.Learning;

class Calc {
    public int add(int a, int b) {
        return a + b;
    }

    public int sub(int a, int b) {
        return a - b;
    }
}

class AdvCalc extends Calc {
    int mul(int a, int b) {
        return a * b;
    }

    int div(int a, int b) {
        return a / b;
    }
}

public class Inher {
    public static void main(String[] args) {
        AdvCalc c = new AdvCalc();
        System.out.println(c.add(5, 6));
        System.out.println(c.sub(8, 5));
        System.out.println(c.mul(4, 5));
        System.out.println(c.div(4, 5));
    }
}

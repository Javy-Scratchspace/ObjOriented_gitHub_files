public class Main {
    public static void main(String[] args) {
        Fraction frac = new Fraction(2, 4);
        System.out.println(frac);
    
        Fraction newFrac = frac.multiply(frac.getInverse());
        System.out.println(frac);
        System.out.println(newFrac);

        Fraction frac1 = new Fraction(1, 5);
        Fraction frac2 = new Fraction(10, 2);

        if (frac1.getInverse().getInverse().equals(frac2.getInverse())) {
            System.out.println("A");
        }
        else {
            System.out.println("B");
        }
    }
}

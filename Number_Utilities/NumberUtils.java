package Number_Utilities; 

public class NumberUtils {

    // Arguments
    double num; 

    /*
     * This class provides utility methods for mathematical operations on a singular number.
     * The following are the methods: 
     * 
     * 1. Default constructor that inistializes the number to 0.0
     * 2. Contructor that sets the number to a given value
     * 3. Method to set the number
     * 4. Method to get the number
     * 5. Method to get the square of the number
     * 6. Method that takes the number and raises it to a given power
     * 7. Method for division and multiplication\
     * 8. Method for addition and subtraction
     * 
     * There are various methods that change the number to a new value and other methods
     * that return a value based on the number within this class. 
     */

    // Default constructor
    public NumberUtils() {
        this.num = 0.0;
    }

    // Constructor with a parameter that sets the num
    public NumberUtils(double num) {
        setNum(num);
    }

    // Method to set the number
    public void setNum(double num) {
        this.num = num; 
    }

    // Method to set the number
    public double getNum() {
        return num; 
    }

    // Method to get the square of the number
    public double getSquare() {
        return this.num * this.num;
    }

    // Method to get the number to the power of some exponent
    public double getPower(int exponent) {
        double result = 1.0; 
        for (int i = 0; i < exponent; i++) {
            result *= this.num; 
        }
        return result;
    }   

    // Method for addiation

    // Method to get the value of the classes number after division by another number
    public double getDivision(double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return this.num / divisor;
    }

    // Method to get the value of the classes number after multiplication by another number
    public double getMultiplication(double multiplier) {
        return this.num * multiplier; 
    }

    // Method to get the value of the classes number after addition by another number
    public double getAddition(double add) {
        return this.num + add;
    }

    // Method to get the value of the classes number after subtraction by another number
    public double getSubtraction(double sub) {
        if (sub > this.num) {
            throw new IllegalArgumentException("Subtraction value cannot be greater than the number.");
        }
        if (sub < 0) {
            throw new IllegalArgumentException("Subtraction value cannot be negative.");
        }
        
        return this.num - sub;
    }

    // Method to change the number to a new value by addition
    public void changeNumberByAddition(double add) {
        this.num+=add; 
    }

    // Method to change the number to a new value by subtraction
    public void changeNumberBySubtraction(double sub) {
        if (sub > this.num) {
            throw new IllegalArgumentException("Subtraction value cannot be greater than the number.");
        }
        if (sub < 0) {
            throw new IllegalArgumentException("Subtraction value cannot be negative.");
        }
        
        this.num -= sub; 
    }

    // Method to change the number to a new value by multiplication
    public void changeNumberByMultiplication(double multiplier) {
        this.num *= multiplier; 
    }

    // Method to change the number to a new value by division
    public void changeNumberByDivision(double divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero. ");
        }
        this.num /= divisor; 
    }

    // Method to duplicate the number
    public NumberUtils duplicate() {
        return new NumberUtils(this.num);
    }
}
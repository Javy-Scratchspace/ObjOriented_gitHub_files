// Lets practice doing java
public class practice {
    int val1; 
    static int val2 = 10; 

    // This is a constructor
    // It is used to initialize objects
    // There will be another constructor that takes the parameters of values
    practice() {
        this.val1=10; 
    }

    // This constructor only takes one parameter
    // This is is because val2 is a static variable
    // You cannot set static variables within a constructor or in general
    practice(int val1) {
        this.val1 = val1; 
    }

    public int add() {
        return this.val1 + val2; 
    }

    public void display(){
        System.out.println(String.valueOf(val1) + " " + String.valueOf(val2));
    }
}
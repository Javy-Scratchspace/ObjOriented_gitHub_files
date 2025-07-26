// Lets practice doing java 
class Main {
    public static void main(String[] args) {

        // array_helper();

        animal();

    }

    public static void array_helper() {
        ArrayHelper first_arr = new ArrayHelper();
        ArrayHelper second_arr = new ArrayHelper();
        ArrayHelper result = first_arr.add(second_arr);

        System.out.println(first_arr.getMin() + " " + first_arr.getMax());
        System.out.println(second_arr.getMin() + " " + second_arr.getMax());
        System.out.println(result.getMin() + " " + result.getMax());
    }

    public static void animal() {
        Dog myDog = new Dog("Henry");
        Pig myPig = new Pig("Peggy");

        myDog.doSomething("running");
        myPig.doSomething("eating");
    }
}
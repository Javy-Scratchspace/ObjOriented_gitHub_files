public class Pig extends Animal {

    Pig(String name) {
        super("Pig", "Mammal", name);
    }

    public void animalSound() {
        System.out.println("Oink Oink");
    }

    public void sleep() {
        System.out.println("Pig is sleeping");
    }
}
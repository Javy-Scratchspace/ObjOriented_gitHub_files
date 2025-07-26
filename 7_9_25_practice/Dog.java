class Dog extends Animal {

    Dog(String name) {
        super("Dog", "Mammal", name);
    }

    public void animalSound() {
        System.out.println("Bark Bark");
    }

    public void sleep() {
        System.out.println("Dog is sleeping");
    }
}
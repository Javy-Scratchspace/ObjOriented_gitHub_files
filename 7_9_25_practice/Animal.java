public abstract class Animal {
    public String species; 
    public String type; 
    public String name; 

    Animal(String species, String type, String name) {
        this.species = species; 
        this.type = type; 
        this.name = name; 
    }

    public void doSomething(String action) {
        System.out.println(this.name +  " of species " + this.species + " is " + action);
    }

    abstract void animalSound();
    abstract void sleep();
}
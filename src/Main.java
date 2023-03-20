public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.makeSound();
        cat.walk();
        cat.animalFood();
        Dog dog = new Dog();
        dog.makeSound();
        dog.walk();
        dog.animalFood();
        Mouse mouse = new Mouse();
        mouse.makeSound();
        mouse.walk();
        mouse.animalFood();
        Chicken chicken = new Chicken();
        chicken.makeSound();
        chicken.walk();
        chicken.animalFood();
        WildDuck wildduck = new WildDuck();
        wildduck.makeSound();
        wildduck.walk();
        wildduck.fly();
        wildduck.animalFood();
    }
}
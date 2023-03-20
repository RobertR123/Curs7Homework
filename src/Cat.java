public class Cat extends Animal{

    public void walk(){
        System.out.println("The cat is walking!");
    }

    public Cat(){
        this.setSound("meow!");
        this.setFood("cat food");
    }
}

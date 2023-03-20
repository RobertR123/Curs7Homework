public class WildDuck extends Animal{
    public void fly(){
        System.out.println("The duck is flying!");
    }
    public void walk(){
        System.out.println("The duck is walking!");
    }

    public WildDuck(){
        this.setSound("quack!");
        this.setFood("seeds, corn");
    }
}

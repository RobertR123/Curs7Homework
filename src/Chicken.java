public class Chicken extends Animal{
    public void walk(){
        System.out.println("The chicken is walking!");
    }

    public Chicken(){
        this.setSound("clucking!");
        this.setFood("seeds");
    }
}

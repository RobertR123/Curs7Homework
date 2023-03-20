public class Mouse extends Animal{
    public void walk(){
        System.out.println("The mouse is walking!");
    }

    public Mouse(){
        this.setSound("squick!");
        this.setFood("seeds");
    }
}

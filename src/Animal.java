public class Animal {
    private String sound;

    private String food;

    public void setSound(String sound){
        this.sound = sound;
    }

    public void setFood(String food){
        this.food = food;
    }

    public void animalFood(){
        System.out.println(this.food);
    }

    public void makeSound(){
        System.out.println(this.sound);
    }

}

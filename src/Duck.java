public class Duck extends Animal{
    private double weight;
    private String sound;
    private String color;
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

   public Duck(String color, String sound, double weight){
        setColor(color);
        setSound(sound);
        setWeight(weight);
   }

    @Override
    void makeSound() {
        System.out.println(getSound());
    }
}

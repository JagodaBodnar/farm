public class Farm {
    public static void main(String[] args) {
        System.out.println("------------------------");

        Animal duck = new Duck("brown", "quack quack", 50);
        duck.eat();
        duck.makeSound();
        System.out.println("------------------------");

        Animal pig = new Pig("pink", "oink oink", 150);
        pig.eat();
        pig.makeSound();

        System.out.println("------------------------");

        Pig pig2 = new Pig("red", "oink oink", 100);
        pig2.makeSound();

        System.out.println("------------------------");

        Duck duck2 =  new Duck("gray", "quack quack", 60);
        duck2.makeSound();
    }
}

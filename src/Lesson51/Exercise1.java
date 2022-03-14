package Lesson51;

public class Exercise1 {
    public static void main(String[] args) {
        Animal mammal = new Mammal();
        Animal bird = new Bird();
        Animal fish = new Fish();
        Animal cat = new Cat();
        mammal.move();
        System.out.println("=====");
        bird.move();
        System.out.println("=====");
        fish.move();
        System.out.println("=====");
        cat.move();
    }
}

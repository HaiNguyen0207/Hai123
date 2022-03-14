package Lesson51;

public class Fish extends Animal {
    private String color;   //màu lông
    private String food;    //thức ăn


    public Fish() {
        color = "";
        food = "";
    }

    public Fish(String color, String food) {
        this.color = color;
        this.food = food;
    }

    public Fish(String name, String type, float height, float weight, String habitat, String reproduction,
                String color, String food) {
        super(name, type, height, weight, habitat, reproduction);
        this.color = color;
        this.food = food;
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final String getFood() {
        return food;
    }

    public final void setFood(String food) {
        this.food = food;
    }

    protected void eat() {
        System.out.println("Cá đang ăn rêu ...");
    }

    @Override
    protected void sleep() {
        System.out.println("Cá đang ngủ ....");
    }

    @Override
    protected void relax() {
        System.out.println("Cá đang thư giãn ....");
    }

    @Override
    protected void move() {
        System.out.println("Cá đang di chuyển dưới nước...");
    }

    @Override
    protected void entertainment() {
        System.out.println("Cá đang bơi tung tăng giải trí....");
    }
}

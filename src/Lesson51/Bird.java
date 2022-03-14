package Lesson51;

public class Bird extends Animal {
    private String color;   //màu lông
    private String foodMain;    //thức ăn chính
    private String wingspan;    //sải cánh

    public Bird(String color, String foodMain, String wingspan) {
        this.color = color;
        this.foodMain = foodMain;
        this.wingspan = wingspan;
    }


    public Bird() {
        color = "";
        foodMain = "";
        wingspan = "";
    }

    public Bird(String name, String type, float height, float weight, String habitat, String reproduction,
                String color, String foodMain, String wingspan) {
        super(name, type, height, weight, habitat, reproduction);
        this.color = color;
        this.foodMain = foodMain;
        this.wingspan = wingspan;
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final String getFoodMain() {
        return foodMain;
    }

    public final void setFoodMain(String foodMain) {
        this.foodMain = foodMain;
    }

    public final String getWingspan() {
        return wingspan;
    }

    public final void setWingspan(String wingspan) {
        this.wingspan = wingspan;
    }

    @Override
    protected void eat() {
        System.out.println("Chim đang ăn cám ...");
    }

    @Override
    protected void sleep() {
        System.out.println("Chim đang ngủ trên cây ....");
    }

    @Override
    protected void relax() {
        System.out.println("Chim đang thư giãn ....");
    }

    @Override
    protected void move() {
        System.out.println("Chim đang đang ...");
    }

    @Override
    protected void entertainment() {
        System.out.println("Chim đang bơi tung tăng giải trí....");
    }
}

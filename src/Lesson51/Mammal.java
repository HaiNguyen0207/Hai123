package Lesson51;

public class Mammal extends Animal {
    private int numOfFoot; //số chân
    private String color; //màu lông
    private int numOfTeeth; //số răng
    private String behavior;    //tập tính ,hành vi

    public Mammal() {
        numOfFoot = 0;
        color = "";
        numOfFoot = 0;
        behavior = "";
    }

    public Mammal(int numOfFoot, String color, int numOfTeeth, String behavior) {
        this.numOfFoot = numOfFoot;
        this.color = color;
        this.numOfTeeth = numOfTeeth;
        this.behavior = behavior;
    }

    public Mammal(String name, String type, float height, float weight, String habitat, String reproduction,
                  int numOfFoot, String color, int numOfTeeth, String behavior) {
        super(name, type, height, weight, habitat, reproduction);
        this.numOfFoot = numOfFoot;
        this.color = color;
        this.numOfTeeth = numOfTeeth;
        this.behavior = behavior;
    }

    public final int getNumOfFoot() {
        return numOfFoot;
    }

    public final void setNumOfFoot(int numOfFoot) {
        this.numOfFoot = numOfFoot;
    }

    public final String getColor() {
        return color;
    }

    public final void setColor(String color) {
        this.color = color;
    }

    public final int getNumOfTeeth() {
        return numOfTeeth;
    }

    public final void setNumOfTeeth(int numOfTeeth) {
        this.numOfTeeth = numOfTeeth;
    }

    public final String getBehavior() {
        return behavior;
    }

    public final void setBehavior(String behavior) {
        this.behavior = behavior;
    }

    @Override
    protected void eat() {
        System.out.println("Hổ đang ăn uống .....");
    }

    @Override
    protected void sleep() {
        System.out.println("Hổ đang ngủ .....");
    }

    @Override
    protected void relax() {
        System.out.println("Hổ đang thư giãn...");
    }

    @Override
    protected void move() {
        System.out.println("Hổ đang di chuyển.....");
    }

    @Override
    protected void entertainment() {
        System.out.println("Hổ đang húc nhau ...");
    }
}

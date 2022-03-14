package Lesson51;

public abstract class Animal {
    private String name;    //tên
    private String type;  //loài
    private float height;   //chiều cao
    private float weight;   //cân nặng
    private String habitat;    //môi trường sống
    private String reproduction;   //hính thức sinh sản


    public Animal() {
        name = "";
        type = "";
        height = 0f;
        weight = 0f;
        habitat = "";
        reproduction = "";

    }

    public Animal(String name, String type, float height, float weight, String habitat, String reproduction) {
        this.name = name;
        this.type = type;
        this.height = height;
        this.weight = weight;
        this.habitat = habitat;
        this.reproduction = reproduction;
    }

    public final String getName() {
        return name;
    }

    public final void setName(String name) {
        this.name = name;
    }

    public final String getType() {
        return type;
    }

    public final void setType(String type) {
        this.type = type;
    }

    public final float getHeight() {
        return height;
    }

    public final void setHeight(float height) {
        this.height = height;
    }

    public final float getWeight() {
        return weight;
    }

    public final void setWeight(float weight) {
        this.weight = weight;
    }

    public final String getHabitat() {
        return habitat;
    }

    public final void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public final String getReproduction() {
        return reproduction;
    }

    public final void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }

    //hành động abstract
    protected abstract void eat(); //ăn

    protected abstract void sleep(); //ngủ

    protected abstract void relax();  //nghỉ

    protected abstract void move();    //di chuyển

    protected abstract void entertainment();//giải trí

}

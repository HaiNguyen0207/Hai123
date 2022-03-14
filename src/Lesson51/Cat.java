package Lesson51;

public class Cat extends Mammal {
    private int age;   //tuôi
    private String hobby;   //sở thích
    private String petName; //tên gọi riêng
    private String eyeColor;   //màu mắt


    public Cat() {
        age = 0;
        hobby = "";
        petName = "";
        eyeColor = "";
    }

    public Cat(int age, String hobby, String petName, String eyeColor) {
        this.age = age;
        this.hobby = hobby;
        this.petName = petName;
        this.eyeColor = eyeColor;
    }

    public Cat(int numOfFoot, String color, int numOfTeeth, String behavior, int age, String hobby, String petName,
               String eyeColor) {
        super(numOfFoot, color, numOfTeeth, behavior);
        this.age = age;
        this.hobby = hobby;
        this.petName = petName;
        this.eyeColor = eyeColor;
    }

    public Cat(String name, String type, float height, float weight, String habitat, String reproduction, int numOfFoot,
               String color, int numOfTeeth, String behavior, int age, String hobby, String petName, String eyeColor) {
        super(name, type, height, weight, habitat, reproduction, numOfFoot, color, numOfTeeth, behavior);
        this.age = age;
        this.hobby = hobby;
        this.petName = petName;
        this.eyeColor = eyeColor;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }
    //abstract

    @Override
    protected void eat() {
        System.out.println("Mèo đang ăn xúc xích...");
    }

    @Override
    protected void sleep() {
        System.out.println("Mèo đang ngủ trưa...");
    }

    @Override
    protected void relax() {
        System.out.println("Mèo đang giải trí");
    }

    @Override
    protected void move() {
        System.out.println("Mèo di chuyển ....");
    }

    @Override
    protected void entertainment() {
        System.out.println("Mèo đang vẫy đuôi...");
    }
}

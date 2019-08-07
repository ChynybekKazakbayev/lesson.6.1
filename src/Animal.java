public class Animal {
    private double weight;
    private int age;
    private String color;
    public static int counter;

    public double getWeight() {
        counter++;
        return weight;
    }

    public void setWeight(double weight) {
        counter++;
        this.weight = weight;
    }

    public int getAge() {
        counter++;
        return age;
    }

    public void setAge(int age) {
        counter++;
        this.age = age;
    }

    public String getColor() {
        counter++;
        return color;
    }

    public void setColor(String color) {
        counter++;
        this.color = color;
    }

    public static void printHello (){
        counter++;
        System.out.println("Hello");
    }



}

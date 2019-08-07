public class Dog extends Animal {

    private String breed;
    private String name;

    public Dog(){}

    public Dog(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.setAge(age);
    }

    public Dog(String breed, String name) {
        this.breed = breed;
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bark(){
        System.out.println("Tyav-tyav");
    }

}



import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Dog d1 = new Dog("Haski", "Teo");
        d1.setAge(2);
        d1.setColor("Black");
        d1.setWeight(3.4);
        d1.setName("Leo");
        d1.bark();

        System.out.println("Кличка собаки = " +
                d1.getName());

        SmartDog sm = new SmartDog();
        sm.setAge(4);
        sm.setWeight(5.0);
        sm.setColor("White");
        sm.setName("Reks");
        sm.setBreed("Ovcharka");
        sm.setCommand(new String[]{"Sit", "Bark", "Jump"});

        System.out.println(sm.getAge() + " " +
                sm.getWeight() + " " + sm.getColor() +
                " " + sm.getName() + " " + sm.getBreed() + " "
                + Arrays.toString(sm.getCommand()));
        sm.bark();

        Animal.printHello();
        Animal a1 = new Animal();
        a1.setAge(4);

        Animal a2 = new Animal();
        a2.setAge(1);
        a2.setColor("Red");

        System.out.println(Animal.counter);
    }
}


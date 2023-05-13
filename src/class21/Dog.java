package class21;

class Animal{
    String name;
    String color;
    String breed;

    public Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void printInfo(){
        System.out.println(name+" "+color+" "+breed);
    }
}
public class Dog extends Animal{


    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }
}
class AnimalTester{
    public static void main(String[] args) {
        Dog dog=new Dog("shaggy","black","German");
        dog.printInfo();

    }
}


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

    void speak(){
        System.out.println("Animals speak");
    }
    void sleep(){
        System.out.println("Animals sleep from 1 to 20 hours a day");
    }
    void eat(){
        System.out.println("Animals eat many different things ");
    }
}
class Cat extends Animal{

    public Cat(String name, String color, String breed) {
        super(name, color, breed);
    }
    void speak(){
        System.out.println("Meow meow.....");
    }
}
public class Dog extends Animal{


    public Dog(String name, String color, String breed) {
        super(name, color, breed);
    }

    void speak(){
        System.out.println("woof woof");
    }
}

class Horse extends Animal{

    public Horse(String name, String color, String breed) {
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("neigh neigh");
    }
}

class AnimalTester{
    public static void main(String[] args) {
        Dog dog=new Dog("shaggy","black","German");
        dog.printInfo();
        //Parent class variables can store the objects of the child classes
        Animal dog1=new Dog("shaggy","black","German");
        dog1.printInfo();
        // 11:54
        Animal [] animals={new Dog("shaggy","black","German"),new Cat("Tom","Blue","persian")};

        for(Animal animal:animals){
            animal.printInfo();
        }



    }
}


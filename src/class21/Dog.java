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
class Cat extends Animal{

    public Cat(String name, String color, String breed) {
        super(name, color, breed);
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
        //Parent class variables can store the objects of the child classes
        Animal dog1=new Dog("shaggy","black","German");
        dog1.printInfo();

        Animal [] animals={new Dog("shaggy","black","German"),new Cat("Tom","Blue","persian")};

        for(Animal animal:animals){
            animal.printInfo();
        }



    }
}


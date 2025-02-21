package Task_20Feb.Abstraction;

abstract class Animal {
    private String name;

    public Animal(String name){
        this.name=name;

    }
    public abstract void makeSound();

    public String getName(){
        return  name;
    }
}

//Abstract class
class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "barks");
    }

}

//Abstract class
class Cat extends Animal{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + "meows");
    }
}

public class Hello{
    public static void main(String[] args) {
        Animal m=new Dog("ABC") ;
        Animal c=new Cat("PQR");
        m.makeSound();
        c.makeSound();
    }

}


abstract class Animal {
    abstract void makeSound();
}

class Cow extends Animal {
    @Override
    void makeSound() {
        System.out.println("Cow goes Moo");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog goes Woof");
    }
}

class Pig extends Animal {
    @Override
    void makeSound() {
        System.out.println("Pig goes Oink");
    }
}

class Goat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Goat goes Baa");
    }
}

class Lion extends Animal {
    @Override
    void makeSound() {
        System.out.println("Lion goes Roar");
    }
}

class Voice2 {
    Animal[] animals;

    public Voice2() {
        animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    public void templateMethod() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Voice2 voice2 = new Voice2();
        voice2.templateMethod();
    }
}

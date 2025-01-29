
abstract class Animal {
    abstract void makeVoice();
}

class Cow extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Moo!");
    }
}

class Dog extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Bark!");
    }
}

class Pig extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Oink!");
    }
}

class Goat extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Bleat!");
    }
}

class Lion extends Animal {
    @Override
    void makeVoice() {
        System.out.println("Roar!");
    }
}


class Voice {
    Animal[] animals;

    void prepareVoice() {
        animals = new Animal[5];
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
    }

    void hear() {
        for (Animal animal : animals) {
            animal.makeVoice();
        }
    }
}


public class Main {
    public static void main(String[] args) {
        Voice voice = new Voice();
        voice.prepareVoice();
        voice.hear();
    }
}

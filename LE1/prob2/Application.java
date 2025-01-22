class Mother {
    int x;

    void show() {
        System.out.println("Hello World"); // Original message
    }
}

class Child extends Mother {
    @Override
    void show() {
        System.out.println("Hello JUET"); // Overridden message
    }
}

class Application {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show(); // Calling show method of Mother

        Child ch = new Child();
        ch.show(); // Calling overridden show method of Child
    }
}

class Mother {
    int x;

    void show() {
        System.out.println("Show method of Mother class");
    }
}

class Child extends Mother {
    // Empty body, inherits all members of Mother
}

class Application {
    public static void main(String args[]) {
        Mother m = new Mother();
        m.show();

        Child ch = new Child();
        ch.show();
    }
}


class Juet {
    private String name;
    private int age;

    // Set function to set the name and age
    public void set(String name, int age) {
        this.name = name;
        this.age = age;

    }

    // Get function to print name and age
    public void get() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        Juet juet = new Juet();

        // Assigning name and age directly
        String name = "John";
        int age = 30;

        // Set name and age
        juet.set(name, age);

        // Get and print name and age
        juet.get();
    }
}

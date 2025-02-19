// Main.java
public class Main {
    public static void main(String[] args) {
        // Testing the Test class
        Test test = new Test();
        test.display();  // This will call the display() method implemented in Test

        // Testing the AbsTest class with a concrete subclass
        class ConcreteTest extends AbsTest {
            // Implementing the display() method in a subclass of AbsTest
            public void display() {
                System.out.println("Display method implemented in ConcreteTest.");
            }
        }

        ConcreteTest concreteTest = new ConcreteTest();
        concreteTest.display();  // This will call the display() method implemented in ConcreteTest
    }
}

class One {
    // Parameterized constructor in One
    One(int x) {
        System.out.println("One's parameterized constructor called with value: " + x);
    }
}

class Two extends One {
    // Constructor in Two causing the compilation error
    /*
    // This will cause an error because there is no default constructor in One
    Two() {
        System.out.println("Two's constructor");
    }
    */
    
    // Rectified constructor in Two
    Two(int x) {
        super(x); // Call the superclass constructor
        System.out.println("Two's constructor called with value: " + x);
    }
}

public class Application {
    public static void main(String[] args) {
        // This line causes the compilation error
        // Two t = new Two(); 

        // Rectified line with parameter passed
        Two t = new Two(10); // This should work now
    }
}

/*

1. Problem: Constructor in Two causing the compilation error

2. Solution: Define a constructor in Two and call super(x).

*/

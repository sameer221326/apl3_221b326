class Mother {
    // Non-static show() method
    // void show() {
    //     System.out.println("Mother's show()");
    // }

    // Static show() method in Mother only
    static void show() {
        System.out.println("Mother's static show()");
    }
}

class Child extends Mother {
    // Non-static show() method
    // void show() {
    //     System.out.println("Child's show()");
    // }

    // Static show() method in Child only
    // static void show() {
    //     System.out.println("Child's static show()");
    // }

    // Static show() method in both Mother and Child
    static void show() {
        System.out.println("Child's static show()");
    }
}

public class Application {
    public static void main(String[] args) {
        Mother m1 = new Child();

        // Non-static show() in both classes
        // m1.show(); // Calls Child's show()

        // Static show() in Mother only
        m1.show(); // Calls Mother's static show()

        // Static show() in Child only
        // m1.show(); // Calls Mother's show()

        // Static show() in both Mother and Child
        // m1.show(); // Calls Mother's static show()
    }
}

/*
Summary of Results:
1. Non-static show() in both classes:- Called: Child's show()

2. Static show() in Mother only:- Called: Mother's static show()

3. Static show() in Child only:- Called: Mother's show()

4. Static show() in both Mother and Child:- Called: Mother's static show()
*/

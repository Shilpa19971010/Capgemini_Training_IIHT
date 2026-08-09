// Parent Class
class Product {
    int id = 78;
    String name = "Amul";

    void display() {
        System.out.println("Product ID : " + id);
        System.out.println("Product Name : " + name);
    }
}

// Child Class A
class A extends Product {
    int count = 50;
    String category = "Butter";

    void display() {
        super.display();
        System.out.println("Category : " + category);
        System.out.println("Count : " + count);
    }
}

// Sub Child Class SubA
class SubA extends A {
    int price = 30;

    void totalPrice() {
        System.out.println("Total Price : " + (count * price));
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Category : " + category);
    }
}

// Child Class B
class B extends Product {
    int count = 90;
    String category = "Milk";

    void display() {
        super.display();
        System.out.println("Category : " + category);
        System.out.println("Count : " + count);
    }
}

// Sub Child Class SubB
class SubB extends B {
    int price = 10;

    void totalPrice() {
        System.out.println("Total Price : " + (count * price));
        System.out.println("ID : " + id);
        System.out.println("Name : " + name);
        System.out.println("Category : " + category);
    }
}

// Child Class C
class C extends Product {
    int count = 56;
    String category = "Choco";

    void display() {
        super.display();
        System.out.println("Category : " + category);
        System.out.println("Count : " + count);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        System.out.println("===== A Details =====");
        A objA = new A();
        objA.display();

        System.out.println("\n===== SubA Details =====");
        SubA subA = new SubA();
        subA.display();
        subA.totalPrice();

        System.out.println("\n===== B Details =====");
        B objB = new B();
        objB.display();

        System.out.println("\n===== SubB Details =====");
        SubB subB = new SubB();
        subB.display();
        subB.totalPrice();

        System.out.println("\n===== C Details =====");
        C objC = new C();
        objC.display();
    }
}
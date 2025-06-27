package inheritance;


class Parent {
    static String role = "Parent"; // inheritable so it is inherited
    static String s = "inheritable";  // inherited 
    
    static void display() {
    	System.out.println("static method from parent");
    }
    static void show() {
    	System.out.println("show from parent");
    }
}

class Child extends Parent {
	/*
	 * here i am using role the same name so idhunala parent ooda role vandhu kanama poirum so that static members are inherited but
	 * hidden 
	 */
    String role = "Child"; 
    static void show() {
    	System.out.println("show from child");
    }
    
}

public class Main {
    public static void main(String[] args) {
    	Parent fullParent = new Parent();
    	Parent polymorphic = new Child();
        Child fullChild = new Child();

        
        
        System.out.println("polymorphic object : "+ polymorphic.role);  // parent 
        System.out.println("Child object: " + fullChild.role); // child
        /*
         * following lines proved static members are inheritable when we use same name for method and variable
         *  it automatically hidden
         * but if we use another name clearly we can conclude that static members are inherited
         */
        System.out.println("polymorphic object : "+ polymorphic.s);  // inheritable
        System.out.println("Child object: " + fullChild.s); // inheritable
        polymorphic.display();  // inheritable
        fullChild.display(); // inheritable
        polymorphic.show();// here calling parent method how????? following point is the reason
        /*
         * In Java, when you access a static field (like a static variable or static method), 
         * Java looks at the reference type (left side) — not the object it actually points to.
         * It resolves the field at compile time, based on what the reference is declared as, not what it's pointing to.
         * If a child class has an instance field with the same name as a parent static field, then:

            If you use Parent reference, you get Parent’s static field

		    If you use Child reference, you get Child’s instance field

			This is called variable hiding, and it’s a little different from overriding.


         */
        
    }
}


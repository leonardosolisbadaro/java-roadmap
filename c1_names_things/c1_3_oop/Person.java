package c1_names_things.c1_3_oop;

/**
 * -> Java objects’ state and behavior
 * 
 * In Java, instances of a class are known as objects. Every object has state
 * and behavior in the form of instance fields and methods respectively.
 * 
 * -> Constructor Method in Java
 * 
 * Java classes contain a constructor method which is used to create instances
 * of the class.
 * 
 * The constructor is named after the class. If no constructor is defined, a
 * default empty constructor is used.
 * 
 * -> Constructor Signatures
 * 
 * A class can contain multiple constructors as long as they have different
 * parameter values. A signature helps the compiler differentiate between the
 * different constructors.
 * 
 * A signature is made up of the constructor’s name and a list of its
 * parameters.
 * 
 * -> Declaring a Method
 * 
 * Method declarations should define the following method information: scope
 * (private or public), return type, method name, and any parameters it
 * receives.
 * 
 * -> The body of a Java method
 * 
 * In Java, we use curly brackets {} to enclose the body of a method. The
 * statements written inside the {} are executed when a method is called.
 * 
 * -> Method parameters in Java
 * 
 * In java, parameters are declared in a method definition. The parameters act
 * as variables inside the method and hold the value that was passed in. They
 * can be used inside a method for printing or calculation purposes.
 * 
 * -> Java Variables Inside a Method
 * 
 * Java variables defined inside a method cannot be used outside the scope of
 * that method.
 */
class Person {
    // state of an object
    int age;
    String name;

    // Constructor method
    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // another Constructor method, different parameters
    public Person(String name) {
        this.age = 0; // default value
        this.name = name;
    }

    // behavior of an object, method
    public void set_value() {
        age = 20;
        name = "Robin";
    }

    // another method
    public void get_value() {
        System.out.println("Age is " + age);
        System.out.println("Name is " + name);
    }

    // method with parameters
    public void set_age(int age) {
        this.age = age;
    }

    /*
     * Returning info from a Java method
     * 
     * A Java method can return any value that can be saved in a variable. The value
     * returned must match with the return type specified in the method signature.
     * 
     * The value is returned using the return keyword.
     */
    public int get_age() {
        return this.age;
    }
}
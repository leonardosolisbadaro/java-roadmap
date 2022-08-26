package c1_names_things.c1_3_oop;

import c1_names_things.c1_3_oop.Person;

/**
 * -> Java instance
 * 
 * Java instances are objects that are based on classes. For example, Bob may be
 * an instance of the class Person.
 * 
 * Every instance has access to its own set of variables which are known as
 * instance fields, which are variables declared within the scope of the
 * instance. Values for instance fields are assigned within the constructor
 * method.
 * 
 * -> Creating a new Class instance in Java
 * 
 * In Java, we use the new keyword followed by a call to the class constructor
 * in order to create a new instance of a class.
 * 
 * The constructor can be used to provide initial values to instance fields.
 * 
 * -> Java dot notation
 * 
 * In Java programming language, we use . to access the variables and methods of
 * an object or a Class.
 * 
 * This is known as dot notation and the structure looks like this:
 * 
 * instanceOrClassName.fieldOrMethodName
 */
public class Clazz {
    public static void main(String[] args) {
        /*
         * Reference Data Types
         * 
         * A variable with a reference data type has a value that references the memory
         * address of an instance. During variable declaration, the class name is used
         * as the variable’s type.
         */
        Person Bob = new Person(31, "Bob"); // creates a new Person object, Age 31

        // changes state through behavior
        Bob.set_value(); // Age 20

        System.out.println("Age is " + Bob.age); // Prints: Age is 20

        // changes state with parameters
        Bob.set_age(33);

        System.out.println("Age is " + Bob.age); // Prints: Age is 33

        /*
         * null Values
         * 
         * null is a special value that denotes that an object has a void reference.
         */
        Bob = null; // set object to null

        System.out.println(Bob); // Prints: null
    }
}

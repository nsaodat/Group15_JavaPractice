public class Amrozia_ConceptQuestions {

/*

- What is the Instance method?
-It is a method that belongs to "Object" rather than class.
-It is Declared without "static" keyword (non-static method).
-In order to call instance methods, we need to create an "Object".

- Can we access instance variables by using the static method?
-No Because it is a instance variable which belongs to an object and it cannot be static.

-we cannot directly access the instance variables within a static method because a static method can
only access static variables or static methods.

-An instance variable, as the name suggests is tied to an instance of a class. Therefore, accessing it
directly from a static method, which is not tied to any specific instance doesn't make sense.
Therefore, to access an instance variable, we must have an instance of the class from which we access
the instance variable.
Example:
public class Test{
public int instanceVariable=10;
public static void main (String args[]{
Test test = new Test();
System.out.println (test.instanceVariable);
}
}
Output:
10
-


 */

}

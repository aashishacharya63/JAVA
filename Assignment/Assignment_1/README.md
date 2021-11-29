
**Reflection in JAVA**

Java programming language provides a feature called “Reflection” that allows us to modify the runtime behavior of a class or field or method at runtime. Thus a Reflection can be defined as a “technique of inspecting and modifying the runtime behavior of an unknown object at run time. An object can be a class, a field, or a method.”

   Unknown Object    --->     Reflection API   --->   Modify classes,method or felds behaviour at run time
   
 In the above representation, we can see that we have an unknown object. Then we use the Reflection API on this object. As a result, we can modify the behavior of this object at runtime.

Thus we can use Reflection API in our programs for the purpose of modifying the object’s behavior. The objects can be anything like methods, interfaces, classes, etc. We inspect these objects and then change their behavior at runtime using reflection API.
In Java, the “java.lang” and “java.lang.reflect” are the two packages that provide classes for reflection. The special class “java.lang.Class” provides the methods and properties to extract metadata using which we can inspect and modify the class behavior.

We use Reflection API provided by the above packages to modify the class and its members including fields, methods, constructors, etc. at runtime. A distinguishing feature of Reflection API is that we can also manipulate the private data members or methods of the class.
   
The Reflection API is mainly used in:
-Reflection is mainly used in debugging tools, JUnit, and frameworks to inspect and change the behavior at runtime.
-IDE (Integrated Development Environment) E.g. Eclipse IDE, NetBeans, etc.
-Test Tools etc.
-It is used, when your application has third-party libraries and when you want to know about the classes and methods available.

The Java program below demonstrates the reflection on a public field.

import java.lang.Class;

import java.lang.reflect.*;

class Student {
  public String StudentName;
}
class Main {

  public static void main(String[] args) {
     try{
         Student student = new Student();
        // get an object of the class Class
         Class obj = student.getClass(); 
 
       // provide field name and get the field info     
         Field student_field = obj.getField("StudentName");
        System.out.println("Details of StudentName class field:");
        // set the value of field
         student_field.set(student, "Lacey");
         
        // get the access modifier of StudentName
         int mod1 = student_field.getModifiers();
         String modifier1 = Modifier.toString(mod1);
         System.out.println("StudentName Modifier::" + modifier1);
        // get the value of field by converting in String
         String typeValue = (String)student_field.get(student);
         System.out.println("StudentName Value::" + typeValue);
     }
     catch(Exception e) {
         e.printStackTrace();
     }
  }
}

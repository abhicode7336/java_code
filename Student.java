import java.util.*;
class Student
{
String name;
int marks;
public void accept ()
{
name="Ajay";
marks=89;
}
public void display()
{
System.out.println("The name entered is" +name);
System.out.println("The marks entered is" +marks);
}
public static void main (String [] x)
{
Student obj = new Student();
obj.accept ();
obj.display ();
}
}
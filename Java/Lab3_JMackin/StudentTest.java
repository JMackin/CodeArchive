
/**
 * Write a description of class StudentTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StudentTest
{
    
    public void test()
    {   System.out.println("Creating an A1<X> object and 2 Student objects...\n");
        A1<Student> studentBody = new A1<Student>();
        Student james = new Student("james");
        Student beth = new Student("beth");
        james.setMajor("Physics");
        beth.setMajor("English");
        System.out.println("Adding first Student object to the array and printing...\n");
        studentBody.add(james);
        studentBody.print();
        System.out.println("\nPrinting size of array...\n");
        System.out.println(studentBody.size());
        System.out.println("\nAdding second Student object to array index 0 and printing...\n");
        studentBody.set(beth,0);
        studentBody.print();
        System.out.println("\nClearing the array and printing...\n");
        studentBody.clear();
        studentBody.print();
        System.out.println("\nAdding both Student objects to the array and printing...\n");
        studentBody.add(beth);
        studentBody.add(james);
        studentBody.print();
    }

    public static void main(String[] args)
    {
        StudentTest go = new StudentTest();
        go.test();
    }
}

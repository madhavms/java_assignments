/*https://www.geeksforgeeks.org/static-vs-dynamic-binding-in-java/*/
public class DynamicClass
{
    public static class superclass
    {int i=1;
        void print()
        {
            System.out.println("print in superclass.");
        }
    }

    public static class subclass extends superclass
    {int i=2;
        
        void print()
        {
            System.out.println("print in subclass.");
        }
    }

    public static void main(String[] args)
    {
        superclass A = new superclass();
        superclass B = new subclass();
        System.out.println("Value of i in A is 1:"+A.i);
        System.out.println("Value of i in B is 2:"+B.i);
        A.print();
        B.print();
    }
}

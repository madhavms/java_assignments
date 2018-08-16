class StaticVariable{

static int count;
int number;
}
public class TestStatic{
  public static void main(String[] args) {


  StaticVariable obj1=new StaticVariable();
  StaticVariable obj2=new StaticVariable();
  System.out.println("object 1 value of static count:"+obj1.count);
  System.out.println("object 2 value of static count:"+obj2.count);
  System.out.println("object 1 value of non-static number:"+obj1.number);
  System.out.println("object 2 value of non-static number:"+obj2.number);
  obj1.count=100;
  obj1.number=10;
  System.out.println("obj1.count=100;");
  System.out.println("obj1.number=10;");
  System.out.println("object 1 count after object 1 changed:"+obj1.count);
  System.out.println("object 2 count afetr object 1 changed:"+obj2.count);
  System.out.println("object 1 number after object 1 changed:"+obj1.number);
  System.out.println("object 2 number afetr object 1 changed:"+obj2.number);
}
}

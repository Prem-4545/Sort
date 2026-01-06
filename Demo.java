class Demo
{
    Demo()
{
    System.out.println("Inside default constructor");
}
Demo(int i)
    {
      this();
      System.out.println("Inside parameterized constructor");
    }
public static void main(String[] args) 
  {
    Demo d = new Demo(3);
  }
}
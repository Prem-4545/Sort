public class Inner2
{
    String name;
    static int roll;
    private String getName(String n)
    {
        name=n;
        return name;
    }
    static int getRoll(int r)
    {
         int age=10;
         static String add="Cuttack";
         static void display()
         {
            Inner2 i1=new Inner2();
            Test t=new Inner2();
            System.out.println("Name Is "+i1.getName("Sai"));
            System.out.println("Roll Number Is "+Inner2.getRoll(1));
            System.out.println("Age Is "+t.age+"\t"+"Address Is"+Test.add);
         }
    public static void main(String args[]){
        Test.display();
    }
}
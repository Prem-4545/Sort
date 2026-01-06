public class checked
{
    void show()
    {
        try{
            throw new Exception();
        } catch(Exception e){
            System.out.println("Java");
        }
    }
    void display()throws Exception{
      throw new Exception();
    }
    public static void main(String args[]){
        checked c=new checked();
        c.show();
        try {
            c.display();
        } catch (Throwable t) {
            System.out.println("interface");
        }
    }
}
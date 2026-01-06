public class NestedClass
{
    static class X
    {
        int j=90;
    }
    public static void main(String[] args){
        X a = new X();
        System.out.println(a.j);
    }
} 
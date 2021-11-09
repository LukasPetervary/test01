public class Main 
{
    public static void main(String[] args)
    {
        House a = new House();
        House b = new House(3, true);

        System.out.println("" + a.cost());
        System.out.println("" + b.cost());
    }
}
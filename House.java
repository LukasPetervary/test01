public class House {
    private int floors;
    private boolean backyard;

    public House()
    {
        floors = 1;
        backyard = true;
    }
    public House(int f, boolean b)
    {
        floors = f;
        backyard = b;
    }

    public int cost()
    {
        int c = 100000;
        if (backyard) {c+=50000;}
        c += floors * 40000;
        return c;
    }
}

class Main
{
    public static void main (String[] args)
    {
        NonGen ng = new NonGen();
        ng.quack();

        Gen rg = new Gen();
        rg.quack();

        Gen ig = new Gen<Integer>();
        ig.quack();

        SubGen bg1 = new SubGen();
        bg1.quack();

        SubGen bg2 = new SubGen<Baz>();
        bg2.quack();

        // Error: String not within bounds of T
        //SubGen bg3 = new SubGen<String>();
        //bg3.quack();

        SuperGen sg1 = new SuperGen();
        sg1.quack();

        SuperGen sg2 = new SuperGen<Foo>();
        sg2.quack();
    }
}

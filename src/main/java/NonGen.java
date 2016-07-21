class NonGen
{
    NonGen()
    {
        System.out.println("NonGen::ctor");
    }

    void quack ()
    {
        System.out.println("NonGen::quack");
    }

    static <R> void s (R x) { }
    <R> void ns (R x) { }
}

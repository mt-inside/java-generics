class SubGen<T extends Bar>
{
    SubGen()
    {
        System.out.println("SubGen::ctor");
    }

    void quack ()
    {
        System.out.println("SubGen::quack");
    }

    void take (T t)
    {
        System.out.println(t.getClass());
        //System.out.println(T.class.getName());
    }
}

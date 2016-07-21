class Gen<T>
{
    Gen()
    {
        System.out.println("Gen::ctor");
    }

    void quack ()
    {
        System.out.println("Gen::quack");
    }

    void take (T t)
    {
        System.out.println(t.getClass());
        //System.out.println(T.class.getName());
    }
}

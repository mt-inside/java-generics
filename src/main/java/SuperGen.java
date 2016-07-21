import java.util.*;

class SuperGen<T>
{
    private List<? super T> store = new ArrayList<>();


    SuperGen()
    {
        System.out.println("SuperGen::ctor");
    }

    void quack ()
    {
        System.out.println("SuperGen::quack");
    }

    void take (T t)
    {
        System.out.println(t.getClass());
        //System.out.println(T.class.getName());
    }

    List<? super T> get () // function returns a list, so list needs to be a consumer so that the fn can put stuff in it
    {
        return java.util.Collections.emptyList();
    }

    void set (List<? extends T> xs) // functions takes a list, so it's gonna wanna read from it (list is a producer)
    {
    }
}

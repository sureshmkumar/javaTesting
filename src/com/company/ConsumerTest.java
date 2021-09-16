package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {

    public static<T> void test(List<T> list,Consumer<T> consumer) //static method
    {
        for(T t:list)
        {
            consumer.accept(t);
        }
    }
    public static void main(String[] args) {
        List<String> alist = Arrays.asList("senthil","sureshMadhanagopal","Divya","Vigneshwaran","Sivakumar");
        test(alist,(String x) -> System.out.println(x+" ="+x.length()));

        //Consumer  == Accept() method
        //Function  == Apply() method
        //Supplier  == get()   method
        //Predicate == test()  method
    }
}

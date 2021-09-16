package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;


class person
{
    public  int  id;
    public String name;

    person(int id,String name)
    {
        this.id = id;
        this.name= name;
    }

}

public class Main {
    public static void main(String[] args) {
        person p1= new person(1, "suresh");
        person p2= new person(2,"sathya");
        person p3 =new person(3,"dinesh");
        person p4 = new person(5,"magesh");

        List<person> personList = new ArrayList<person>();
        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);

        Predicate<person> preage = (e) -> e.id >= 3 && e.id <=5;
        Predicate<person> prename = (nam) -> nam.name.startsWith("s");

        for(person p: personList)
        {
            if(preage.test(p))
            {
                System.out.println("Emp id ="+p.id+" is eligble for work");
            }
        }
        for(person p: personList)
        {
            if(prename.test(p))
            {
                System.out.println("Emp name="+p.name+" is eligible by name");
            }
        }
    }
}


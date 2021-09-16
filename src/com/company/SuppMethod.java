package com.company;

import java.math.BigDecimal;
import java.util.function.Supplier;

class Developer
{
    String name;
    BigDecimal salary ;

    public Developer(){}

    public Developer(String name,BigDecimal sal)
    {
        this.name = name;
        this.salary = sal;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Developer{" + "name='" + name + '\'' + ", salary=" + salary + '}';
    }
}


public class SuppMethod {

    public static Developer factory(Supplier<? extends Developer >supplier)
    {
        Developer developer = supplier.get();
        if(developer.name == null || "".equals(developer.getName()))
        {
            developer.setName("suresh_Mathanagopal");
        }
        developer.setSalary(BigDecimal.TEN);
        return developer;
    }
    public static void main(String[] args) {
       Developer dev = factory(Developer::new);
        System.out.println("Came Method =="+dev);

        Developer developer = factory(()-> new Developer("Mathanagopal",BigDecimal.ONE));
        System.out.println("Developer ==="+developer);



    }
}

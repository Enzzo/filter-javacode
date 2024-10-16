package ru.vasilev.filter;

public class FilterImpl implements Filter{
    @Override
    public Object apply(Object o) {
        System.out.printf("do something with %s\n", o.toString());
        return o;
    }
}
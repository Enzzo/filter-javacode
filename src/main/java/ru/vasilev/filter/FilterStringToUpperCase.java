package ru.vasilev.filter;

public class FilterStringToUpperCase implements Filter{
    @Override
    public Object apply(Object o) {
        return o.toString().toUpperCase();
    }
}
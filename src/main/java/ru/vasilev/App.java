package ru.vasilev;

import ru.vasilev.filter.Filter;
import ru.vasilev.filter.FilterImpl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        List<Integer> integers = List.of(1, 2, 3, 4);

        App app = new App();

        List<Integer> newIntegers = (ArrayList)app.filter(integers, new FilterImpl());
    }

    public <T> Collection filter(Collection<T> collection, Filter filter){
        Collection result = new ArrayList();
            for(T item : collection){
                result.add(filter.apply(item));
            }
        return result;
    }
}
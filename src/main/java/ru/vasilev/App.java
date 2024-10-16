package ru.vasilev;

import ru.vasilev.filter.Filter;
import ru.vasilev.filter.FilterStringToUpperCase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        Collection<String> words = List.of("word1", "Word2", "wORD3");
        Collection<Integer> ints = List.of(1, 2, 3);

        App app = new App();

        // I. Interface implementation
        Collection upperCaseWords = app.filter(words, new FilterStringToUpperCase());

        // II. Lambda
        Collection multipledIntegers = app.filter(ints, o -> {
            {
                Integer newInt  = (Integer)o * 2;
                return newInt;
            }
        });
    }

    public <T> Collection filter(Collection<T> collection, Filter filter){
        Collection result = new ArrayList(collection.size());
            for(T item : collection){
                result.add(filter.apply(item));
            }
        return result;
    }
}
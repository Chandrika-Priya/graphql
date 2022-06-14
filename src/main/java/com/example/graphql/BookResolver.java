package com.example.graphql;

import com.example.graphql.Model.Book;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

@Component
public class BookResolver implements GraphQLQueryResolver {
    public Book getBook(String isbn){
        return new Book("graphql","bookisbn123");
    }
}

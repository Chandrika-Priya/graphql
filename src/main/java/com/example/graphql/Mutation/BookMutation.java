package com.example.graphql.Mutation;

import com.example.graphql.Model.Book;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class BookMutation implements GraphQLMutationResolver {
    public Book createBook(Book book){
        return new Book(book.getTitle(),book.getIsbn());
    }
}

package com.example.graphql.Mutation;

import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class AuthorMutation implements GraphQLMutationResolver {

    public String createAuthor(String id,String name){
        return "";
    }
}

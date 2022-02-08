package graphQL;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;

@Component
public class Mutation implements GraphQLMutationResolver {
    private PostDao postDao;
    
    public Mutation(PostDao postDao) {
        this.postDao = postDao;
    }

    public Post writePost(String title, String text, String category) {
        return postDao.savePost(title, text, category);
    }
}
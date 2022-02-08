package graphQL;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLResolver;

@Component
public class PostResolver implements GraphQLResolver<Post> {
    private AuthorDao authorDao;

    public Author getAuthor(Post post) {
        return authorDao.getAuthorById(post.getAuthorId());
    }
    
    public PostResolver(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }
}
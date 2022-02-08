package graphQL;

import java.util.List;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;

@Component
public class  Query implements GraphQLQueryResolver {
    private PostDao postDao;
    
    public Query(PostDao postDao) {
        this.postDao = postDao;
    }
    
    public List<Post> getRecentPosts(int count, int offset) {
        return postDao.getRecentPosts(count, offset);
    }
    
    public Post findPost(String title) {
    	return postDao.getPostByTitle(title);
    }
}
package graphQL;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import reactor.core.publisher.FluxSink;

@Component

public class PostDao {

	public Post savePost(String title, String text, String category) {
		Post post = new Post();
		post.setTitle(title);
		post.setCategory(category);
		post.setText(text);

		publish(post);

		return post;
	}

	private void publish(Post post) {
		try {
			if (post.getCategory().equalsIgnoreCase("TECH")) {
				FluxSink<Post> sink = Service.cache.get(post.getCategory());
				sink.next(post);
			}
		}catch (Exception e) {
			System.out.println("---- exception while publishing ---");
		}
		

	}

	public List<Post> getRecentPosts(int count, int offset) {

		List<Post> posts = new ArrayList<Post>();
		posts.add(new Post("1", "Serverless", "Tech", "A1", "Embrace Serverless!!"));

		return posts;

	}

	public Post getPostByTitle(String title) {
		Post post = new Post();
		post.setTitle(title);
		post.setCategory("Tech");
		post.setText(title);
		return post;
	}

}

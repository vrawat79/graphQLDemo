package graphQL;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;


@Component
public class AuthorDao {

	public Author getAuthorById(String authorId) {
		// TODO Auto-generated method stub
		Author author = new Author();
		author.setName("Sydney Sheldon");
		
		return author;
	}

}

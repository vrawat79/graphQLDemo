package graphQL;

public class Post {
	private String id;
    private String title;
    private String category;
    private String authorId;
    private String text;
    
    public Post() {
    	
    }
    
	public Post(String id, String title, String category, String authorId, String text) {
				
		super();
		this.id = id;
		this.title = title;
		this.category = category;
		this.authorId = authorId;
		this.text = text;
		
		System.out.println("---- creating Post ----");

	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getAuthorId() {
		return authorId;
	}
	public void setAuthorId(String authorId) {
		this.authorId = authorId;
	}

	 public Author getAuthor() {
       Author author = new Author();
       author.setName("Jack Holmes");
       return author;
	 }
}

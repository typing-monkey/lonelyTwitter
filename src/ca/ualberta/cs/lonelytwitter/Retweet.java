package ca.ualberta.cs.lonelytwitter;

public class Retweet {
	
	private final Author orginal_author;
	private User user;
	
	public Retweet(Author orginal_author, User user) {
		super();
		this.orginal_author = orginal_author;
		this.user = user;
	}
	
	public Author getAuthor() {
		return orginal_author;
	}
	
	public User getUser() {
		return user;
	}
	
	public String getAuthorName() {
		return orginal_author.getName();
	}
	
	public String getUserName() {
		return user.getName();
	}
	
	
}

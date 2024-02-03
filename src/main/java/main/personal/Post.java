package main.personal;

public class Post {
    String post;

    public Post(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "Post{" +
                "post='" + post + '\'' +
                '}';
    }
}

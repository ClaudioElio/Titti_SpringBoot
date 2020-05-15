package it.mariani.titti.core.model;

public class Greeting {

    private long id;
    private String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Greeting() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
		this.id = id;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getContent() {
        return content;
    }

}

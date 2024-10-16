package src;

import java.time.Instant;

public class Note {

    private final String name;

    private String text;

    private final String author;

    private final Instant creationDate;
    private Instant updateDate;

    public Note(String name, String text) {
        this.name = name;
        this.text = text;

        author = null;

        creationDate = Instant.now();
    }

    public Instant getCreationDate() {
        return creationDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        this.updateDate= Instant.now();
    }

    public String getName() {
        return name;
    }

    public Instant getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Instant updateDate) {
        this.updateDate = updateDate;
    }
}

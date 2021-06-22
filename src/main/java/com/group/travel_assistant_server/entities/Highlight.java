package com.group.travel_assistant_server.entities;
import javax.persistence.*;

@Entity
@Table(name = "highlight", uniqueConstraints = { @UniqueConstraint(columnNames = { "id" }) })
public class Highlight
{
    @Id
    @Column(name="id", nullable = false)
    private int id;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="description", nullable = false)
    private String description;

    @Column(name="username", nullable = false)
    private String username;

    public Highlight() {
    }

    public Highlight(int id, String title, String description, String username) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}

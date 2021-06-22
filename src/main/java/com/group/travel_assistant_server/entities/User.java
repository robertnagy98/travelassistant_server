package com.group.travel_assistant_server.entities;
import javax.persistence.*;

@Entity
@Table(name = "user", uniqueConstraints = { @UniqueConstraint(columnNames = { "username" }) })
public class User
{
    @Id
    @Column(name="username", nullable = false)
    private String username;
    @Column(name="firstName", nullable = false)
    private String firstName;
    @Column(name="lastName", nullable = false)
    private String lastName;
    @Column(name="email", nullable = false)
    private String email;
    @Column(name="country", nullable = false)
    private String country;
    @Column(name="birth", nullable = false)
    private String birth;
    @Column(name="occupation", nullable = false)
    private String occupation;
    @Column(name="tripsPlanned", nullable = false)
    private String tripsPlanned;
    @Column(name="highlightsPosted", nullable = false)
    private String highlightsPosted;
    @Column(name="time", nullable = false)
    private String time;
    @Column(name="password", nullable = false)
    private String password;

    public User()
    { }

    public User(String username, String firstName, String lastName, String email, String country, String birth, String occupation, String tripsPlanned, String highlightsPosted, String time, String password) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.country = country;
        this.birth = birth;
        this.occupation = occupation;
        this.tripsPlanned = tripsPlanned;
        this.highlightsPosted = highlightsPosted;
        this.time = time;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getTripsPlanned() {
        return tripsPlanned;
    }

    public void setTripsPlanned(String tripsPlanned) {
        this.tripsPlanned = tripsPlanned;
    }

    public String getHighlightsPosted() {
        return highlightsPosted;
    }

    public void setHighlightsPosted(String highlightsPosted) {
        this.highlightsPosted = highlightsPosted;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

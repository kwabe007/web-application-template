package se.kth.sda6.skeleton.posts;

import javax.persistence.*;

// @TODO add Hibernate annotations to define which table and columns should be used to save the Post Object.
@Entity
@Table(name = "post")
public class Post {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // The DB will handle the process of generating the id.
    private Long id;
    @Column(name = "bandName")
    private String bandName;
    @Column(name = "tourName")
    private String tourName;
    @Column(name = "location")
    private String location;
    @Column(name = "date")
    private String date;


    public Post() {
    }

    public Post(Long id, String bandName, String tourName, String location, String date) {
        this.id = id;
        this.bandName = bandName;
        this.tourName = tourName;
        this.location = location;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}

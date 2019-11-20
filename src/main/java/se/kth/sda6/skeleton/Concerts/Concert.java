package se.kth.sda6.skeleton.Concerts;

import javax.persistence.*;

// @TODO add Hibernate annotations to define which table and columns should be used to save the Concert Object.
@Entity
@Table(name = "concert")
public class Concert {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)     // The DB will handle the process of generating the id.
    private Long id;
    @Column(name = "concertName")
    private String concertName;

    public Concert() {
    }

    public Concert(Long id, String concertName) {
        this.id = id;
        this.concertName = concertName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConcertName() {
        return concertName;
    }

    public void setConcertName(String concertName) {
        this.concertName = concertName;
    }
}

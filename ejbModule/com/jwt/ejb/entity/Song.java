package com.jwt.ejb.entity;
 
import java.io.Serializable;
import javax.persistence.*;
 
@Entity
@Table(name = "SONG")
public class Song implements Serializable {
 
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;
 
    @Column(name = "song_name", length = 50)
    private String songName;
 
    @Column(name = "author_name", length = 50)
    private String author_Name;
 
    @Column(name = "year", length = 10)
    private Integer year;
 
    public Integer getId() {
        return id;
    }
 
    public void setId(Integer id) {
        this.id = id;
    }

	public String getName() {
		return songName;
	}

	public void setName(String name) {
		this.songName = name;
	}

	public String getAuthor_Name() {
		return author_Name;
	}

	public void setAuthor_Name(String author_Name) {
		this.author_Name = author_Name;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}
    
}
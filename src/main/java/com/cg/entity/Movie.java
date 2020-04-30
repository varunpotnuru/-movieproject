package com.cg.entity;


import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="onlinemovies")
@DynamicUpdate
@DynamicInsert
public class Movie {
	
	@Id
	@Column(name="movie_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer movieId;
	
	@NotEmpty(message="movie name is mandatory")
	@Size(min=3,max=25,message="only alphabets and blank spaces are allowed")
	@Column(name="movie_name")
	private String movieName;
	
	@Column(name="release_year")
	private int releaseYear;
	
	@Column(name="genre")
	private String genre;
	
	@Column(name="director")
	private String director;
	
	@Column(name="runtime")
	private Integer runtime;
	
	@Column(name="language")
	private String Language;
	
	@Column(name="hero")
	private String hero;
	
	@Column(name="heroine")
	private String heroine;
	
	//@Column(name="trailer_link")
	//private String trailerLink;
	
	//@Column(name="image_links")
	//private String imageLinks;
	
	
	@JsonBackReference(value="listOfTheatres")
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.PERSIST)
	@JoinTable(name="movie_theatre",
			joinColumns=@JoinColumn(name="movie_id"),
			inverseJoinColumns=@JoinColumn(name="theatre_id"))
	
	private List<Theatre> listOfTheatres;
	
	
	

	public Movie() {
		super();
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public String getLanguage() {
		return Language;
	}

	public void setLanguage(String language) {
		Language = language;
	}

	public String getHero() {
		return hero;
	}

	public void setHero(String hero) {
		this.hero = hero;
	}

	public String getHeroine() {
		return heroine;
	}

	public void setHeroine(String heroine) {
		this.heroine = heroine;
	}

	
	
	

	public Movie(Integer movieId,
			@NotEmpty(message = "movie name is mandatory") @Size(min = 3, max = 25, message = "only alphabets and blank spaces are allowed") String movieName,
			int releaseYear, String genre, String director, Integer runtime, String language, String hero,
			String heroine, Theatre theatre) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.releaseYear = releaseYear;
		this.genre = genre;
		this.director = director;
		this.runtime = runtime;
		Language = language;
		this.hero = hero;
		this.heroine = heroine;
		
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public void setRuntime(Integer runtime) {
		this.runtime = runtime;
	}

	
	 
	                     
	
	

}

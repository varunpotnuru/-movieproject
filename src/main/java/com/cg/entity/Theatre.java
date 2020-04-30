package com.cg.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name="online_theatres")
public class Theatre {

	@Id
	@Column(name="theatre_id")
	private Integer theatreId;
	
	@Column(name="theatre_name")
	private String theatreName;
	
	@Column(name="theatre_city")
	private String theatreCity;
	
	@ManyToMany(mappedBy="listOfTheatres")
	@Column(name="movie_id")
	@JsonManagedReference
	private List<Movie> listOfMovies;
	
    @OneToMany(
            mappedBy = "theatre",
            cascade = CascadeType.ALL,
            orphanRemoval = true
        )
   
	private List<Screen> listOfScreens;
	
    @Column(name="manager_name")
    private String managerName;
    
    @Column(name="manager_contact")
	private String managerContact;

	public Theatre() {
		super();
	}

	public Integer getTheatreId() {
		return theatreId;
	}

	public void setTheatreId(Integer theatreId) {
		this.theatreId = theatreId;
	}

	public String getTheatreName() {
		return theatreName;
	}

	public void setTheatreName(String theatreName) {
		this.theatreName = theatreName;
	}

	public String getTheatreCity() {
		return theatreCity;
	}

	public void setTheatreCity(String theatreCity) {
		this.theatreCity = theatreCity;
	}


	public List<Screen> getListOfScreens() {
		return listOfScreens;
	}

	public void setListOfScreens(List<Screen> listOfScreens) {
		this.listOfScreens = listOfScreens;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	public String getManagerContact() {
		return managerContact;
	}

	public void setManagerContact(String managerContact) {
		this.managerContact = managerContact;
	}

	public Theatre(Integer theatreId, String theatreName, String theatreCity,
			List<Screen> listOfScreens, String managerName, String managerContact) {
		super();
		this.theatreId = theatreId;
		this.theatreName = theatreName;
		this.theatreCity = theatreCity;
	
		this.listOfScreens = listOfScreens;
		this.managerName = managerName;
		this.managerContact = managerContact;
	}

	public Theatre(String theatreName) {
		// TODO Auto-generated constructor stub
		super();
		this.theatreName=theatreName;
	}
	
    
    
}
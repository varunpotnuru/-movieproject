package com.cg.service;

import java.util.List;

import com.cg.entity.Admin;
import com.cg.entity.Movie;
import com.cg.entity.Screen;
import com.cg.entity.Show;
import com.cg.entity.Theatre;

public interface AdminServiceI 
{
	public List getAdmin()	;
	 public List getMovie();
	 public List getTheatre();
	 public List getShow();
	
	 public List getScreen();
	 public void createAdmin(Admin a);
	 public void createMovie(Movie m);
	 public void createTheatre(Theatre t);
	 public void createShow(Show s);
	 public void createScreen(Screen sc);
	
	 public void deleteMovie(int movieId);
	 public void deleteTheatre(int theatreId);
	 public void deleteShow(int showId);
	 public void deleteScreen(int screenId);
	 public Movie getBymovieId(int movieId);
	 public Theatre getBytheatreId(int theatreId);
	 public boolean isMovieNameExist(String movieName);
	
}

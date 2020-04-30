package com.cg.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cg.entity.Admin;
import com.cg.entity.Movie;
import com.cg.entity.Screen;
import com.cg.entity.Show;
import com.cg.entity.Theatre;

@Repository
public interface AdminDaoI 
{
 public List getAdmin()	;
 public List getMovie();
 public List getTheatre();
 public List getShow();
 public List getScreen();
 public void create(Admin a);	
 public void create(Movie m);
 public void create(Theatre t);
 public void create(Show s);
 public void create(Screen sc);
 
 
 public void deleteMovie(int movieId);
 public void deleteTheatre(int theatreId);
 public void deleteShow(int showId);
 public void deleteScreen(int screenId);
  public Movie getBymovieId(int movieId);
  public Theatre getBytheatreId(int theatreId);
  public boolean ismovieNameExist(String movieName);
 


 
}

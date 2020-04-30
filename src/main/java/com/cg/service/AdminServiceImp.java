package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.AdminDaoI;
import com.cg.entity.Admin;
import com.cg.entity.Movie;
import com.cg.entity.Screen;
import com.cg.entity.Show;

import com.cg.entity.Theatre;
@Service

public class AdminServiceImp implements AdminServiceI
{
	@Autowired
	AdminDaoI admindao;

	@Override
	public void createMovie(Movie m) 
	{
		admindao.create(m);

	}

	@Override
	public void createTheatre(Theatre t) 
	{
		admindao.create(t);

	}

	@Override
	public void createShow (Show s) 
	{
		admindao.create(s);

	}



	@Override
	public void deleteMovie(int movieId) 
	{
		
		admindao.deleteMovie(movieId);
		
		
	}

	@Override
	public void deleteTheatre(int theatreId) 
	{
		admindao.deleteTheatre(theatreId);

	}

	@Override
	public void deleteShow(int showId)
	{
		admindao.deleteShow(showId);

	}

	@Override
	public void createAdmin(Admin a) {
		// TODO Auto-generated method stub
		admindao.create(a);
		
	}

	@Override
	public List getAdmin() 
	{
		return admindao.getAdmin();
	}

	@Override
	public List getMovie() 	
	{
		
		return admindao.getMovie();
	}

	@Override
	public List getTheatre() {
		return admindao.getTheatre();
	}

	@Override
	public List getShow() {
		return admindao.getShow();
	}

	@Override
	public void createScreen(Screen sc) {
		// TODO Auto-generated method stub
		admindao.create(sc);
		
	}

	@Override
	public List getScreen() {
		// TODO Auto-generated method stub
		return admindao.getScreen();
	}

	@Override
	public void deleteScreen(int screenId) {
		// TODO Auto-generated method stub
		admindao.deleteScreen(screenId);
		
	}

	

	@Override
	public boolean isMovieNameExist(String movieName) {
		// TODO Auto-generated method stub
		return admindao.ismovieNameExist(movieName);
	}

	@Override
	public Movie getBymovieId(int movieId) {
		// TODO Auto-generated method stub
		return admindao.getBymovieId(movieId);
	}

	@Override
	public Theatre  getBytheatreId(int theatreId) {
		// TODO Auto-generated method stub
		return admindao.getBytheatreId(theatreId);
	}

	

}

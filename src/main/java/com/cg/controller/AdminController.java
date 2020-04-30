package com.cg.controller;


import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.MediaType;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.cg.entity.Admin;
import com.cg.entity.Movie;
import com.cg.entity.Screen;
import com.cg.entity.Show;

import com.cg.entity.Theatre;
import com.cg.exception.AdminException;

import com.cg.service.AdminServiceI;

@CrossOrigin(origins="http://localhost:4200")                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       
@RestController
public class AdminController 
{
    @Autowired
    AdminServiceI adminservice;
    @GetMapping(value="/movie/{movieId}")
    public Movie getBymovieId(@PathVariable int movieId)
    {
    	return adminservice.getBymovieId(movieId);
    }
    @GetMapping(value="/theatre/{theatreId}")
    public Theatre getBytheatreId(@PathVariable int theatreId)
    {
    	return adminservice.getBytheatreId(theatreId);
    }
                               
    @GetMapping("/admin")
    public List<Admin> fetchAdmin()
    {
  	return adminservice.getAdmin(); 
    }
    @GetMapping("/movie")
    public List<Movie> fetchMovie()
    {
  	 return adminservice.getMovie(); 
    }
    @GetMapping("/theatre")
    public List<Theatre> fetchTheatre()
    {
  	return adminservice.getTheatre();
    }
    @GetMapping("/show")
    public List<Show> fetchShow()
    {
  	return adminservice.getShow();  
    }
    @GetMapping("/screen")
    public List<Screen> fetchScreen()
    {
    	return adminservice.getScreen();
    }
    @PostMapping(value="/movie/new",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
    public String addMovie(@Valid @RequestBody Movie movie,BindingResult bindingResult) throws AdminException
    {
      String err="";
      if(bindingResult.hasErrors())
      {
    	  List<FieldError> errors=bindingResult.getFieldErrors();
    	  for(FieldError error:errors)
    	  {
    		  err +=error.getDefaultMessage();
    	  }
    	  throw new AdminException(err);
      }
      try
      {
    	  adminservice.createMovie(movie);
    	  return "it created";
      }
      catch(DataIntegrityViolationException exception)
      {
    	  
    	  throw new AdminException("id already exists");
      }
    	
    	
		
    	
    }
    @PostMapping(value="/theatre/new", consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)	
    public String addTheatre(@Valid @RequestBody Theatre theatre,BindingResult bindingResult) throws AdminException
    {

        String err="";
        if(bindingResult.hasErrors())
        {
      	  List<FieldError> errors=bindingResult.getFieldErrors();
      	  for(FieldError error:errors)
      	  {
      		  err +=error.getDefaultMessage();
      	  }
      	  throw new AdminException(err);
        }
        try
        {
          adminservice.createTheatre(theatre);
      	  return "it created";
        }
        catch(DataIntegrityViolationException exception)
        {
      	  
      	  throw new AdminException("id already exists");
        }
    	
    
    }
    @PostMapping(value="/screen/new",consumes= {"application/json"})	
    public String addScreen(@RequestBody Screen screen)
    {
    	adminservice.createScreen(screen);
    	return "statement added";
    }
    @PostMapping(value="/show/new",consumes= {"application/json"})
    public String addShow(@RequestBody Show show)
    {
    	adminservice.createShow(show);
    	return "statement added";
    }
    @GetMapping(value="/deleteMovie/{movieId}")
    public void deleteMovie(@PathVariable int movieId)
    {
    	adminservice.deleteMovie(movieId);
    }
    @GetMapping(value="/deleteTheatre/{theatreId}")
    public void deleteTheatre(@PathVariable int theatreId)
    {
    	adminservice.deleteTheatre(theatreId);
    }
    @GetMapping(value="/deleteShow/{showId}")
    public void deleteShow(@PathVariable int showId)
    {
    	adminservice.deleteShow(showId );                                                                                                                            
    }
    @GetMapping(value="/deleteScreen/{screenId}")
    public void deleteScreen(@PathVariable int screenId)
    {
    	adminservice.deleteScreen(screenId);
    	
    }
}

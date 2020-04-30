package com.cg;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.dao.AdminDaoI;
import com.cg.entity.Admin;
import com.cg.entity.Customer;
import com.cg.entity.Movie;
import com.cg.entity.Screen;
import com.cg.entity.Show;
import com.cg.entity.Theatre;
import com.cg.entity.UserType;
import com.cg.service.AdminServiceI;

@SpringBootApplication
public class OnlinemovieApplication implements CommandLineRunner {
 @Autowired
 AdminServiceI adminservice;
	

	public static void main(String[] args)	
	{
	SpringApplication.run(OnlinemovieApplication.class, args);
 
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	


	

	
	
     
	
		
	//adminservice.createMovie(m1);
	//System.out.println("its done");
	
		
		
		
		//Screen sc = new Screen();
		//sc.setHallHeight(150);
		//sc.setHallWidth(190);
		//sc.setScreenId(1002);
		//sc.setScreenName("screen b");
	
		//adminservice.createScreen(sc);
		//System.out.println("SCREEN DETAILSS ARE INSERTED");
	 //Show s = new Show();
	 //s.setShowName("matney");
	// s.setScreenId(sc);	
	 //s.setShowId(150);
	 //s.setScreenId(sc);
	 //adminservice.createShow(s);
	 //System.out.println("MOVIE DETAILS ARE INSERTED");
		//Movie m1 = new Movie();
		//m1.setDirector("trivikram");
		//m1.setGenre("action");
		//m1.setHero("pawankalyan");
		//m1.setHeroine("samantha");
		//m1.setMovieName("athadu");
		//m1.setListOfTheatres("imax");
	   //adminservice.createMovie(m1);
		
		//Theatre t1 = new Theatre();
		//t1.setManagerContact("797350784");
		//t1.setTheatreCity("singupuram");
		//t1.setTheatreName("geetamultiplex");
		//t1.setManagerName("varun");
		//t1.setTheatreId(15);
		//adminservice.createTheatre(t1);
		
		//System.out.println("INSERTED");
		//Movie mo = new Movie();
		//mo.setMovieName("bahubhali");
		//mo.setReleaseYear(2018);
		//mo.setDirector("rajamouli");
		//mo.setGenre("action");
		//mo.setHero("prabhas");
		//mo.setHeroine("anushka");
		//mo.setLanguage("telugu");
		//mo.setRuntime(120);
		//adminservice.createMovie(mo);
		//Theatre th = new Theatre();
		//th.setTheatreId(11);
		//th.setTheatreName("ramalaxmana");
		//th.setTheatreCity("srikakulam");
       // th.setManagerName("varun");
		//th.setManagerContact("9666090716");
		//adminservice.createTheatre(th);
		//Screen scr = new Screen();
		//scr.setHallHeight(120);
		//scr.setScreenId(150);
		//scr.setHallWidth(150);
		//scr.setTheatreId(th);
		//scr.setScreenName("screen a");
		//scr.setScreenId(15);
		//adminservice.createScreen(scr);
		
		
		
		
		
	 
	
		
		
		
		
		
	
	}
}

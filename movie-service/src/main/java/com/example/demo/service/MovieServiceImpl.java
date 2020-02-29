package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MovieDao;
import com.example.demo.model.Movie;
@Service
public class MovieServiceImpl implements MovieService {
	
	private MovieDao movieDao;
	
	
 @Autowired
	public MovieServiceImpl(MovieDao movieDao) {
		super();
		this.movieDao = movieDao;
	}



	@Override
	public Movie createMovie(Movie movie) {
		// TODO Auto-generated method stub
		return movieDao.save(movie) ;
	}



	@Override
	public List<Movie> getAllMovies() {
		
		return movieDao.findAll();
	}



	@Override
	public Optional<Movie> FindMovie(String id) {
		// TODO Auto-generated method stub
		return movieDao.findById(id);
	}



	@Override
	public void deleteMovie(String id) {
		// TODO Auto-generated method stub
		movieDao.deleteById(id);
	}

}

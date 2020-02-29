package com.example.demo.service;

import java.util.List;
import java.util.Optional;



import com.example.demo.model.Movie;

public interface MovieService {

	public Movie createMovie(Movie movie);
	public List<Movie> getAllMovies();
	public Optional<Movie> FindMovie(String id);
	public void deleteMovie(String id);
}

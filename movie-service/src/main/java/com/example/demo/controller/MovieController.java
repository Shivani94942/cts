package com.example.demo.controller;

import java.util.Optional;

//import java.util.ArrayList;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movie;
import com.example.demo.service.MovieService;

@RestController
@RequestMapping("/api")
public class MovieController {
	
	private MovieService movieService;
	
	@Autowired
	public MovieController(MovieService movieService) {
		super();
		this.movieService = movieService;
	}

	/*
	 * private static List<Movie> movieList= new ArrayList<>();
	 * 
	 * static { movieList.add(new Movie("1", "URI", "Synopsis-1"));
	 * movieList.add(new Movie("2", "Raazi", "Synopsis-2")); movieList.add(new
	 * Movie("3", "STOY", "Synopsis-3"));
	 * 
	 * }
	 */
	@PostMapping("/movies")
	public Movie createMovie(@RequestBody Movie movie) {
		return movieService.createMovie(movie);
	}
	
	@GetMapping("/movies")
	public ResponseEntity<?> getMovies(){
		
		return ResponseEntity.ok(movieService.getAllMovies());
	}
	
	
	  @GetMapping("/movies/{id}")
	  public ResponseEntity<?> getMovie(@PathVariable String id) {
		  Optional<Movie> movie= movieService.FindMovie(id);
	  
	  if(movie==null) {
		  return ResponseEntity.badRequest().body("Invalid id");
		  }
	  
	  return ResponseEntity.ok(movie);
	  
	  }
	  @PutMapping("/movies")
		public Movie updateMovie(@RequestBody Movie movie) {
			return movieService.createMovie(movie);
		}
	  
	  @DeleteMapping("/movies/{id}")
	  public void deleteMovie(@PathVariable String id) {
		  Optional<Movie> movie= movieService.FindMovie(id);
	  
	  if(movie==null) {
		   ResponseEntity.badRequest().body("Invalid id");
		  }
	  else {
		  movieService.deleteMovie(id);
	  }   
	  
	  }
/*
 * private Movie findMovie(Integer id) { return
 * getAllMovies().stream().filter(movie->movie.getId().equals(id)).findFirst().
 * orElse(null); }
 * 
 * 
 */
}

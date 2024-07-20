package movies.Rishabh.movies;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MovieService {
    @Autowired //to instanciate movieRepository
    private MoviesRepository moviesRepository;

    public List<Movie> getAllMovies() {
        return moviesRepository.findAll();

    }

    public Optional<Movie> getSingleMovie(String id) {
        return moviesRepository.findByImdbId(id);
    }
}

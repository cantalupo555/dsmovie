package br.com.cantalupo.dsmovie.repositories;

import br.com.cantalupo.dsmovie.entities.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}

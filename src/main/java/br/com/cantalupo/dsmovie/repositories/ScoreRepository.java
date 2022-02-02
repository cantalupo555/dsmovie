package br.com.cantalupo.dsmovie.repositories;

import br.com.cantalupo.dsmovie.entities.Score;
import br.com.cantalupo.dsmovie.entities.ScorePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}

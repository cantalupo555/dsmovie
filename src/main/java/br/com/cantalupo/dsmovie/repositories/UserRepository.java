package br.com.cantalupo.dsmovie.repositories;

import br.com.cantalupo.dsmovie.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmail(String email);
}

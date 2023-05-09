package repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import entity.User;

@EnableJpaRepositories
@Repository
public interface userRepo extends JpaRepository<User,Integer> {
	Optional<User> findOneByEmailAndPassword(String email, String password); 
    User findByEmail(String email);
}

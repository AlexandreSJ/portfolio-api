package br.com.aelxand.portfolioapi.repositories.auth;

import br.com.aelxand.portfolioapi.models.auth.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    List<User> findByRole(String role);
}

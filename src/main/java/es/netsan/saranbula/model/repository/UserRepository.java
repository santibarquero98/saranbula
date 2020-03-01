package es.netsan.saranbula.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.netsan.saranbula.model.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {

}
package br.com.viniciusprates.todolist.user;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;


//extends = extende os metodos de uma classe que queremos, nesse exemplo usamos o JpaRepository
public interface IUserRepository extends JpaRepository<UserModel, UUID> {
    UserModel findByUsername(String username);
}

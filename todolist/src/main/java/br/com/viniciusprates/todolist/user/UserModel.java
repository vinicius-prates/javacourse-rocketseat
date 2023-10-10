package br.com.viniciusprates.todolist.user;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

// Geralmente quando queremos pegar/mudar os dados, 
// nos utilizamos os getters/setters respectivamente.
// Com a lib @lombok, nao eh necessario incluir os getters/setters, basta colocar o @Data, como foi feito abaixo.

// Para usar o lombok em apenas um atributo, basta colocar o @Data em cima de um atributo.

@Data
@Entity(name ="tb_users") //reconhecimento da tabela usuarios no BD sera tb_users
public class UserModel {

    @Id
    @GeneratedValue(generator = "UUID") //desa forma o id sera gerado de maneira automatica
    private UUID id;

    @Column(unique = true) 
    private String username;
    private String name;
    private String password;

    @CreationTimestamp
    private LocalDateTime createdAt;
    
}



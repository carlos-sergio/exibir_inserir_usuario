package com.projeto.Projeto1.repositories;

import com.projeto.Projeto1.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface UserRepository extends JpaRepository<User, Long>{

    }


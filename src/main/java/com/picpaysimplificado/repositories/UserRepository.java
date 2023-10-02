package com.picpaysimplificado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<com.picpaysimplificado.domain.user.User,Long> {

    Optional<com.picpaysimplificado.domain.user.User> findUserByDocument(String document);
    Optional<com.picpaysimplificado.domain.user.User> findUserById(Long id);
}

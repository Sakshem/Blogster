package com.programming.sakshem.blogster.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programming.sakshem.blogster.model.RefreshToken;

import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByToken(String token);

    void deleteByToken(String token);
}

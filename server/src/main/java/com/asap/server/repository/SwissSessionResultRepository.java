package com.asap.server.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asap.server.domain.SwissSessionResult;

public interface SwissSessionResultRepository extends JpaRepository<SwissSessionResult, Long> {
  Optional<SwissSessionResult> findBySessionId(Long sessionId);
}
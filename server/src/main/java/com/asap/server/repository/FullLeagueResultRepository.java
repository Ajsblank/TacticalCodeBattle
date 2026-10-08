package com.asap.server.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.asap.server.domain.FullLeagueResult;

public interface FullLeagueResultRepository extends JpaRepository<FullLeagueResult, Long> {
  Optional<FullLeagueResult> findByContestId(Long contestId);
}
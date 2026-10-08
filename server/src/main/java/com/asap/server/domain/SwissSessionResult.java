package com.asap.server.domain;

import java.time.LocalDateTime;
import java.util.Map;

import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;
import org.springframework.data.annotation.Id;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "swiss_session_result")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class SwissSessionResult {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "contest_id", nullable = false)
  private Long contestId;

  @Column(name = "session_id", nullable = false, unique = true)
  private Long sessionId;

  @Column(name = "total_participants", nullable = false)
  private Integer totalParticipants;

  @JdbcTypeCode(SqlTypes.JSON)
  @Column(columnDefinition = "jsonb", nullable = false)
  private Map<String, Object> result;

  @Column(name = "created_at", insertable = false, updatable = false)
  private LocalDateTime createdAt;

  @Column(name = "updated_at")
  private LocalDateTime updatedAt;

  public static SwissSessionResult of(Long contestId, Long sessionId) {
    SwissSessionResult r = new SwissSessionResult();
    r.contestId = contestId;
    r.sessionId = sessionId;
    return r;
  }

  public void update(int totalParticipants, Map<String, Object> result) {
    this.totalParticipants = totalParticipants;
    this.result = result;
    this.updatedAt = LocalDateTime.now();
  }
}

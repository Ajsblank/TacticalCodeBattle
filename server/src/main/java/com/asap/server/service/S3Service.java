package com.asap.server.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@RequiredArgsConstructor
public class S3Service {

  public String readFileAsString(String keyOrUrl) {
    return "readFileAsString is not available.";
  }

  public void uploadJsonResult(String key, String json) {

    log.debug("현재 JSON 결과 업로드 코드는 실행되지 않음 - key: {}", key);
  }

  public void uploadCode(String key, String content) {
    log.debug("현재 코드 업로드 미완료 - key: {}", key);
  }

  public String uploadProfileImage(Long userId, byte[] imageBytes) {
    return "프로필 이미지 업로드 구현 필요";
  }

  public String buildFinalResultKey(Long contestId) {
    return "buildFinalResultKey";
  }

  public String buildSessionResultKey(Long contestId, int sessionNumber) {
    return "buildSessionResultKey";
  }

  public String buildCodeSubmissionKey(Long contestId, Long userId, Long submissionId) {
    return "buildCodeSubmissionKey";
  }
}
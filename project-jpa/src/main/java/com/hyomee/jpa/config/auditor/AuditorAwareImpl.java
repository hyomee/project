package com.hyomee.jpa.config.auditor;

import org.springframework.data.domain.AuditorAware;

import java.util.Optional;

/**
 * Auditing 기능을 확장 하여 등록자, 수정지 등의 정보를 가지고 온다
 * @EnableJapAuditing 을 활성화 하고
 * @Configuration을 통헤서 Bean 주입을 해야 함
 */
public class AuditorAwareImpl implements AuditorAware<String> {
  @Override
  public Optional<String> getCurrentAuditor() {
    String userid = "Test";
    // 이곳에 권한 사용자
    //  - Authentication authentication =
    //            SecurityContextHokder.getContext().getAuthentication()
    // Session 정보 사용
    //  RequestScopeUtil.getAttribute().getUserId()
     return Optional.of(userid);
  }
}

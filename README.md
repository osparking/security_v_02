1. 개발 목적: 뷰에서 username(="user") 표출
    - 참조: https://www.baeldung.com/spring-thymeleaf-user-info
2. 뷰파일 (index.html) 타임리프 태그
    - SEL(Spring Expression Language) 사용 : th:text="${#authentication.principal.username}"

    ![image](https://github.com/osparking/security_v_02/assets/11144061/bf5b1d49-b7a6-4184-b239-59338e60f335)

    - 타임리프 extra 모듈 제공 authentication 정보 및 security dialect 사용
      - html xmlns:sec="http://www.thymeleaf.org/extras/spring-security">
      - p>span sec:authentication="name">/span> 님 환영합니다!/p>"
3. 효과
    - 뷰페이지에 username 표시
  
    ![image](https://github.com/osparking/security_v_02/assets/11144061/95a09526-3e65-46db-ada4-7f7653800552)

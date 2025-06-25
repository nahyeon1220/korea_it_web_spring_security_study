package com.koreait.SpringSecurityStudy.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class User {
    private Integer userId;
    private String username;
    private String password;
    private String email;
}

//권한 목록과 유저 권한 목록을 따로 둔 이유
//만약 유저당 하나의 권한만 가질 수 있을 때
//User는 1개의 Role만 가질 수 있음
//Role은 N명의 사용자에게 부여될 수 있음
//--> 1:N 관계
//하지만 이러면 관리자이면서 일반사용자인 경우 동시에 두개의 권한을 가지는 것이 불가능

//User은 여러 Role을 가질 수 있음
//Role도 여러 User에게 부여될 수 있음
//--> N:M 관계
//이러면 권한 관리가 복잡해지기 때문에 권한 목록인 중간 테이블을 따로 분리해서 관리

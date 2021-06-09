package com.codesquad.issuetracker.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class JwtResponse {

    private final String accessToken;

    private final String tokenType;

}

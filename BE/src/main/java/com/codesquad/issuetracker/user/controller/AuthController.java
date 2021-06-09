package com.codesquad.issuetracker.user.controller;

import com.codesquad.issuetracker.user.dto.JwtResponse;
import com.codesquad.issuetracker.user.service.GithubLoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/login")
public class AuthController {

    private final GithubLoginService githubLoginService;

    public AuthController(GithubLoginService githubLoginService) {
        this.githubLoginService = githubLoginService;
    }

    @GetMapping("/github/web")
    public JwtResponse issueJwtForWeb(String code) {
        return githubLoginService.issueJwtForWeb(code);
    }

    @GetMapping("/github/ios")
    public JwtResponse issueJwtForIos(String code) {
        return githubLoginService.issueTokenForIos(code);
    }
}

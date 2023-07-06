package com.example.teemo_backend.Controller;


import com.example.teemo_backend.Domain.Dto.ChangePwRequest;
import com.example.teemo_backend.Service.UserService;
import com.example.teemo_backend.Utils.JwtTokenProvider;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/account")
public class AccountController {

    UserService userService;





    //비밀번호 변경
    @PatchMapping(value = "/pw-change")
    public ResponseEntity<String> changePassword(HttpServletRequest request, @RequestBody ChangePwRequest ChangePwRequest){

        String token  = request.getHeader("Authorization");

        userService.changePassword(token,ChangePwRequest);


        return ResponseEntity.ok().body("비밀번호가 변경되었습니다");
    }


}

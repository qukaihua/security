package com.qu.Controller;

import com.fasterxml.jackson.annotation.JsonView;
import com.qu.entity.User;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Created by 96283 on 2018/12/18.
 */

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/hello")
    @JsonView(User.userDetail.class)
    public User hello(){
        return new User();
    }

    @PostMapping("/getuser")
    public User getUser(@Valid @RequestBody User user, BindingResult errors){
        errors.getAllErrors().stream().forEach(error ->{
          System.out.println(error.toString());
        });
        return user;
    }


}

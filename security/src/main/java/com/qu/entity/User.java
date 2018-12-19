package com.qu.entity;

import com.fasterxml.jackson.annotation.JsonView;

import javax.validation.constraints.NotBlank;


/**
 * Created by 96283 on 2018/12/18.
 */
public class User {
    public interface userSimple{};
    public interface userDetail extends userSimple{};
    private String name;
    @NotBlank
    private String password;

    @JsonView(userSimple.class)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @JsonView(userDetail.class)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

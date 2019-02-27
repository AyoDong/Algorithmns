package com.sheldon.annotation;

import java.util.List;

public class PasswordUtils {

    @UseCase(id =47, description = "Password must contain at least one numeric")
    public boolean validatePassword(String pwd){
        return (pwd.matches("\\w\\d\\w*"));
    }

    @UseCase(id=48)
    public String encryptPassword(String pwd){
        return new StringBuilder(pwd).reverse().toString();
    }

    @UseCase(id=49, description = "New passwords can't equal previously used ones")
    public boolean checkForNewPwd(List<String> prevPwds, String pwd){
        return !prevPwds.contains(pwd);
    }
}

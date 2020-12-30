package com.huifu.hansund.pageobject;

import org.openqa.selenium.WebDriver;
import com.huifu.hansund.pagefactory.LoginFactory;
import org.springframework.stereotype.Service;
import org.testng.annotations.Test;

/**
 * @author leifeng.cai
 * @description
 * @time: 2020/12/29 13:34
 **/

public class LoginObject {

    WebDriver driver;

    //登录hkposs
    public HomeObject loginHkposs(String username, String password) {

        LoginFactory loginFactory = new LoginFactory();
        loginFactory.setAccount(username);
        loginFactory.setPassword(password);

        return new HomeObject();

    }



}

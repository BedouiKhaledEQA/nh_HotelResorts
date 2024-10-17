package com.nh_HotelResorts.pages;

import com.nh_HotelResorts.locators.login_locators;
import org.openqa.selenium.support.PageFactory;

public class login_page extends login_locators{
    public static login_page instance;
    public login_page(){
        PageFactory.initElements(driver,this);
    }


    public static login_page getInstance(){
        if(instance == null){
            instance=new login_page();
        }return instance;
    }
}

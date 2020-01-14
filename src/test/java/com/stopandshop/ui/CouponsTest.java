package com.stopandshop.ui;

import com.stopandshop.ui.BaseUI;
import org.testng.annotations.Test;

public class CouponsTest extends BaseUI {

    String currentBrowseCouponsURL;
    String currentLoadedCouponsURL;
    String currentOrderOnlineURL;


    @Test
    public void addCouponsTest(){
        homePage.signInPopUpWindow();
        couponsPage.clickIfVisible();
        //couponsPage.viewAllCouponsHomePage();
        couponsPage.addCoupons();
        //homePage.confirmAutoAddCoupons();



    }
    @Test
    public void clickAllCoupons(){
        homePage.signInPopUpWindow();
        couponsPage.clickIfVisible();
        couponsPage.addCoupons();
        couponsPage.titleAllCoupons();
        //couponsPage.addAllCoupons();
        couponsPage.addEveryCoupon();
    }
    @Test
    public void allCouponsLoaded(){
        couponsPage.signIn();
        couponsPage.viewAllCoupons();
    }
}

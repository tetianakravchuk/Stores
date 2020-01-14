package com.stopandshop.ui;

import org.openqa.selenium.By;

public class Locators {
    public static final By H1_TITLE = By.xpath("//h1");
    //Home Page

    //Primary Navigation List
    public By LINK_PHARMACY = By.xpath("//a[@id='utility-nav-pharmacy']");
    public static final By LINK_HOME = By.xpath("//img[@id='logo']");
    public static final By LINK_SAVINGS = By.xpath("//a[@id ='primary-nav-savings']");
    public static final By LINK_DIGITAL_COUPONS = By.xpath("//li[@class =\"c-buckets__item\"]//a[@href=\"/coupons-weekly-circular/digital-coupons\"]");
    public static final By LINK_WEEKLY_CIRCULAR = By.xpath("//li[@class = 'c-buckets__item']//a[@href='/coupons-weekly-circular/weekly-circular']");
    public static final By LINK_REWARDS_AND_PROGRAM = By.xpath("//li[@class ='c-buckets__item']//a[@href='/member-benefits']");

    //Shop Menu
    public static final By LINK_SHOP_PEAPOD_DELIVERY = By.xpath("//a[@href='https://peapod.com/?c3ch=OpCo+Websites&c3nid=stopandshop.com']");
    public static final By LINK_SHOP_CATERING = By.xpath("//li[@class='c-buckets__item']//a[@href='/shop-online/catering']");
    public static final By LINK_SHOP_GIFT_CARDS = By.xpath("//ul[@class ='c-buckets__list']//a[@href='/shop-online/giftcard']");
    public static final By LINK_SHOP_FLORAL = By.xpath("//ul[@class ='c-buckets__list']//a[@href='/floral']");
    public static final By LINK_SHOP_PRIVATE_BRANDS = By.xpath("//ul[@class ='c-buckets__list']//a[@href='/own-brands']");
    public static final By LINK_SHOP = By.xpath("//ul[@class='c-primary-nav__list']//a[@id ='primary-nav-shop']");

    //Savory Menu
    public static final By LINK_SAVORY = By.xpath("//a[@class='c-primary-nav__link h-light js-bucket-nav js-track-click']");
    public static final By LINK_SAVORY_SAVORY = By.xpath("//a[@class='c-buckets__logo']");
    public static final By LINK_SAVORY_BROWSE = By.xpath("//div[@class ='c-buckets__container']//a[@id='savory-browse']");
    public static final By LINK_SAVORY_MAGAZINE = By.xpath("//li[@class ='c-buckets__item']//a[@href='https://recipecenter.stopandshop.com/savory/magazine']");
    public static final By LINK_SAVORY_SEASONAL = By.xpath("//li[@class ='c-buckets__item']//a[@href='https://recipecenter.stopandshop.com/savory/seasonal-inspiration']");
    public static final By LINK_SAVORY_FAVORITES = By.xpath("//li[@class ='c-buckets__item']//a[@href='https://recipecenter.stopandshop.com/savory/favorites']");




    //Registration
    public static final By BUTTON_REGISTER = By.xpath("//p[@class='c-login__content']//a[@href='/sign-up']");
    public static final By BUTTON_NEEDS_THE_CARD = By.xpath("(//a[@class = 'a-button -blue -full-width'])[2]");
    public static final By BUTTON_REGISTRATION_NEEDS_CARD = By.xpath("//a[@href='/sign-up/registration']");
    public static final By LOYALTY_CARD_REGISTRATION = By.xpath("//a[@class ='a-button -white l-button-buddies__button js-track-click js-track-register-click']");
    public static final By REGISTRATION_NEEDS_CARD_BUTTON = By.xpath("//a[@id='regi-needs-card']");
    public static final By TEXT_FIELD_FIRSTNAME = By.cssSelector("input[name ='firstName']");
    public static final By TEXT_FIELD_LASTNAME = By.cssSelector("input[name ='lastName']");
    public static final By TEXT_FIELD_EMAIL = By.cssSelector("input[id ='email']");
    public static final By TEXT_FIELD_PASSWORD = By.cssSelector("input[id ='password']");
    public static final By TEXT_FIELD_CONFIRM_PASSWORD = By.cssSelector("input[id ='registration-confirm-password']");
    public static final By TEXT_FIELD_ADDRESS = By.cssSelector("input[id ='address']");
    public static final By TEXT_FIELD_CITY = By.cssSelector("input[id ='city']");
    public static final By TEXT_FIELD_PHONE = By.cssSelector("input[name ='phone']");
    public static final By NEXT_BUTTON_REGISTRATION = By.xpath("//a[@class=\"defer-link zeta a-link-blue\"]");
    public static final By CHOOSE_THE_STATE_FIELD = By.xpath("//div[@class ='chosen-container chosen-container-single']//a[@class ='chosen-single chosen-default']");
    public static final By CHOOSE_MA = By.xpath("//li[@id ='state-Massachusetts']");
    public static final By CHECKBOX_EMAIL_SUBSCRIPTIONS = By.id("checkbox-email-label");
    public static final By CHECKBOX_HOUSEHOLD_CARD_SHARING = By.id("checkbox-sharing-label");
    public static final By CHOOSE_A_STORE_LOCATION_ARROW = By.xpath("//div[@class='chosen-drop']//ul[@id='storeNumber-list']");
    public static final By CHOOSE_A_STORE_LOCATION_FIELD = By.xpath("//label[@id = 'label-storeNumber_chosen']");
    public static final By CHOOSE_KINGSTON_MA = By.xpath("//li[@id='storeNumber-160_Summer_Street__Kingston__MA_02364']");
    public static final By CHECK_BOX_AGREE_TERMS_AND_CONDITIONS_CLICK = By.id("checkbox-agree-label");
    public static final By CHECK_BOX_AGREE_TERMS_AND_CONDITIONS = By.xpath("//input[@id ='checkbox-agree']");
    public static final By BUTTON_NEXT= By.xpath("//button[@id ='registration-submit-button']");


    //    //Sign In
    public static final By LINK_SIGN_IN_PRIMARY = By.xpath("//a[@href='/sign-in']");
    public static final By TEXT_FIELD_USERNAME_PRIMARY = By.cssSelector("input#username");
    public static final By TEXT_FIELD_PASSWORD_PRIMARY = By.cssSelector("input#password");
    public static final By TEXT_FIELD_ZIP = By.xpath("//input[@name ='zip']");
    public static final By BUTTON_SIGN_IN_PRIMARY = By.cssSelector("//input[@id='login-submit-button']");
    public static final By BUTTON_SIGN_IN_UNLOCK = By.xpath("//a[@class = 'a-button -white l-button-buddies__button js-coremetrics-location js-track-click js-open-modal']");
    //Search
    public static final By SEARCH_HOME_PAGE = By.xpath("//a[@id='utility-nav-search']");
    //Titles
    public static final By TITLE_OF_PAGE = By.xpath("//h1");
    public static final By TITLE_OF_STORE_DEPARTMENTS = By.xpath("//div[@class ='l-content-strip__row']");
    public static final By TITLE_OF_FRESH_STORIES_PAGE = By.xpath("//h1[@class='c-page-intro-tile__title h-bold h-black']");
    //Footer Links
    public static final By ABOUT_STOP_AND_SHOP_LINK_LIST = (By.xpath("(//ul[@class='c-list--no-bullets'])[5]//li"));
    public static final By PRIVATE_BRANDS_IMAGE = (By.xpath("(//ul[@class='c-list--no-bullets'])[5]//li"));


    public static final By OWN_BRANDS_EXPLORE_BUTTON =(By.xpath("//a[@href=\"#/own-brands\"]"));
    public static final By FRESH_STORIES_IMAGE =(By.xpath("//img[@src=https://stopandshop.com/site/14/0/0/2/f6d08190-50de-49f8-9478-1a1f83ffc33d.jpg]"));
    public static final By STORE_DEPARTMENTS_IMAGE =(By.xpath("//img[@src= https://stopandshop.com/site/61/0/0/4/16e7c144-4a22-47bc-93cb-fc0a5ae334de.jpg]"));
    public static final By NEWS_MEDIA_IMAGE =(By.xpath("//img[@src=https://stopandshop.com/site/61/0/0/4/16e7c144-4a22-47bc-93cb-fc0a5ae334de.jpg]"));
    public static final By COMMUNITY_IMAGE =(By.xpath("//img[@src=https://stopandshop.com/site/80/0/0/0/cf11fd8c-318c-4563-9780-86fe73bb6431.jpg]"));

    //Career
    public static final By CAREER_LINK = (By.xpath("//div[@class='c-footer__top is-visible-xlarge']//a[@href='/our-careers']"));

    //Private brands
    public static final By EXPLORE_OUR_PRIVATE_BRANDS = (By.xpath("//div[@class='c-lower-banner__card']//a[@href='/own-brands']"));

    //Coupons
    public static final By PLEASE_CHECK_BACK_LATER = (By.xpath("(//p[@class='h-bold'])[1]"));
    public static  final By VIEW_MY_LOADED_COUPONS = (By.xpath("//a[@href='/coupons-weekly-circular/digital-coupons/#/loaded']"));
    public static final By COUPONS_LOAD_TO_CARD = (By.xpath("//div[@class='c-coupon__action']"));
    public static final By COUPONS_LOAD_TO_CARD_ONE = (By.xpath("(//button[@class ='c-coupon__button a-button -red -grows -full-width js-load-to-card js-coremetrics-location'])[1]"));
    public static final By COUPONS_LOAD_TO_CARD_TWO = (By.xpath("(//button[@class ='c-coupon__button a-button -red -grows -full-width js-load-to-card js-coremetrics-location'])[2]"));
    public static final By COUPONS_LOAD_TO_CARD_THREE = (By.xpath("(//button[@class ='c-coupon__button a-button -red -grows -full-width js-load-to-card js-coremetrics-location'])[3]"));
    public static final By COUPONS_LOAD_TO_CARD_FOUR = (By.xpath("(//button[@class ='c-coupon__button a-button -red -grows -full-width js-load-to-card js-coremetrics-location'])[4]"));
    public static final By COUPONS_LOAD_TO_CARD_FIVE = (By.xpath("(//button[@class ='c-coupon__button a-button -red -grows -full-width js-load-to-card js-coremetrics-location'])[5]"));
    public static final By COUPONS_PLUS_CLICK_ONE = (By.xpath("(//button[@class ='c-coupon-small__button js-coremetrics-location js-load-to-card'])[1]"));
    public static final By COUPONS_PLUS_CLICK_TWO= (By.xpath("(//button[@class ='c-coupon-small__button js-coremetrics-location js-load-to-card'])[2]"));
    public static final By COUPONS_PLUS_CLICK_THREE = (By.xpath("(//button[@class ='c-coupon-small__button js-coremetrics-location js-load-to-card'])[3]"));
    public static final By COUPONS_PLUS_CLICK_FOUR = (By.xpath("(//button[@class ='c-coupon-small__button js-coremetrics-location js-load-to-card'])[4]"));
    public static final By COUPONS_PLUS_CLICK_FIVE = (By.xpath("(//button[@class ='c-coupon-small__button js-coremetrics-location js-load-to-card'])[5]"));
    public static final By VIEW_ALL_COUPONS_HOME_PAGE = (By.xpath("//div[@class='h-margin-bottom-medium']//a[@href='/coupons-weekly-circular/digital-coupons']"));
    //Please Confirm
    public static final By CONFIRM_WINDOW_CLOSE = ((By.xpath("(//div[@class='reveal-overlay h-z-index-modals']//button[@class='a-close-button'])[2]")));
    public static final By CONFIRM_WINDOW = ((By.xpath("(//div[@class='l-modal__container'])[7]")));
    public static final By YES_AUTOMATICALLY_ADD = (By.xpath("//button[@class ='a-button -red js-list-preference']"));
    public static final By NO_THANKS = (By.xpath("(//button[@class ='a-button -red js-list-preference'])[1]"));

    //Sign in pop up window
    public static final By USERNAME_SIGN_IN_POPUP_WINDOW =(By.cssSelector("input#username-modal"));
    public static final By PASSWORD_SIGN_IN_POPUP_WINDOW =(By.cssSelector("input#password-modal"));
    public static final By SIGN_IN_POPUP_WINDOW =(By.xpath("//input[@id='login-submit-button-modal']"));
    public static final By CLOSE_SIGN_IN_POPUP_WINDOW_BUTTON =(By.xpath("//div[@class='a-close-button']//button[@class='a-close-button']"));
    public static final By SIGN_IN_UNLOCK_SAVINGS =(By.xpath("//a[@id ='sign-in-link']"));

    //Peapod
    public static final By ORDER_TODAY = (By.xpath("(//a[@href='https://www.peapod.com/?001=10005&006=10977'])[1]"));
    public static final By SHOP_ONLINE_WITH_PEAPOD = (By.xpath("(//a[@href='/shop-online/peapod/'])[3]"));
    public static final By LEARN_MORE_PEAPOD = (By.xpath("(//a[@href='/shop-online/peapod/'])[2]"));

    //Footer Links
    //About Stop & Shop
    public static final By OUR_STORY =(By.xpath("(//a[@href='/about'])[2]"));
    public static final By PRIVATE_BRANDS =(By.xpath("(//a[@href='/own-brands'])[5]"));
    public static final By FRESH_STORIES =(By.xpath("(//a[@href='/fresh-stories'])[2]"));
    public static final By STORE_DEPARTMENTS =(By.xpath("(//a[@href='/store-departments'])[2]"));
    public static final By NEWS_AND_MEDIA =(By.xpath("(//a[@href='/news-media'])[2]"));
    public static final By COMMUNITY =(By.xpath("(//a[@href='/community'])[2]"));
    //Customer Support
    public static final By CONTACT_US =(By.xpath("(//a[@href='/contact-us'])[2]"));
    public static final By FAQ =(By.xpath("(//a[@href='/frequently-asked-questions'])[2]"));
    public static final By COUPON_POLICY =(By.xpath("(//a[@href='/coupon-policy'])[2]"));
    public static final By FOOD_SAFETY =(By.xpath("(//a[@href='/foodsafety'])[2]"));
    public static final By PRODUCT_RECALLS =(By.xpath("(//a[@href='/recalls'])[2]"));
    //Company
    public static final By CAREERS =(By.xpath("(//a[@href='/our-careers'])[2]"));
    public static final By ASSOCIATE_CONNECT =(By.xpath("(//a[@href='https://www.ssneac.com/'])[2]"));
    public static final By NEW_SUPPLIERS =(By.xpath("(//a[@href='https://www.rangeme.com/aholddelhaizeusbrands'])[2]"));

    // Social Network Links
    public static final By FACEBOOK_HOMEPAGE_LINK = (By.xpath("//a[@href='https://www.facebook.com/StopandShop']"));
    public static final By PINTEREST_HOMEPAGE_LINK = (By.xpath("//a[@href='https://www.pinterest.com/stopandshop/']"));
    public static final By TWITTER_HOMEPAGE_LINK = (By.xpath("//a[@href='https://twitter.com/StopandShop']"));
    public static final By YOUTUBE_HOMEPAGE_LINK = (By.xpath("//a[@href='https://www.youtube.com/channel/UCH7XvOfJPnwHkFK6jqpxt9g']"));
    public static final By INSTAGRAM_HOMEPAGE_LINK = (By.xpath("//a[@href='https://www.instagram.com/stopandshop/']"));

    //Terms and Conditions
    public static final By TERMS_OF_USE =(By.xpath("//a[@href='/terms-of-use']"));
    public static final By PRIVACY_POLICY =(By.xpath("//a[@href='/privacy-policy']"));

    //Google Stores and App Store Links
    public static final By APP_STORE =(By.xpath("(//a[@href='https://itunes.apple.com/us/app/stop-shop/id423801622?mt=8'])[2]"));
    public static final By GOOGLE_PLAY =(By.xpath("(//a[@href='https://market.android.com/details?id=com.stopandshop.mobile.droid'])[2]"));

    //Coupons page
    public static final By LOADED_COUPONS_TAB = ((By.xpath("//div[@class ='c-tabs__item']//div[@class ='c-tabs__text h-bold h-center']")));
    public static final By PRINT_LOADED_COUPONS = ((By.xpath("")));
    public static final By ORDER_ONLINE_AVAILABLE_COUPONS = ((By.xpath("//div[@class='l-coupon-utils__print']//a[@href='https://www.peapod.com']")));
    public static final By BROWSE_COUPONS_LOADED_COUPONS = ((By.xpath("//a[@href='#/available']")));
    public static final By BROWSE_COUPONS_TAB = ((By.xpath("//a[@href='#/available']")));
    public static final By REFINE_AVAILABLE_COUPONS = ((By.xpath("//div[@class ='c-sort-filter c-sort-filter--min-300 is-open']")));
    public static final By SEARCH_COUPONS_AVAILABLE_COUPONS = ((By.xpath("//div[@class ='c-search c-search--coupons']")));
    public static final By SEARCH_ARROW_AVAILABLE_COUPONS = ((By.xpath("//button[@id='coupon-search-input-button']")));
    public static final By REMOVE_ALL_FILTERS_AVAILABLE_COUPONS = ((By.xpath("//button[@id='coupon-search-input-button']")));
    public static final By SORT_REDEEM_BY_DATE = ((By.xpath("(//div[@class='c-radio'])[1]")));
    public static final By SORT_VALUE_LOW_TO_HIGH = ((By.xpath("(//div[@class='c-radio'])[2]")));
    public static final By SORT_VALUE_HIGH_TO_LOW = ((By.xpath("(//div[@class='c-radio'])[3]")));
    public static final By SORT_BRAND = ((By.xpath("(//div[@class='c-radio'])[4]")));
    public static final By SORT_RECOMMENDED = ((By.xpath("(//div[@class='c-radio'])[4]")));
    public static final By FILTER_BABY_AND_CHILDCARE = ((By.xpath("(//div[@class='c-checkbox'])[1]")));
    public static final By FILTER_BAKERY = ((By.xpath("(//div[@class='c-checkbox'])[2]")));
    public static final By FILTER_BEVERAGES = ((By.xpath("(//div[@class='c-checkbox'])[3]")));
    public static final By FILTER_BREAKFAST = ((By.xpath("(//div[@class='c-checkbox'])[4]")));
    public static final By FILTER_CONDIMENTS_AND_SAUCES = ((By.xpath("(//div[@class='c-checkbox'])[4]")));
    public static final By FILTER_DAIRY = ((By.xpath("(//div[@class='c-checkbox'])[4]")));
    public static final By FILTER_DELI = ((By.xpath("(//div[@class='c-checkbox'])[4]")));
    public static final By FILTER_ETHNIC_PRODUCTS = ((By.xpath("(//div[@class='c-checkbox'])[4]")));
    public static final By FILTER_FROZEN_FOOD = ((By.xpath("(//div[@class='c-checkbox'])[4]")));
    public static final By FILTER_GENERAL_MERCHANDISE = ((By.xpath("(//div[@class='c-checkbox'])[4]")));
    public static final By FILTER_GRAINS_PASTA_BEANS = ((By.xpath("(//div[@class='c-checkbox'])[4]")));
    public static final By FILTER_HEALTH_WELLNESS = ((By.xpath("(//div[@class='c-checkbox'])[4]")));
    public static final By FILTER_HOUSEHOLD = ((By.xpath("(//div[@class='c-checkbox'])[4]")));
    public static final By FILTER_MEAT_SEAFOOD = ((By.xpath("(//div[@class='c-checkbox'])[4]")));
    public static final By FILTER_PERSONAL_CARE = ((By.xpath("(//div[@class='c-checkbox'])[4]")));
    public static final By FILTER_PET_CARE = ((By.xpath("(//div[@class='c-checkbox'])[4]")));
    public static final By FILTER_PRODUCE = ((By.xpath("(//div[@class='c-checkbox'])[4]")));
    public static final By FILTER_SNACKS = ((By.xpath("(//div[@class='c-checkbox'])[4]")));

    //Automatically add loaded coupons

    //Catering Page
    public static final By DROPDOWN_CHOOSE_STATE = ((By.xpath("//form[@id =\"chooseStore\"]//select[@name='stateSelect']")));
    public static final By DROPDOWN_CHOOSE_CITY = ((By.xpath("//select[@name='citySelect']")));
    public static final By DROP_DOWN_STATE_LIST = ((By.xpath("//select[@name='citySelect']")));

    //Shopping List
    public static final By SHOPPING_LIST_HOME_PAGE = ((By.xpath("//a[@id='utility-nav-shopping-list']")));
    public static final By SHOPPING_LIST_SORT = ((By.xpath("//button[@class = 'c-controls c-controls__button h-margin-right-small js-show-sort qa-list-sort']")));
    public static final By SHOPPING_LIST_OPTION = ((By.xpath("//button[@class = 'c-controls c-controls__button js-show-gear-list-options qa-list-options']")));
    public static final By SHOPPING_LIST_FAVORITES = ((By.xpath("//div[@id = 'favorites-toggle']")));
    public static final By SHOPPING_LIST_FAVORITES_EDIT = ((By.xpath("//div[@id = 'favorites-toggle']")));
    public static final By SHOPPING_LIST_FAVORITES_ADD_FAVORITE_INPUT = ((By.xpath("//input[@id = 'new-favorite-input']")));
    public static final By SHOPPING_LIST_FAVORITES_BUTTON = ((By.xpath("//div[@class ='c-sort-filter show-for-xlarge']")));
    public static final By SHOPPING_LIST_FAVORITES_FIELD = ((By.xpath("//div[@class ='c-textfield c-textfield--border h-margin-bottom-none h-center-row-vertical-spaced']")));
    public static final By SHOPPING_LIST_FAVORITES_ADD_BUTTON = ((By.xpath("//input[@class ='a-button -small -purple h-flex-grow-1 h-margin-right-medium js-submit-button qa-submit-button']")));
    public static final By FAVORITES_ADD_TO_SHOPPING_LIST = ((By.xpath("(//button[@class='a-list-icon js-add-to-list'])[1]")));
    public static final By FAVORITES_EDIT_LINK = ((By.xpath("//a[@class='a-link  h-margin-left-small js-edit']")));
    public static final By FAVORITES_REMOVE_BUCKET = ((By.xpath("//button[@class='a-list-icon js-remove-favorite']")));


   //Rewards and Programs
    // About Stop & Shop
    public static final By ABOUT_STOP_AND_SHOP_LINKS = ((By.xpath("(//ul[@class = 'c-list--no-bullets'])[5]//li")));
    //Customer Support
    public static final By CUSTOMER_SUPPORT_LINKS = ((By.xpath("(//ul[@class = 'c-list--no-bullets'])[6]//li")));
    //Company
    public static final By COMPANY_LINKS = ((By.xpath("(//ul[@class = 'c-list--no-bullets'])[7]//li")));

}

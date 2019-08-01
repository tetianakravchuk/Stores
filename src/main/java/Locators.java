import org.openqa.selenium.By;

public class Locators {
    //Primary Navigation List
    public static final By LINK_PHARMACY = By.xpath("//a[@id='utility-nav-pharmacy']");
    public static final By LINK_HOME = By.xpath("//img[@id='logo']");
    public static final By LINK_SAVINGS = By.xpath("//a[@id ='primary-nav-savings']");
    public static final By LINK_DIGITAL_COUPONS = By.xpath("//li[@class =\"c-buckets__item\"]//a[@href=\"/coupons-weekly-circular/digital-coupons\"]");
    public static final By LINK_WEEKLY_CIRCULAR = By.xpath("//li[@class = 'c-buckets__item']//a[@href='/coupons-weekly-circular/weekly-circular']");
    public static final By LINK_REWARDS_AND_PROGRAM = By.xpath("//li[@class =\"c-buckets__item\"]//a[@href=\"/member-benefits\"]");
    //Registration
    public static final By BUTTON_REGISTER = By.xpath("//p[@class=\"c-login__content\"]//a[@href=\"/sign-up\"]");
    public static final By BUTTON_REGISTRATION_NEEDS_CARD = By.xpath("//a[@href=\"/sign-up/registration\"]");
    public static final By LOYALTY_CARD_REGISTRATION = By.xpath("//a[@class =\"a-button -white l-button-buddies__button js-track-click js-track-register-click\"]");
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
    //Sign In
    public static final By LINK_SIGN_IN_PRIMARY = By.xpath("//a[@href='/sign-in']");
    public static final By TEXT_FIELD_USERNAME_PRIMARY = By.cssSelector("\"input#username\"");
    public static final By TEXT_FIELD_PASSWORD_PRIMARY = By.cssSelector("\"input#password\"");
    public static final By TEXT_FIELD_ZIP = By.xpath("//input[@name ='zip']");
    public static final By BUTTON_SIGN_IN_PRIMARY = By.cssSelector("//input[@id='login-submit-button']");
    //Search
    public static final By SEARCH_HOME_PAGE = By.xpath("//a[@id='utility-nav-search']");
    //Titles
    public static final By TITLE_OF_PAGE = By.xpath("//h1");
    public static final By TITLE_OF_FRESH_STORIES_PAGE = By.xpath("//h1[@class='c-page-intro-tile__title h-bold h-black']");
    //Footer Links
    public static final By ABOUT_STOP_AND_SHOP_LINK_LIST = (By.xpath("(//ul[@class='c-list--no-bullets'])[5]//li"));
    public static final By PRIVATE_BRANDS_IMAGE = (By.xpath("(//ul[@class='c-list--no-bullets'])[5]//li"));


    public static final By OWN_BRANDS_EXPLORE_BUTTON =(By.xpath("//a[@href=\"#/own-brands\"]"));
    public static final By FRESH_STORIES_IMAGE =(By.xpath("//img[@src=\"https://stopandshop.com/site/14/0/0/2/f6d08190-50de-49f8-9478-1a1f83ffc33d.jpg\"]"));

}

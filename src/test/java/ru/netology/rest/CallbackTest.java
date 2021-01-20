package ru.netology.rest;

public class CallbackTest {
    private WebDriver driver;

    @BeforeAll
    static void setUpAll(){
    System.setProperty("webdriver.chrome.driver","\\driver\\win\\chromedriver.exe");
    }

    @BeforeEach
    void setUp(){
    driver=new ChromeDriver();
    }

    @AfterEach
    void tearDown(){
    driver.quit();
    driver=null;
    }
    @Test
    void shouldTestSomething(){
    throw new UnsupportedOperationException();
    }

   // publicinterfaceWebDriverextendsSearchContext{voidget(Stringurl);
    //StringgetCurrentUrl();
    //StringgetTitle();
    //List<WebElement>findElements(Byby);
    //WebElementfindElement(Byby);
    //StringgetPageSource();
    //voidclose();
    //voidquit();

}

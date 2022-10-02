import Pages.BlogPage;
import org.junit.*;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class TestBlogPage extends Base{
    private static String MAIN_URL = "https://ithillel.ua/";
    private static BlogPage newsPage;

    @BeforeClass
    public static void before(){
        driver.get(MAIN_URL);
        newsPage=new BlogPage(driver);
    }
    @After
    public void nenuznuyMetod() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void aclickBlogNews() {
        newsPage.clickBlogButton();
        Assert.assertEquals(driver.getTitle(),"Корисні матеріали: Статті та новини IT-індустрії | Комп'ютерна школа Hillel");
        newsPage=new BlogPage(driver);
    }

    @Test
    public void bTestFrontEnd() {
        newsPage.printHrefListBlogMenu();
        newsPage.clickBlogMenu("frontend");

        System.out.println("frontend ="+newsPage.getListNewsSize());
        driver.navigate().back();

    }

    @Test
    public void cTestDevops(){
        newsPage.clickBlogMenu("devops");
        System.out.println("devops ="+newsPage.getListNewsSize());
        driver.navigate().back();
    }

    @Test
    public void dTestQA(){
        newsPage.clickBlogMenu("qa");
        System.out.println("QA ="+newsPage.getListNewsSize());
    }
    @Test
    public void eTestMarketing(){
        newsPage.clickBlogMenu("marketing");
        System.out.println("marketing ="+newsPage.getListNewsSize());
    }

}
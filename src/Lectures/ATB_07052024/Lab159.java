package ATB_07052024;

public class Lab159
{
    public static void main(String[] args)
    {
        openBrowser();
        testLoginPage();
        testLoginPage1("Home");
        closeBrowser();

        openBrowser();
        testLoginPage();
        testLoginPage1("Fav page");
        closeBrowser();

    }

    static void closeBrowser()
    {
        System.out.println("Chrome browser closed");
    }

    static void testLoginPage1(String page)
    {
        System.out.println("Page 2 opened: " + page);
    }
    static void testLoginPage()
    {
        System.out.println("Login page opened");
    }

    static void openBrowser()
    {
        System.out.println("Chrome browser opened");
    }
}

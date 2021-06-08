package day34_void_methods;

public class EtsySearchTest {
    public static void main(String[] args) {
        System.out.println("----Starting ETSY Search Smoke Test----");

        openBrowser();
        navigateToEtsyUrl();
        searchForWoodenSpoon();
        verifyResultsAreDisplayed();

    }


    public static void openBrowser(){
        System.out.println("1.Launching Chrome Browser");
    }
    public static void navigateToEtsyUrl() {
        System.out.println("2.Navigate to https://www.etsy.com/");
    }
    public static void searchForWoodenSpoon() {
        System.out.println("3.Type 'Wooden spoon' in search field and click search");
    }
    public static void  verifyResultsAreDisplayed() {
        System.out.println("4.Pass: Search results are successfully displayed");
    }
}

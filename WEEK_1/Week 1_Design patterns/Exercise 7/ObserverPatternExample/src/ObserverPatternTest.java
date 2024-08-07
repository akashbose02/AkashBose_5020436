// ObserverPatternTest.java
public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp1 = new MobileApp("App1");
        Observer mobileApp2 = new MobileApp("App2");
        Observer webApp1 = new WebApp("WebApp1");

        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp1);

        stockMarket.setStockPrice(100.00);
        System.out.println("");

        stockMarket.setStockPrice(105.50);
        System.out.println("");

        stockMarket.removeObserver(mobileApp1);

        stockMarket.setStockPrice(110.75);
    }
}

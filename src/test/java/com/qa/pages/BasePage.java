package com.qa.pages;

import com.qa.utils.TestUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import static com.qa.utils.TestUtils.driver;


public class BasePage extends TGglobalElement {

    TestUtils utils = new TestUtils();

    public WebDriver driver = utils.driver ;
    public BasePage(){
        PageFactory.initElements(this.driver,this);
    }

    public void waitForVisibility(WebElement e) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void waitForVisibility(By e) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(e));
    }

    public void clear(WebElement e) {
        waitForVisibility(e);
        e.clear();
    }

    public void click(WebElement e) {
        waitForVisibility(e);
        e.click();
    }

    public void click(WebElement e, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        e.click();
    }

    public void click(By e, String msg) {
        waitForVisibility(e);
        utils.log().info(msg);
        driver.findElement(e).click();
    }

    public void sendKeys(WebElement e, String txt) {
        // waitForVisibility(e);
        e.sendKeys(txt);
    }

    public void sendKeys(WebElement e, String txt, String msg) {
        //waitForVisibility(e);
        utils.log().info(msg);
        e.sendKeys(txt);
    }

    public String getAttribute(WebElement e, String attribute) {
        waitForVisibility(e);
        return e.getAttribute(attribute);
    }

    public String getAttribute(By e, String attribute) {
        waitForVisibility(e);
        return driver.findElement(e).getAttribute(attribute);
    }

    public String getText(WebElement e, String msg) {
        String txt;

                txt = e.getText();
        utils.log().info(msg + txt);
        return txt;
    }

//    public String getText(By e, String msg) {
//        String txt;
//        switch (new GlobalParams().getPlatformName()) {
//            case "Android":
//                txt = getAttribute(e, "text");
//                break;
//            case "iOS":
//                txt = getAttribute(e, "label");
//                break;
//            default:
//                throw new IllegalStateException("Unexpected value: " + new GlobalParams().getPlatformName());
//        }
//        utils.log().info(msg + txt);
//        return txt;
//    }

//    public void closeApp() {
//        ((InteractsWithApps) driver).closeApp();
//    }

//    public void launchApp() {
//        ((InteractsWithApps) driver).launchApp();
//    }
//
//    public WebElement andScrollToElementUsingUiScrollable(String childLocAttr, String childLocValue) {
//        return  (driver).findElementByAndroidUIAutomator(
//                "new UiScrollable(new UiSelector()" + ".scrollable(true)).scrollIntoView("
//                        + "new UiSelector()." + childLocAttr + "(\"" + childLocValue + "\"));");
//    }

//    public WebElement iOSScrollToElementUsingMobileScroll(WebElement e) {
//        RemoteWebElement element = ((RemoteWebElement) e);
//        String elementID = element.getId();
//        HashMap<String, String> scrollObject = new HashMap<String, String>();
//        scrollObject.put("element", elementID);
////	  scrollObject.put("direction", "down");
////	  scrollObject.put("predicateString", "label == 'ADD TO CART'");
////	  scrollObject.put("name", "test-ADD TO CART");
//        scrollObject.put("toVisible", "sdfnjksdnfkld");
////        driver.executeScript("mobile:scroll", scrollObject);
//        return e;
//    }

    public void iOSScrollToElementUsingMobileScrollParent(WebElement parentE, String predicateString) {
        RemoteWebElement parent = (RemoteWebElement) parentE;
        String parentID = parent.getId();
        HashMap<String, String> scrollObject = new HashMap<String, String>();
        scrollObject.put("element", parentID);
//	  scrollObject.put("direction", "down");
        scrollObject.put("predicateString", predicateString);
//	  scrollObject.put("name", "test-ADD TO CART");
//        scrollObject.put("toVisible", "sdfnjksdnfkld");
//        driver.executeScript("mobile:scroll", scrollObject);
//        By m = MobileBy.iOSNsPredicateString(predicateString);
//        System.out.println("Mobilelement is " + m);

    }

public WebElement scrollToElement(String txt) throws InterruptedException {
    WebElement element1 = driver.findElement(By.xpath(txt));
    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element1);
    Thread.sleep(500);
    element1.click();
    return element1;
}
    public WebElement scrollToElement(WebElement element, String direction) throws Exception {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        element.click();
        return element;
    }

    public By scrollToElement(By element, String direction) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int endX = (int) (size.width * 0.5);
        int startY = 0;
        int endY = 0;
        boolean isFound = false;

        switch (direction) {
            case "up":
                endY = (int) (size.height * 0.4);
                startY = (int) (size.height * 0.6);
                break;

            case "down":
                endY = (int) (size.height * 0.6);
                startY = (int) (size.height * 0.4);
                break;
        }

        for (int i = 0; i < 5; i++) {
            if (find(element, 1)) {
                isFound = true;
                break;
            } else {
                swipe(startX, startY, endX, endY, 1000);
            }
        }
        if (!isFound) {
            throw new Exception("Element not found");
        }
        return element;
    }

    public boolean find(final WebElement element, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
            return wait.until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver driver) {
                    if (element.isDisplayed()) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            return false;
        }
    }

    public boolean find(final By element, int timeout) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            return wait.until(new ExpectedCondition<Boolean>() {
                @Override
                public Boolean apply(WebDriver driver) {
                    if (driver.findElement(element).isDisplayed()) {
                        return true;
                    }
                    return false;
                }
            });
        } catch (Exception e) {
            return false;
        }
    }

    public void swipe(int startX, int startY, int endX, int endY, int millis) throws InterruptedException {
//        TouchAction t = new TouchAction((PerformsTouchActions) driver);
//        t.press(point(startX, startY)).waitAction(waitOptions(ofMillis(millis))).moveTo(point(endX, endY)).release()
//                .perform();
        JavascriptExecutor js = (JavascriptExecutor) driver;
         js.executeScript("window.scrollBy(0,350)", "");
    }

    public String elementGetText(WebElement e, String msg) {
        String txt;
        txt = e.getText();
        utils.log().info(msg + txt);

        return txt;
    }

    public String elementGetValue(WebElement e, String msg) {
        String txt;
        txt = e.getAttribute("value");
        utils.log().info(msg + txt);

        return txt;
    }
//    public void elementXpath1(String e, String msg) {
//        utils.log().info(msg);
//        driver.findElement("e").click();
//    }
    public void elementClick(String e, String msg) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(e)));
        utils.log().info(msg);
        element.click();
    }

    public WebElement convertWebElement(String e)  {

        return driver.findElement(By.xpath(e));
    }

    public void elementName(String e, String msg) {

        // try{
        utils.log().info(msg);
        driver.findElement(By.name(e)).click();

    }

    public void elementClick(WebElement e, String msg) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(e));
        utils.log().info(msg);
        element.click();

//        e.click();

    }
public void findAndClickMobileElement(String selectorPath,String injector, String selectorName) throws Exception {
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

}

    public void  findandclick(String selectorPath, String injector, String selectorName) {


    }


    public String findAndGetText(String selectorPath, String injector, String selectorName) {
        String text="";
//        WebElement element;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        return text;
    }



    public void  findandclick_Skeys(String selectorPath, String injector, String selectorName,String KeyVal,String keyText) {

//        WebElement element;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public void  findandclickM(By selectorPath) {
//        WebElement element;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                try {

                    wait.until(ExpectedConditions.elementToBeClickable(selectorPath));

                    if (!driver.findElements(selectorPath).isEmpty()) {

//                        wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));

                        driver.findElement(selectorPath).click();

                    } else {

//                        wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));

                        Thread.sleep(1000);
                        driver.findElement(selectorPath).click();

                    }
                } catch (Exception e) {

                    utils.log().info("Xpath" + selectorPath + "element not found");

        }
    }

    public String  findAndGetTextM(By selectorPath) {
//        WebElement element;
        String text="";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        try {

            wait.until(ExpectedConditions.visibilityOfElementLocated(selectorPath));

            if (!driver.findElements(selectorPath).isEmpty()) {

//                        wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));

                text=driver.findElement(selectorPath).getText();

            } else {

//                        wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));

                Thread.sleep(10000);
                text=driver.findElement(selectorPath).getText();

            }
        } catch (Exception e) {

            utils.log().info("Xpath" + selectorPath + "element not found");

        }
        return text;
    }

    // Function to merge partial xpath and related injector (name,value,etc)
    public WebElement mergeAndFindElement(String selectorPath, String injector, String selectorName) {

            WebElement element = FindAndSelectElement(selectorPath, injector, selectorName, 0);

        return element;
    }

    // Method to find and get the element
    public WebElement FindAndSelectElement(String selectorPath, String injector,
                                              String selectorName, int iteration) {
        WebElement element=findElement(selectorPath, injector, selectorName);


        return element;
    }

    public void SelectPickerWheelValue(String pickerClass, String selectedText, TestUtils.Order order, String msg) {
        // find pickerWheel
//        WebElement pickerWheel =  driver.findElementByXPath(pickerClass);
//
//        // limit search time to avoid infinite loops
//        String resultText;
//        boolean isDisplayed = false;
//        Long startTime = System.currentTimeMillis() + 30 * 1000; // 30 sec MAX
//        do {
//            resultText = pickerWheel.getText();
//
//            if (resultText.equals(selectedText)) {
//                isDisplayed = true;
//
//            } else {
//                if (!selectPickerWheelInIOS(pickerWheel, order)) {
//                    isDisplayed = false;
//                }
//            }
//        } while (!isDisplayed && System.currentTimeMillis() < startTime); // 30 sec MAX
//
//        if (!isDisplayed) {
//            utils.log().info("The expected text is not available. Expected Text: " +
//                    selectedText + ", Moving order:" + order.name().toLowerCase());
//        } else {
//            utils.log().info(msg);
//        }
    }

//    public boolean selectPickerWheelInIOS(WebElement element, TestUtils.Order order) {
//        HashMap<String, Object> pickerOptions = new HashMap<>();
//        pickerOptions.put("order", order.name().toLowerCase());
//        pickerOptions.put("offset", "0.1"); // tap offset
//        pickerOptions.put("element", element.getId()); // pickerWheel element
//        try {
//            driver.executeScript("mobile: selectPickerWheelValue", pickerOptions);
//            return true;
//        } catch (Exception ex) {
//            // skip the exception
//        }
//        return false;
//    }



    public List<WebElement> selectAndFindElements(String selectorPath) {
        List<WebElement> elements = FindAndSelectElements(selectorPath,0);
//        //Wait default
//        int iteration = 1;
//        do {
//            try {
//                if (iteration != 1) {
//                    // wait 1 sec
//                    Thread.sleep(1000);
//                }
//            } catch (InterruptedException e) {
//                // handling InterruptedException
//            }
//
//            iteration++;
//            // Get the element
//            elements = FindAndSelectElements(selectorPath,iteration);
//        } while (elements == null && iteration < Duration.ofSeconds(10));

        return elements;


    }

    public List<WebElement> FindAndSelectElements(String selectorPath, int iteration) {
        List<WebElement> elements = findElements(selectorPath);

//        try {
//            // Get the element
//            elements = findElements(selectorPath);
//        } catch (Exception ex) {
//
//            if (iteration == Duration.ofSeconds(10)) {
//                // log the exception
//                utils.log().info(ex.getMessage());
//            }
//
//            elements = null;
//        }

        return elements;
    }

    public List<WebElement> findElements(String selectorPath) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(selectorPath))));

        List<WebElement> elements = (List<WebElement>) driver.findElements(By.xpath(selectorPath));
        return elements;
    }


    // Method to find the element
    public WebElement findElement(String selectorPath, String injector, String selectorName) {
        WebElement element = null;
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        String elementXPath = utils.stringFormatInjector(selectorPath, injector);
//        switch (selectorName) {
//            case TestUtils.XPath:
//                try {
//
//                    element =  driver.findElementByXPath(elementXPath);
//
//                    if(!driver.findElements(By.xpath(elementXPath)).isEmpty()) {
//                        wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));
//                        return element;
//                    }
//
//                    else
//                    {
//
//                        wait.until(ExpectedConditions.elementToBeClickable((By.xpath(elementXPath))));
//                        driver.findElement(By.xpath(elementXPath));
//                        return element;
//                    }
//                }catch(Exception e){
//                    utils.log().info("element not found");
//                    element =  wait.until(new Function<WebDriver,WebElement>() {
//                        public WebElement apply(WebDriver arg0) {
//                            return driver.findElement(By.xpath(elementXPath));}
//                    });
//                }
//
//                break;
//            case TestUtils.Accessibility:
//                String accXPath = utils.stringFormatInjector(selectorPath, injector);
//                try {
//
////                    wait.until(ExpectedConditions.visibilityOfElementLocated((By.name(accXPath))));
//                    element =  driver.findElementByAccessibilityId(accXPath);
//
//                    if(!driver.findElements(By.id(accXPath)).isEmpty()) {
//                        wait.until(ExpectedConditions.elementToBeClickable((By.id(accXPath))));
//                        return element;
//                    }
//
//                    else
//                    {
//
////                        Thread.sleep(1000);
//
////                        wait.until(ExpectedConditions.visibilityOfElementLocated((By.name(accXPath))));
//                        wait.until(ExpectedConditions.elementToBeClickable((By.id(accXPath))));
//
//                        driver.findElement(By.id(accXPath));
//                        return element;
//                    }
//                }
//                catch(Exception e){
//                        utils.log().info("element not found");
//                        element =  wait.until(new Function<WebDriver,WebElement>() {
//                            public WebElement apply(WebDriver arg0) {
//                                return driver.findElementByAccessibilityId(accXPath);}
//                        });
//                    }
//                break;
//            case TestUtils.Name:
//                String elmName = utils.stringFormatInjector(selectorPath, injector);
//                wait.until(ExpectedConditions.visibilityOfElementLocated((By.name(elmName))));
//                element =  driver.findElementByName(elmName);
//                break;
//            default:
//                element = null;
//                utils.log().info("please choose correct selector as mentioned in TestUtils constants");
//                break;
//        }

        return element;
    }

    public WebElement scrollToElementPayments(WebElement element,String msg) throws Exception {

//        WebElement element1 = driver.findElement(By.xpath(txt));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        element.click();
            return element;
        }

    public void scrollToElementPayments(String txt,String msg) throws Exception {

        WebElement element = driver.findElement(By.xpath(txt));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
        Thread.sleep(500);
        element.click();

    }

    public void scrollToElementCategory(String direction) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int endX = (int) (size.width * 0.5);
        int startY = 0;
        int endY = 0;

        switch (direction) {
            case "up":
                endY = (int) (size.height * 0.2);
                startY = (int) (size.height * 0.4);
                break;

            case "down":
                endY = (int) (size.height * 0.6);
                startY = (int) (size.height * 0.4);
                break;
        }
        swipe(startX, startY, endX, endY, 200);
    }

    public void scrollToElementPayments(String direction) throws Exception {
        Dimension size = driver.manage().window().getSize();
        int startX = (int) (size.width * 0.5);
        int endX = (int) (size.width * 0.5);
        int startY = 0;
        int endY = 0;

        switch (direction) {
            case "up":
                endY = (int) (size.height * 0.2);
                startY = (int) (size.height * 0.4);
                break;

            case "down":
                endY = (int) (size.height * 0.6);
                startY = (int) (size.height * 0.4);
                break;
        }
        swipe(startX, startY, endX, endY, 100);
    }

    public boolean isElementExists() {
        try {
            driver.getTitle().wait();
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    // Function to merge partial xpath and related injector (name,value,etc)

    public WebElement mergeAndFindMobileElement(String selectorPath) {
        return FindAndSelectMobileElement(selectorPath);
    }


    public WebElement mergeAndFindMobileElement(WebElement selectorPath) {
        return FindAndSelectMobileElement(selectorPath);
    }

    // Method to find and get the element
    public WebElement FindAndSelectMobileElement(String selectorPath) {
        return findMobileElement(selectorPath);
    }
    public WebElement FindAndSelectMobileElement(WebElement selectorPath) {
        return findMobileElement(selectorPath);
    }
    // Method to find the element
    public WebElement findMobileElement(String selectorPath) {

        WebElement element;
//        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
             element =  driver.findElement(By.xpath(selectorPath));
            wait.until(ExpectedConditions.elementToBeClickable(element));
//            element.click();


        return element;
    }

    public WebElement findMobileElement(WebElement selectorPath) {

        WebElement element;
//        try {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        element =  selectorPath;
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();


        return element;
    }

    public void listScroller(String accessibilityId, int startX, int startY, int endX, int endY, int millis) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        int iteration = 0;
        boolean isVisible = false;

        while (!isVisible && iteration < 10) {
            try {
                iteration++;
                // Check mobile element visibility
                wait.until(ExpectedConditions.visibilityOfElementLocated((By.id(accessibilityId))));
                isVisible = true;
            } catch (Exception ex) {
                isVisible = false;
                swipe(startX, startY, endX, endY, millis);
            }
        }
    }

    public void listScroller1(WebElement Xpath, int startX, int startY, int endX, int endY, int millis) throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        int iteration = 0;
        boolean isVisible = false;

        while (!isVisible && iteration < 10) {
            try {
                iteration++;
                // Check mobile element visibility
                wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath(String.valueOf(Xpath)))));
                isVisible = true;
            } catch (Exception ex) {
                isVisible = false;
                swipe(startX, startY, endX, endY, millis);
            }
        }
    }
}



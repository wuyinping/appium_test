package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LandingPage;
import pages.LoginPage;

import java.util.Set;

public class AppiumTest extends AndroidSetup {

    @BeforeClass
    public void setUp() throws Exception {
        prepareAndroidForAppium();
    }

    @AfterClass
    public void tearDown() throws Exception {
        driver.quit();
    }

    @Test( groups = { "calculator" } )
    public void calculatorTest(){
        // check the buttons in the main page
        WebElement btnRecharge = driver.findElementById(app_package_name + "demoBtnRecharge");
        WebElement btnStartGame = driver.findElementById(app_package_name + "demoBtnStartGame");
        WebElement btnMyProps = driver.findElementById(app_package_name + "demoBtnMyProps");
        WebElement btnMyPause = driver.findElementById(app_package_name + "demoBtnMyPause");
        WebElement btnExitGame = driver.findElementById(app_package_name + "demoBtnExitGame");
        WebElement btnLogin = driver.findElementById(app_package_name + "demoBtnLogin");

        // check the main page buttons
        Assert.assertTrue(btnRecharge.isDisplayed());
        Assert.assertTrue(btnStartGame.isDisplayed());
        Assert.assertTrue(btnMyProps.isDisplayed());
        Assert.assertTrue(btnMyPause.isDisplayed());
        Assert.assertTrue(btnExitGame.isDisplayed());
        Assert.assertTrue(btnLogin.isDisplayed());

        // go into the Recharge page and check the elements in the page
        btnRecharge.click();
        rechargePageCheck();

        String daoJuImgPath = "//android.widget.GridView[1]/android.widget.LinearLayout";
        WebElement daoJuImg_1 = driver.findElement( By.xpath( daoJuImgPath + "[1]/android.widget.ImageView[1]" ));
        WebElement daoJuImg_2 = driver.findElement( By.xpath( daoJuImgPath + "[2]/android.widget.ImageView[1]" ));
        WebElement daoJuImg_3 = driver.findElement( By.xpath( daoJuImgPath + "[3]/android.widget.ImageView[1]" ));
        WebElement daoJuImg_4 = driver.findElement( By.xpath( daoJuImgPath + "[4]/android.widget.ImageView[1]" ));
        WebElement daoJuImg_5 = driver.findElement( By.xpath( daoJuImgPath + "[5]/android.widget.ImageView[1]" ));
        WebElement daoJuImg_6 = driver.findElement( By.xpath( daoJuImgPath + "[6]/android.widget.ImageView[1]" ));
        WebElement daoJuImg_7 = driver.findElement( By.xpath( daoJuImgPath + "[7]/android.widget.ImageView[1]" ));
        WebElement daoJuImg_8 = driver.findElement( By.xpath( daoJuImgPath + "[8]/android.widget.ImageView[1]" ));
        WebElement daoJuImg_9 = driver.findElement( By.xpath( daoJuImgPath + "[9]/android.widget.ImageView[1]" ));
        WebElement daoJuImg_10 = driver.findElement( By.xpath( daoJuImgPath + "[10]/android.widget.ImageView[1]" ));
        WebElement daoJuImg_11 = driver.findElement( By.xpath( daoJuImgPath + "[11]/android.widget.ImageView[1]" ));

        // check the daoJuImg_1 click
        daoJuImg_1.click();
        payPageCheck("匕首", "1元");

    }

    public void rechargePageCheck(){
        WebElement nonPropsFirst = driver.findElementById(app_package_name + "demoNonPropsFirst");
        WebElement inputMoney = driver.findElementById(app_package_name + "demoInputMoney");
        WebElement btnConfirm = driver.findElementById(app_package_name + "demoBtnConfirm");

        WebElement titleShopProperty = driver.findElement( By.xpath( "//android.widget.TextView[@text='商城道具']" ));
        WebElement peopleColumn = driver.findElement( By.xpath( "//android.widget.TextView[@text='人物专栏']" ));
        WebElement goodsColumn = driver.findElement( By.xpath( "//android.widget.TextView[@text='消费品专栏']" ));
        String daoJuImgPath = "//android.widget.GridView[1]/android.widget.LinearLayout";
        WebElement daoJuImg_1 = driver.findElement( By.xpath( daoJuImgPath + "[1]/android.widget.ImageView[1]" ));
        WebElement daoJuImg_2 = driver.findElement( By.xpath( daoJuImgPath + "[2]/android.widget.ImageView[1]" ));
        WebElement daoJuImg_3 = driver.findElement( By.xpath( daoJuImgPath + "[3]/android.widget.ImageView[1]" ));
        WebElement daoJuImg_4 = driver.findElement( By.xpath( daoJuImgPath + "[4]/android.widget.ImageView[1]" ));
        WebElement daoJuImg_5 = driver.findElement( By.xpath( daoJuImgPath + "[5]/android.widget.ImageView[1]" ));
        WebElement daoJuImg_6 = driver.findElement( By.xpath( daoJuImgPath + "[6]/android.widget.ImageView[1]" ));
        WebElement daoJuImg_7 = driver.findElement( By.xpath( daoJuImgPath + "[7]/android.widget.ImageView[1]" ));
        WebElement daoJuImg_8 = driver.findElement( By.xpath( daoJuImgPath + "[8]/android.widget.ImageView[1]" ));
        WebElement daoJuImg_9 = driver.findElement( By.xpath( daoJuImgPath + "[9]/android.widget.ImageView[1]" ));
        WebElement daoJuImg_10 = driver.findElement( By.xpath( daoJuImgPath + "[10]/android.widget.ImageView[1]" ));
        WebElement daoJuImg_11 = driver.findElement( By.xpath( daoJuImgPath + "[11]/android.widget.ImageView[1]" ));

        Assert.assertTrue(nonPropsFirst.isDisplayed());
        Assert.assertTrue(nonPropsFirst.getText().contains("人物卡牌-1元"));
        Assert.assertTrue(inputMoney.isDisplayed());
        Assert.assertTrue(btnConfirm.isDisplayed());

        Assert.assertTrue(titleShopProperty.isDisplayed());
        Assert.assertTrue(peopleColumn.isDisplayed());
        Assert.assertTrue(goodsColumn.isDisplayed());
        Assert.assertTrue(daoJuImg_1.isDisplayed());
        Assert.assertTrue(daoJuImg_2.isDisplayed());
        Assert.assertTrue(daoJuImg_3.isDisplayed());
        Assert.assertTrue(daoJuImg_4.isDisplayed());
        Assert.assertTrue(daoJuImg_5.isDisplayed());
        Assert.assertTrue(daoJuImg_6.isDisplayed());
        Assert.assertTrue(daoJuImg_7.isDisplayed());
        Assert.assertTrue(daoJuImg_8.isDisplayed());
        Assert.assertTrue(daoJuImg_9.isDisplayed());
        Assert.assertTrue(daoJuImg_10.isDisplayed());
        Assert.assertTrue(daoJuImg_11.isDisplayed());
    }

    public void payPageCheck(String txtGoodsName, String txtGoodsPrice){
        // locate the elements
        WebElement dkMainHeadBack = driver.findElement(By.id(app_package_name + "dkMainHeadBack"));
        WebElement dkMainHeadTitle = driver.findElement(By.id(app_package_name + "dkMainHeadTitle"));
        WebElement dkMainHeadTxt = driver.findElement(By.id(app_package_name + "dkMainHeadTxt"));
        WebElement textView02 = driver.findElement(By.id(app_package_name + "TextView02"));
        WebElement textView03 = driver.findElement(By.id(app_package_name + "TextView03"));
        WebElement dkTxtGoodsName = driver.findElement(By.id(app_package_name + "dkTxtGoodsName"));
        WebElement dkTxtGoodsPrice = driver.findElement(By.id(app_package_name + "dkTxtGoodsPrice"));
        WebElement dkMainFootView = driver.findElement(By.id(app_package_name + "dkMainFootView"));
        WebElement dkTxtOtherPaymethod = driver.findElement(By.id(app_package_name + "dkTxtOtherPaymethod"));

        // check the elements exist
        Assert.assertTrue(dkMainHeadBack.isDisplayed());
        Assert.assertTrue(dkMainHeadTitle.isDisplayed());
        Assert.assertTrue(dkMainHeadTxt.isDisplayed());
        Assert.assertTrue(textView02.isDisplayed());
        Assert.assertTrue(textView03.isDisplayed());
        Assert.assertTrue(dkTxtGoodsName.isDisplayed());
        Assert.assertTrue(dkTxtGoodsPrice.isDisplayed());
        Assert.assertTrue(dkMainFootView.isDisplayed());
        Assert.assertTrue(dkTxtOtherPaymethod.isDisplayed());

        // check the elements text
        Assert.assertTrue(dkMainHeadTxt.getText().contains("百度移动游戏"));
        Assert.assertTrue(textView02.getText().contains("商品名称"));
        Assert.assertTrue(textView03.getText().contains("支付金额"));
        Assert.assertTrue(dkTxtGoodsName.getText().contains(txtGoodsName));
        Assert.assertTrue(dkTxtGoodsPrice.getText().contains(txtGoodsPrice));
        Assert.assertTrue(dkMainFootView.getText().contains("4000-826-898"));
        Assert.assertTrue(dkTxtOtherPaymethod.getText().contains("选择支付方式"));

        // click the back button
        dkMainHeadBack.click();

        // check the pop up dialog window
        WebElement dk_dialog_tv_main = driver.findElement(By.id(app_package_name + "dk_dialog_tv_main"));
        WebElement dk_dialog_btn1 = driver.findElement(By.id(app_package_name + "dk_dialog_btn1"));
        WebElement dk_dialog_btn2 = driver.findElement(By.id(app_package_name + "dk_dialog_btn2"));

        Assert.assertTrue(dk_dialog_tv_main.isDisplayed());
        Assert.assertTrue(dk_dialog_tv_main.getText().contains("道具尚未完成购买"));
        Assert.assertTrue(dk_dialog_btn1.getText().contains("继续购买"));
        Assert.assertTrue(dk_dialog_btn2.getText().contains("返回游戏"));

        // go back to the recharge page
        dk_dialog_btn2.click();

        // check we are at at the recharge page
        rechargePageCheck();
    }

/*    @Test
    public void falseLoginTest() throws InterruptedException
    {
        new LoginPage(driver).invalidLogin();
    }

    @Test
    public void testProductSearch(){

        new LandingPage(driver).chooseToBrowseItems()
                                .searchFor("iphone");
    }


    @Test
    public void testAddToCart(){
        new LandingPage(driver).chooseToBrowseItems()
                .searchFor("iphone")
                .selectFirstResultFor("iphone")
                .addToCart("iphone")
                .verifyCartShowsTheCount();
    }

    @Test
    public void testSwipeOnHomePage()  {
        new LandingPage(driver).swipeFromLeftToPullMenu();

    }

    @Test
    public  void testScrollUponHomePageAndTapAction(){
        new LandingPage(driver).scrollPageUpAndClickOnRefrigerator();

    }*/
}


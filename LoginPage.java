package POMelement.Repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
  public LoginPage(WebDriver driver)
  {
	  PageFactory.initElements(driver,this);
  }
   
  @FindBy(id="username")
  private WebElement usernameTB;
  
  @FindBy(name="pwd")
  private WebElement passwordTB;
  
  @FindBy(id="loginButton")
  private WebElement loginbutton;
  
  @FindBy(id="logoutLink")
  private WebElement logoutbutton;
  
  
  
  public WebElement getusernameTB()
  {
	  return usernameTB;
  }
  
  public WebElement getpasswordTB()
  {
	  return passwordTB;
  }
  
  public WebElement getloginbutton()
  {
	  return loginbutton;
  }
  
  public WebElement getlogoutbutton()
  {
	  return logoutbutton;
  }
  
  public void loginApp(String username,String password)
  {
	  getusernameTB().sendKeys(username);
	  getpasswordTB().sendKeys(password);
	  getloginbutton().click();
  }
  
  public void logoutApp()
  {
	  getlogoutbutton().click();
  }
  
}















package day3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Page_objectmodel {
	@FindBy(id="email")
	private WebElement userName;
	
	@FindBy(id="pass")
	private WebElement passWord;
	
	@FindBy(name="login")
	private WebElement loginButton;
	
	@FindBy(xpath="h2[text()='Facebooklife.']")
	private WebElement facebookText;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getFacebookText() {
		return facebookText;
}
}
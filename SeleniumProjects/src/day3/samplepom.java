package day3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class samplepom {
	@FindBy(id="email")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;

	public void setUsername(WebElement username) {
		this.username = username;
	}

	public void setPassword(WebElement password) {
		this.password = password;
}
}
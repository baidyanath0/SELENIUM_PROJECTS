package generic;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Generic_handeling_dropdown {
	public  static Select Dropdown(WebElement dp)
	{
		Select s=new Select(dp);
		return s;
	}
}

package framework;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_Demo {
  @Test
  public void test() {
	  Reporter.log("hii",true);
  }
  @Test
  public void test2()
  {
	  Reporter.log("hello",true);
  }
}

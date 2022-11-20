package MethodTestNg;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.Test;

//(priority = 3)

public class NewTest {
	@Test(dependsOnMethods = "First1")
	public void First() {
		System.out.println("1");
	}

	@Test(dependsOnMethods = "First2")
	public void First1() {
		System.out.println("2");
	}

	@Test(dependsOnMethods = "First")
	public void First2() {
		System.out.println("3");

	}
}

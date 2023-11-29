package project1;

import org.testng.annotations.Test;

public class Class1_test {
	@Test(groups = "smoketest")
	public void main1() {
		System.out.println("----test1-----");
		System.out.println("----test2-----");
	}
	@Test(groups="regression")
	public void main2() {
		System.out.println("----test11-----");
		System.out.println("----test12-----");
	}

}

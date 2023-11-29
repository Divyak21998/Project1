package project1;

import org.testng.annotations.Test;

public class Class3_test {
	@Test(groups = "smoketest")
	public void main1() {
		System.out.println("----main1-----");
		System.out.println("----main2-----");
	}
	@Test(groups="regressiontest")
	public void main2() {
		System.out.println("----test111-----");
		System.out.println("----test123-----");
	}

}

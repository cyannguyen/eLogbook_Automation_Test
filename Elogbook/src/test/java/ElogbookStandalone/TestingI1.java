package ElogbookStandalone;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestingI1 {
	WebDriver driver;
	
	 String Actualtext;
	
	@Test(priority=1)
	public void BoTrongThongtindangnhap(){
		driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  driver.get("http://35.192.132.241:8080/login ");
		   driver.findElement(By.xpath("//input[@id='username']")).sendKeys("");
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("");	
		 
		  driver.findElement(By.xpath("//button[@id='login']")).click();
		  			
}

	@Test(priority=2)
	public void kiemtracauthongbaokhithongtindangnhapbotrong(){
	Actualtext = driver.findElement(By.xpath("//*[@id='error']")).getText();
	Assert.assertEquals(Actualtext, "Thông tin đăng nhập không được bỏ trống");	
}
	@Test(priority=3)
	public void Nhapmatkhaubotrongthongtintendangnhap(){
		 driver.findElement(By.xpath("//input[@id='username']")).sendKeys("");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		 driver.findElement(By.xpath("//button[@id='login']")).click();	
	}
	@Test(priority=4)
	public void kiemtracauthongbaokhibotrongmatkhau() {
		Actualtext = driver.findElement(By.xpath("//*[@id='password']")).getText();
		Assert.assertEquals(Actualtext, "Mật khẩu không được bỏ trống");
	//}
	//@Test(priority=5)
	//public void Nhapthongtindangnhapbotrongmatkhau() {
	//	Actualtext = driver.findElement(By.xpath("//*[@id='username']")).getText();
	//	Assert.assertEquals(Actualtext, "Mật khẩu không được bỏ trống");
	}
	@Test(priority=6)
	public void Nhapsaitendangnhaphoacmatkhau() {
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("1234567");
		 driver.findElement(By.xpath("//button[@id='login']")).click();	
	}
	@Test(priority=7)
	public void Cauthongbaokhisaitendangnhaphoacmatkhau() {
			Actualtext = driver.findElement(By.xpath("//*[@id='error']")).getText();
			Assert.assertEquals(Actualtext, "Sai tên đăng nhập/ mật khẩu. Vui lòng nhập lại");
	}
	@Test(priority=20)
	public void Dangxuat() {
			 driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[10]/a")).click();
			
}
	
	@Test(priority=9)
	public void VaoCauhinh() {
		 driver.findElement(By.xpath("//*[@id='sidebar']/ul/li[9]/a")).click();
		
	
}
	@Test(priority=8)
	public void Nhapdungthongtindangnhapvamatkhau(){
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		 driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
		 driver.findElement(By.xpath("//button[@id='login']")).click();	
		
	}
	@Test(priority=11)
	
public void Xoabackground(){
		 driver.findElement(By.xpath("//*[@id='multiselect']"));	
		 driver.findElement(By.xpath("//*[@id='multiselect_leftSelected']")).click();
		
}
	@Test(priority=12)
	
	public void Thembackground(){
			 driver.findElement(By.xpath("//*[@id='multiselect']"));	
			 driver.findElement(By.xpath("//*[@id='multiselect_rightSelected']")).click();
}
	@Test(priority=13)
	public void Themiconmobile(){
		 driver.findElement(By.xpath("//*[@id='multiselect_to']"));	
		 driver.findElement(By.xpath("//*[@id='multiselect_rightSelected']")).click();
}
	@Test(priority=14)
	public void Xoaconmobile(){
		 driver.findElement(By.xpath("//*[@id='multiselect_to']"));	
		 driver.findElement(By.xpath("//*[@id='multiselect_leftSelected']")).click();
}
	@Test(priority=15)
	public void Luudulieudongbo(){
		
		 driver.findElement(By.xpath("//*[@id='save_syncconfig']")).click();
}
	
	
}


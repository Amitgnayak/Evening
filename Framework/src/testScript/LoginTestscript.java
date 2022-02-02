package testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import generic.Base_class;
import generic.Generic_readexcel;
import pom.ActiTime_Login;

public class LoginTestscript extends Base_class
{
	@Test
	public void test() throws EncryptedDocumentException, IOException
	{
		 String username = Generic_readexcel.getData("Sheet1", 0, 0);
		 String password = Generic_readexcel.getData("Sheet1", 0, 1);
		      ActiTime_Login act = new ActiTime_Login(driver);
		      act.username(username);
		      act.password(password);
		      act.login();
	}
	
	
}

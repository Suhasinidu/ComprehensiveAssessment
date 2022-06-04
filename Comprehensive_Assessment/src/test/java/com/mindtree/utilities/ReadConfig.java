package com.mindtree.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
public class ReadConfig {
	
 Properties pro;
	
	//public ConfigUtils() throws IOException{
		//File file=new File("./Configuration/Config.properties");
		//FileReader reader=new FileReader(file);
		//pro=new Properties();
		//pro.load(reader);
public  void ReagConfig()
{
	File src=new File("./Configuration/Config.properties");
	try {

	FileInputStream fis=new FileInputStream(src);
	pro=new Properties();
	pro.load(fis);
	}catch(Exception e) {
		System.out.println("Exception is "+e.getMessage());
	}
	
       
	}
	
	public String getURL() {
		String url= pro.getProperty("baseURL");
		return url;
	}
	
	public String getUserName() {
		String username= pro.getProperty("username");
		return username;
		
	}
	
	public String getPwd() {
		String password= pro.getProperty("password");
		return password;
		
	}


}

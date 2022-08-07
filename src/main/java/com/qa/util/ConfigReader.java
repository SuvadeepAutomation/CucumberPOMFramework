package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	
	private Properties prop;
	
	/**
	 * This class is used to load properties from Property file
	 * @return it returns Properties prop object
	 */
	
	public Properties init_prop()
	{
		prop=new Properties();
		try {
			FileInputStream ip=new FileInputStream("./src/test/resources/com/config/config.properties");
			prop.load(ip);
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}
}

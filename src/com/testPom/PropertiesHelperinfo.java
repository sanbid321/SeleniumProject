package com.testPom;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesHelperinfo{

	Properties properties = null;
	
	//Constructor
	
	public  PropertiesHelperinfo()throws Exception  {

		properties = new Properties();
		properties.load(new FileInputStream(new File("testPom.properties")));
	}
	
//	
//	A Method declaared with class name
//	public void Propertieshelperinfo()throws Exception
//	{
//		properties = new Properties();
//		properties.load(new FileInputStream(new File("testPom.properties")));
//
//	}
//	
}

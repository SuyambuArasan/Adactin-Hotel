package com.reader;

import java.io.IOException;

public class ConfigurationHelper {
	
	
	private ConfigurationHelper() {
		
		
	}

	
  public static  ConfigurationReader getInstanceCR() throws IOException {

	  ConfigurationReader r  = new ConfigurationReader();
			  return r;
	  
}
		
  public static ConfigurationHelper getInstance() {
  ConfigurationHelper h = new ConfigurationHelper();
  return h;

}

	
	
	
}

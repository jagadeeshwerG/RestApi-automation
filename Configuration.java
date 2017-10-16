package com.util;

import java.io.File;
import java.io.FileReader;
import java.util.Properties;

public class Configuration {

	public static String URI;

	public Configuration() {

		loadProperties();
	}

	public void loadProperties() {

		Properties prop = new Properties();

		try {

			/*FileReader reader = new FileReader(
					new File(String.format("%s/resources/config.properties", System.getProperty("User.dir"))));*/

			FileReader reader = new FileReader(
					new File(String.format(Constant.PATH+"config.properties")));

			prop.load(reader);

			URI = prop.getProperty("Uri");

		} catch (Exception Ex) {

			System.out.println(Ex);
			
		}

	}
}

package fr.diginamic.xml;

import java.util.Enumeration;
import java.util.Iterator;

import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;

public class TestConfigurationXML {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configurations configs = new Configurations();
		try {
			XMLConfiguration test = configs.xml("test.xml");
			
			Iterator<String> vals = test.getKeys();
			boolean first = true;
			while (vals.hasNext()) {
				String cle = vals.next();
				if (first) {
					System.out.println(test.getString(cle) + "\n");
					first = false;
				} 
				System.out.println(test.getString(cle));
			}
		} catch (ConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}

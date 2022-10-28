package fr.diginamic.props;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class TestConfigurationProps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ResourceBundle config = ResourceBundle.getBundle("config");
		String premierParam = config.getString("database.url");
		
		Enumeration<String> enumListe = config.getKeys();
		
		boolean first = true;
		while (enumListe.hasMoreElements()) {
			String clef = enumListe.nextElement();
			if (first) {
					System.out.println(config.getString(clef) + "\n");
					first = false;
			}
			System.out.println(config.getString(clef));
			
		}
	}

}

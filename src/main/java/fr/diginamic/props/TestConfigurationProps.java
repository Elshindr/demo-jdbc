package fr.diginamic.props;

import java.util.Enumeration;
import java.util.ResourceBundle;

public class TestConfigurationProps {
    public static void main(String[] args) {
        ResourceBundle properties = ResourceBundle.getBundle("app");//demande le nom du fichier application.propertis mais sans son extesnion
        String urlDtb = properties.getString("database.url");
        String usrDtb = properties.getString("database.user");
        String pwdDtb = properties.getString("database.password");
        Enumeration<String> emn = properties.getKeys();

        while(emn.hasMoreElements()){
            String cle = emn.nextElement();
            System.out.println(properties.getString(cle) + "=" +  cle );
        }

        System.out.printf("%s, %s, %s", urlDtb,usrDtb,pwdDtb);
    }
    }


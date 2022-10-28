package fr.diginamic.props;

import org.apache.commons.configuration2.Configuration;
import org.apache.commons.configuration2.XMLConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import java.util.Iterator;

public class TestConfigurationXML {
    public static void main(String[] args) throws ConfigurationException {

        // Permet de lire plusieurs configurations
        Configurations configs = new Configurations();
        try {
            XMLConfiguration config = configs.xml("app.xml");

            String nomBase = config.getString("database[@nom]");
            String host = config.getString("database.host");
            String user = config.getString("database.user");
            System.out.println(user +"  "+  host + "  "+ nomBase);

            Iterator<String> enume = config.getKeys();

            while(enume.hasNext()){
                String key = enume.next();
                System.out.println(key +"  " + config.getString(key));
            }

        } catch (ConfigurationException e) {
            e.printStackTrace();
        }
    }
}

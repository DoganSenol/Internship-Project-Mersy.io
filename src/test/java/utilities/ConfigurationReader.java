package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    public static Properties getPropertyObject() throws IOException {

        FileInputStream fileInputStream = new FileInputStream("Configuration/Login.properties");

        Properties properties =new Properties();
        properties.load(fileInputStream);

        return properties;
    }

    public static String getUrl() throws IOException {
        return getPropertyObject().getProperty("url");
    }
    public static String getUserName() throws IOException {
        return getPropertyObject().getProperty("username");
    }
    public static String getPassword() throws IOException {
        return getPropertyObject().getProperty("password");
    }
}

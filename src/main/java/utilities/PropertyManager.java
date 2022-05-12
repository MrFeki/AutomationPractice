package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class PropertyManager {

    private static String url;
    private static String driverPath;
    private static String email;
    private static String bad_login_password;
    private static String login_email;
    private static String login_password;
    private static String configFilePath = "src/main/resources/configuration.properties";

    public static PropertyManager getInstance(){
        Properties properties = new Properties();
        PropertyManager instance = new PropertyManager();

        try {
            FileInputStream fi = new FileInputStream(configFilePath);
            properties.load(fi);
        } catch (Exception e) {
            e.printStackTrace();
        }
        url = properties.getProperty("url");
        driverPath = properties.getProperty("driverPath");
        email = properties.getProperty("email");
        bad_login_password = properties.getProperty("bad_login_password");
        login_email = properties.getProperty("login_email");
        login_password = properties.getProperty("login_password");

        return instance;
    }
    public static void changeProperty(String key, String value) {
        Properties editProp = new Properties();
        try {
            FileInputStream editFi = new
                    FileInputStream(configFilePath);
            editProp.load(editFi);
            editProp.setProperty(key, value);
            editProp.store(new FileOutputStream(configFilePath), null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public String getUrl(){
        return url;
    }
    public String getEmail(){
        return email;
    }
    public String getBad_login_password(){
        return bad_login_password;
    }
    public String getLogin_email(){
        return login_email;
    }
    public String getLogin_password(){
        return login_password;
    }
}

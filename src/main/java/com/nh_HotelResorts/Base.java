package com.nh_HotelResorts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base {
    public static WebDriver driver;
    public static Properties props = new Properties();

    public Base() {
        try {
            String environment = System.getProperty("env", "local");
            File file;
            if("local".equalsIgnoreCase(environment)){
                file=new File("src/main/java/com/nh_HotelResorts/properties/local_config.properties");}
            else if ("prod".equalsIgnoreCase(environment)) {
                file=new File("src/main/java/com/nh_HotelResorts/properties/prod_config.properties");}
            else
                throw new RuntimeException("Environment '" + environment + "' is not supported!");


            FileInputStream fis = new FileInputStream(file);
            props.load(fis);
        } catch (IOException e) {
            e.printStackTrace();  // Replace with a logger in real projects
        }
    }

    // Method to initialize and launch the browser
    public static WebDriver launchBrowser() {
        String browser = System.getProperty("browser", "chrome");

        // Switch to initialize the appropriate WebDriver based on the browser type
        switch (browser) {
            case "chrome" ->{ driver = new ChromeDriver();}
            case "firefox" -> driver = new FirefoxDriver();
            case "edge" -> driver = new EdgeDriver();
            default -> throw new RuntimeException("Browser '" + browser + "' is not supported!");
        }

        // Configure WebDriver settings
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        // Navigate to the URL specified in the properties file
        String url = props.getProperty("url");
        if (url == null || url.isEmpty()) {
            throw new RuntimeException("URL is not specified in the properties file!");
        }
        driver.get(url);

        return driver;
    }
}

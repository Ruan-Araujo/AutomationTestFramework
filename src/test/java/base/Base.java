package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Base {

    private Properties prop;

    public String initializeProp(String propriedade) throws IOException {
        prop = new Properties();

        FileInputStream fis = new FileInputStream(
                "src/main/resources/data.properties");

        prop.load(fis);
        return prop.getProperty(propriedade);
    }

    public String getScreenShotPath(String testCaseName) throws IOException {
        File source = Selenide.screenshot(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir") + "/reports/"+ testCaseName +".png";
        assert source != null;
        FileUtils.copyFile(source, new File(destinationFile));
        return destinationFile;
    }
}

import ru.sberbank.qa.ChromeDriverHolder;

import java.nio.file.Paths;

/**
 * @author mvetchinov on 16.05.2018.
 */
public class Main {
    public static void main(String[] args) {
        new ChromeDriverHolder().createExecutableDriverFile(System.getProperty("os.name"), Paths.get("target","chromedriver.exe").toAbsolutePath());
    }
}

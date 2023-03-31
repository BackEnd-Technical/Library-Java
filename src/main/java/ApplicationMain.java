import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class ApplicationMain {

    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationMain.class);

    public static void main(String[] args) {
        LOGGER.info("Main start...");
        LOGGER.info("Main process ...");
        LOGGER.error("Main end.");
    }
}

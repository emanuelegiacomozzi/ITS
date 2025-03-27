import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class EsempioFormatter extends Formatter {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        public String format(LogRecord record) {
        StringBuilder sb = new StringBuilder();
        sb.append(dateFormat.format(new Date(record.getMillis())))
          .append(" [").append(record.getLongThreadID()).append("] ")
          .append(record.getLevel()).append(" ")
          .append(record.getLoggerName()).append(" - ")
          .append(formatMessage(record)).append("\n");
        return sb.toString();
    	}

    public static void main(String[] args) {
        // Create a logger object
        Logger logger = Logger.getLogger(EsempioFormatter.class.getName());

        // Remove default handlers
        logger.setUseParentHandlers(false);

        // Create and configure console handler
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new EsempioFormatter());
        logger.addHandler(consoleHandler);

        // Set the logger level
        logger.setLevel(Level.ALL);
        consoleHandler.setLevel(Level.ALL);

        // Use the logger
        logger.fine("This is a fine message");
        logger.info("This is an info message");
        logger.warning("This is a warning message");
        logger.severe("This is a severe message");
    }
    
}

import javax.print.DocFlavor;
import java.util.Arrays;

public class LogLevels {
    static String[] logLevels = {"[INFO]","[WARNING]","[ERROR]"};
    public static String message(String logLine) {
        String[] splitedLog = logLine.split(":");
        String logLevel = splitedLog[0].toUpperCase();
        String finalMessage = "";
        if (Arrays.asList(logLevels).contains(logLevel)) {
            try {
                finalMessage = splitedLog[1].strip();
            }
            catch(IndexOutOfBoundsException e){
                System.out.println("Error: No message to log");
            }
        }
        return finalMessage;
    }

    public static String logLevel(String logLine) {
        String lineLogLevel = logLine.split(":")[0].toUpperCase();
        String outLogLevel = "";
        if (Arrays.asList(logLevels).contains(lineLogLevel)) {
            outLogLevel = lineLogLevel.replaceAll("[\\[\\]]","").toLowerCase();
        }
        return outLogLevel;
    }

    public static String reformat(String logLine) {
        String logLevel = logLevel(logLine);
        String logMessage = message(logLine);

        String finalMessage = logMessage + " (" + logLevel + ")";

        return finalMessage;
    }
}

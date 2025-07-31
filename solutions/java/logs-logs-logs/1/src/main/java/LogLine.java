public class LogLine {

    LogLevel logLineLevel;
    String logMessage;
    public LogLine(String logLine) {
        String lineLevel = logLine.split(":")[0].replaceAll("[\\[\\]]","");
        logMessage = logLine.split(":")[1].strip();
        setLogLevel(lineLevel);
    }

    private void setLogLevel(String lineLevel){

        switch (lineLevel){
            case "INF":
                logLineLevel = LogLevel.INFO;
                break;
            case "TRC":
                logLineLevel = LogLevel.TRACE;
                break;
            case "DBG":
                logLineLevel = LogLevel.DEBUG;
                break;
            case "WRN":
                logLineLevel = LogLevel.WARNING;
                break;
            case "ERR":
                logLineLevel = LogLevel.ERROR;
                break;
            case "FTL":
                logLineLevel = LogLevel.FATAL;
                break;
            default:
                logLineLevel = LogLevel.UNKNOWN;
        }
    }

    public LogLevel getLogLevel() {
        return logLineLevel;
    }

    public String getOutputForShortLog() {
        int logLevelCode = logLineLevel.getLevelCode();
        return logLevelCode + ":" + logMessage;
    }
}

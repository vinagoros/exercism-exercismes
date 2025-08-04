public enum LogLevel {
    UNKNOWN(0),
    TRACE(1),
    DEBUG(2),
    INFO(4),
    WARNING(5),
    ERROR(6),
    FATAL(42);

    int levelCode;
    LogLevel(int levelCode){
        this.levelCode = levelCode;
    }
    public int getLevelCode(){
        return this.levelCode;
    }
}

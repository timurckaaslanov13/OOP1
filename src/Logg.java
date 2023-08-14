import java.util.logging.Logger;

public class Logg {
    protected static Logger log(Logger logg){
        if (logg == null){
            Logger.getLogger(Logg.class.getName()).info("log info");
        }
        return logg;
    }
}

package utility;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log {

    private static Logger logger = Logger.getLogger(Log.class);

    public static void logConfig(){

        PropertyConfigurator.configure(Constant_SignInPage.log4jConfPath);
    }


        public static void info(String message){
            logger.info(message);
        }

        public static void warn(String message) {

            logger.warn(message);

        }

        public static void error(String message) {

            logger.error(message);

        }

        public static void fatal(String message) {

            logger.fatal(message);

        }

        public static void debug(String message) {

            logger.debug(message);

        }



    }



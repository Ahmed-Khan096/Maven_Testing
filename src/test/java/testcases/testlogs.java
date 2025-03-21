package testcases;
import org.apache.*;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
public class testlogs {
	public static Logger log = Logger.getLogger(testlogs.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasicConfigurator.configure();
		
		log.info("this is inofrmation llog");
		log.error("this is erro message log");
		log.fatal("this is the fatal log");
		log.warn("this is a warning message !!");
	}

}

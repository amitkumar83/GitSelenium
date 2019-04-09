package alphaTest;
import org.apache.logging.log4j.*;

public class DemoA {

	private static Logger log = LogManager.getLogger(DemoA.class.getName()); //Class Name as an Argument
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		log.debug("I am Debugging");
		log.info("Object is Present");
		log.error("Object is Not Present");
		log.fatal("This is Fatal");
	}
}

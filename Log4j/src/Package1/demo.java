package Package1;


import org.apache.logging.log4j.*;


public class demo {
	private static Logger log=LogManager.getLogger(demo.class.getName());
	public static void main(String[] args) {
     	log.debug("i am debuging");
		log.info("Info message");
		log.error("Error message");
		log.fatal("This is fatal");
		
	
	}

}

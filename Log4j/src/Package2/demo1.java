package Package2;


import org.apache.logging.log4j.*;

public class demo1 {
	private static Logger log=LogManager.getLogger(demo1.class.getName());
	public static void main(String[] args) {
     	log.debug("This is Debug");
     	log.error("This is Error");
     	log.fatal("This is Fatal");
     	log.info("This is Info");
		
	}

}

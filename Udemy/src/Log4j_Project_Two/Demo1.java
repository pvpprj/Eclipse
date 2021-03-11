package Log4j_Project_Two;

import org.apache.logging.log4j.*;

public class Demo1 {
	
	private static Logger log =  LogManager.getLogger(Demo1.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		log.debug("I am Debugg");
		//if(5<4)
			log.info("Object is Present");
		log.error("Object is Not present");
		log.fatal("This is fatal");
		
	}                                                                                                                                      

}

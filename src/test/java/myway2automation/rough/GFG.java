package myway2automation.rough;


	
	import java.util.logging.*;
	import java.util.*;
	  
	public class GFG {
	  
	    public static void main(String[] args)
	    {
	  
	        // Create LogManager object
	        LogManager logManager
	            = LogManager.getLogManager();
	  
	        String LoggerName = "GFG";
	        Logger logger
	            = Logger.getLogger(LoggerName);
	        logManager.addLogger(logger);
	  
	        System.out.println("\nList of Logger Names: ");
	        Enumeration<String> listOfNames
	            = logManager.getLoggerNames();
	        while (listOfNames.hasMoreElements())
	            System.out.println(listOfNames.nextElement());
	  
	        System.out.println(
	            "\nGet Logger Name "
	            + LoggerName + ": "
	            + logManager.getLogger(LoggerName));
	  
	        LoggerName = "Geeks";
	  
	        System.out.println(
	            "\nGet Logger Name "
	            + LoggerName + ": "
	            + logManager.getLogger(LoggerName));
	    }
	}



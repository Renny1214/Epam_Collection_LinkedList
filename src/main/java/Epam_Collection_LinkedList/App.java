package Epam_Collection_LinkedList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args ) {
        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            linkedList.add(i);
        }

        logger.info("linklist before removing an element");
        linkedList.display();

        logger.info("enter index of the node you want to delete");
        int del = scanner.nextInt();
        linkedList.remove(del);

        logger.info("linklist after removing an element");
        linkedList.display();

        logger.info("enter index of the node you want to see");
        int k = scanner.nextInt();
        logger.info(linkedList.get(k));

    }
}


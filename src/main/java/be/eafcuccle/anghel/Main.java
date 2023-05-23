package be.eafcuccle.anghel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        for (int i = 0; i < 1_000_000; i++) {
            logger.info("Message DEBUG n°{}", i);
        }

        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1_000_000;  // convert to milliseconds
        logger.info("Duration: {} ms", duration);
    }
}
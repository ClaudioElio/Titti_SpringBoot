package it.mariani.titti.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Log {

  public static final void log(String arg) {

    Logger logger = LoggerFactory.getLogger("chapters.introduction.HelloWorld1");
    logger.debug("Hello world.");

  }
}

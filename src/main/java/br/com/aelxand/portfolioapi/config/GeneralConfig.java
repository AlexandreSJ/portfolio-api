package br.com.aelxand.portfolioapi.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GeneralConfig {

    private final Logger log = LoggerFactory.getLogger(GeneralConfig.class);

    public Logger getLog() {
        return log;
    }
    public Logger loadLog() {
        return LoggerFactory.getLogger(GeneralConfig.class);
    }
    public static Logger loadLogStatic() {
        return LoggerFactory.getLogger(GeneralConfig.class);
    }

}

package com.github.ipergenitsa.engcards;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

public class ApplicationEnvironmentPreparedEventListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    private static final Logger LOGGER = LoggerFactory.getLogger(ApplicationEnvironmentPreparedEventListener.class);
    @Override
    public void onApplicationEvent(final ApplicationEnvironmentPreparedEvent event) {
        if (event.getEnvironment().getActiveProfiles().length == 0) {
            LOGGER.error("No active profile is set. Will terminate");
            System.exit(1);
        }
    }
}

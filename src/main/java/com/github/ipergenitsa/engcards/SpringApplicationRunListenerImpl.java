package com.github.ipergenitsa.engcards;

import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class SpringApplicationRunListenerImpl implements SpringApplicationRunListener {
    @Override
    public void started() {
        System.out.println();
    }

    @Override
    public void environmentPrepared(final ConfigurableEnvironment environment) {
        System.out.println();
    }

    @Override
    public void contextPrepared(final ConfigurableApplicationContext context) {
        System.out.println();
    }

    @Override
    public void contextLoaded(final ConfigurableApplicationContext context) {
        System.out.println();
    }

    @Override
    public void finished(final ConfigurableApplicationContext context, final Throwable exception) {
        System.out.println();
    }
}

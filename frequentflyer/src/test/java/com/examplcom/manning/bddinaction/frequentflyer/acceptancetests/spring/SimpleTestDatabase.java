package com.examplcom.manning.bddinaction.frequentflyer.acceptancetests.spring;

import org.testcontainers.containers.PostgreSQLContainer;

public class SimpleTestDatabase {
    private static PostgreSQLContainer container
            = new PostgreSQLContainer("postgres:11.1")
                    .withDatabaseName("integration-tests-db")
                    .withUsername("sa")
                    .withPassword("sa");

    static {
        container.start();
    }

    public static PostgreSQLContainer getInstance() {
        return container;
    }
}

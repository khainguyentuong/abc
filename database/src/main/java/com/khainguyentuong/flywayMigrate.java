package com.khainguyentuong;

import org.flywaydb.core.Flyway;

public class flywayMigrate  {
    public static void main(String[] args) {
        // Create the Flyway instance
        Flyway flyway = new Flyway();

        // Point it to the database
        flyway.setDataSource("jdbc:mysql://localhost:3306", "builder", "builder");

        // Set migration schema
        flyway.setSchemas("person");

        // Start the migration
        flyway.migrate();
    }
}
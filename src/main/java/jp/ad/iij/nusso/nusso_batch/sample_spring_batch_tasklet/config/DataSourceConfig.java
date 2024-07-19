package jp.ad.iij.nusso.nusso_batch.sample_spring_batch_tasklet.config;

import javax.sql.DataSource;
import org.springframework.boot.autoconfigure.batch.BatchDataSource;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class DataSourceConfig {
    // @Bean
    // @ConfigurationProperties("spring.datasource.h2metadata")
    // DataSourceProperties h2Properties() {
    // return new DataSourceProperties();
    // }

    // @Bean
    // @ConfigurationProperties("spring.datasource.postgresmain")
    // DataSourceProperties postgresProperties() {
    // return new DataSourceProperties();
    // }

    // @BatchDataSource
    // @Bean
    // DataSource h2DataSource() {
    // return h2Properties().initializeDataSourceBuilder().build();
    // }

    // @Primary
    // @Bean
    // DataSource postgresDataSource() {
    // return postgresProperties().initializeDataSourceBuilder().build();
    // }

    // @Bean("mainJdbcTemplate")
    // JdbcTemplate jdbcTemplate() {
    // return new JdbcTemplate(postgresDataSource());
    // }
}

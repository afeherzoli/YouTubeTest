package org.acsapatkedd.youtubetest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.acsapatkedd.youtubetest.factory.WebDriverFactory;

@Configuration
@ComponentScan("org.acsapatkedd.youtubetest")
public class TestConfig {
    public static final long PAGE_OR_ELEMENT_LOAD_WAIT_SECONDS = 20;

    @Bean(destroyMethod = "closeWebDriver")
    public WebDriverFactory webDriverFactory() {
        return new WebDriverFactory();
    }
}

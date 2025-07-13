package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.spring_learn.model.Country;

public class CountryDisplay {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryDisplay.class);

    public static void main(String[] args) {
        LOGGER.info("START");
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country  country = context.getBean("country", Country.class);
        LOGGER.debug("Country : {}", country.toString());
        LOGGER.info("END");
    }
}

package com.yedam.quiz;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Controller
@SpringBootApplication
public class QuizApplication {

	private static final Logger log = LoggerFactory.getLogger(QuizApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(QuizApplication.class, args);
	}

	@Bean
	LocaleResolver localeResolver() {
		SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
		sessionLocaleResolver.setDefaultLocale(Locale.KOREA);
		return sessionLocaleResolver;
	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index() {
		return "index";
	}

}

package com.krunal.trading.service;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.krunal.trading.quotes.model.YahooQuoteResponse;
import com.krunal.trading.quotes.model.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * Service facade to retrieve @{@link com.krunal.trading.quotes.model.Quote} and @{@link com.krunal.trading.quotes.model.CompanyInfo}
 */

@Service
public class QuoteService {

    @Value("${quotes.quote_url}")
    private String quoteUrl;

    @Value("${quotes.company_url}")
    private String companyUrl;

    @Value("${pivotal.quotes.yahoo_rest_query}")
    protected String yahoo_url = "https://query.yahooapis.com/v1/public/yql?q=select * from yahoo.finance.quotes where symbol in ('{symbol}')&format={fmt}&env={env}";

    @Value("${pivotal.quotes.yahoo_env}")
    protected String ENV = "http://datatables.org/alltables.env";

    public static final String FMT = "json";

    private static final Logger logger = LoggerFactory.getLogger(QuoteService.class);

    private RestTemplate restTemplate;

    public QuoteService() {
        restTemplate = new RestTemplate();
        ObjectMapper objectMapper = new ObjectMapper().enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        MappingJackson2HttpMessageConverter messageConverter = new MappingJackson2HttpMessageConverter(objectMapper);
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        messageConverters.add(messageConverter);
        restTemplate.setMessageConverters(messageConverters);
    }

    public List<Quote> getQuotes(final String symbol) {
        restTemplate.getForObject(quoteUrl, YahooQuoteResponse.class, FMT, ENV)

    }

}

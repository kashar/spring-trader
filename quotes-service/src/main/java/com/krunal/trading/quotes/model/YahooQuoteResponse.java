package com.krunal.trading.quotes.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YahooQuoteResponse {

    @JsonProperty(value="reults")
    private YahooResults results;

    public YahooResults getResults() {
        return results;
    }

    public void setResults(YahooResults results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "YahooQuoteResponse{" +
                "results=" + results +
                '}';
    }
}

package com.krunal.trading.quotes.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.LocalDate;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class YahooResults {

    @JsonProperty(value="quote")
    private List<YahooQuote> quote;

    @JsonProperty(value="created")
    private LocalDate created;

    @JsonProperty(value="count")
    private int count;

    @JsonProperty(value="lang")
    private String lang;

    public List<YahooQuote> getQuote() {
        return quote;
    }

    public void setQuote(List<YahooQuote> quote) {
        this.quote = quote;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    @Override
    public String toString() {
        return "YahooResults{" +
                "quote=" + quote +
                '}';
    }
}

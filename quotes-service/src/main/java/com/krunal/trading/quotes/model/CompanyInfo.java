package com.krunal.trading.quotes.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the information of the firm
 *
 * {
    "Symbol":"NFLX",
    "Name":"Netflix Inc",
    "Exchange":"NASDAQ"
 }
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class CompanyInfo implements Comparable<CompanyInfo> {

    @JsonProperty("Symbol")
    private String symbol;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Exchange")
    private String exchange;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompanyInfo)) return false;

        CompanyInfo that = (CompanyInfo) o;

        if (!getSymbol().equals(that.getSymbol())) return false;
        if (!getName().equals(that.getName())) return false;
        return getExchange().equals(that.getExchange());
    }

    @Override
    public int hashCode() {
        int result = getSymbol().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getExchange().hashCode();
        return result;
    }

    @Override
    public int compareTo(CompanyInfo o) {
        if (o == null) {
            return -1;
        }

        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "CompanyInfo{" +
                "symbol='" + symbol + '\'' +
                ", name='" + name + '\'' +
                ", exchange='" + exchange + '\'' +
                '}';
    }
}

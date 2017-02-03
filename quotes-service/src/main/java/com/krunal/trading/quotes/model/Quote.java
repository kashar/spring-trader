package com.krunal.trading.quotes.model;

import com.fasterxml.jackson.annotation.*;
import org.joda.time.LocalDate;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * Represents price and information of a particular stock at a particular point in time
 *
 * A sample message looks like this.
 *
 * <pre>
 *         {
             "Name":"Apple Inc",
             "Symbol":"AAPL",
             "LastPrice":524.49,
             "Change":15.6,
             "ChangePercent":3.06549549018453,
             "Timestamp":"Wed Oct 23 13:39:19 UTC-06:00 2013",
             "MSDate": 41570.568969907,
             "MarketCap":476497591530,
             "Volume":397562,
             "ChangeYTD":532.1729,
             "ChangePercentYTD":-1.44368493773359,
             "High":52499,
             "Low":519.175,
             "Open":519.175
           }
 * </pre>
 *
 * Query looks like this
 * http://query.yahooapis.com/v1/public/yql?q=select * from yahoo.finance.quotes where symbol in ("AAPL")&env=store://datatables.org/alltableswithkeys
 *
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Symbol")
    private String symbol;

    @JsonProperty("LastPrice")
    private BigDecimal lastPrice;

    @JsonProperty("Change")
    private BigDecimal change;

    @JsonProperty("ChangePercent")
    private BigDecimal changePercent;

    @JsonProperty("TimeStamp")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="EEE MMM dd HH:mm:ss zzzXXX yyyy", locale="ENGLISH")
    private LocalDate timeStamp;

    @JsonProperty("MSDate")
    private BigDecimal msDate;

    @JsonProperty("MarketCap")
    private BigInteger marketCap;

    @JsonProperty("Volume")
    private BigInteger Volume;

    @JsonProperty("ChangeYTD")
    private BigDecimal changeYTD;

    @JsonProperty("ChangePercentYTD")
    private BigDecimal getChangePercentYTD;

    @JsonProperty("High")
    private BigDecimal high;

    @JsonProperty("Low")
    private BigDecimal low;

    @JsonProperty("Open")
    private BigDecimal open;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public BigDecimal getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(BigDecimal lastPrice) {
        this.lastPrice = lastPrice;
    }

    public BigDecimal getChange() {
        return change;
    }

    public void setChange(BigDecimal change) {
        this.change = change;
    }

    public BigDecimal getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(BigDecimal changePercent) {
        this.changePercent = changePercent;
    }

    public LocalDate getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDate timeStamp) {
        this.timeStamp = timeStamp;
    }

    public BigDecimal getMsDate() {
        return msDate;
    }

    public void setMsDate(BigDecimal msDate) {
        this.msDate = msDate;
    }

    public BigInteger getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(BigInteger marketCap) {
        this.marketCap = marketCap;
    }

    public BigInteger getVolume() {
        return Volume;
    }

    public void setVolume(BigInteger volume) {
        Volume = volume;
    }

    public BigDecimal getChangeYTD() {
        return changeYTD;
    }

    public void setChangeYTD(BigDecimal changeYTD) {
        this.changeYTD = changeYTD;
    }

    public BigDecimal getGetChangePercentYTD() {
        return getChangePercentYTD;
    }

    public void setGetChangePercentYTD(BigDecimal getChangePercentYTD) {
        this.getChangePercentYTD = getChangePercentYTD;
    }

    public BigDecimal getHigh() {
        return high;
    }

    public void setHigh(BigDecimal high) {
        this.high = high;
    }

    public BigDecimal getLow() {
        return low;
    }

    public void setLow(BigDecimal low) {
        this.low = low;
    }

    public BigDecimal getOpen() {
        return open;
    }

    public void setOpen(BigDecimal open) {
        this.open = open;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Quote)) return false;

        Quote quote = (Quote) o;

        if (!getName().equals(quote.getName())) return false;
        if (!getSymbol().equals(quote.getSymbol())) return false;
        if (!getLastPrice().equals(quote.getLastPrice())) return false;
        if (!getChange().equals(quote.getChange())) return false;
        if (!getChangePercent().equals(quote.getChangePercent())) return false;
        if (!getTimeStamp().equals(quote.getTimeStamp())) return false;
        if (!getMsDate().equals(quote.getMsDate())) return false;
        if (!getMarketCap().equals(quote.getMarketCap())) return false;
        if (!getVolume().equals(quote.getVolume())) return false;
        if (!getChangeYTD().equals(quote.getChangeYTD())) return false;
        if (!getGetChangePercentYTD().equals(quote.getGetChangePercentYTD())) return false;
        if (!getHigh().equals(quote.getHigh())) return false;
        if (!getLow().equals(quote.getLow())) return false;
        return getOpen().equals(quote.getOpen());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getSymbol().hashCode();
        result = 31 * result + getLastPrice().hashCode();
        result = 31 * result + getChange().hashCode();
        result = 31 * result + getChangePercent().hashCode();
        result = 31 * result + getTimeStamp().hashCode();
        result = 31 * result + getMsDate().hashCode();
        result = 31 * result + getMarketCap().hashCode();
        result = 31 * result + getVolume().hashCode();
        result = 31 * result + getChangeYTD().hashCode();
        result = 31 * result + getGetChangePercentYTD().hashCode();
        result = 31 * result + getHigh().hashCode();
        result = 31 * result + getLow().hashCode();
        result = 31 * result + getOpen().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Quote{" +
                "name='" + name + '\'' +
                ", symbol='" + symbol + '\'' +
                ", lastPrice=" + lastPrice +
                ", change=" + change +
                ", changePercent=" + changePercent +
                ", timeStamp=" + timeStamp +
                ", msDate=" + msDate +
                ", marketCap=" + marketCap +
                ", Volume=" + Volume +
                ", changeYTD=" + changeYTD +
                ", getChangePercentYTD=" + getChangePercentYTD +
                ", high=" + high +
                ", low=" + low +
                ", open=" + open +
                '}';
    }
}

package com.krunal.trading.quotes.model;

import org.joda.time.LocalDate;

import java.math.BigDecimal;

/**
 *
 * This is a Singleton which maps {@link YahooQuote} to {@link Quote} object
 * @author kashar
 */
public class QuoteMapper {

    private static final QuoteMapper INSTANCE = new QuoteMapper();

    private QuoteMapper() {}

    public static QuoteMapper getINSTANCE() {
        return INSTANCE;
    }

    public Quote map(YahooQuote yahooQuote, LocalDate created) {
        if (yahooQuote == null ) {
            return null;
        }

        Quote mappedQuote = new Quote();
        mappedQuote.setChange(yahooQuote.getChange());

        if (yahooQuote.getPercentChange() != null) {
            mappedQuote.setChangePercent(new BigDecimal((yahooQuote.getPercentChange().replace("%", ""))));
        }
        //mappedQuote.setChangePercentYTD(null);
        mappedQuote.setChangeYTD(null);
        mappedQuote.setHigh(yahooQuote.getDaysHigh());
        mappedQuote.setLastPrice(yahooQuote.getLastTradePriceOnly());
        mappedQuote.setLow(yahooQuote.getDaysLow());
        mappedQuote.setMarketCap(null);
        //mappedQuote.setmSDate(null);
        mappedQuote.setName(yahooQuote.getName());
        mappedQuote.setOpen(yahooQuote.getOpen());
        //mappedQuote.setStatus("SUCCESS");
        mappedQuote.setSymbol(yahooQuote.getSymbol());
        //mappedQuote.setTimestamp(created);
        mappedQuote.setVolume(yahooQuote.getVolume());

        return mappedQuote;
    }
}

package com.krunal.trading.quotes.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by krunal on 2/02/17.
 */
public class Security {

    @JsonProperty("CIK")
    private String CIK=null;

    @JsonProperty("CUSIP")
    private String CUSIP=null;

    @JsonProperty("Symbol")
    private String Symbol=null;

    @JsonProperty("ISIN")
    private String ISIN=null;

    @JsonProperty("Valoren")
    private String valoren=null;

    @JsonProperty("Name")
    private String name=null;

    @JsonProperty("Market")
    private String market=null;

    @JsonProperty("MarketIdentificationCode")
    private String marketIdentificationCode=null;

    @JsonProperty("MostLiquidExchange")
    private String mostLiquidExchange=null;

    @JsonProperty("CategoryOrIndustry")
    private String categoryOrIndustry=null;

    public String getCIK() {
        return CIK;
    }

    public void setCIK(String CIK) {
        this.CIK = CIK;
    }

    public String getCUSIP() {
        return CUSIP;
    }

    public void setCUSIP(String CUSIP) {
        this.CUSIP = CUSIP;
    }

    public String getSymbol() {
        return Symbol;
    }

    public void setSymbol(String symbol) {
        Symbol = symbol;
    }

    public String getISIN() {
        return ISIN;
    }

    public void setISIN(String ISIN) {
        this.ISIN = ISIN;
    }

    public String getValoren() {
        return valoren;
    }

    public void setValoren(String valoren) {
        this.valoren = valoren;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getMarketIdentificationCode() {
        return marketIdentificationCode;
    }

    public void setMarketIdentificationCode(String marketIdentificationCode) {
        this.marketIdentificationCode = marketIdentificationCode;
    }

    public String getMostLiquidExchange() {
        return mostLiquidExchange;
    }

    public void setMostLiquidExchange(String mostLiquidExchange) {
        this.mostLiquidExchange = mostLiquidExchange;
    }

    public String getCategoryOrIndustry() {
        return categoryOrIndustry;
    }

    public void setCategoryOrIndustry(String categoryOrIndustry) {
        this.categoryOrIndustry = categoryOrIndustry;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Security)) return false;

        Security security = (Security) o;

        if (!getCIK().equals(security.getCIK())) return false;
        if (!getCUSIP().equals(security.getCUSIP())) return false;
        if (!getSymbol().equals(security.getSymbol())) return false;
        if (!getISIN().equals(security.getISIN())) return false;
        if (!getValoren().equals(security.getValoren())) return false;
        if (!getName().equals(security.getName())) return false;
        if (!getMarket().equals(security.getMarket())) return false;
        if (!getMarketIdentificationCode().equals(security.getMarketIdentificationCode())) return false;
        if (!getMostLiquidExchange().equals(security.getMostLiquidExchange())) return false;
        return getCategoryOrIndustry().equals(security.getCategoryOrIndustry());
    }

    @Override
    public int hashCode() {
        int result = getCIK().hashCode();
        result = 31 * result + getCUSIP().hashCode();
        result = 31 * result + getSymbol().hashCode();
        result = 31 * result + getISIN().hashCode();
        result = 31 * result + getValoren().hashCode();
        result = 31 * result + getName().hashCode();
        result = 31 * result + getMarket().hashCode();
        result = 31 * result + getMarketIdentificationCode().hashCode();
        result = 31 * result + getMostLiquidExchange().hashCode();
        result = 31 * result + getCategoryOrIndustry().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Security{" +
                "CIK='" + CIK + '\'' +
                ", CUSIP='" + CUSIP + '\'' +
                ", Symbol='" + Symbol + '\'' +
                ", ISIN='" + ISIN + '\'' +
                ", valoren='" + valoren + '\'' +
                ", name='" + name + '\'' +
                ", market='" + market + '\'' +
                ", marketIdentificationCode='" + marketIdentificationCode + '\'' +
                ", mostLiquidExchange='" + mostLiquidExchange + '\'' +
                ", categoryOrIndustry='" + categoryOrIndustry + '\'' +
                '}';
    }
}

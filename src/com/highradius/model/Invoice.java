package com.highradius.model;

public class Invoice {
    private int SI_No;
    private int CustOrderID;
    private int SalesOrg;
    private String DistributionChannel;
    private int CompanyCode;
    private String OrderCreationDate;
    private String OrderCurrency;
    private int CustNo;
    private double AmountInUSD;
    private double OrderAmount;

    public Invoice(int SI_No, int custOrderID, int salesOrg, String distributionChannel,
                   int companyCode, String orderCreationDate, String orderCurrency, int custNo,
                   double amountInUSD, double orderAmount) {
        this.SI_No = SI_No;
        CustOrderID = custOrderID;
        SalesOrg = salesOrg;
        DistributionChannel = distributionChannel;
        CompanyCode = companyCode;
        OrderCreationDate = orderCreationDate;
        OrderCurrency = orderCurrency;
        CustNo = custNo;
        AmountInUSD = amountInUSD;
        OrderAmount = orderAmount;
    }

   
    public int getSI_No() {
        return SI_No;
    }

    public void setSI_No(int SI_No) {
        this.SI_No = SI_No;
    }

    public int getCustOrderID() {
        return CustOrderID;
    }
    public void setCustOrderID(int custOrderID) {
        CustOrderID = custOrderID;
    }

    public int getSalesOrg() {
        return SalesOrg;
    }
    public void setSalesOrg(int salesOrg) {
        SalesOrg = salesOrg;
    }

    public String getDistributionChannel() {
        return DistributionChannel;
    }

    public void setDistributionChannel(String distributionChannel) {
        DistributionChannel = distributionChannel;
    }
    public int getCompanyCode() {
        return CompanyCode;
    }
    public void setCompanyCode(int companyCode) {
        CompanyCode = companyCode;
    }

    public String getOrderCreationDate() {
        return OrderCreationDate;
    }

    public void setOrderCreationDate(String orderCreationDate) {
        OrderCreationDate = orderCreationDate;
    }

    public String getOrderCurrency() {
        return OrderCurrency;
    }

    public void setOrderCurrency(String orderCurrency) {
        OrderCurrency = orderCurrency;
    }

    public int getCustNo() {
        return CustNo;
    }
    public void setCustNo(int custNo) {
        CustNo = custNo;
    }

    public double getAmountInUSD() {
        return AmountInUSD;
    }


    public void setAmountInUSD(double amountInUSD) {
        AmountInUSD = amountInUSD;
    }

    public double getOrderAmount() {
        return OrderAmount;
    }

   
    public void setOrderAmount(double orderAmount) {
        OrderAmount = orderAmount;
    }
}


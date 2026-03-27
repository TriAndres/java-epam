package ru.epam.learn.transfer.bean;

public class Account {
    private long accountId;
    private double asset;
    // constructor without parameters
    public Account() {
        super();
/* if class is declared without constructors, then compiler will provide it in
this form */
    }
    // constructor with parameters
    public Account(long accountId) {
        super(); /* access to superclass constructor is explicitly optional, compiler
will add it automatically */
        this.accountId = accountId;
    }
    // constructor with parameters
    public Account(long accountId, double asset) {
        this.accountId = accountId;
        this.asset = asset;
    }
    public double getAsset() {
        return asset;
    }
    public void setAsset(double asset) {
        this.asset = asset;
    }
    public long getAccountId () {
        return accountId;
    }
    public void setId(long accountId) {
        this.accountId = accountId;
    }
}
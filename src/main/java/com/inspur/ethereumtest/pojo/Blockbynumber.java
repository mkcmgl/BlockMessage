package com.inspur.ethereumtest.pojo;

public class Blockbynumber {
    private String height;

    private String timestamp;

    private String transactions;

    @Override
    public String toString() {
        return "Blockbynumber{" +
                "height='" + height + '\'' +
                ", timestamp='" + timestamp + '\'' +
                ", transactions='" + transactions + '\'' +
                ", miner='" + miner + '\'' +
                ", uncles='" + uncles + '\'' +
                ", difficulty='" + difficulty + '\'' +
                ", totaldifficulty='" + totaldifficulty + '\'' +
                ", size='" + size + '\'' +
                ", gasused='" + gasused + '\'' +
                ", gaslimit='" + gaslimit + '\'' +
                ", extradata='" + extradata + '\'' +
                ", hash='" + hash + '\'' +
                ", parenthash='" + parenthash + '\'' +
                ", sha3uncles='" + sha3uncles + '\'' +
                ", stateroot='" + stateroot + '\'' +
                ", nonce='" + nonce + '\'' +
                ", number='" + number + '\'' +
                ", transactionsroot='" + transactionsroot + '\'' +
                '}';
    }

    private String miner;

    private String uncles;

    private String difficulty;

    private String totaldifficulty;

    private String size;

    private String gasused;

    private String gaslimit;

    private String extradata;

    private String hash;

    private String parenthash;

    private String sha3uncles;

    private String stateroot;

    private String nonce;

    private String number;

    private String transactionsroot;

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTransactions() {
        return transactions;
    }

    public void setTransactions(String transactions) {
        this.transactions = transactions;
    }

    public String getMiner() {
        return miner;
    }

    public void setMiner(String miner) {
        this.miner = miner;
    }

    public String getUncles() {
        return uncles;
    }

    public void setUncles(String uncles) {
        this.uncles = uncles;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getTotaldifficulty() {
        return totaldifficulty;
    }

    public void setTotaldifficulty(String totaldifficulty) {
        this.totaldifficulty = totaldifficulty;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getGasused() {
        return gasused;
    }

    public void setGasused(String gasused) {
        this.gasused = gasused;
    }

    public String getGaslimit() {
        return gaslimit;
    }

    public void setGaslimit(String gaslimit) {
        this.gaslimit = gaslimit;
    }

    public String getExtradata() {
        return extradata;
    }

    public void setExtradata(String extradata) {
        this.extradata = extradata;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getParenthash() {
        return parenthash;
    }

    public void setParenthash(String parenthash) {
        this.parenthash = parenthash;
    }

    public String getSha3uncles() {
        return sha3uncles;
    }

    public void setSha3uncles(String sha3uncles) {
        this.sha3uncles = sha3uncles;
    }

    public String getStateroot() {
        return stateroot;
    }

    public void setStateroot(String stateroot) {
        this.stateroot = stateroot;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getTransactionsroot() {
        return transactionsroot;
    }

    public void setTransactionsroot(String transactionsroot) {
        this.transactionsroot = transactionsroot;
    }
}
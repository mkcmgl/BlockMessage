package com.inspur.ethereumtest.pojo;

import java.util.ArrayList;
import java.util.List;

public class BlockbynumberExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BlockbynumberExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(String value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(String value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(String value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(String value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(String value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(String value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLike(String value) {
            addCriterion("height like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotLike(String value) {
            addCriterion("height not like", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<String> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<String> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(String value1, String value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(String value1, String value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNull() {
            addCriterion("timestamp is null");
            return (Criteria) this;
        }

        public Criteria andTimestampIsNotNull() {
            addCriterion("timestamp is not null");
            return (Criteria) this;
        }

        public Criteria andTimestampEqualTo(String value) {
            addCriterion("timestamp =", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotEqualTo(String value) {
            addCriterion("timestamp <>", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThan(String value) {
            addCriterion("timestamp >", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampGreaterThanOrEqualTo(String value) {
            addCriterion("timestamp >=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThan(String value) {
            addCriterion("timestamp <", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLessThanOrEqualTo(String value) {
            addCriterion("timestamp <=", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampLike(String value) {
            addCriterion("timestamp like", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotLike(String value) {
            addCriterion("timestamp not like", value, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampIn(List<String> values) {
            addCriterion("timestamp in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotIn(List<String> values) {
            addCriterion("timestamp not in", values, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampBetween(String value1, String value2) {
            addCriterion("timestamp between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTimestampNotBetween(String value1, String value2) {
            addCriterion("timestamp not between", value1, value2, "timestamp");
            return (Criteria) this;
        }

        public Criteria andTransactionsIsNull() {
            addCriterion("transactions is null");
            return (Criteria) this;
        }

        public Criteria andTransactionsIsNotNull() {
            addCriterion("transactions is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionsEqualTo(String value) {
            addCriterion("transactions =", value, "transactions");
            return (Criteria) this;
        }

        public Criteria andTransactionsNotEqualTo(String value) {
            addCriterion("transactions <>", value, "transactions");
            return (Criteria) this;
        }

        public Criteria andTransactionsGreaterThan(String value) {
            addCriterion("transactions >", value, "transactions");
            return (Criteria) this;
        }

        public Criteria andTransactionsGreaterThanOrEqualTo(String value) {
            addCriterion("transactions >=", value, "transactions");
            return (Criteria) this;
        }

        public Criteria andTransactionsLessThan(String value) {
            addCriterion("transactions <", value, "transactions");
            return (Criteria) this;
        }

        public Criteria andTransactionsLessThanOrEqualTo(String value) {
            addCriterion("transactions <=", value, "transactions");
            return (Criteria) this;
        }

        public Criteria andTransactionsLike(String value) {
            addCriterion("transactions like", value, "transactions");
            return (Criteria) this;
        }

        public Criteria andTransactionsNotLike(String value) {
            addCriterion("transactions not like", value, "transactions");
            return (Criteria) this;
        }

        public Criteria andTransactionsIn(List<String> values) {
            addCriterion("transactions in", values, "transactions");
            return (Criteria) this;
        }

        public Criteria andTransactionsNotIn(List<String> values) {
            addCriterion("transactions not in", values, "transactions");
            return (Criteria) this;
        }

        public Criteria andTransactionsBetween(String value1, String value2) {
            addCriterion("transactions between", value1, value2, "transactions");
            return (Criteria) this;
        }

        public Criteria andTransactionsNotBetween(String value1, String value2) {
            addCriterion("transactions not between", value1, value2, "transactions");
            return (Criteria) this;
        }

        public Criteria andMinerIsNull() {
            addCriterion("miner is null");
            return (Criteria) this;
        }

        public Criteria andMinerIsNotNull() {
            addCriterion("miner is not null");
            return (Criteria) this;
        }

        public Criteria andMinerEqualTo(String value) {
            addCriterion("miner =", value, "miner");
            return (Criteria) this;
        }

        public Criteria andMinerNotEqualTo(String value) {
            addCriterion("miner <>", value, "miner");
            return (Criteria) this;
        }

        public Criteria andMinerGreaterThan(String value) {
            addCriterion("miner >", value, "miner");
            return (Criteria) this;
        }

        public Criteria andMinerGreaterThanOrEqualTo(String value) {
            addCriterion("miner >=", value, "miner");
            return (Criteria) this;
        }

        public Criteria andMinerLessThan(String value) {
            addCriterion("miner <", value, "miner");
            return (Criteria) this;
        }

        public Criteria andMinerLessThanOrEqualTo(String value) {
            addCriterion("miner <=", value, "miner");
            return (Criteria) this;
        }

        public Criteria andMinerLike(String value) {
            addCriterion("miner like", value, "miner");
            return (Criteria) this;
        }

        public Criteria andMinerNotLike(String value) {
            addCriterion("miner not like", value, "miner");
            return (Criteria) this;
        }

        public Criteria andMinerIn(List<String> values) {
            addCriterion("miner in", values, "miner");
            return (Criteria) this;
        }

        public Criteria andMinerNotIn(List<String> values) {
            addCriterion("miner not in", values, "miner");
            return (Criteria) this;
        }

        public Criteria andMinerBetween(String value1, String value2) {
            addCriterion("miner between", value1, value2, "miner");
            return (Criteria) this;
        }

        public Criteria andMinerNotBetween(String value1, String value2) {
            addCriterion("miner not between", value1, value2, "miner");
            return (Criteria) this;
        }

        public Criteria andUnclesIsNull() {
            addCriterion("uncles is null");
            return (Criteria) this;
        }

        public Criteria andUnclesIsNotNull() {
            addCriterion("uncles is not null");
            return (Criteria) this;
        }

        public Criteria andUnclesEqualTo(String value) {
            addCriterion("uncles =", value, "uncles");
            return (Criteria) this;
        }

        public Criteria andUnclesNotEqualTo(String value) {
            addCriterion("uncles <>", value, "uncles");
            return (Criteria) this;
        }

        public Criteria andUnclesGreaterThan(String value) {
            addCriterion("uncles >", value, "uncles");
            return (Criteria) this;
        }

        public Criteria andUnclesGreaterThanOrEqualTo(String value) {
            addCriterion("uncles >=", value, "uncles");
            return (Criteria) this;
        }

        public Criteria andUnclesLessThan(String value) {
            addCriterion("uncles <", value, "uncles");
            return (Criteria) this;
        }

        public Criteria andUnclesLessThanOrEqualTo(String value) {
            addCriterion("uncles <=", value, "uncles");
            return (Criteria) this;
        }

        public Criteria andUnclesLike(String value) {
            addCriterion("uncles like", value, "uncles");
            return (Criteria) this;
        }

        public Criteria andUnclesNotLike(String value) {
            addCriterion("uncles not like", value, "uncles");
            return (Criteria) this;
        }

        public Criteria andUnclesIn(List<String> values) {
            addCriterion("uncles in", values, "uncles");
            return (Criteria) this;
        }

        public Criteria andUnclesNotIn(List<String> values) {
            addCriterion("uncles not in", values, "uncles");
            return (Criteria) this;
        }

        public Criteria andUnclesBetween(String value1, String value2) {
            addCriterion("uncles between", value1, value2, "uncles");
            return (Criteria) this;
        }

        public Criteria andUnclesNotBetween(String value1, String value2) {
            addCriterion("uncles not between", value1, value2, "uncles");
            return (Criteria) this;
        }

        public Criteria andDifficultyIsNull() {
            addCriterion("difficulty is null");
            return (Criteria) this;
        }

        public Criteria andDifficultyIsNotNull() {
            addCriterion("difficulty is not null");
            return (Criteria) this;
        }

        public Criteria andDifficultyEqualTo(String value) {
            addCriterion("difficulty =", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotEqualTo(String value) {
            addCriterion("difficulty <>", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyGreaterThan(String value) {
            addCriterion("difficulty >", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyGreaterThanOrEqualTo(String value) {
            addCriterion("difficulty >=", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLessThan(String value) {
            addCriterion("difficulty <", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLessThanOrEqualTo(String value) {
            addCriterion("difficulty <=", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyLike(String value) {
            addCriterion("difficulty like", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotLike(String value) {
            addCriterion("difficulty not like", value, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyIn(List<String> values) {
            addCriterion("difficulty in", values, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotIn(List<String> values) {
            addCriterion("difficulty not in", values, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyBetween(String value1, String value2) {
            addCriterion("difficulty between", value1, value2, "difficulty");
            return (Criteria) this;
        }

        public Criteria andDifficultyNotBetween(String value1, String value2) {
            addCriterion("difficulty not between", value1, value2, "difficulty");
            return (Criteria) this;
        }

        public Criteria andTotaldifficultyIsNull() {
            addCriterion("totalDifficulty is null");
            return (Criteria) this;
        }

        public Criteria andTotaldifficultyIsNotNull() {
            addCriterion("totalDifficulty is not null");
            return (Criteria) this;
        }

        public Criteria andTotaldifficultyEqualTo(String value) {
            addCriterion("totalDifficulty =", value, "totaldifficulty");
            return (Criteria) this;
        }

        public Criteria andTotaldifficultyNotEqualTo(String value) {
            addCriterion("totalDifficulty <>", value, "totaldifficulty");
            return (Criteria) this;
        }

        public Criteria andTotaldifficultyGreaterThan(String value) {
            addCriterion("totalDifficulty >", value, "totaldifficulty");
            return (Criteria) this;
        }

        public Criteria andTotaldifficultyGreaterThanOrEqualTo(String value) {
            addCriterion("totalDifficulty >=", value, "totaldifficulty");
            return (Criteria) this;
        }

        public Criteria andTotaldifficultyLessThan(String value) {
            addCriterion("totalDifficulty <", value, "totaldifficulty");
            return (Criteria) this;
        }

        public Criteria andTotaldifficultyLessThanOrEqualTo(String value) {
            addCriterion("totalDifficulty <=", value, "totaldifficulty");
            return (Criteria) this;
        }

        public Criteria andTotaldifficultyLike(String value) {
            addCriterion("totalDifficulty like", value, "totaldifficulty");
            return (Criteria) this;
        }

        public Criteria andTotaldifficultyNotLike(String value) {
            addCriterion("totalDifficulty not like", value, "totaldifficulty");
            return (Criteria) this;
        }

        public Criteria andTotaldifficultyIn(List<String> values) {
            addCriterion("totalDifficulty in", values, "totaldifficulty");
            return (Criteria) this;
        }

        public Criteria andTotaldifficultyNotIn(List<String> values) {
            addCriterion("totalDifficulty not in", values, "totaldifficulty");
            return (Criteria) this;
        }

        public Criteria andTotaldifficultyBetween(String value1, String value2) {
            addCriterion("totalDifficulty between", value1, value2, "totaldifficulty");
            return (Criteria) this;
        }

        public Criteria andTotaldifficultyNotBetween(String value1, String value2) {
            addCriterion("totalDifficulty not between", value1, value2, "totaldifficulty");
            return (Criteria) this;
        }

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("size not between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andGasusedIsNull() {
            addCriterion("gasUsed is null");
            return (Criteria) this;
        }

        public Criteria andGasusedIsNotNull() {
            addCriterion("gasUsed is not null");
            return (Criteria) this;
        }

        public Criteria andGasusedEqualTo(String value) {
            addCriterion("gasUsed =", value, "gasused");
            return (Criteria) this;
        }

        public Criteria andGasusedNotEqualTo(String value) {
            addCriterion("gasUsed <>", value, "gasused");
            return (Criteria) this;
        }

        public Criteria andGasusedGreaterThan(String value) {
            addCriterion("gasUsed >", value, "gasused");
            return (Criteria) this;
        }

        public Criteria andGasusedGreaterThanOrEqualTo(String value) {
            addCriterion("gasUsed >=", value, "gasused");
            return (Criteria) this;
        }

        public Criteria andGasusedLessThan(String value) {
            addCriterion("gasUsed <", value, "gasused");
            return (Criteria) this;
        }

        public Criteria andGasusedLessThanOrEqualTo(String value) {
            addCriterion("gasUsed <=", value, "gasused");
            return (Criteria) this;
        }

        public Criteria andGasusedLike(String value) {
            addCriterion("gasUsed like", value, "gasused");
            return (Criteria) this;
        }

        public Criteria andGasusedNotLike(String value) {
            addCriterion("gasUsed not like", value, "gasused");
            return (Criteria) this;
        }

        public Criteria andGasusedIn(List<String> values) {
            addCriterion("gasUsed in", values, "gasused");
            return (Criteria) this;
        }

        public Criteria andGasusedNotIn(List<String> values) {
            addCriterion("gasUsed not in", values, "gasused");
            return (Criteria) this;
        }

        public Criteria andGasusedBetween(String value1, String value2) {
            addCriterion("gasUsed between", value1, value2, "gasused");
            return (Criteria) this;
        }

        public Criteria andGasusedNotBetween(String value1, String value2) {
            addCriterion("gasUsed not between", value1, value2, "gasused");
            return (Criteria) this;
        }

        public Criteria andGaslimitIsNull() {
            addCriterion("gasLimit is null");
            return (Criteria) this;
        }

        public Criteria andGaslimitIsNotNull() {
            addCriterion("gasLimit is not null");
            return (Criteria) this;
        }

        public Criteria andGaslimitEqualTo(String value) {
            addCriterion("gasLimit =", value, "gaslimit");
            return (Criteria) this;
        }

        public Criteria andGaslimitNotEqualTo(String value) {
            addCriterion("gasLimit <>", value, "gaslimit");
            return (Criteria) this;
        }

        public Criteria andGaslimitGreaterThan(String value) {
            addCriterion("gasLimit >", value, "gaslimit");
            return (Criteria) this;
        }

        public Criteria andGaslimitGreaterThanOrEqualTo(String value) {
            addCriterion("gasLimit >=", value, "gaslimit");
            return (Criteria) this;
        }

        public Criteria andGaslimitLessThan(String value) {
            addCriterion("gasLimit <", value, "gaslimit");
            return (Criteria) this;
        }

        public Criteria andGaslimitLessThanOrEqualTo(String value) {
            addCriterion("gasLimit <=", value, "gaslimit");
            return (Criteria) this;
        }

        public Criteria andGaslimitLike(String value) {
            addCriterion("gasLimit like", value, "gaslimit");
            return (Criteria) this;
        }

        public Criteria andGaslimitNotLike(String value) {
            addCriterion("gasLimit not like", value, "gaslimit");
            return (Criteria) this;
        }

        public Criteria andGaslimitIn(List<String> values) {
            addCriterion("gasLimit in", values, "gaslimit");
            return (Criteria) this;
        }

        public Criteria andGaslimitNotIn(List<String> values) {
            addCriterion("gasLimit not in", values, "gaslimit");
            return (Criteria) this;
        }

        public Criteria andGaslimitBetween(String value1, String value2) {
            addCriterion("gasLimit between", value1, value2, "gaslimit");
            return (Criteria) this;
        }

        public Criteria andGaslimitNotBetween(String value1, String value2) {
            addCriterion("gasLimit not between", value1, value2, "gaslimit");
            return (Criteria) this;
        }

        public Criteria andExtradataIsNull() {
            addCriterion("extraData is null");
            return (Criteria) this;
        }

        public Criteria andExtradataIsNotNull() {
            addCriterion("extraData is not null");
            return (Criteria) this;
        }

        public Criteria andExtradataEqualTo(String value) {
            addCriterion("extraData =", value, "extradata");
            return (Criteria) this;
        }

        public Criteria andExtradataNotEqualTo(String value) {
            addCriterion("extraData <>", value, "extradata");
            return (Criteria) this;
        }

        public Criteria andExtradataGreaterThan(String value) {
            addCriterion("extraData >", value, "extradata");
            return (Criteria) this;
        }

        public Criteria andExtradataGreaterThanOrEqualTo(String value) {
            addCriterion("extraData >=", value, "extradata");
            return (Criteria) this;
        }

        public Criteria andExtradataLessThan(String value) {
            addCriterion("extraData <", value, "extradata");
            return (Criteria) this;
        }

        public Criteria andExtradataLessThanOrEqualTo(String value) {
            addCriterion("extraData <=", value, "extradata");
            return (Criteria) this;
        }

        public Criteria andExtradataLike(String value) {
            addCriterion("extraData like", value, "extradata");
            return (Criteria) this;
        }

        public Criteria andExtradataNotLike(String value) {
            addCriterion("extraData not like", value, "extradata");
            return (Criteria) this;
        }

        public Criteria andExtradataIn(List<String> values) {
            addCriterion("extraData in", values, "extradata");
            return (Criteria) this;
        }

        public Criteria andExtradataNotIn(List<String> values) {
            addCriterion("extraData not in", values, "extradata");
            return (Criteria) this;
        }

        public Criteria andExtradataBetween(String value1, String value2) {
            addCriterion("extraData between", value1, value2, "extradata");
            return (Criteria) this;
        }

        public Criteria andExtradataNotBetween(String value1, String value2) {
            addCriterion("extraData not between", value1, value2, "extradata");
            return (Criteria) this;
        }

        public Criteria andHashIsNull() {
            addCriterion("hash is null");
            return (Criteria) this;
        }

        public Criteria andHashIsNotNull() {
            addCriterion("hash is not null");
            return (Criteria) this;
        }

        public Criteria andHashEqualTo(String value) {
            addCriterion("hash =", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashNotEqualTo(String value) {
            addCriterion("hash <>", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashGreaterThan(String value) {
            addCriterion("hash >", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashGreaterThanOrEqualTo(String value) {
            addCriterion("hash >=", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashLessThan(String value) {
            addCriterion("hash <", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashLessThanOrEqualTo(String value) {
            addCriterion("hash <=", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashLike(String value) {
            addCriterion("hash like", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashNotLike(String value) {
            addCriterion("hash not like", value, "hash");
            return (Criteria) this;
        }

        public Criteria andHashIn(List<String> values) {
            addCriterion("hash in", values, "hash");
            return (Criteria) this;
        }

        public Criteria andHashNotIn(List<String> values) {
            addCriterion("hash not in", values, "hash");
            return (Criteria) this;
        }

        public Criteria andHashBetween(String value1, String value2) {
            addCriterion("hash between", value1, value2, "hash");
            return (Criteria) this;
        }

        public Criteria andHashNotBetween(String value1, String value2) {
            addCriterion("hash not between", value1, value2, "hash");
            return (Criteria) this;
        }

        public Criteria andParenthashIsNull() {
            addCriterion("parentHash is null");
            return (Criteria) this;
        }

        public Criteria andParenthashIsNotNull() {
            addCriterion("parentHash is not null");
            return (Criteria) this;
        }

        public Criteria andParenthashEqualTo(String value) {
            addCriterion("parentHash =", value, "parenthash");
            return (Criteria) this;
        }

        public Criteria andParenthashNotEqualTo(String value) {
            addCriterion("parentHash <>", value, "parenthash");
            return (Criteria) this;
        }

        public Criteria andParenthashGreaterThan(String value) {
            addCriterion("parentHash >", value, "parenthash");
            return (Criteria) this;
        }

        public Criteria andParenthashGreaterThanOrEqualTo(String value) {
            addCriterion("parentHash >=", value, "parenthash");
            return (Criteria) this;
        }

        public Criteria andParenthashLessThan(String value) {
            addCriterion("parentHash <", value, "parenthash");
            return (Criteria) this;
        }

        public Criteria andParenthashLessThanOrEqualTo(String value) {
            addCriterion("parentHash <=", value, "parenthash");
            return (Criteria) this;
        }

        public Criteria andParenthashLike(String value) {
            addCriterion("parentHash like", value, "parenthash");
            return (Criteria) this;
        }

        public Criteria andParenthashNotLike(String value) {
            addCriterion("parentHash not like", value, "parenthash");
            return (Criteria) this;
        }

        public Criteria andParenthashIn(List<String> values) {
            addCriterion("parentHash in", values, "parenthash");
            return (Criteria) this;
        }

        public Criteria andParenthashNotIn(List<String> values) {
            addCriterion("parentHash not in", values, "parenthash");
            return (Criteria) this;
        }

        public Criteria andParenthashBetween(String value1, String value2) {
            addCriterion("parentHash between", value1, value2, "parenthash");
            return (Criteria) this;
        }

        public Criteria andParenthashNotBetween(String value1, String value2) {
            addCriterion("parentHash not between", value1, value2, "parenthash");
            return (Criteria) this;
        }

        public Criteria andSha3unclesIsNull() {
            addCriterion("sha3Uncles is null");
            return (Criteria) this;
        }

        public Criteria andSha3unclesIsNotNull() {
            addCriterion("sha3Uncles is not null");
            return (Criteria) this;
        }

        public Criteria andSha3unclesEqualTo(String value) {
            addCriterion("sha3Uncles =", value, "sha3uncles");
            return (Criteria) this;
        }

        public Criteria andSha3unclesNotEqualTo(String value) {
            addCriterion("sha3Uncles <>", value, "sha3uncles");
            return (Criteria) this;
        }

        public Criteria andSha3unclesGreaterThan(String value) {
            addCriterion("sha3Uncles >", value, "sha3uncles");
            return (Criteria) this;
        }

        public Criteria andSha3unclesGreaterThanOrEqualTo(String value) {
            addCriterion("sha3Uncles >=", value, "sha3uncles");
            return (Criteria) this;
        }

        public Criteria andSha3unclesLessThan(String value) {
            addCriterion("sha3Uncles <", value, "sha3uncles");
            return (Criteria) this;
        }

        public Criteria andSha3unclesLessThanOrEqualTo(String value) {
            addCriterion("sha3Uncles <=", value, "sha3uncles");
            return (Criteria) this;
        }

        public Criteria andSha3unclesLike(String value) {
            addCriterion("sha3Uncles like", value, "sha3uncles");
            return (Criteria) this;
        }

        public Criteria andSha3unclesNotLike(String value) {
            addCriterion("sha3Uncles not like", value, "sha3uncles");
            return (Criteria) this;
        }

        public Criteria andSha3unclesIn(List<String> values) {
            addCriterion("sha3Uncles in", values, "sha3uncles");
            return (Criteria) this;
        }

        public Criteria andSha3unclesNotIn(List<String> values) {
            addCriterion("sha3Uncles not in", values, "sha3uncles");
            return (Criteria) this;
        }

        public Criteria andSha3unclesBetween(String value1, String value2) {
            addCriterion("sha3Uncles between", value1, value2, "sha3uncles");
            return (Criteria) this;
        }

        public Criteria andSha3unclesNotBetween(String value1, String value2) {
            addCriterion("sha3Uncles not between", value1, value2, "sha3uncles");
            return (Criteria) this;
        }

        public Criteria andStaterootIsNull() {
            addCriterion("stateRoot is null");
            return (Criteria) this;
        }

        public Criteria andStaterootIsNotNull() {
            addCriterion("stateRoot is not null");
            return (Criteria) this;
        }

        public Criteria andStaterootEqualTo(String value) {
            addCriterion("stateRoot =", value, "stateroot");
            return (Criteria) this;
        }

        public Criteria andStaterootNotEqualTo(String value) {
            addCriterion("stateRoot <>", value, "stateroot");
            return (Criteria) this;
        }

        public Criteria andStaterootGreaterThan(String value) {
            addCriterion("stateRoot >", value, "stateroot");
            return (Criteria) this;
        }

        public Criteria andStaterootGreaterThanOrEqualTo(String value) {
            addCriterion("stateRoot >=", value, "stateroot");
            return (Criteria) this;
        }

        public Criteria andStaterootLessThan(String value) {
            addCriterion("stateRoot <", value, "stateroot");
            return (Criteria) this;
        }

        public Criteria andStaterootLessThanOrEqualTo(String value) {
            addCriterion("stateRoot <=", value, "stateroot");
            return (Criteria) this;
        }

        public Criteria andStaterootLike(String value) {
            addCriterion("stateRoot like", value, "stateroot");
            return (Criteria) this;
        }

        public Criteria andStaterootNotLike(String value) {
            addCriterion("stateRoot not like", value, "stateroot");
            return (Criteria) this;
        }

        public Criteria andStaterootIn(List<String> values) {
            addCriterion("stateRoot in", values, "stateroot");
            return (Criteria) this;
        }

        public Criteria andStaterootNotIn(List<String> values) {
            addCriterion("stateRoot not in", values, "stateroot");
            return (Criteria) this;
        }

        public Criteria andStaterootBetween(String value1, String value2) {
            addCriterion("stateRoot between", value1, value2, "stateroot");
            return (Criteria) this;
        }

        public Criteria andStaterootNotBetween(String value1, String value2) {
            addCriterion("stateRoot not between", value1, value2, "stateroot");
            return (Criteria) this;
        }

        public Criteria andNonceIsNull() {
            addCriterion("nonce is null");
            return (Criteria) this;
        }

        public Criteria andNonceIsNotNull() {
            addCriterion("nonce is not null");
            return (Criteria) this;
        }

        public Criteria andNonceEqualTo(String value) {
            addCriterion("nonce =", value, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceNotEqualTo(String value) {
            addCriterion("nonce <>", value, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceGreaterThan(String value) {
            addCriterion("nonce >", value, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceGreaterThanOrEqualTo(String value) {
            addCriterion("nonce >=", value, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceLessThan(String value) {
            addCriterion("nonce <", value, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceLessThanOrEqualTo(String value) {
            addCriterion("nonce <=", value, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceLike(String value) {
            addCriterion("nonce like", value, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceNotLike(String value) {
            addCriterion("nonce not like", value, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceIn(List<String> values) {
            addCriterion("nonce in", values, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceNotIn(List<String> values) {
            addCriterion("nonce not in", values, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceBetween(String value1, String value2) {
            addCriterion("nonce between", value1, value2, "nonce");
            return (Criteria) this;
        }

        public Criteria andNonceNotBetween(String value1, String value2) {
            addCriterion("nonce not between", value1, value2, "nonce");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andTransactionsrootIsNull() {
            addCriterion("transactionsRoot is null");
            return (Criteria) this;
        }

        public Criteria andTransactionsrootIsNotNull() {
            addCriterion("transactionsRoot is not null");
            return (Criteria) this;
        }

        public Criteria andTransactionsrootEqualTo(String value) {
            addCriterion("transactionsRoot =", value, "transactionsroot");
            return (Criteria) this;
        }

        public Criteria andTransactionsrootNotEqualTo(String value) {
            addCriterion("transactionsRoot <>", value, "transactionsroot");
            return (Criteria) this;
        }

        public Criteria andTransactionsrootGreaterThan(String value) {
            addCriterion("transactionsRoot >", value, "transactionsroot");
            return (Criteria) this;
        }

        public Criteria andTransactionsrootGreaterThanOrEqualTo(String value) {
            addCriterion("transactionsRoot >=", value, "transactionsroot");
            return (Criteria) this;
        }

        public Criteria andTransactionsrootLessThan(String value) {
            addCriterion("transactionsRoot <", value, "transactionsroot");
            return (Criteria) this;
        }

        public Criteria andTransactionsrootLessThanOrEqualTo(String value) {
            addCriterion("transactionsRoot <=", value, "transactionsroot");
            return (Criteria) this;
        }

        public Criteria andTransactionsrootLike(String value) {
            addCriterion("transactionsRoot like", value, "transactionsroot");
            return (Criteria) this;
        }

        public Criteria andTransactionsrootNotLike(String value) {
            addCriterion("transactionsRoot not like", value, "transactionsroot");
            return (Criteria) this;
        }

        public Criteria andTransactionsrootIn(List<String> values) {
            addCriterion("transactionsRoot in", values, "transactionsroot");
            return (Criteria) this;
        }

        public Criteria andTransactionsrootNotIn(List<String> values) {
            addCriterion("transactionsRoot not in", values, "transactionsroot");
            return (Criteria) this;
        }

        public Criteria andTransactionsrootBetween(String value1, String value2) {
            addCriterion("transactionsRoot between", value1, value2, "transactionsroot");
            return (Criteria) this;
        }

        public Criteria andTransactionsrootNotBetween(String value1, String value2) {
            addCriterion("transactionsRoot not between", value1, value2, "transactionsroot");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}
package com.wyyuand.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BabyWeightExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_baby_weight
     *
     * @mbg.generated Thu Jul 04 19:48:40 CST 2019
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_baby_weight
     *
     * @mbg.generated Thu Jul 04 19:48:40 CST 2019
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_baby_weight
     *
     * @mbg.generated Thu Jul 04 19:48:40 CST 2019
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_baby_weight
     *
     * @mbg.generated Thu Jul 04 19:48:40 CST 2019
     */
    public BabyWeightExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_baby_weight
     *
     * @mbg.generated Thu Jul 04 19:48:40 CST 2019
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_baby_weight
     *
     * @mbg.generated Thu Jul 04 19:48:40 CST 2019
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_baby_weight
     *
     * @mbg.generated Thu Jul 04 19:48:40 CST 2019
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_baby_weight
     *
     * @mbg.generated Thu Jul 04 19:48:40 CST 2019
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_baby_weight
     *
     * @mbg.generated Thu Jul 04 19:48:40 CST 2019
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_baby_weight
     *
     * @mbg.generated Thu Jul 04 19:48:40 CST 2019
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_baby_weight
     *
     * @mbg.generated Thu Jul 04 19:48:40 CST 2019
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_baby_weight
     *
     * @mbg.generated Thu Jul 04 19:48:40 CST 2019
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_baby_weight
     *
     * @mbg.generated Thu Jul 04 19:48:40 CST 2019
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_baby_weight
     *
     * @mbg.generated Thu Jul 04 19:48:40 CST 2019
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_baby_weight
     *
     * @mbg.generated Thu Jul 04 19:48:40 CST 2019
     */
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

        public Criteria andWeightIdIsNull() {
            addCriterion("weight_id is null");
            return (Criteria) this;
        }

        public Criteria andWeightIdIsNotNull() {
            addCriterion("weight_id is not null");
            return (Criteria) this;
        }

        public Criteria andWeightIdEqualTo(String value) {
            addCriterion("weight_id =", value, "weightId");
            return (Criteria) this;
        }

        public Criteria andWeightIdNotEqualTo(String value) {
            addCriterion("weight_id <>", value, "weightId");
            return (Criteria) this;
        }

        public Criteria andWeightIdGreaterThan(String value) {
            addCriterion("weight_id >", value, "weightId");
            return (Criteria) this;
        }

        public Criteria andWeightIdGreaterThanOrEqualTo(String value) {
            addCriterion("weight_id >=", value, "weightId");
            return (Criteria) this;
        }

        public Criteria andWeightIdLessThan(String value) {
            addCriterion("weight_id <", value, "weightId");
            return (Criteria) this;
        }

        public Criteria andWeightIdLessThanOrEqualTo(String value) {
            addCriterion("weight_id <=", value, "weightId");
            return (Criteria) this;
        }

        public Criteria andWeightIdLike(String value) {
            addCriterion("weight_id like", value, "weightId");
            return (Criteria) this;
        }

        public Criteria andWeightIdNotLike(String value) {
            addCriterion("weight_id not like", value, "weightId");
            return (Criteria) this;
        }

        public Criteria andWeightIdIn(List<String> values) {
            addCriterion("weight_id in", values, "weightId");
            return (Criteria) this;
        }

        public Criteria andWeightIdNotIn(List<String> values) {
            addCriterion("weight_id not in", values, "weightId");
            return (Criteria) this;
        }

        public Criteria andWeightIdBetween(String value1, String value2) {
            addCriterion("weight_id between", value1, value2, "weightId");
            return (Criteria) this;
        }

        public Criteria andWeightIdNotBetween(String value1, String value2) {
            addCriterion("weight_id not between", value1, value2, "weightId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andWeightDataIsNull() {
            addCriterion("weight_data is null");
            return (Criteria) this;
        }

        public Criteria andWeightDataIsNotNull() {
            addCriterion("weight_data is not null");
            return (Criteria) this;
        }

        public Criteria andWeightDataEqualTo(Date value) {
            addCriterion("weight_data =", value, "weightData");
            return (Criteria) this;
        }

        public Criteria andWeightDataNotEqualTo(Date value) {
            addCriterion("weight_data <>", value, "weightData");
            return (Criteria) this;
        }

        public Criteria andWeightDataGreaterThan(Date value) {
            addCriterion("weight_data >", value, "weightData");
            return (Criteria) this;
        }

        public Criteria andWeightDataGreaterThanOrEqualTo(Date value) {
            addCriterion("weight_data >=", value, "weightData");
            return (Criteria) this;
        }

        public Criteria andWeightDataLessThan(Date value) {
            addCriterion("weight_data <", value, "weightData");
            return (Criteria) this;
        }

        public Criteria andWeightDataLessThanOrEqualTo(Date value) {
            addCriterion("weight_data <=", value, "weightData");
            return (Criteria) this;
        }

        public Criteria andWeightDataIn(List<Date> values) {
            addCriterion("weight_data in", values, "weightData");
            return (Criteria) this;
        }

        public Criteria andWeightDataNotIn(List<Date> values) {
            addCriterion("weight_data not in", values, "weightData");
            return (Criteria) this;
        }

        public Criteria andWeightDataBetween(Date value1, Date value2) {
            addCriterion("weight_data between", value1, value2, "weightData");
            return (Criteria) this;
        }

        public Criteria andWeightDataNotBetween(Date value1, Date value2) {
            addCriterion("weight_data not between", value1, value2, "weightData");
            return (Criteria) this;
        }

        public Criteria andBdpIsNull() {
            addCriterion("bdp is null");
            return (Criteria) this;
        }

        public Criteria andBdpIsNotNull() {
            addCriterion("bdp is not null");
            return (Criteria) this;
        }

        public Criteria andBdpEqualTo(BigDecimal value) {
            addCriterion("bdp =", value, "bdp");
            return (Criteria) this;
        }

        public Criteria andBdpNotEqualTo(BigDecimal value) {
            addCriterion("bdp <>", value, "bdp");
            return (Criteria) this;
        }

        public Criteria andBdpGreaterThan(BigDecimal value) {
            addCriterion("bdp >", value, "bdp");
            return (Criteria) this;
        }

        public Criteria andBdpGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bdp >=", value, "bdp");
            return (Criteria) this;
        }

        public Criteria andBdpLessThan(BigDecimal value) {
            addCriterion("bdp <", value, "bdp");
            return (Criteria) this;
        }

        public Criteria andBdpLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bdp <=", value, "bdp");
            return (Criteria) this;
        }

        public Criteria andBdpIn(List<BigDecimal> values) {
            addCriterion("bdp in", values, "bdp");
            return (Criteria) this;
        }

        public Criteria andBdpNotIn(List<BigDecimal> values) {
            addCriterion("bdp not in", values, "bdp");
            return (Criteria) this;
        }

        public Criteria andBdpBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bdp between", value1, value2, "bdp");
            return (Criteria) this;
        }

        public Criteria andBdpNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bdp not between", value1, value2, "bdp");
            return (Criteria) this;
        }

        public Criteria andAcIsNull() {
            addCriterion("ac is null");
            return (Criteria) this;
        }

        public Criteria andAcIsNotNull() {
            addCriterion("ac is not null");
            return (Criteria) this;
        }

        public Criteria andAcEqualTo(BigDecimal value) {
            addCriterion("ac =", value, "ac");
            return (Criteria) this;
        }

        public Criteria andAcNotEqualTo(BigDecimal value) {
            addCriterion("ac <>", value, "ac");
            return (Criteria) this;
        }

        public Criteria andAcGreaterThan(BigDecimal value) {
            addCriterion("ac >", value, "ac");
            return (Criteria) this;
        }

        public Criteria andAcGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ac >=", value, "ac");
            return (Criteria) this;
        }

        public Criteria andAcLessThan(BigDecimal value) {
            addCriterion("ac <", value, "ac");
            return (Criteria) this;
        }

        public Criteria andAcLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ac <=", value, "ac");
            return (Criteria) this;
        }

        public Criteria andAcIn(List<BigDecimal> values) {
            addCriterion("ac in", values, "ac");
            return (Criteria) this;
        }

        public Criteria andAcNotIn(List<BigDecimal> values) {
            addCriterion("ac not in", values, "ac");
            return (Criteria) this;
        }

        public Criteria andAcBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ac between", value1, value2, "ac");
            return (Criteria) this;
        }

        public Criteria andAcNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ac not between", value1, value2, "ac");
            return (Criteria) this;
        }

        public Criteria andFlIsNull() {
            addCriterion("fl is null");
            return (Criteria) this;
        }

        public Criteria andFlIsNotNull() {
            addCriterion("fl is not null");
            return (Criteria) this;
        }

        public Criteria andFlEqualTo(BigDecimal value) {
            addCriterion("fl =", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlNotEqualTo(BigDecimal value) {
            addCriterion("fl <>", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlGreaterThan(BigDecimal value) {
            addCriterion("fl >", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fl >=", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlLessThan(BigDecimal value) {
            addCriterion("fl <", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fl <=", value, "fl");
            return (Criteria) this;
        }

        public Criteria andFlIn(List<BigDecimal> values) {
            addCriterion("fl in", values, "fl");
            return (Criteria) this;
        }

        public Criteria andFlNotIn(List<BigDecimal> values) {
            addCriterion("fl not in", values, "fl");
            return (Criteria) this;
        }

        public Criteria andFlBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fl between", value1, value2, "fl");
            return (Criteria) this;
        }

        public Criteria andFlNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fl not between", value1, value2, "fl");
            return (Criteria) this;
        }

        public Criteria andWeightValueIsNull() {
            addCriterion("weight_value is null");
            return (Criteria) this;
        }

        public Criteria andWeightValueIsNotNull() {
            addCriterion("weight_value is not null");
            return (Criteria) this;
        }

        public Criteria andWeightValueEqualTo(BigDecimal value) {
            addCriterion("weight_value =", value, "weightValue");
            return (Criteria) this;
        }

        public Criteria andWeightValueNotEqualTo(BigDecimal value) {
            addCriterion("weight_value <>", value, "weightValue");
            return (Criteria) this;
        }

        public Criteria andWeightValueGreaterThan(BigDecimal value) {
            addCriterion("weight_value >", value, "weightValue");
            return (Criteria) this;
        }

        public Criteria andWeightValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight_value >=", value, "weightValue");
            return (Criteria) this;
        }

        public Criteria andWeightValueLessThan(BigDecimal value) {
            addCriterion("weight_value <", value, "weightValue");
            return (Criteria) this;
        }

        public Criteria andWeightValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight_value <=", value, "weightValue");
            return (Criteria) this;
        }

        public Criteria andWeightValueIn(List<BigDecimal> values) {
            addCriterion("weight_value in", values, "weightValue");
            return (Criteria) this;
        }

        public Criteria andWeightValueNotIn(List<BigDecimal> values) {
            addCriterion("weight_value not in", values, "weightValue");
            return (Criteria) this;
        }

        public Criteria andWeightValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight_value between", value1, value2, "weightValue");
            return (Criteria) this;
        }

        public Criteria andWeightValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight_value not between", value1, value2, "weightValue");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_baby_weight
     *
     * @mbg.generated do_not_delete_during_merge Thu Jul 04 19:48:40 CST 2019
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table t_baby_weight
     *
     * @mbg.generated Thu Jul 04 19:48:40 CST 2019
     */
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
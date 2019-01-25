package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class XwBindFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public XwBindFlowExample() {
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

        public Criteria andBank_card_idIsNull() {
            addCriterion("bank_card_id is null");
            return (Criteria) this;
        }

        public Criteria andBank_card_idIsNotNull() {
            addCriterion("bank_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andBank_card_idEqualTo(String value) {
            addCriterion("bank_card_id =", value, "bank_card_id");
            return (Criteria) this;
        }

        public Criteria andBank_card_idNotEqualTo(String value) {
            addCriterion("bank_card_id <>", value, "bank_card_id");
            return (Criteria) this;
        }

        public Criteria andBank_card_idGreaterThan(String value) {
            addCriterion("bank_card_id >", value, "bank_card_id");
            return (Criteria) this;
        }

        public Criteria andBank_card_idGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_id >=", value, "bank_card_id");
            return (Criteria) this;
        }

        public Criteria andBank_card_idLessThan(String value) {
            addCriterion("bank_card_id <", value, "bank_card_id");
            return (Criteria) this;
        }

        public Criteria andBank_card_idLessThanOrEqualTo(String value) {
            addCriterion("bank_card_id <=", value, "bank_card_id");
            return (Criteria) this;
        }

        public Criteria andBank_card_idLike(String value) {
            addCriterion("bank_card_id like", value, "bank_card_id");
            return (Criteria) this;
        }

        public Criteria andBank_card_idNotLike(String value) {
            addCriterion("bank_card_id not like", value, "bank_card_id");
            return (Criteria) this;
        }

        public Criteria andBank_card_idIn(List<String> values) {
            addCriterion("bank_card_id in", values, "bank_card_id");
            return (Criteria) this;
        }

        public Criteria andBank_card_idNotIn(List<String> values) {
            addCriterion("bank_card_id not in", values, "bank_card_id");
            return (Criteria) this;
        }

        public Criteria andBank_card_idBetween(String value1, String value2) {
            addCriterion("bank_card_id between", value1, value2, "bank_card_id");
            return (Criteria) this;
        }

        public Criteria andBank_card_idNotBetween(String value1, String value2) {
            addCriterion("bank_card_id not between", value1, value2, "bank_card_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUser_idIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUser_idEqualTo(String value) {
            addCriterion("user_id =", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotEqualTo(String value) {
            addCriterion("user_id <>", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThan(String value) {
            addCriterion("user_id >", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThan(String value) {
            addCriterion("user_id <", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idLike(String value) {
            addCriterion("user_id like", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotLike(String value) {
            addCriterion("user_id not like", value, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idIn(List<String> values) {
            addCriterion("user_id in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotIn(List<String> values) {
            addCriterion("user_id not in", values, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andUser_idNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "user_id");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andChannel_codeIsNull() {
            addCriterion("channel_code is null");
            return (Criteria) this;
        }

        public Criteria andChannel_codeIsNotNull() {
            addCriterion("channel_code is not null");
            return (Criteria) this;
        }

        public Criteria andChannel_codeEqualTo(String value) {
            addCriterion("channel_code =", value, "channel_code");
            return (Criteria) this;
        }

        public Criteria andChannel_codeNotEqualTo(String value) {
            addCriterion("channel_code <>", value, "channel_code");
            return (Criteria) this;
        }

        public Criteria andChannel_codeGreaterThan(String value) {
            addCriterion("channel_code >", value, "channel_code");
            return (Criteria) this;
        }

        public Criteria andChannel_codeGreaterThanOrEqualTo(String value) {
            addCriterion("channel_code >=", value, "channel_code");
            return (Criteria) this;
        }

        public Criteria andChannel_codeLessThan(String value) {
            addCriterion("channel_code <", value, "channel_code");
            return (Criteria) this;
        }

        public Criteria andChannel_codeLessThanOrEqualTo(String value) {
            addCriterion("channel_code <=", value, "channel_code");
            return (Criteria) this;
        }

        public Criteria andChannel_codeLike(String value) {
            addCriterion("channel_code like", value, "channel_code");
            return (Criteria) this;
        }

        public Criteria andChannel_codeNotLike(String value) {
            addCriterion("channel_code not like", value, "channel_code");
            return (Criteria) this;
        }

        public Criteria andChannel_codeIn(List<String> values) {
            addCriterion("channel_code in", values, "channel_code");
            return (Criteria) this;
        }

        public Criteria andChannel_codeNotIn(List<String> values) {
            addCriterion("channel_code not in", values, "channel_code");
            return (Criteria) this;
        }

        public Criteria andChannel_codeBetween(String value1, String value2) {
            addCriterion("channel_code between", value1, value2, "channel_code");
            return (Criteria) this;
        }

        public Criteria andChannel_codeNotBetween(String value1, String value2) {
            addCriterion("channel_code not between", value1, value2, "channel_code");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andLocal_urlIsNull() {
            addCriterion("local_url is null");
            return (Criteria) this;
        }

        public Criteria andLocal_urlIsNotNull() {
            addCriterion("local_url is not null");
            return (Criteria) this;
        }

        public Criteria andLocal_urlEqualTo(String value) {
            addCriterion("local_url =", value, "local_url");
            return (Criteria) this;
        }

        public Criteria andLocal_urlNotEqualTo(String value) {
            addCriterion("local_url <>", value, "local_url");
            return (Criteria) this;
        }

        public Criteria andLocal_urlGreaterThan(String value) {
            addCriterion("local_url >", value, "local_url");
            return (Criteria) this;
        }

        public Criteria andLocal_urlGreaterThanOrEqualTo(String value) {
            addCriterion("local_url >=", value, "local_url");
            return (Criteria) this;
        }

        public Criteria andLocal_urlLessThan(String value) {
            addCriterion("local_url <", value, "local_url");
            return (Criteria) this;
        }

        public Criteria andLocal_urlLessThanOrEqualTo(String value) {
            addCriterion("local_url <=", value, "local_url");
            return (Criteria) this;
        }

        public Criteria andLocal_urlLike(String value) {
            addCriterion("local_url like", value, "local_url");
            return (Criteria) this;
        }

        public Criteria andLocal_urlNotLike(String value) {
            addCriterion("local_url not like", value, "local_url");
            return (Criteria) this;
        }

        public Criteria andLocal_urlIn(List<String> values) {
            addCriterion("local_url in", values, "local_url");
            return (Criteria) this;
        }

        public Criteria andLocal_urlNotIn(List<String> values) {
            addCriterion("local_url not in", values, "local_url");
            return (Criteria) this;
        }

        public Criteria andLocal_urlBetween(String value1, String value2) {
            addCriterion("local_url between", value1, value2, "local_url");
            return (Criteria) this;
        }

        public Criteria andLocal_urlNotBetween(String value1, String value2) {
            addCriterion("local_url not between", value1, value2, "local_url");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeEqualTo(Date value) {
            addCriterion("update_time =", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThan(Date value) {
            addCriterion("update_time >", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThan(Date value) {
            addCriterion("update_time <", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeIn(List<Date> values) {
            addCriterion("update_time in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "update_time");
            return (Criteria) this;
        }

        public Criteria andUpdate_timeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "update_time");
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
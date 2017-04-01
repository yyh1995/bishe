package com.yyh.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUnameIsNull() {
            addCriterion("uname is null");
            return (Criteria) this;
        }

        public Criteria andUnameIsNotNull() {
            addCriterion("uname is not null");
            return (Criteria) this;
        }

        public Criteria andUnameEqualTo(String value) {
            addCriterion("uname =", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotEqualTo(String value) {
            addCriterion("uname <>", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThan(String value) {
            addCriterion("uname >", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameGreaterThanOrEqualTo(String value) {
            addCriterion("uname >=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThan(String value) {
            addCriterion("uname <", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLessThanOrEqualTo(String value) {
            addCriterion("uname <=", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameLike(String value) {
            addCriterion("uname like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotLike(String value) {
            addCriterion("uname not like", value, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameIn(List<String> values) {
            addCriterion("uname in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotIn(List<String> values) {
            addCriterion("uname not in", values, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameBetween(String value1, String value2) {
            addCriterion("uname between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUnameNotBetween(String value1, String value2) {
            addCriterion("uname not between", value1, value2, "uname");
            return (Criteria) this;
        }

        public Criteria andUaccoutIsNull() {
            addCriterion("uaccout is null");
            return (Criteria) this;
        }

        public Criteria andUaccoutIsNotNull() {
            addCriterion("uaccout is not null");
            return (Criteria) this;
        }

        public Criteria andUaccoutEqualTo(String value) {
            addCriterion("uaccout =", value, "uaccout");
            return (Criteria) this;
        }

        public Criteria andUaccoutNotEqualTo(String value) {
            addCriterion("uaccout <>", value, "uaccout");
            return (Criteria) this;
        }

        public Criteria andUaccoutGreaterThan(String value) {
            addCriterion("uaccout >", value, "uaccout");
            return (Criteria) this;
        }

        public Criteria andUaccoutGreaterThanOrEqualTo(String value) {
            addCriterion("uaccout >=", value, "uaccout");
            return (Criteria) this;
        }

        public Criteria andUaccoutLessThan(String value) {
            addCriterion("uaccout <", value, "uaccout");
            return (Criteria) this;
        }

        public Criteria andUaccoutLessThanOrEqualTo(String value) {
            addCriterion("uaccout <=", value, "uaccout");
            return (Criteria) this;
        }

        public Criteria andUaccoutLike(String value) {
            addCriterion("uaccout like", value, "uaccout");
            return (Criteria) this;
        }

        public Criteria andUaccoutNotLike(String value) {
            addCriterion("uaccout not like", value, "uaccout");
            return (Criteria) this;
        }

        public Criteria andUaccoutIn(List<String> values) {
            addCriterion("uaccout in", values, "uaccout");
            return (Criteria) this;
        }

        public Criteria andUaccoutNotIn(List<String> values) {
            addCriterion("uaccout not in", values, "uaccout");
            return (Criteria) this;
        }

        public Criteria andUaccoutBetween(String value1, String value2) {
            addCriterion("uaccout between", value1, value2, "uaccout");
            return (Criteria) this;
        }

        public Criteria andUaccoutNotBetween(String value1, String value2) {
            addCriterion("uaccout not between", value1, value2, "uaccout");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNull() {
            addCriterion("upassword is null");
            return (Criteria) this;
        }

        public Criteria andUpasswordIsNotNull() {
            addCriterion("upassword is not null");
            return (Criteria) this;
        }

        public Criteria andUpasswordEqualTo(String value) {
            addCriterion("upassword =", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotEqualTo(String value) {
            addCriterion("upassword <>", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThan(String value) {
            addCriterion("upassword >", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("upassword >=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThan(String value) {
            addCriterion("upassword <", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLessThanOrEqualTo(String value) {
            addCriterion("upassword <=", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordLike(String value) {
            addCriterion("upassword like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotLike(String value) {
            addCriterion("upassword not like", value, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordIn(List<String> values) {
            addCriterion("upassword in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotIn(List<String> values) {
            addCriterion("upassword not in", values, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordBetween(String value1, String value2) {
            addCriterion("upassword between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUpasswordNotBetween(String value1, String value2) {
            addCriterion("upassword not between", value1, value2, "upassword");
            return (Criteria) this;
        }

        public Criteria andUactivedIsNull() {
            addCriterion("uactived is null");
            return (Criteria) this;
        }

        public Criteria andUactivedIsNotNull() {
            addCriterion("uactived is not null");
            return (Criteria) this;
        }

        public Criteria andUactivedEqualTo(Integer value) {
            addCriterion("uactived =", value, "uactived");
            return (Criteria) this;
        }

        public Criteria andUactivedNotEqualTo(Integer value) {
            addCriterion("uactived <>", value, "uactived");
            return (Criteria) this;
        }

        public Criteria andUactivedGreaterThan(Integer value) {
            addCriterion("uactived >", value, "uactived");
            return (Criteria) this;
        }

        public Criteria andUactivedGreaterThanOrEqualTo(Integer value) {
            addCriterion("uactived >=", value, "uactived");
            return (Criteria) this;
        }

        public Criteria andUactivedLessThan(Integer value) {
            addCriterion("uactived <", value, "uactived");
            return (Criteria) this;
        }

        public Criteria andUactivedLessThanOrEqualTo(Integer value) {
            addCriterion("uactived <=", value, "uactived");
            return (Criteria) this;
        }

        public Criteria andUactivedIn(List<Integer> values) {
            addCriterion("uactived in", values, "uactived");
            return (Criteria) this;
        }

        public Criteria andUactivedNotIn(List<Integer> values) {
            addCriterion("uactived not in", values, "uactived");
            return (Criteria) this;
        }

        public Criteria andUactivedBetween(Integer value1, Integer value2) {
            addCriterion("uactived between", value1, value2, "uactived");
            return (Criteria) this;
        }

        public Criteria andUactivedNotBetween(Integer value1, Integer value2) {
            addCriterion("uactived not between", value1, value2, "uactived");
            return (Criteria) this;
        }

        public Criteria andUactiveCodeIsNull() {
            addCriterion("uactive_code is null");
            return (Criteria) this;
        }

        public Criteria andUactiveCodeIsNotNull() {
            addCriterion("uactive_code is not null");
            return (Criteria) this;
        }

        public Criteria andUactiveCodeEqualTo(String value) {
            addCriterion("uactive_code =", value, "uactiveCode");
            return (Criteria) this;
        }

        public Criteria andUactiveCodeNotEqualTo(String value) {
            addCriterion("uactive_code <>", value, "uactiveCode");
            return (Criteria) this;
        }

        public Criteria andUactiveCodeGreaterThan(String value) {
            addCriterion("uactive_code >", value, "uactiveCode");
            return (Criteria) this;
        }

        public Criteria andUactiveCodeGreaterThanOrEqualTo(String value) {
            addCriterion("uactive_code >=", value, "uactiveCode");
            return (Criteria) this;
        }

        public Criteria andUactiveCodeLessThan(String value) {
            addCriterion("uactive_code <", value, "uactiveCode");
            return (Criteria) this;
        }

        public Criteria andUactiveCodeLessThanOrEqualTo(String value) {
            addCriterion("uactive_code <=", value, "uactiveCode");
            return (Criteria) this;
        }

        public Criteria andUactiveCodeLike(String value) {
            addCriterion("uactive_code like", value, "uactiveCode");
            return (Criteria) this;
        }

        public Criteria andUactiveCodeNotLike(String value) {
            addCriterion("uactive_code not like", value, "uactiveCode");
            return (Criteria) this;
        }

        public Criteria andUactiveCodeIn(List<String> values) {
            addCriterion("uactive_code in", values, "uactiveCode");
            return (Criteria) this;
        }

        public Criteria andUactiveCodeNotIn(List<String> values) {
            addCriterion("uactive_code not in", values, "uactiveCode");
            return (Criteria) this;
        }

        public Criteria andUactiveCodeBetween(String value1, String value2) {
            addCriterion("uactive_code between", value1, value2, "uactiveCode");
            return (Criteria) this;
        }

        public Criteria andUactiveCodeNotBetween(String value1, String value2) {
            addCriterion("uactive_code not between", value1, value2, "uactiveCode");
            return (Criteria) this;
        }

        public Criteria andUemailIsNull() {
            addCriterion("uemail is null");
            return (Criteria) this;
        }

        public Criteria andUemailIsNotNull() {
            addCriterion("uemail is not null");
            return (Criteria) this;
        }

        public Criteria andUemailEqualTo(String value) {
            addCriterion("uemail =", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotEqualTo(String value) {
            addCriterion("uemail <>", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThan(String value) {
            addCriterion("uemail >", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailGreaterThanOrEqualTo(String value) {
            addCriterion("uemail >=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThan(String value) {
            addCriterion("uemail <", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLessThanOrEqualTo(String value) {
            addCriterion("uemail <=", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailLike(String value) {
            addCriterion("uemail like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotLike(String value) {
            addCriterion("uemail not like", value, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailIn(List<String> values) {
            addCriterion("uemail in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotIn(List<String> values) {
            addCriterion("uemail not in", values, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailBetween(String value1, String value2) {
            addCriterion("uemail between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andUemailNotBetween(String value1, String value2) {
            addCriterion("uemail not between", value1, value2, "uemail");
            return (Criteria) this;
        }

        public Criteria andHeadUrlIsNull() {
            addCriterion("head_url is null");
            return (Criteria) this;
        }

        public Criteria andHeadUrlIsNotNull() {
            addCriterion("head_url is not null");
            return (Criteria) this;
        }

        public Criteria andHeadUrlEqualTo(String value) {
            addCriterion("head_url =", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlNotEqualTo(String value) {
            addCriterion("head_url <>", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlGreaterThan(String value) {
            addCriterion("head_url >", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlGreaterThanOrEqualTo(String value) {
            addCriterion("head_url >=", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlLessThan(String value) {
            addCriterion("head_url <", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlLessThanOrEqualTo(String value) {
            addCriterion("head_url <=", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlLike(String value) {
            addCriterion("head_url like", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlNotLike(String value) {
            addCriterion("head_url not like", value, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlIn(List<String> values) {
            addCriterion("head_url in", values, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlNotIn(List<String> values) {
            addCriterion("head_url not in", values, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlBetween(String value1, String value2) {
            addCriterion("head_url between", value1, value2, "headUrl");
            return (Criteria) this;
        }

        public Criteria andHeadUrlNotBetween(String value1, String value2) {
            addCriterion("head_url not between", value1, value2, "headUrl");
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
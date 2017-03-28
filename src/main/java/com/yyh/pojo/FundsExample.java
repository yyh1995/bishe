package com.yyh.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;



//mybatis的逆向工程中会生成实例及实例对应的example，example用于添加条件，相当where后面的部分
public class FundsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FundsExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andFnameIsNull() {
            addCriterion("fName is null");
            return (Criteria) this;
        }

        public Criteria andFnameIsNotNull() {
            addCriterion("fName is not null");
            return (Criteria) this;
        }

        public Criteria andFnameEqualTo(String value) {
            addCriterion("fName =", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotEqualTo(String value) {
            addCriterion("fName <>", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThan(String value) {
            addCriterion("fName >", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThanOrEqualTo(String value) {
            addCriterion("fName >=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThan(String value) {
            addCriterion("fName <", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThanOrEqualTo(String value) {
            addCriterion("fName <=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLike(String value) {
            addCriterion("fName like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotLike(String value) {
            addCriterion("fName not like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameIn(List<String> values) {
            addCriterion("fName in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotIn(List<String> values) {
            addCriterion("fName not in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameBetween(String value1, String value2) {
            addCriterion("fName between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotBetween(String value1, String value2) {
            addCriterion("fName not between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFcodeIsNull() {
            addCriterion("fCode is null");
            return (Criteria) this;
        }

        public Criteria andFcodeIsNotNull() {
            addCriterion("fCode is not null");
            return (Criteria) this;
        }

        public Criteria andFcodeEqualTo(Integer value) {
            addCriterion("fCode =", value, "fcode");
            return (Criteria) this;
        }

        public Criteria andFcodeNotEqualTo(Integer value) {
            addCriterion("fCode <>", value, "fcode");
            return (Criteria) this;
        }

        public Criteria andFcodeGreaterThan(Integer value) {
            addCriterion("fCode >", value, "fcode");
            return (Criteria) this;
        }

        public Criteria andFcodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("fCode >=", value, "fcode");
            return (Criteria) this;
        }

        public Criteria andFcodeLessThan(Integer value) {
            addCriterion("fCode <", value, "fcode");
            return (Criteria) this;
        }

        public Criteria andFcodeLessThanOrEqualTo(Integer value) {
            addCriterion("fCode <=", value, "fcode");
            return (Criteria) this;
        }

        public Criteria andFcodeIn(List<Integer> values) {
            addCriterion("fCode in", values, "fcode");
            return (Criteria) this;
        }

        public Criteria andFcodeNotIn(List<Integer> values) {
            addCriterion("fCode not in", values, "fcode");
            return (Criteria) this;
        }

        public Criteria andFcodeBetween(Integer value1, Integer value2) {
            addCriterion("fCode between", value1, value2, "fcode");
            return (Criteria) this;
        }

        public Criteria andFcodeNotBetween(Integer value1, Integer value2) {
            addCriterion("fCode not between", value1, value2, "fcode");
            return (Criteria) this;
        }

        public Criteria andFnetdateIsNull() {
            addCriterion("fNetdate is null");
            return (Criteria) this;
        }

        public Criteria andFnetdateIsNotNull() {
            addCriterion("fNetdate is not null");
            return (Criteria) this;
        }

        public Criteria andFnetdateEqualTo(Date value) {
            addCriterionForJDBCDate("fNetdate =", value, "fnetdate");
            return (Criteria) this;
        }

        public Criteria andFnetdateNotEqualTo(Date value) {
            addCriterionForJDBCDate("fNetdate <>", value, "fnetdate");
            return (Criteria) this;
        }

        public Criteria andFnetdateGreaterThan(Date value) {
            addCriterionForJDBCDate("fNetdate >", value, "fnetdate");
            return (Criteria) this;
        }

        public Criteria andFnetdateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fNetdate >=", value, "fnetdate");
            return (Criteria) this;
        }

        public Criteria andFnetdateLessThan(Date value) {
            addCriterionForJDBCDate("fNetdate <", value, "fnetdate");
            return (Criteria) this;
        }

        public Criteria andFnetdateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fNetdate <=", value, "fnetdate");
            return (Criteria) this;
        }

        public Criteria andFnetdateIn(List<Date> values) {
            addCriterionForJDBCDate("fNetdate in", values, "fnetdate");
            return (Criteria) this;
        }

        public Criteria andFnetdateNotIn(List<Date> values) {
            addCriterionForJDBCDate("fNetdate not in", values, "fnetdate");
            return (Criteria) this;
        }

        public Criteria andFnetdateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fNetdate between", value1, value2, "fnetdate");
            return (Criteria) this;
        }

        public Criteria andFnetdateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fNetdate not between", value1, value2, "fnetdate");
            return (Criteria) this;
        }

        public Criteria andFanetIsNull() {
            addCriterion("fAnet is null");
            return (Criteria) this;
        }

        public Criteria andFanetIsNotNull() {
            addCriterion("fAnet is not null");
            return (Criteria) this;
        }

        public Criteria andFanetEqualTo(Double value) {
            addCriterion("fAnet =", value, "fanet");
            return (Criteria) this;
        }

        public Criteria andFanetNotEqualTo(Double value) {
            addCriterion("fAnet <>", value, "fanet");
            return (Criteria) this;
        }

        public Criteria andFanetGreaterThan(Double value) {
            addCriterion("fAnet >", value, "fanet");
            return (Criteria) this;
        }

        public Criteria andFanetGreaterThanOrEqualTo(Double value) {
            addCriterion("fAnet >=", value, "fanet");
            return (Criteria) this;
        }

        public Criteria andFanetLessThan(Double value) {
            addCriterion("fAnet <", value, "fanet");
            return (Criteria) this;
        }

        public Criteria andFanetLessThanOrEqualTo(Double value) {
            addCriterion("fAnet <=", value, "fanet");
            return (Criteria) this;
        }

        public Criteria andFanetIn(List<Double> values) {
            addCriterion("fAnet in", values, "fanet");
            return (Criteria) this;
        }

        public Criteria andFanetNotIn(List<Double> values) {
            addCriterion("fAnet not in", values, "fanet");
            return (Criteria) this;
        }

        public Criteria andFanetBetween(Double value1, Double value2) {
            addCriterion("fAnet between", value1, value2, "fanet");
            return (Criteria) this;
        }

        public Criteria andFanetNotBetween(Double value1, Double value2) {
            addCriterion("fAnet not between", value1, value2, "fanet");
            return (Criteria) this;
        }

        public Criteria andFdhlIsNull() {
            addCriterion("fDhl is null");
            return (Criteria) this;
        }

        public Criteria andFdhlIsNotNull() {
            addCriterion("fDhl is not null");
            return (Criteria) this;
        }

        public Criteria andFdhlEqualTo(Double value) {
            addCriterion("fDhl =", value, "fdhl");
            return (Criteria) this;
        }

        public Criteria andFdhlNotEqualTo(Double value) {
            addCriterion("fDhl <>", value, "fdhl");
            return (Criteria) this;
        }

        public Criteria andFdhlGreaterThan(Double value) {
            addCriterion("fDhl >", value, "fdhl");
            return (Criteria) this;
        }

        public Criteria andFdhlGreaterThanOrEqualTo(Double value) {
            addCriterion("fDhl >=", value, "fdhl");
            return (Criteria) this;
        }

        public Criteria andFdhlLessThan(Double value) {
            addCriterion("fDhl <", value, "fdhl");
            return (Criteria) this;
        }

        public Criteria andFdhlLessThanOrEqualTo(Double value) {
            addCriterion("fDhl <=", value, "fdhl");
            return (Criteria) this;
        }

        public Criteria andFdhlIn(List<Double> values) {
            addCriterion("fDhl in", values, "fdhl");
            return (Criteria) this;
        }

        public Criteria andFdhlNotIn(List<Double> values) {
            addCriterion("fDhl not in", values, "fdhl");
            return (Criteria) this;
        }

        public Criteria andFdhlBetween(Double value1, Double value2) {
            addCriterion("fDhl between", value1, value2, "fdhl");
            return (Criteria) this;
        }

        public Criteria andFdhlNotBetween(Double value1, Double value2) {
            addCriterion("fDhl not between", value1, value2, "fdhl");
            return (Criteria) this;
        }

        public Criteria andFyearningsIsNull() {
            addCriterion("fYearnings is null");
            return (Criteria) this;
        }

        public Criteria andFyearningsIsNotNull() {
            addCriterion("fYearnings is not null");
            return (Criteria) this;
        }

        public Criteria andFyearningsEqualTo(Double value) {
            addCriterion("fYearnings =", value, "fyearnings");
            return (Criteria) this;
        }

        public Criteria andFyearningsNotEqualTo(Double value) {
            addCriterion("fYearnings <>", value, "fyearnings");
            return (Criteria) this;
        }

        public Criteria andFyearningsGreaterThan(Double value) {
            addCriterion("fYearnings >", value, "fyearnings");
            return (Criteria) this;
        }

        public Criteria andFyearningsGreaterThanOrEqualTo(Double value) {
            addCriterion("fYearnings >=", value, "fyearnings");
            return (Criteria) this;
        }

        public Criteria andFyearningsLessThan(Double value) {
            addCriterion("fYearnings <", value, "fyearnings");
            return (Criteria) this;
        }

        public Criteria andFyearningsLessThanOrEqualTo(Double value) {
            addCriterion("fYearnings <=", value, "fyearnings");
            return (Criteria) this;
        }

        public Criteria andFyearningsIn(List<Double> values) {
            addCriterion("fYearnings in", values, "fyearnings");
            return (Criteria) this;
        }

        public Criteria andFyearningsNotIn(List<Double> values) {
            addCriterion("fYearnings not in", values, "fyearnings");
            return (Criteria) this;
        }

        public Criteria andFyearningsBetween(Double value1, Double value2) {
            addCriterion("fYearnings between", value1, value2, "fyearnings");
            return (Criteria) this;
        }

        public Criteria andFyearningsNotBetween(Double value1, Double value2) {
            addCriterion("fYearnings not between", value1, value2, "fyearnings");
            return (Criteria) this;
        }

        public Criteria andFaincomeIsNull() {
            addCriterion("fAincome is null");
            return (Criteria) this;
        }

        public Criteria andFaincomeIsNotNull() {
            addCriterion("fAincome is not null");
            return (Criteria) this;
        }

        public Criteria andFaincomeEqualTo(Double value) {
            addCriterion("fAincome =", value, "faincome");
            return (Criteria) this;
        }

        public Criteria andFaincomeNotEqualTo(Double value) {
            addCriterion("fAincome <>", value, "faincome");
            return (Criteria) this;
        }

        public Criteria andFaincomeGreaterThan(Double value) {
            addCriterion("fAincome >", value, "faincome");
            return (Criteria) this;
        }

        public Criteria andFaincomeGreaterThanOrEqualTo(Double value) {
            addCriterion("fAincome >=", value, "faincome");
            return (Criteria) this;
        }

        public Criteria andFaincomeLessThan(Double value) {
            addCriterion("fAincome <", value, "faincome");
            return (Criteria) this;
        }

        public Criteria andFaincomeLessThanOrEqualTo(Double value) {
            addCriterion("fAincome <=", value, "faincome");
            return (Criteria) this;
        }

        public Criteria andFaincomeIn(List<Double> values) {
            addCriterion("fAincome in", values, "faincome");
            return (Criteria) this;
        }

        public Criteria andFaincomeNotIn(List<Double> values) {
            addCriterion("fAincome not in", values, "faincome");
            return (Criteria) this;
        }

        public Criteria andFaincomeBetween(Double value1, Double value2) {
            addCriterion("fAincome between", value1, value2, "faincome");
            return (Criteria) this;
        }

        public Criteria andFaincomeNotBetween(Double value1, Double value2) {
            addCriterion("fAincome not between", value1, value2, "faincome");
            return (Criteria) this;
        }

        public Criteria andFtypeIsNull() {
            addCriterion("fType is null");
            return (Criteria) this;
        }

        public Criteria andFtypeIsNotNull() {
            addCriterion("fType is not null");
            return (Criteria) this;
        }

        public Criteria andFtypeEqualTo(String value) {
            addCriterion("fType =", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotEqualTo(String value) {
            addCriterion("fType <>", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeGreaterThan(String value) {
            addCriterion("fType >", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeGreaterThanOrEqualTo(String value) {
            addCriterion("fType >=", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLessThan(String value) {
            addCriterion("fType <", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLessThanOrEqualTo(String value) {
            addCriterion("fType <=", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeLike(String value) {
            addCriterion("fType like", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotLike(String value) {
            addCriterion("fType not like", value, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeIn(List<String> values) {
            addCriterion("fType in", values, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotIn(List<String> values) {
            addCriterion("fType not in", values, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeBetween(String value1, String value2) {
            addCriterion("fType between", value1, value2, "ftype");
            return (Criteria) this;
        }

        public Criteria andFtypeNotBetween(String value1, String value2) {
            addCriterion("fType not between", value1, value2, "ftype");
            return (Criteria) this;
        }
    }



    //静态内部类Criteria，Criteria中的方法是定义SQL 语句where后的查询条件
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
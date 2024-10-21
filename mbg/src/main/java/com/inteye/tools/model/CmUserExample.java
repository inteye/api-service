package com.inteye.tools.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CmUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CmUserExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andTokenIsNull() {
            addCriterion("token is null");
            return (Criteria) this;
        }

        public Criteria andTokenIsNotNull() {
            addCriterion("token is not null");
            return (Criteria) this;
        }

        public Criteria andTokenEqualTo(String value) {
            addCriterion("token =", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotEqualTo(String value) {
            addCriterion("token <>", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThan(String value) {
            addCriterion("token >", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenGreaterThanOrEqualTo(String value) {
            addCriterion("token >=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThan(String value) {
            addCriterion("token <", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLessThanOrEqualTo(String value) {
            addCriterion("token <=", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenLike(String value) {
            addCriterion("token like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotLike(String value) {
            addCriterion("token not like", value, "token");
            return (Criteria) this;
        }

        public Criteria andTokenIn(List<String> values) {
            addCriterion("token in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotIn(List<String> values) {
            addCriterion("token not in", values, "token");
            return (Criteria) this;
        }

        public Criteria andTokenBetween(String value1, String value2) {
            addCriterion("token between", value1, value2, "token");
            return (Criteria) this;
        }

        public Criteria andTokenNotBetween(String value1, String value2) {
            addCriterion("token not between", value1, value2, "token");
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

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andErrorsNumberIsNull() {
            addCriterion("errors_number is null");
            return (Criteria) this;
        }

        public Criteria andErrorsNumberIsNotNull() {
            addCriterion("errors_number is not null");
            return (Criteria) this;
        }

        public Criteria andErrorsNumberEqualTo(Short value) {
            addCriterion("errors_number =", value, "errorsNumber");
            return (Criteria) this;
        }

        public Criteria andErrorsNumberNotEqualTo(Short value) {
            addCriterion("errors_number <>", value, "errorsNumber");
            return (Criteria) this;
        }

        public Criteria andErrorsNumberGreaterThan(Short value) {
            addCriterion("errors_number >", value, "errorsNumber");
            return (Criteria) this;
        }

        public Criteria andErrorsNumberGreaterThanOrEqualTo(Short value) {
            addCriterion("errors_number >=", value, "errorsNumber");
            return (Criteria) this;
        }

        public Criteria andErrorsNumberLessThan(Short value) {
            addCriterion("errors_number <", value, "errorsNumber");
            return (Criteria) this;
        }

        public Criteria andErrorsNumberLessThanOrEqualTo(Short value) {
            addCriterion("errors_number <=", value, "errorsNumber");
            return (Criteria) this;
        }

        public Criteria andErrorsNumberIn(List<Short> values) {
            addCriterion("errors_number in", values, "errorsNumber");
            return (Criteria) this;
        }

        public Criteria andErrorsNumberNotIn(List<Short> values) {
            addCriterion("errors_number not in", values, "errorsNumber");
            return (Criteria) this;
        }

        public Criteria andErrorsNumberBetween(Short value1, Short value2) {
            addCriterion("errors_number between", value1, value2, "errorsNumber");
            return (Criteria) this;
        }

        public Criteria andErrorsNumberNotBetween(Short value1, Short value2) {
            addCriterion("errors_number not between", value1, value2, "errorsNumber");
            return (Criteria) this;
        }

        public Criteria andLockedTimeIsNull() {
            addCriterion("locked_time is null");
            return (Criteria) this;
        }

        public Criteria andLockedTimeIsNotNull() {
            addCriterion("locked_time is not null");
            return (Criteria) this;
        }

        public Criteria andLockedTimeEqualTo(Integer value) {
            addCriterion("locked_time =", value, "lockedTime");
            return (Criteria) this;
        }

        public Criteria andLockedTimeNotEqualTo(Integer value) {
            addCriterion("locked_time <>", value, "lockedTime");
            return (Criteria) this;
        }

        public Criteria andLockedTimeGreaterThan(Integer value) {
            addCriterion("locked_time >", value, "lockedTime");
            return (Criteria) this;
        }

        public Criteria andLockedTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("locked_time >=", value, "lockedTime");
            return (Criteria) this;
        }

        public Criteria andLockedTimeLessThan(Integer value) {
            addCriterion("locked_time <", value, "lockedTime");
            return (Criteria) this;
        }

        public Criteria andLockedTimeLessThanOrEqualTo(Integer value) {
            addCriterion("locked_time <=", value, "lockedTime");
            return (Criteria) this;
        }

        public Criteria andLockedTimeIn(List<Integer> values) {
            addCriterion("locked_time in", values, "lockedTime");
            return (Criteria) this;
        }

        public Criteria andLockedTimeNotIn(List<Integer> values) {
            addCriterion("locked_time not in", values, "lockedTime");
            return (Criteria) this;
        }

        public Criteria andLockedTimeBetween(Integer value1, Integer value2) {
            addCriterion("locked_time between", value1, value2, "lockedTime");
            return (Criteria) this;
        }

        public Criteria andLockedTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("locked_time not between", value1, value2, "lockedTime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeIsNull() {
            addCriterion("register_datetime is null");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeIsNotNull() {
            addCriterion("register_datetime is not null");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeEqualTo(Date value) {
            addCriterion("register_datetime =", value, "registerDatetime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeNotEqualTo(Date value) {
            addCriterion("register_datetime <>", value, "registerDatetime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeGreaterThan(Date value) {
            addCriterion("register_datetime >", value, "registerDatetime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("register_datetime >=", value, "registerDatetime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeLessThan(Date value) {
            addCriterion("register_datetime <", value, "registerDatetime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeLessThanOrEqualTo(Date value) {
            addCriterion("register_datetime <=", value, "registerDatetime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeIn(List<Date> values) {
            addCriterion("register_datetime in", values, "registerDatetime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeNotIn(List<Date> values) {
            addCriterion("register_datetime not in", values, "registerDatetime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeBetween(Date value1, Date value2) {
            addCriterion("register_datetime between", value1, value2, "registerDatetime");
            return (Criteria) this;
        }

        public Criteria andRegisterDatetimeNotBetween(Date value1, Date value2) {
            addCriterion("register_datetime not between", value1, value2, "registerDatetime");
            return (Criteria) this;
        }

        public Criteria andIsEmailValidatedIsNull() {
            addCriterion("is_email_validated is null");
            return (Criteria) this;
        }

        public Criteria andIsEmailValidatedIsNotNull() {
            addCriterion("is_email_validated is not null");
            return (Criteria) this;
        }

        public Criteria andIsEmailValidatedEqualTo(Boolean value) {
            addCriterion("is_email_validated =", value, "isEmailValidated");
            return (Criteria) this;
        }

        public Criteria andIsEmailValidatedNotEqualTo(Boolean value) {
            addCriterion("is_email_validated <>", value, "isEmailValidated");
            return (Criteria) this;
        }

        public Criteria andIsEmailValidatedGreaterThan(Boolean value) {
            addCriterion("is_email_validated >", value, "isEmailValidated");
            return (Criteria) this;
        }

        public Criteria andIsEmailValidatedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_email_validated >=", value, "isEmailValidated");
            return (Criteria) this;
        }

        public Criteria andIsEmailValidatedLessThan(Boolean value) {
            addCriterion("is_email_validated <", value, "isEmailValidated");
            return (Criteria) this;
        }

        public Criteria andIsEmailValidatedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_email_validated <=", value, "isEmailValidated");
            return (Criteria) this;
        }

        public Criteria andIsEmailValidatedIn(List<Boolean> values) {
            addCriterion("is_email_validated in", values, "isEmailValidated");
            return (Criteria) this;
        }

        public Criteria andIsEmailValidatedNotIn(List<Boolean> values) {
            addCriterion("is_email_validated not in", values, "isEmailValidated");
            return (Criteria) this;
        }

        public Criteria andIsEmailValidatedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_email_validated between", value1, value2, "isEmailValidated");
            return (Criteria) this;
        }

        public Criteria andIsEmailValidatedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_email_validated not between", value1, value2, "isEmailValidated");
            return (Criteria) this;
        }

        public Criteria andIsPhoneValidatedIsNull() {
            addCriterion("is_phone_validated is null");
            return (Criteria) this;
        }

        public Criteria andIsPhoneValidatedIsNotNull() {
            addCriterion("is_phone_validated is not null");
            return (Criteria) this;
        }

        public Criteria andIsPhoneValidatedEqualTo(Boolean value) {
            addCriterion("is_phone_validated =", value, "isPhoneValidated");
            return (Criteria) this;
        }

        public Criteria andIsPhoneValidatedNotEqualTo(Boolean value) {
            addCriterion("is_phone_validated <>", value, "isPhoneValidated");
            return (Criteria) this;
        }

        public Criteria andIsPhoneValidatedGreaterThan(Boolean value) {
            addCriterion("is_phone_validated >", value, "isPhoneValidated");
            return (Criteria) this;
        }

        public Criteria andIsPhoneValidatedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_phone_validated >=", value, "isPhoneValidated");
            return (Criteria) this;
        }

        public Criteria andIsPhoneValidatedLessThan(Boolean value) {
            addCriterion("is_phone_validated <", value, "isPhoneValidated");
            return (Criteria) this;
        }

        public Criteria andIsPhoneValidatedLessThanOrEqualTo(Boolean value) {
            addCriterion("is_phone_validated <=", value, "isPhoneValidated");
            return (Criteria) this;
        }

        public Criteria andIsPhoneValidatedIn(List<Boolean> values) {
            addCriterion("is_phone_validated in", values, "isPhoneValidated");
            return (Criteria) this;
        }

        public Criteria andIsPhoneValidatedNotIn(List<Boolean> values) {
            addCriterion("is_phone_validated not in", values, "isPhoneValidated");
            return (Criteria) this;
        }

        public Criteria andIsPhoneValidatedBetween(Boolean value1, Boolean value2) {
            addCriterion("is_phone_validated between", value1, value2, "isPhoneValidated");
            return (Criteria) this;
        }

        public Criteria andIsPhoneValidatedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_phone_validated not between", value1, value2, "isPhoneValidated");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("last_login_time =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("last_login_time <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("last_login_time >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("last_login_time >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("last_login_time <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("last_login_time <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("last_login_time in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("last_login_time not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("last_login_time between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("last_login_time not between", value1, value2, "lastLoginTime");
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
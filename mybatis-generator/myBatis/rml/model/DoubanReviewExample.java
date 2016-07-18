package rml.model;

import java.util.ArrayList;
import java.util.List;

public class DoubanReviewExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DoubanReviewExample() {
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

        public Criteria andMovieNameIsNull() {
            addCriterion("movie_name is null");
            return (Criteria) this;
        }

        public Criteria andMovieNameIsNotNull() {
            addCriterion("movie_name is not null");
            return (Criteria) this;
        }

        public Criteria andMovieNameEqualTo(String value) {
            addCriterion("movie_name =", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotEqualTo(String value) {
            addCriterion("movie_name <>", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThan(String value) {
            addCriterion("movie_name >", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameGreaterThanOrEqualTo(String value) {
            addCriterion("movie_name >=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThan(String value) {
            addCriterion("movie_name <", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLessThanOrEqualTo(String value) {
            addCriterion("movie_name <=", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameLike(String value) {
            addCriterion("movie_name like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotLike(String value) {
            addCriterion("movie_name not like", value, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameIn(List<String> values) {
            addCriterion("movie_name in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotIn(List<String> values) {
            addCriterion("movie_name not in", values, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameBetween(String value1, String value2) {
            addCriterion("movie_name between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andMovieNameNotBetween(String value1, String value2) {
            addCriterion("movie_name not between", value1, value2, "movieName");
            return (Criteria) this;
        }

        public Criteria andStarIsNull() {
            addCriterion("star is null");
            return (Criteria) this;
        }

        public Criteria andStarIsNotNull() {
            addCriterion("star is not null");
            return (Criteria) this;
        }

        public Criteria andStarEqualTo(Integer value) {
            addCriterion("star =", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotEqualTo(Integer value) {
            addCriterion("star <>", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThan(Integer value) {
            addCriterion("star >", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarGreaterThanOrEqualTo(Integer value) {
            addCriterion("star >=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThan(Integer value) {
            addCriterion("star <", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarLessThanOrEqualTo(Integer value) {
            addCriterion("star <=", value, "star");
            return (Criteria) this;
        }

        public Criteria andStarIn(List<Integer> values) {
            addCriterion("star in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotIn(List<Integer> values) {
            addCriterion("star not in", values, "star");
            return (Criteria) this;
        }

        public Criteria andStarBetween(Integer value1, Integer value2) {
            addCriterion("star between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andStarNotBetween(Integer value1, Integer value2) {
            addCriterion("star not between", value1, value2, "star");
            return (Criteria) this;
        }

        public Criteria andDescsIsNull() {
            addCriterion("descs is null");
            return (Criteria) this;
        }

        public Criteria andDescsIsNotNull() {
            addCriterion("descs is not null");
            return (Criteria) this;
        }

        public Criteria andDescsEqualTo(String value) {
            addCriterion("descs =", value, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsNotEqualTo(String value) {
            addCriterion("descs <>", value, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsGreaterThan(String value) {
            addCriterion("descs >", value, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsGreaterThanOrEqualTo(String value) {
            addCriterion("descs >=", value, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsLessThan(String value) {
            addCriterion("descs <", value, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsLessThanOrEqualTo(String value) {
            addCriterion("descs <=", value, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsLike(String value) {
            addCriterion("descs like", value, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsNotLike(String value) {
            addCriterion("descs not like", value, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsIn(List<String> values) {
            addCriterion("descs in", values, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsNotIn(List<String> values) {
            addCriterion("descs not in", values, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsBetween(String value1, String value2) {
            addCriterion("descs between", value1, value2, "descs");
            return (Criteria) this;
        }

        public Criteria andDescsNotBetween(String value1, String value2) {
            addCriterion("descs not between", value1, value2, "descs");
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
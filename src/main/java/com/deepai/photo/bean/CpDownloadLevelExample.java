package com.deepai.photo.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CpDownloadLevelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CpDownloadLevelExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLevelNameIsNull() {
            addCriterion("LEVEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLevelNameIsNotNull() {
            addCriterion("LEVEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLevelNameEqualTo(String value) {
            addCriterion("LEVEL_NAME =", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotEqualTo(String value) {
            addCriterion("LEVEL_NAME <>", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameGreaterThan(String value) {
            addCriterion("LEVEL_NAME >", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("LEVEL_NAME >=", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLessThan(String value) {
            addCriterion("LEVEL_NAME <", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLessThanOrEqualTo(String value) {
            addCriterion("LEVEL_NAME <=", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameLike(String value) {
            addCriterion("LEVEL_NAME like", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotLike(String value) {
            addCriterion("LEVEL_NAME not like", value, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameIn(List<String> values) {
            addCriterion("LEVEL_NAME in", values, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotIn(List<String> values) {
            addCriterion("LEVEL_NAME not in", values, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameBetween(String value1, String value2) {
            addCriterion("LEVEL_NAME between", value1, value2, "levelName");
            return (Criteria) this;
        }

        public Criteria andLevelNameNotBetween(String value1, String value2) {
            addCriterion("LEVEL_NAME not between", value1, value2, "levelName");
            return (Criteria) this;
        }

        public Criteria andLimitPxHIsNull() {
            addCriterion("LIMIT_PX_H is null");
            return (Criteria) this;
        }

        public Criteria andLimitPxHIsNotNull() {
            addCriterion("LIMIT_PX_H is not null");
            return (Criteria) this;
        }

        public Criteria andLimitPxHEqualTo(Integer value) {
            addCriterion("LIMIT_PX_H =", value, "limitPxH");
            return (Criteria) this;
        }

        public Criteria andLimitPxHNotEqualTo(Integer value) {
            addCriterion("LIMIT_PX_H <>", value, "limitPxH");
            return (Criteria) this;
        }

        public Criteria andLimitPxHGreaterThan(Integer value) {
            addCriterion("LIMIT_PX_H >", value, "limitPxH");
            return (Criteria) this;
        }

        public Criteria andLimitPxHGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIMIT_PX_H >=", value, "limitPxH");
            return (Criteria) this;
        }

        public Criteria andLimitPxHLessThan(Integer value) {
            addCriterion("LIMIT_PX_H <", value, "limitPxH");
            return (Criteria) this;
        }

        public Criteria andLimitPxHLessThanOrEqualTo(Integer value) {
            addCriterion("LIMIT_PX_H <=", value, "limitPxH");
            return (Criteria) this;
        }

        public Criteria andLimitPxHIn(List<Integer> values) {
            addCriterion("LIMIT_PX_H in", values, "limitPxH");
            return (Criteria) this;
        }

        public Criteria andLimitPxHNotIn(List<Integer> values) {
            addCriterion("LIMIT_PX_H not in", values, "limitPxH");
            return (Criteria) this;
        }

        public Criteria andLimitPxHBetween(Integer value1, Integer value2) {
            addCriterion("LIMIT_PX_H between", value1, value2, "limitPxH");
            return (Criteria) this;
        }

        public Criteria andLimitPxHNotBetween(Integer value1, Integer value2) {
            addCriterion("LIMIT_PX_H not between", value1, value2, "limitPxH");
            return (Criteria) this;
        }

        public Criteria andLimitPxWIsNull() {
            addCriterion("LIMIT_PX_W is null");
            return (Criteria) this;
        }

        public Criteria andLimitPxWIsNotNull() {
            addCriterion("LIMIT_PX_W is not null");
            return (Criteria) this;
        }

        public Criteria andLimitPxWEqualTo(Integer value) {
            addCriterion("LIMIT_PX_W =", value, "limitPxW");
            return (Criteria) this;
        }

        public Criteria andLimitPxWNotEqualTo(Integer value) {
            addCriterion("LIMIT_PX_W <>", value, "limitPxW");
            return (Criteria) this;
        }

        public Criteria andLimitPxWGreaterThan(Integer value) {
            addCriterion("LIMIT_PX_W >", value, "limitPxW");
            return (Criteria) this;
        }

        public Criteria andLimitPxWGreaterThanOrEqualTo(Integer value) {
            addCriterion("LIMIT_PX_W >=", value, "limitPxW");
            return (Criteria) this;
        }

        public Criteria andLimitPxWLessThan(Integer value) {
            addCriterion("LIMIT_PX_W <", value, "limitPxW");
            return (Criteria) this;
        }

        public Criteria andLimitPxWLessThanOrEqualTo(Integer value) {
            addCriterion("LIMIT_PX_W <=", value, "limitPxW");
            return (Criteria) this;
        }

        public Criteria andLimitPxWIn(List<Integer> values) {
            addCriterion("LIMIT_PX_W in", values, "limitPxW");
            return (Criteria) this;
        }

        public Criteria andLimitPxWNotIn(List<Integer> values) {
            addCriterion("LIMIT_PX_W not in", values, "limitPxW");
            return (Criteria) this;
        }

        public Criteria andLimitPxWBetween(Integer value1, Integer value2) {
            addCriterion("LIMIT_PX_W between", value1, value2, "limitPxW");
            return (Criteria) this;
        }

        public Criteria andLimitPxWNotBetween(Integer value1, Integer value2) {
            addCriterion("LIMIT_PX_W not between", value1, value2, "limitPxW");
            return (Criteria) this;
        }

        public Criteria andIsWatermarkIsNull() {
            addCriterion("IS_WATERMARK is null");
            return (Criteria) this;
        }

        public Criteria andIsWatermarkIsNotNull() {
            addCriterion("IS_WATERMARK is not null");
            return (Criteria) this;
        }

        public Criteria andIsWatermarkEqualTo(Byte value) {
            addCriterion("IS_WATERMARK =", value, "isWatermark");
            return (Criteria) this;
        }

        public Criteria andIsWatermarkNotEqualTo(Byte value) {
            addCriterion("IS_WATERMARK <>", value, "isWatermark");
            return (Criteria) this;
        }

        public Criteria andIsWatermarkGreaterThan(Byte value) {
            addCriterion("IS_WATERMARK >", value, "isWatermark");
            return (Criteria) this;
        }

        public Criteria andIsWatermarkGreaterThanOrEqualTo(Byte value) {
            addCriterion("IS_WATERMARK >=", value, "isWatermark");
            return (Criteria) this;
        }

        public Criteria andIsWatermarkLessThan(Byte value) {
            addCriterion("IS_WATERMARK <", value, "isWatermark");
            return (Criteria) this;
        }

        public Criteria andIsWatermarkLessThanOrEqualTo(Byte value) {
            addCriterion("IS_WATERMARK <=", value, "isWatermark");
            return (Criteria) this;
        }

        public Criteria andIsWatermarkIn(List<Byte> values) {
            addCriterion("IS_WATERMARK in", values, "isWatermark");
            return (Criteria) this;
        }

        public Criteria andIsWatermarkNotIn(List<Byte> values) {
            addCriterion("IS_WATERMARK not in", values, "isWatermark");
            return (Criteria) this;
        }

        public Criteria andIsWatermarkBetween(Byte value1, Byte value2) {
            addCriterion("IS_WATERMARK between", value1, value2, "isWatermark");
            return (Criteria) this;
        }

        public Criteria andIsWatermarkNotBetween(Byte value1, Byte value2) {
            addCriterion("IS_WATERMARK not between", value1, value2, "isWatermark");
            return (Criteria) this;
        }

        public Criteria andWatermarkLocationIsNull() {
            addCriterion("WATERMARK_LOCATION is null");
            return (Criteria) this;
        }

        public Criteria andWatermarkLocationIsNotNull() {
            addCriterion("WATERMARK_LOCATION is not null");
            return (Criteria) this;
        }

        public Criteria andWatermarkLocationEqualTo(Integer value) {
            addCriterion("WATERMARK_LOCATION =", value, "watermarkLocation");
            return (Criteria) this;
        }

        public Criteria andWatermarkLocationNotEqualTo(Integer value) {
            addCriterion("WATERMARK_LOCATION <>", value, "watermarkLocation");
            return (Criteria) this;
        }

        public Criteria andWatermarkLocationGreaterThan(Integer value) {
            addCriterion("WATERMARK_LOCATION >", value, "watermarkLocation");
            return (Criteria) this;
        }

        public Criteria andWatermarkLocationGreaterThanOrEqualTo(Integer value) {
            addCriterion("WATERMARK_LOCATION >=", value, "watermarkLocation");
            return (Criteria) this;
        }

        public Criteria andWatermarkLocationLessThan(Integer value) {
            addCriterion("WATERMARK_LOCATION <", value, "watermarkLocation");
            return (Criteria) this;
        }

        public Criteria andWatermarkLocationLessThanOrEqualTo(Integer value) {
            addCriterion("WATERMARK_LOCATION <=", value, "watermarkLocation");
            return (Criteria) this;
        }

        public Criteria andWatermarkLocationIn(List<Integer> values) {
            addCriterion("WATERMARK_LOCATION in", values, "watermarkLocation");
            return (Criteria) this;
        }

        public Criteria andWatermarkLocationNotIn(List<Integer> values) {
            addCriterion("WATERMARK_LOCATION not in", values, "watermarkLocation");
            return (Criteria) this;
        }

        public Criteria andWatermarkLocationBetween(Integer value1, Integer value2) {
            addCriterion("WATERMARK_LOCATION between", value1, value2, "watermarkLocation");
            return (Criteria) this;
        }

        public Criteria andWatermarkLocationNotBetween(Integer value1, Integer value2) {
            addCriterion("WATERMARK_LOCATION not between", value1, value2, "watermarkLocation");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNull() {
            addCriterion("SITE_ID is null");
            return (Criteria) this;
        }

        public Criteria andSiteIdIsNotNull() {
            addCriterion("SITE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSiteIdEqualTo(Integer value) {
            addCriterion("SITE_ID =", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotEqualTo(Integer value) {
            addCriterion("SITE_ID <>", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThan(Integer value) {
            addCriterion("SITE_ID >", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SITE_ID >=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThan(Integer value) {
            addCriterion("SITE_ID <", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdLessThanOrEqualTo(Integer value) {
            addCriterion("SITE_ID <=", value, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdIn(List<Integer> values) {
            addCriterion("SITE_ID in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotIn(List<Integer> values) {
            addCriterion("SITE_ID not in", values, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdBetween(Integer value1, Integer value2) {
            addCriterion("SITE_ID between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andSiteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SITE_ID not between", value1, value2, "siteId");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("CREATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("CREATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("CREATE_USER =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("CREATE_USER <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("CREATE_USER >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("CREATE_USER >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("CREATE_USER <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("CREATE_USER <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("CREATE_USER like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("CREATE_USER not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("CREATE_USER in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("CREATE_USER not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("CREATE_USER between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("CREATE_USER not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("CREATE_TIME =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("CREATE_TIME <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("CREATE_TIME >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("CREATE_TIME <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_TIME <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("CREATE_TIME in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("CREATE_TIME not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_TIME not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("UPDATE_USER is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("UPDATE_USER is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("UPDATE_USER =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("UPDATE_USER <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("UPDATE_USER >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("UPDATE_USER <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("UPDATE_USER <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("UPDATE_USER like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("UPDATE_USER not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("UPDATE_USER in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("UPDATE_USER not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("UPDATE_USER between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("UPDATE_USER not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("DELETE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("DELETE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Byte value) {
            addCriterion("DELETE_FLAG =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Byte value) {
            addCriterion("DELETE_FLAG <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Byte value) {
            addCriterion("DELETE_FLAG >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Byte value) {
            addCriterion("DELETE_FLAG >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Byte value) {
            addCriterion("DELETE_FLAG <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Byte value) {
            addCriterion("DELETE_FLAG <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Byte> values) {
            addCriterion("DELETE_FLAG in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Byte> values) {
            addCriterion("DELETE_FLAG not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Byte value1, Byte value2) {
            addCriterion("DELETE_FLAG between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Byte value1, Byte value2) {
            addCriterion("DELETE_FLAG not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andWatermarkPicIdIsNull() {
            addCriterion("WATERMARK_PIC_ID is null");
            return (Criteria) this;
        }

        public Criteria andWatermarkPicIdIsNotNull() {
            addCriterion("WATERMARK_PIC_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWatermarkPicIdEqualTo(Integer value) {
            addCriterion("WATERMARK_PIC_ID =", value, "watermarkPicId");
            return (Criteria) this;
        }

        public Criteria andWatermarkPicIdNotEqualTo(Integer value) {
            addCriterion("WATERMARK_PIC_ID <>", value, "watermarkPicId");
            return (Criteria) this;
        }

        public Criteria andWatermarkPicIdGreaterThan(Integer value) {
            addCriterion("WATERMARK_PIC_ID >", value, "watermarkPicId");
            return (Criteria) this;
        }

        public Criteria andWatermarkPicIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("WATERMARK_PIC_ID >=", value, "watermarkPicId");
            return (Criteria) this;
        }

        public Criteria andWatermarkPicIdLessThan(Integer value) {
            addCriterion("WATERMARK_PIC_ID <", value, "watermarkPicId");
            return (Criteria) this;
        }

        public Criteria andWatermarkPicIdLessThanOrEqualTo(Integer value) {
            addCriterion("WATERMARK_PIC_ID <=", value, "watermarkPicId");
            return (Criteria) this;
        }

        public Criteria andWatermarkPicIdIn(List<Integer> values) {
            addCriterion("WATERMARK_PIC_ID in", values, "watermarkPicId");
            return (Criteria) this;
        }

        public Criteria andWatermarkPicIdNotIn(List<Integer> values) {
            addCriterion("WATERMARK_PIC_ID not in", values, "watermarkPicId");
            return (Criteria) this;
        }

        public Criteria andWatermarkPicIdBetween(Integer value1, Integer value2) {
            addCriterion("WATERMARK_PIC_ID between", value1, value2, "watermarkPicId");
            return (Criteria) this;
        }

        public Criteria andWatermarkPicIdNotBetween(Integer value1, Integer value2) {
            addCriterion("WATERMARK_PIC_ID not between", value1, value2, "watermarkPicId");
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
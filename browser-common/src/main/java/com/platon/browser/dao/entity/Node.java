package com.platon.browser.dao.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class Node {
    private String nodeId;

    private Integer statSlashMultiQty;

    private Integer statSlashLowQty;

    private Long statBlockQty;

    private Long statExpectBlockQty;

    private Integer statVerifierTime;

    private Integer isRecommend;

    private BigDecimal totalValue;

    private Long stakingBlockNum;

    private Integer stakingTxIndex;

    private BigDecimal stakingHes;

    private BigDecimal stakingLocked;

    private BigDecimal stakingReduction;

    private Integer stakingReductionEpoch;

    private String nodeName;

    private String nodeIcon;

    private String externalId;

    private String externalName;

    private String stakingAddr;

    private String benefitAddr;

    private Double annualizedRate;

    private Integer programVersion;

    private Integer bigVersion;

    private String webSite;

    private String details;

    private Date joinTime;

    private Date leaveTime;

    private Integer status;

    private Integer isConsensus;

    private Integer isSettle;

    private Integer isInit;

    private BigDecimal statDelegateValue;

    private BigDecimal statDelegateReleased;

    private Integer statValidAddrs;

    private Integer statInvalidAddrs;

    private BigDecimal statBlockRewardValue;

    private BigDecimal statStakingRewardValue;

    private BigDecimal statFeeRewardValue;

    private BigDecimal predictStakingReward;

    private Date createTime;

    private Date updateTime;

    private Integer rewardPer;

    private BigDecimal haveDeleReward;

    private Double preDeleAnnualizedRate;

    private Double deleAnnualizedRate;

    private BigDecimal totalDeleReward;

    private String annualizedRateInfo;

    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId == null ? null : nodeId.trim();
    }

    public Integer getStatSlashMultiQty() {
        return statSlashMultiQty;
    }

    public void setStatSlashMultiQty(Integer statSlashMultiQty) {
        this.statSlashMultiQty = statSlashMultiQty;
    }

    public Integer getStatSlashLowQty() {
        return statSlashLowQty;
    }

    public void setStatSlashLowQty(Integer statSlashLowQty) {
        this.statSlashLowQty = statSlashLowQty;
    }

    public Long getStatBlockQty() {
        return statBlockQty;
    }

    public void setStatBlockQty(Long statBlockQty) {
        this.statBlockQty = statBlockQty;
    }

    public Long getStatExpectBlockQty() {
        return statExpectBlockQty;
    }

    public void setStatExpectBlockQty(Long statExpectBlockQty) {
        this.statExpectBlockQty = statExpectBlockQty;
    }

    public Integer getStatVerifierTime() {
        return statVerifierTime;
    }

    public void setStatVerifierTime(Integer statVerifierTime) {
        this.statVerifierTime = statVerifierTime;
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public BigDecimal getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(BigDecimal totalValue) {
        this.totalValue = totalValue;
    }

    public Long getStakingBlockNum() {
        return stakingBlockNum;
    }

    public void setStakingBlockNum(Long stakingBlockNum) {
        this.stakingBlockNum = stakingBlockNum;
    }

    public Integer getStakingTxIndex() {
        return stakingTxIndex;
    }

    public void setStakingTxIndex(Integer stakingTxIndex) {
        this.stakingTxIndex = stakingTxIndex;
    }

    public BigDecimal getStakingHes() {
        return stakingHes;
    }

    public void setStakingHes(BigDecimal stakingHes) {
        this.stakingHes = stakingHes;
    }

    public BigDecimal getStakingLocked() {
        return stakingLocked;
    }

    public void setStakingLocked(BigDecimal stakingLocked) {
        this.stakingLocked = stakingLocked;
    }

    public BigDecimal getStakingReduction() {
        return stakingReduction;
    }

    public void setStakingReduction(BigDecimal stakingReduction) {
        this.stakingReduction = stakingReduction;
    }

    public Integer getStakingReductionEpoch() {
        return stakingReductionEpoch;
    }

    public void setStakingReductionEpoch(Integer stakingReductionEpoch) {
        this.stakingReductionEpoch = stakingReductionEpoch;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    public String getNodeIcon() {
        return nodeIcon;
    }

    public void setNodeIcon(String nodeIcon) {
        this.nodeIcon = nodeIcon == null ? null : nodeIcon.trim();
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId == null ? null : externalId.trim();
    }

    public String getExternalName() {
        return externalName;
    }

    public void setExternalName(String externalName) {
        this.externalName = externalName == null ? null : externalName.trim();
    }

    public String getStakingAddr() {
        return stakingAddr;
    }

    public void setStakingAddr(String stakingAddr) {
        this.stakingAddr = stakingAddr == null ? null : stakingAddr.trim();
    }

    public String getBenefitAddr() {
        return benefitAddr;
    }

    public void setBenefitAddr(String benefitAddr) {
        this.benefitAddr = benefitAddr == null ? null : benefitAddr.trim();
    }

    public Double getAnnualizedRate() {
        return annualizedRate;
    }

    public void setAnnualizedRate(Double annualizedRate) {
        this.annualizedRate = annualizedRate;
    }

    public Integer getProgramVersion() {
        return programVersion;
    }

    public void setProgramVersion(Integer programVersion) {
        this.programVersion = programVersion;
    }

    public Integer getBigVersion() {
        return bigVersion;
    }

    public void setBigVersion(Integer bigVersion) {
        this.bigVersion = bigVersion;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite == null ? null : webSite.trim();
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public Date getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }

    public Date getLeaveTime() {
        return leaveTime;
    }

    public void setLeaveTime(Date leaveTime) {
        this.leaveTime = leaveTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIsConsensus() {
        return isConsensus;
    }

    public void setIsConsensus(Integer isConsensus) {
        this.isConsensus = isConsensus;
    }

    public Integer getIsSettle() {
        return isSettle;
    }

    public void setIsSettle(Integer isSettle) {
        this.isSettle = isSettle;
    }

    public Integer getIsInit() {
        return isInit;
    }

    public void setIsInit(Integer isInit) {
        this.isInit = isInit;
    }

    public BigDecimal getStatDelegateValue() {
        return statDelegateValue;
    }

    public void setStatDelegateValue(BigDecimal statDelegateValue) {
        this.statDelegateValue = statDelegateValue;
    }

    public BigDecimal getStatDelegateReleased() {
        return statDelegateReleased;
    }

    public void setStatDelegateReleased(BigDecimal statDelegateReleased) {
        this.statDelegateReleased = statDelegateReleased;
    }

    public Integer getStatValidAddrs() {
        return statValidAddrs;
    }

    public void setStatValidAddrs(Integer statValidAddrs) {
        this.statValidAddrs = statValidAddrs;
    }

    public Integer getStatInvalidAddrs() {
        return statInvalidAddrs;
    }

    public void setStatInvalidAddrs(Integer statInvalidAddrs) {
        this.statInvalidAddrs = statInvalidAddrs;
    }

    public BigDecimal getStatBlockRewardValue() {
        return statBlockRewardValue;
    }

    public void setStatBlockRewardValue(BigDecimal statBlockRewardValue) {
        this.statBlockRewardValue = statBlockRewardValue;
    }

    public BigDecimal getStatStakingRewardValue() {
        return statStakingRewardValue;
    }

    public void setStatStakingRewardValue(BigDecimal statStakingRewardValue) {
        this.statStakingRewardValue = statStakingRewardValue;
    }

    public BigDecimal getStatFeeRewardValue() {
        return statFeeRewardValue;
    }

    public void setStatFeeRewardValue(BigDecimal statFeeRewardValue) {
        this.statFeeRewardValue = statFeeRewardValue;
    }

    public BigDecimal getPredictStakingReward() {
        return predictStakingReward;
    }

    public void setPredictStakingReward(BigDecimal predictStakingReward) {
        this.predictStakingReward = predictStakingReward;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getRewardPer() {
        return rewardPer;
    }

    public void setRewardPer(Integer rewardPer) {
        this.rewardPer = rewardPer;
    }

    public BigDecimal getHaveDeleReward() {
        return haveDeleReward;
    }

    public void setHaveDeleReward(BigDecimal haveDeleReward) {
        this.haveDeleReward = haveDeleReward;
    }

    public Double getPreDeleAnnualizedRate() {
        return preDeleAnnualizedRate;
    }

    public void setPreDeleAnnualizedRate(Double preDeleAnnualizedRate) {
        this.preDeleAnnualizedRate = preDeleAnnualizedRate;
    }

    public Double getDeleAnnualizedRate() {
        return deleAnnualizedRate;
    }

    public void setDeleAnnualizedRate(Double deleAnnualizedRate) {
        this.deleAnnualizedRate = deleAnnualizedRate;
    }

    public BigDecimal getTotalDeleReward() {
        return totalDeleReward;
    }

    public void setTotalDeleReward(BigDecimal totalDeleReward) {
        this.totalDeleReward = totalDeleReward;
    }

    public String getAnnualizedRateInfo() {
        return annualizedRateInfo;
    }

    public void setAnnualizedRateInfo(String annualizedRateInfo) {
        this.annualizedRateInfo = annualizedRateInfo == null ? null : annualizedRateInfo.trim();
    }

    /**
     * This enum was generated by MyBatis Generator.
     * This enum corresponds to the database table node
     *
     * @mbg.generated
     * @project https://github.com/itfsw/mybatis-generator-plugin
     */
    public enum Column {
        nodeId("node_id", "nodeId", "VARCHAR", false),
        statSlashMultiQty("stat_slash_multi_qty", "statSlashMultiQty", "INTEGER", false),
        statSlashLowQty("stat_slash_low_qty", "statSlashLowQty", "INTEGER", false),
        statBlockQty("stat_block_qty", "statBlockQty", "BIGINT", false),
        statExpectBlockQty("stat_expect_block_qty", "statExpectBlockQty", "BIGINT", false),
        statVerifierTime("stat_verifier_time", "statVerifierTime", "INTEGER", false),
        isRecommend("is_recommend", "isRecommend", "INTEGER", false),
        totalValue("total_value", "totalValue", "DECIMAL", false),
        stakingBlockNum("staking_block_num", "stakingBlockNum", "BIGINT", false),
        stakingTxIndex("staking_tx_index", "stakingTxIndex", "INTEGER", false),
        stakingHes("staking_hes", "stakingHes", "DECIMAL", false),
        stakingLocked("staking_locked", "stakingLocked", "DECIMAL", false),
        stakingReduction("staking_reduction", "stakingReduction", "DECIMAL", false),
        stakingReductionEpoch("staking_reduction_epoch", "stakingReductionEpoch", "INTEGER", false),
        nodeName("node_name", "nodeName", "VARCHAR", false),
        nodeIcon("node_icon", "nodeIcon", "VARCHAR", false),
        externalId("external_id", "externalId", "VARCHAR", false),
        externalName("external_name", "externalName", "VARCHAR", false),
        stakingAddr("staking_addr", "stakingAddr", "VARCHAR", false),
        benefitAddr("benefit_addr", "benefitAddr", "VARCHAR", false),
        annualizedRate("annualized_rate", "annualizedRate", "DOUBLE", false),
        programVersion("program_version", "programVersion", "INTEGER", false),
        bigVersion("big_version", "bigVersion", "INTEGER", false),
        webSite("web_site", "webSite", "VARCHAR", false),
        details("details", "details", "VARCHAR", false),
        joinTime("join_time", "joinTime", "TIMESTAMP", false),
        leaveTime("leave_time", "leaveTime", "TIMESTAMP", false),
        status("status", "status", "INTEGER", true),
        isConsensus("is_consensus", "isConsensus", "INTEGER", false),
        isSettle("is_settle", "isSettle", "INTEGER", false),
        isInit("is_init", "isInit", "INTEGER", false),
        statDelegateValue("stat_delegate_value", "statDelegateValue", "DECIMAL", false),
        statDelegateReleased("stat_delegate_released", "statDelegateReleased", "DECIMAL", false),
        statValidAddrs("stat_valid_addrs", "statValidAddrs", "INTEGER", false),
        statInvalidAddrs("stat_invalid_addrs", "statInvalidAddrs", "INTEGER", false),
        statBlockRewardValue("stat_block_reward_value", "statBlockRewardValue", "DECIMAL", false),
        statStakingRewardValue("stat_staking_reward_value", "statStakingRewardValue", "DECIMAL", false),
        statFeeRewardValue("stat_fee_reward_value", "statFeeRewardValue", "DECIMAL", false),
        predictStakingReward("predict_staking_reward", "predictStakingReward", "DECIMAL", false),
        createTime("create_time", "createTime", "TIMESTAMP", false),
        updateTime("update_time", "updateTime", "TIMESTAMP", false),
        rewardPer("reward_per", "rewardPer", "INTEGER", false),
        haveDeleReward("have_dele_reward", "haveDeleReward", "DECIMAL", false),
        preDeleAnnualizedRate("pre_dele_annualized_rate", "preDeleAnnualizedRate", "DOUBLE", false),
        deleAnnualizedRate("dele_annualized_rate", "deleAnnualizedRate", "DOUBLE", false),
        totalDeleReward("total_dele_reward", "totalDeleReward", "DECIMAL", false),
        annualizedRateInfo("annualized_rate_info", "annualizedRateInfo", "LONGVARCHAR", false);

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table node
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String BEGINNING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table node
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private static final String ENDING_DELIMITER = "`";

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table node
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String column;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table node
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final boolean isColumnNameDelimited;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table node
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String javaProperty;

        /**
         * This field was generated by MyBatis Generator.
         * This field corresponds to the database table node
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        private final String jdbcType;

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table node
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String value() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table node
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getValue() {
            return this.column;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table node
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJavaProperty() {
            return this.javaProperty;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table node
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getJdbcType() {
            return this.jdbcType;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table node
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        Column(String column, String javaProperty, String jdbcType, boolean isColumnNameDelimited) {
            this.column = column;
            this.javaProperty = javaProperty;
            this.jdbcType = jdbcType;
            this.isColumnNameDelimited = isColumnNameDelimited;
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table node
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String desc() {
            return this.getEscapedColumnName() + " DESC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table node
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String asc() {
            return this.getEscapedColumnName() + " ASC";
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table node
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public static Column[] excludes(Column ... excludes) {
            ArrayList<Column> columns = new ArrayList<>(Arrays.asList(Column.values()));
            if (excludes != null && excludes.length > 0) {
                columns.removeAll(new ArrayList<>(Arrays.asList(excludes)));
            }
            return columns.toArray(new Column[]{});
        }

        /**
         * This method was generated by MyBatis Generator.
         * This method corresponds to the database table node
         *
         * @mbg.generated
         * @project https://github.com/itfsw/mybatis-generator-plugin
         */
        public String getEscapedColumnName() {
            if (this.isColumnNameDelimited) {
                return new StringBuilder().append(BEGINNING_DELIMITER).append(this.column).append(ENDING_DELIMITER).toString();
            } else {
                return this.column;
            }
        }
    }
}
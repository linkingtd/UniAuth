package com.dianrong.common.uniauth.server.data.entity;

import java.util.Date;

public class Tag {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.id
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.code
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.status
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    private Byte status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.description
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    private String description;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.tag_type_id
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    private Integer tagTypeId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.create_date
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    private Date createDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tag.last_update
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    private Date lastUpdate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.id
     *
     * @return the value of tag.id
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.id
     *
     * @param id the value for tag.id
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.code
     *
     * @return the value of tag.code
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.code
     *
     * @param code the value for tag.code
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.status
     *
     * @return the value of tag.status
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.status
     *
     * @param status the value for tag.status
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.description
     *
     * @return the value of tag.description
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.description
     *
     * @param description the value for tag.description
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.tag_type_id
     *
     * @return the value of tag.tag_type_id
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    public Integer getTagTypeId() {
        return tagTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.tag_type_id
     *
     * @param tagTypeId the value for tag.tag_type_id
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    public void setTagTypeId(Integer tagTypeId) {
        this.tagTypeId = tagTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.create_date
     *
     * @return the value of tag.create_date
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.create_date
     *
     * @param createDate the value for tag.create_date
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tag.last_update
     *
     * @return the value of tag.last_update
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    public Date getLastUpdate() {
        return lastUpdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tag.last_update
     *
     * @param lastUpdate the value for tag.last_update
     *
     * @mbggenerated Thu Apr 07 16:46:03 CST 2016
     */
    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
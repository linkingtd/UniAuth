package com.dianrong.common.uniauth.server.data.mapper;

import com.dianrong.common.uniauth.server.data.entity.HrJob;
import com.dianrong.common.uniauth.server.data.entity.HrJobExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HrJobMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_job
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    int countByExample(HrJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_job
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    int deleteByExample(HrJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_job
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    int deleteByPrimaryKey(Long jobId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_job
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    int insert(HrJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_job
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    int insertSelective(HrJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_job
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    List<HrJob> selectByExample(HrJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_job
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    HrJob selectByPrimaryKey(Long jobId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_job
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    int updateByExampleSelective(@Param("record") HrJob record,
        @Param("example") HrJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_job
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    int updateByExample(@Param("record") HrJob record, @Param("example") HrJobExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_job
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    int updateByPrimaryKeySelective(HrJob record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table hr_job
     *
     * @mbggenerated Wed Aug 30 11:30:53 CST 2017
     */
    int updateByPrimaryKey(HrJob record);

    /**
     * 清空数据库表所有数据.
     */
    int clearTable();

    /**
     * 批量插入数据.
     */
    int insertBatch(List<HrJob> hrJobList);
}
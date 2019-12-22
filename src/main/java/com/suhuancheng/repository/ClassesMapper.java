package com.suhuancheng.repository;

import com.suhuancheng.entity.Classes;
import com.suhuancheng.entity.ClassesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClassesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Thu Dec 12 15:50:53 CST 2019
     */
    int countByExample(ClassesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Thu Dec 12 15:50:53 CST 2019
     */
    int deleteByExample(ClassesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Thu Dec 12 15:50:53 CST 2019
     */
    int insert(Classes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Thu Dec 12 15:50:53 CST 2019
     */
    int insertSelective(Classes record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Thu Dec 12 15:50:53 CST 2019
     */
    List<Classes> selectByExample(ClassesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Thu Dec 12 15:50:53 CST 2019
     */
    int updateByExampleSelective(@Param("record") Classes record, @Param("example") ClassesExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbggenerated Thu Dec 12 15:50:53 CST 2019
     */
    int updateByExample(@Param("record") Classes record, @Param("example") ClassesExample example);
}
package com.cskaoyan.mapper;

import com.cskaoyan.domain.Technology;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TechnologyMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table technology
     *
     * @mbg.generated Fri Dec 07 22:28:08 CST 2018
     */
    int deleteByPrimaryKey(String technologyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table technology
     *
     * @mbg.generated Fri Dec 07 22:28:08 CST 2018
     */
    int insert(Technology record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table technology
     *
     * @mbg.generated Fri Dec 07 22:28:08 CST 2018
     */
    int insertSelective(Technology record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table technology
     *
     * @mbg.generated Fri Dec 07 22:28:08 CST 2018
     */
    Technology selectByPrimaryKey(String technologyId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table technology
     *
     * @mbg.generated Fri Dec 07 22:28:08 CST 2018
     */
    int updateByPrimaryKeySelective(Technology record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table technology
     *
     * @mbg.generated Fri Dec 07 22:28:08 CST 2018
     */
    int updateByPrimaryKey(Technology record);

    List<Technology> findAllTechnologyFromDB();

    List<Technology> findTechnologyByTechnologyNameFromDB(@Param("searchValue") String searchValue);
}
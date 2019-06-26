package com.zpark.mapper;

import com.zpark.pojo.Tbcatalog;
import java.util.List;

public interface TbcatalogMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbcatalog
     *
     * @mbg.generated Wed May 08 10:45:33 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbcatalog
     *
     * @mbg.generated Wed May 08 10:45:33 CST 2019
     */
    int insert(Tbcatalog record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbcatalog
     *
     * @mbg.generated Wed May 08 10:45:33 CST 2019
     */
    Tbcatalog selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbcatalog
     *
     * @mbg.generated Wed May 08 10:45:33 CST 2019
     */
    List<Tbcatalog> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbcatalog
     *
     * @mbg.generated Wed May 08 10:45:33 CST 2019
     */
    int updateByPrimaryKey(Tbcatalog record);
}
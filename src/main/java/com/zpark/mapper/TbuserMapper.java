package com.zpark.mapper;

import com.zpark.pojo.Tbuser;
import java.util.List;

public interface TbuserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbuser
     *
     * @mbg.generated Wed May 08 10:45:33 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbuser
     *
     * @mbg.generated Wed May 08 10:45:33 CST 2019
     */
    int insert(Tbuser record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbuser
     *
     * @mbg.generated Wed May 08 10:45:33 CST 2019
     */
    Tbuser selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbuser
     *
     * @mbg.generated Wed May 08 10:45:33 CST 2019
     */
    List<Tbuser> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tbuser
     *
     * @mbg.generated Wed May 08 10:45:33 CST 2019
     */
    int updateByPrimaryKey(Tbuser record);
    
    //登录返回Tbuser
    public Tbuser login(Tbuser tbuser);
    
    public Tbuser selectByName(String name);
    
    List<Tbuser> findTbuserByUserName(Tbuser tbuser);

	public List<Tbuser> findTbuser(Tbuser tbuser);
    
    
}
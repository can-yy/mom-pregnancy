package com.wyyuand.dao;

import com.wyyuand.domain.Food;
import com.wyyuand.domain.FoodExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FoodMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Thu Jun 27 08:06:28 CST 2019
     */
    long countByExample(FoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Thu Jun 27 08:06:28 CST 2019
     */
    int deleteByExample(FoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Thu Jun 27 08:06:28 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Thu Jun 27 08:06:28 CST 2019
     */
    int insert(Food record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Thu Jun 27 08:06:28 CST 2019
     */
    int insertSelective(Food record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Thu Jun 27 08:06:28 CST 2019
     */
    List<Food> selectByExample(FoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Thu Jun 27 08:06:28 CST 2019
     */
    Food selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Thu Jun 27 08:06:28 CST 2019
     */
    int updateByExampleSelective(@Param("record") Food record, @Param("example") FoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Thu Jun 27 08:06:28 CST 2019
     */
    int updateByExample(@Param("record") Food record, @Param("example") FoodExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Thu Jun 27 08:06:28 CST 2019
     */
    int updateByPrimaryKeySelective(Food record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_food
     *
     * @mbg.generated Thu Jun 27 08:06:28 CST 2019
     */
    int updateByPrimaryKey(Food record);
}
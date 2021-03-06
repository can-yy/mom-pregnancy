package com.wyyuand.dao;

import com.wyyuand.domain.CircleComment;
import com.wyyuand.domain.CircleCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CircleCommentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_circle_comment
     *
     * @mbg.generated Tue Jul 09 14:22:52 CST 2019
     */
    long countByExample(CircleCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_circle_comment
     *
     * @mbg.generated Tue Jul 09 14:22:52 CST 2019
     */
    int deleteByExample(CircleCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_circle_comment
     *
     * @mbg.generated Tue Jul 09 14:22:52 CST 2019
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_circle_comment
     *
     * @mbg.generated Tue Jul 09 14:22:52 CST 2019
     */
    int insert(CircleComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_circle_comment
     *
     * @mbg.generated Tue Jul 09 14:22:52 CST 2019
     */
    int insertSelective(CircleComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_circle_comment
     *
     * @mbg.generated Tue Jul 09 14:22:52 CST 2019
     */
    List<CircleComment> selectByExample(CircleCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_circle_comment
     *
     * @mbg.generated Tue Jul 09 14:22:52 CST 2019
     */
    CircleComment selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_circle_comment
     *
     * @mbg.generated Tue Jul 09 14:22:52 CST 2019
     */
    int updateByExampleSelective(@Param("record") CircleComment record, @Param("example") CircleCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_circle_comment
     *
     * @mbg.generated Tue Jul 09 14:22:52 CST 2019
     */
    int updateByExample(@Param("record") CircleComment record, @Param("example") CircleCommentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_circle_comment
     *
     * @mbg.generated Tue Jul 09 14:22:52 CST 2019
     */
    int updateByPrimaryKeySelective(CircleComment record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_circle_comment
     *
     * @mbg.generated Tue Jul 09 14:22:52 CST 2019
     */
    int updateByPrimaryKey(CircleComment record);
}
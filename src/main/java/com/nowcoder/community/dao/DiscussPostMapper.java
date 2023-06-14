package com.nowcoder.community.dao;


import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {

    //声明查询方法,分页查询(offset 初始的行号，limit最大页数)
    List<DiscussPost> selectDiscussPosts(int userId,int offset,int limit);

    //查询帖子行数 //@param(取别名， 如果方法只有一个参数并且在if里面使用必须加别名)
    int selectDiscussPostRows(@Param("userId") int userId);




}

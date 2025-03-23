package com.dao;

import com.entity.DiscussshicishangxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshicishangxiVO;
import com.entity.view.DiscussshicishangxiView;


/**
 * 诗词赏析评论表
 * 
 * @author 
 * @email 
 * @date 2021-06-02 10:42:23
 */
public interface DiscussshicishangxiDao extends BaseMapper<DiscussshicishangxiEntity> {
	
	List<DiscussshicishangxiVO> selectListVO(@Param("ew") Wrapper<DiscussshicishangxiEntity> wrapper);
	
	DiscussshicishangxiVO selectVO(@Param("ew") Wrapper<DiscussshicishangxiEntity> wrapper);
	
	List<DiscussshicishangxiView> selectListView(@Param("ew") Wrapper<DiscussshicishangxiEntity> wrapper);

	List<DiscussshicishangxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshicishangxiEntity> wrapper);
	
	DiscussshicishangxiView selectView(@Param("ew") Wrapper<DiscussshicishangxiEntity> wrapper);
	
}

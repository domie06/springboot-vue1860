package com.dao;

import com.entity.ShicishangxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShicishangxiVO;
import com.entity.view.ShicishangxiView;


/**
 * 诗词赏析
 * 
 * @author 
 * @email 
 * @date 2021-06-02 10:42:23
 */
public interface ShicishangxiDao extends BaseMapper<ShicishangxiEntity> {
	
	List<ShicishangxiVO> selectListVO(@Param("ew") Wrapper<ShicishangxiEntity> wrapper);
	
	ShicishangxiVO selectVO(@Param("ew") Wrapper<ShicishangxiEntity> wrapper);
	
	List<ShicishangxiView> selectListView(@Param("ew") Wrapper<ShicishangxiEntity> wrapper);

	List<ShicishangxiView> selectListView(Pagination page,@Param("ew") Wrapper<ShicishangxiEntity> wrapper);
	
	ShicishangxiView selectView(@Param("ew") Wrapper<ShicishangxiEntity> wrapper);
	
}

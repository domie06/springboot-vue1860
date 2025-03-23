package com.dao;

import com.entity.ShicifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShicifenleiVO;
import com.entity.view.ShicifenleiView;


/**
 * 诗词分类
 * 
 * @author 
 * @email 
 * @date 2021-06-02 10:42:23
 */
public interface ShicifenleiDao extends BaseMapper<ShicifenleiEntity> {
	
	List<ShicifenleiVO> selectListVO(@Param("ew") Wrapper<ShicifenleiEntity> wrapper);
	
	ShicifenleiVO selectVO(@Param("ew") Wrapper<ShicifenleiEntity> wrapper);
	
	List<ShicifenleiView> selectListView(@Param("ew") Wrapper<ShicifenleiEntity> wrapper);

	List<ShicifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<ShicifenleiEntity> wrapper);
	
	ShicifenleiView selectView(@Param("ew") Wrapper<ShicifenleiEntity> wrapper);
	
}

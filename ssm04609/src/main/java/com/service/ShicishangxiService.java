package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShicishangxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShicishangxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShicishangxiView;


/**
 * 诗词赏析
 *
 * @author 
 * @email 
 * @date 2021-06-02 10:42:23
 */
public interface ShicishangxiService extends IService<ShicishangxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShicishangxiVO> selectListVO(Wrapper<ShicishangxiEntity> wrapper);
   	
   	ShicishangxiVO selectVO(@Param("ew") Wrapper<ShicishangxiEntity> wrapper);
   	
   	List<ShicishangxiView> selectListView(Wrapper<ShicishangxiEntity> wrapper);
   	
   	ShicishangxiView selectView(@Param("ew") Wrapper<ShicishangxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShicishangxiEntity> wrapper);
   	
}


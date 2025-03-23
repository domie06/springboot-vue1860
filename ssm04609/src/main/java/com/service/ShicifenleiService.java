package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShicifenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShicifenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShicifenleiView;


/**
 * 诗词分类
 *
 * @author 
 * @email 
 * @date 2021-06-02 10:42:23
 */
public interface ShicifenleiService extends IService<ShicifenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShicifenleiVO> selectListVO(Wrapper<ShicifenleiEntity> wrapper);
   	
   	ShicifenleiVO selectVO(@Param("ew") Wrapper<ShicifenleiEntity> wrapper);
   	
   	List<ShicifenleiView> selectListView(Wrapper<ShicifenleiEntity> wrapper);
   	
   	ShicifenleiView selectView(@Param("ew") Wrapper<ShicifenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShicifenleiEntity> wrapper);
   	
}


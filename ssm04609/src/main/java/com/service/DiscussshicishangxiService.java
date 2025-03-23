package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshicishangxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshicishangxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshicishangxiView;


/**
 * 诗词赏析评论表
 *
 * @author 
 * @email 
 * @date 2021-06-02 10:42:23
 */
public interface DiscussshicishangxiService extends IService<DiscussshicishangxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshicishangxiVO> selectListVO(Wrapper<DiscussshicishangxiEntity> wrapper);
   	
   	DiscussshicishangxiVO selectVO(@Param("ew") Wrapper<DiscussshicishangxiEntity> wrapper);
   	
   	List<DiscussshicishangxiView> selectListView(Wrapper<DiscussshicishangxiEntity> wrapper);
   	
   	DiscussshicishangxiView selectView(@Param("ew") Wrapper<DiscussshicishangxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshicishangxiEntity> wrapper);
   	
}


package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.DiscussshicishangxiDao;
import com.entity.DiscussshicishangxiEntity;
import com.service.DiscussshicishangxiService;
import com.entity.vo.DiscussshicishangxiVO;
import com.entity.view.DiscussshicishangxiView;

@Service("discussshicishangxiService")
public class DiscussshicishangxiServiceImpl extends ServiceImpl<DiscussshicishangxiDao, DiscussshicishangxiEntity> implements DiscussshicishangxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshicishangxiEntity> page = this.selectPage(
                new Query<DiscussshicishangxiEntity>(params).getPage(),
                new EntityWrapper<DiscussshicishangxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshicishangxiEntity> wrapper) {
		  Page<DiscussshicishangxiView> page =new Query<DiscussshicishangxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshicishangxiVO> selectListVO(Wrapper<DiscussshicishangxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshicishangxiVO selectVO(Wrapper<DiscussshicishangxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshicishangxiView> selectListView(Wrapper<DiscussshicishangxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshicishangxiView selectView(Wrapper<DiscussshicishangxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

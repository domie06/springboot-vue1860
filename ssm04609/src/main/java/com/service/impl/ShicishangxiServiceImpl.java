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


import com.dao.ShicishangxiDao;
import com.entity.ShicishangxiEntity;
import com.service.ShicishangxiService;
import com.entity.vo.ShicishangxiVO;
import com.entity.view.ShicishangxiView;

@Service("shicishangxiService")
public class ShicishangxiServiceImpl extends ServiceImpl<ShicishangxiDao, ShicishangxiEntity> implements ShicishangxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShicishangxiEntity> page = this.selectPage(
                new Query<ShicishangxiEntity>(params).getPage(),
                new EntityWrapper<ShicishangxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShicishangxiEntity> wrapper) {
		  Page<ShicishangxiView> page =new Query<ShicishangxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShicishangxiVO> selectListVO(Wrapper<ShicishangxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShicishangxiVO selectVO(Wrapper<ShicishangxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShicishangxiView> selectListView(Wrapper<ShicishangxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShicishangxiView selectView(Wrapper<ShicishangxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

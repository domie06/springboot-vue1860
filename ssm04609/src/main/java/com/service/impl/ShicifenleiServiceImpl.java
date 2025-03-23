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


import com.dao.ShicifenleiDao;
import com.entity.ShicifenleiEntity;
import com.service.ShicifenleiService;
import com.entity.vo.ShicifenleiVO;
import com.entity.view.ShicifenleiView;

@Service("shicifenleiService")
public class ShicifenleiServiceImpl extends ServiceImpl<ShicifenleiDao, ShicifenleiEntity> implements ShicifenleiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShicifenleiEntity> page = this.selectPage(
                new Query<ShicifenleiEntity>(params).getPage(),
                new EntityWrapper<ShicifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShicifenleiEntity> wrapper) {
		  Page<ShicifenleiView> page =new Query<ShicifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShicifenleiVO> selectListVO(Wrapper<ShicifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShicifenleiVO selectVO(Wrapper<ShicifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShicifenleiView> selectListView(Wrapper<ShicifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShicifenleiView selectView(Wrapper<ShicifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}

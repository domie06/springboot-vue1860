package com.entity.view;

import com.entity.ShicifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 诗词分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-02 10:42:23
 */
@TableName("shicifenlei")
public class ShicifenleiView  extends ShicifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShicifenleiView(){
	}
 
 	public ShicifenleiView(ShicifenleiEntity shicifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, shicifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

package com.entity.view;

import com.entity.ShicishangxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 诗词赏析
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-02 10:42:23
 */
@TableName("shicishangxi")
public class ShicishangxiView  extends ShicishangxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShicishangxiView(){
	}
 
 	public ShicishangxiView(ShicishangxiEntity shicishangxiEntity){
 	try {
			BeanUtils.copyProperties(this, shicishangxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

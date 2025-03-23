package com.entity.view;

import com.entity.DiscussshicishangxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 诗词赏析评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-06-02 10:42:23
 */
@TableName("discussshicishangxi")
public class DiscussshicishangxiView  extends DiscussshicishangxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshicishangxiView(){
	}
 
 	public DiscussshicishangxiView(DiscussshicishangxiEntity discussshicishangxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussshicishangxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

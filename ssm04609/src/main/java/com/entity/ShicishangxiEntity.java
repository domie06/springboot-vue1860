package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 诗词赏析
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-06-02 10:42:23
 */
@TableName("shicishangxi")
public class ShicishangxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public ShicishangxiEntity() {
		
	}
	
	public ShicishangxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 诗词名称
	 */
					
	private String shicimingcheng;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 作者
	 */
					
	private String zuozhe;
	
	/**
	 * 诗词分类
	 */
					
	private String shicifenlei;
	
	/**
	 * 朝代
	 */
					
	private String chaodai;
	
	/**
	 * 音频
	 */
					
	private String yinpin;
	
	/**
	 * 视频
	 */
					
	private String shipin;
	
	/**
	 * 译文
	 */
					
	private String yiwen;
	
	/**
	 * 注释
	 */
					
	private String zhushi;
	
	/**
	 * 赏析
	 */
					
	private String shangxi;
	
	/**
	 * 赞
	 */
					
	private Integer thumbsupnum;
	
	/**
	 * 踩
	 */
					
	private Integer crazilynum;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：诗词名称
	 */
	public void setShicimingcheng(String shicimingcheng) {
		this.shicimingcheng = shicimingcheng;
	}
	/**
	 * 获取：诗词名称
	 */
	public String getShicimingcheng() {
		return shicimingcheng;
	}
	/**
	 * 设置：图片
	 */
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
	/**
	 * 设置：作者
	 */
	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}
	/**
	 * 获取：作者
	 */
	public String getZuozhe() {
		return zuozhe;
	}
	/**
	 * 设置：诗词分类
	 */
	public void setShicifenlei(String shicifenlei) {
		this.shicifenlei = shicifenlei;
	}
	/**
	 * 获取：诗词分类
	 */
	public String getShicifenlei() {
		return shicifenlei;
	}
	/**
	 * 设置：朝代
	 */
	public void setChaodai(String chaodai) {
		this.chaodai = chaodai;
	}
	/**
	 * 获取：朝代
	 */
	public String getChaodai() {
		return chaodai;
	}
	/**
	 * 设置：音频
	 */
	public void setYinpin(String yinpin) {
		this.yinpin = yinpin;
	}
	/**
	 * 获取：音频
	 */
	public String getYinpin() {
		return yinpin;
	}
	/**
	 * 设置：视频
	 */
	public void setShipin(String shipin) {
		this.shipin = shipin;
	}
	/**
	 * 获取：视频
	 */
	public String getShipin() {
		return shipin;
	}
	/**
	 * 设置：译文
	 */
	public void setYiwen(String yiwen) {
		this.yiwen = yiwen;
	}
	/**
	 * 获取：译文
	 */
	public String getYiwen() {
		return yiwen;
	}
	/**
	 * 设置：注释
	 */
	public void setZhushi(String zhushi) {
		this.zhushi = zhushi;
	}
	/**
	 * 获取：注释
	 */
	public String getZhushi() {
		return zhushi;
	}
	/**
	 * 设置：赏析
	 */
	public void setShangxi(String shangxi) {
		this.shangxi = shangxi;
	}
	/**
	 * 获取：赏析
	 */
	public String getShangxi() {
		return shangxi;
	}
	/**
	 * 设置：赞
	 */
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
	/**
	 * 设置：踩
	 */
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}

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
 * 业务信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-03-13 17:41:23
 */
@TableName("yewuxinxi")
public class YewuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YewuxinxiEntity() {
		
	}
	
	public YewuxinxiEntity(T t) {
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
	 * 业务名称
	 */
					
	private String yewumingcheng;
	
	/**
	 * 业务图片
	 */
					
	private String yewutupian;
	
	/**
	 * 业务类型
	 */
					
	private String yewuleixing;
	
	/**
	 * 业务价格
	 */
					
	private Float yewujiage;
	
	/**
	 * 业务时效
	 */
					
	private String yewushixiao;
	
	/**
	 * 业务说明
	 */
					
	private String yewushuoming;
	
	/**
	 * 业务详情
	 */
					
	private String yewuxiangqing;
	
	
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
	 * 设置：业务名称
	 */
	public void setYewumingcheng(String yewumingcheng) {
		this.yewumingcheng = yewumingcheng;
	}
	/**
	 * 获取：业务名称
	 */
	public String getYewumingcheng() {
		return yewumingcheng;
	}
	/**
	 * 设置：业务图片
	 */
	public void setYewutupian(String yewutupian) {
		this.yewutupian = yewutupian;
	}
	/**
	 * 获取：业务图片
	 */
	public String getYewutupian() {
		return yewutupian;
	}
	/**
	 * 设置：业务类型
	 */
	public void setYewuleixing(String yewuleixing) {
		this.yewuleixing = yewuleixing;
	}
	/**
	 * 获取：业务类型
	 */
	public String getYewuleixing() {
		return yewuleixing;
	}
	/**
	 * 设置：业务价格
	 */
	public void setYewujiage(Float yewujiage) {
		this.yewujiage = yewujiage;
	}
	/**
	 * 获取：业务价格
	 */
	public Float getYewujiage() {
		return yewujiage;
	}
	/**
	 * 设置：业务时效
	 */
	public void setYewushixiao(String yewushixiao) {
		this.yewushixiao = yewushixiao;
	}
	/**
	 * 获取：业务时效
	 */
	public String getYewushixiao() {
		return yewushixiao;
	}
	/**
	 * 设置：业务说明
	 */
	public void setYewushuoming(String yewushuoming) {
		this.yewushuoming = yewushuoming;
	}
	/**
	 * 获取：业务说明
	 */
	public String getYewushuoming() {
		return yewushuoming;
	}
	/**
	 * 设置：业务详情
	 */
	public void setYewuxiangqing(String yewuxiangqing) {
		this.yewuxiangqing = yewuxiangqing;
	}
	/**
	 * 获取：业务详情
	 */
	public String getYewuxiangqing() {
		return yewuxiangqing;
	}

}

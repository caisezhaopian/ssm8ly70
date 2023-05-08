package com.entity.vo;

import com.entity.YewuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 业务信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-13 17:41:23
 */
public class YewuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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

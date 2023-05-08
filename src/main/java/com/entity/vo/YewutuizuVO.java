package com.entity.vo;

import com.entity.YewutuizuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 业务退租
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-03-13 17:41:23
 */
public class YewutuizuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 业务名称
	 */
	
	private String yewumingcheng;
		
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
	 * 退租日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date tuizuriqi;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 手机号码
	 */
	
	private String shoujihaoma;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
				
	
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
	 * 设置：退租日期
	 */
	 
	public void setTuizuriqi(Date tuizuriqi) {
		this.tuizuriqi = tuizuriqi;
	}
	
	/**
	 * 获取：退租日期
	 */
	public Date getTuizuriqi() {
		return tuizuriqi;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：手机号码
	 */
	 
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
			
}

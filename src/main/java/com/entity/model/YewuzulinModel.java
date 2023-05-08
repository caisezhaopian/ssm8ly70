package com.entity.model;

import com.entity.YewuzulinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 业务租赁
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2023-03-13 17:41:23
 */
public class YewuzulinModel  implements Serializable {
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
	 * 租赁日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date zulinriqi;
		
	/**
	 * 业务状态
	 */
	
	private String yewuzhuangtai;
		
	/**
	 * 备注
	 */
	
	private String beizhu;
		
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
	 * 设置：租赁日期
	 */
	 
	public void setZulinriqi(Date zulinriqi) {
		this.zulinriqi = zulinriqi;
	}
	
	/**
	 * 获取：租赁日期
	 */
	public Date getZulinriqi() {
		return zulinriqi;
	}
				
	
	/**
	 * 设置：业务状态
	 */
	 
	public void setYewuzhuangtai(String yewuzhuangtai) {
		this.yewuzhuangtai = yewuzhuangtai;
	}
	
	/**
	 * 获取：业务状态
	 */
	public String getYewuzhuangtai() {
		return yewuzhuangtai;
	}
				
	
	/**
	 * 设置：备注
	 */
	 
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
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
			
}

package com.entity.view;

import com.entity.DiscussyewuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 业务信息评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-13 17:41:23
 */
@TableName("discussyewuxinxi")
public class DiscussyewuxinxiView  extends DiscussyewuxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussyewuxinxiView(){
	}
 
 	public DiscussyewuxinxiView(DiscussyewuxinxiEntity discussyewuxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, discussyewuxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

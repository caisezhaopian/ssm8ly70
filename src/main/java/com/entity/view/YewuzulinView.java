package com.entity.view;

import com.entity.YewuzulinEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 业务租赁
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-13 17:41:23
 */
@TableName("yewuzulin")
public class YewuzulinView  extends YewuzulinEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YewuzulinView(){
	}
 
 	public YewuzulinView(YewuzulinEntity yewuzulinEntity){
 	try {
			BeanUtils.copyProperties(this, yewuzulinEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

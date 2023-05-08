package com.entity.view;

import com.entity.YewujiaofeiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 业务缴费
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-03-13 17:41:23
 */
@TableName("yewujiaofei")
public class YewujiaofeiView  extends YewujiaofeiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YewujiaofeiView(){
	}
 
 	public YewujiaofeiView(YewujiaofeiEntity yewujiaofeiEntity){
 	try {
			BeanUtils.copyProperties(this, yewujiaofeiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

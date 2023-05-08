package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YewujiaofeiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YewujiaofeiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YewujiaofeiView;


/**
 * 业务缴费
 *
 * @author 
 * @email 
 * @date 2023-03-13 17:41:23
 */
public interface YewujiaofeiService extends IService<YewujiaofeiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YewujiaofeiVO> selectListVO(Wrapper<YewujiaofeiEntity> wrapper);
   	
   	YewujiaofeiVO selectVO(@Param("ew") Wrapper<YewujiaofeiEntity> wrapper);
   	
   	List<YewujiaofeiView> selectListView(Wrapper<YewujiaofeiEntity> wrapper);
   	
   	YewujiaofeiView selectView(@Param("ew") Wrapper<YewujiaofeiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YewujiaofeiEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<YewujiaofeiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<YewujiaofeiEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<YewujiaofeiEntity> wrapper);



}


package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YewutuizuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YewutuizuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YewutuizuView;


/**
 * 业务退租
 *
 * @author 
 * @email 
 * @date 2023-03-13 17:41:23
 */
public interface YewutuizuService extends IService<YewutuizuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YewutuizuVO> selectListVO(Wrapper<YewutuizuEntity> wrapper);
   	
   	YewutuizuVO selectVO(@Param("ew") Wrapper<YewutuizuEntity> wrapper);
   	
   	List<YewutuizuView> selectListView(Wrapper<YewutuizuEntity> wrapper);
   	
   	YewutuizuView selectView(@Param("ew") Wrapper<YewutuizuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YewutuizuEntity> wrapper);
   	

}


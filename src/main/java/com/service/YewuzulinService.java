package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YewuzulinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YewuzulinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YewuzulinView;


/**
 * 业务租赁
 *
 * @author 
 * @email 
 * @date 2023-03-13 17:41:23
 */
public interface YewuzulinService extends IService<YewuzulinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YewuzulinVO> selectListVO(Wrapper<YewuzulinEntity> wrapper);
   	
   	YewuzulinVO selectVO(@Param("ew") Wrapper<YewuzulinEntity> wrapper);
   	
   	List<YewuzulinView> selectListView(Wrapper<YewuzulinEntity> wrapper);
   	
   	YewuzulinView selectView(@Param("ew") Wrapper<YewuzulinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YewuzulinEntity> wrapper);
   	

}


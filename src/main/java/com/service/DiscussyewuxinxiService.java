package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussyewuxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussyewuxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussyewuxinxiView;


/**
 * 业务信息评论表
 *
 * @author 
 * @email 
 * @date 2023-03-13 17:41:23
 */
public interface DiscussyewuxinxiService extends IService<DiscussyewuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussyewuxinxiVO> selectListVO(Wrapper<DiscussyewuxinxiEntity> wrapper);
   	
   	DiscussyewuxinxiVO selectVO(@Param("ew") Wrapper<DiscussyewuxinxiEntity> wrapper);
   	
   	List<DiscussyewuxinxiView> selectListView(Wrapper<DiscussyewuxinxiEntity> wrapper);
   	
   	DiscussyewuxinxiView selectView(@Param("ew") Wrapper<DiscussyewuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussyewuxinxiEntity> wrapper);
   	

}


package com.dao;

import com.entity.YewutuizuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YewutuizuVO;
import com.entity.view.YewutuizuView;


/**
 * 业务退租
 * 
 * @author 
 * @email 
 * @date 2023-03-13 17:41:23
 */
public interface YewutuizuDao extends BaseMapper<YewutuizuEntity> {
	
	List<YewutuizuVO> selectListVO(@Param("ew") Wrapper<YewutuizuEntity> wrapper);
	
	YewutuizuVO selectVO(@Param("ew") Wrapper<YewutuizuEntity> wrapper);
	
	List<YewutuizuView> selectListView(@Param("ew") Wrapper<YewutuizuEntity> wrapper);

	List<YewutuizuView> selectListView(Pagination page,@Param("ew") Wrapper<YewutuizuEntity> wrapper);
	
	YewutuizuView selectView(@Param("ew") Wrapper<YewutuizuEntity> wrapper);
	

}

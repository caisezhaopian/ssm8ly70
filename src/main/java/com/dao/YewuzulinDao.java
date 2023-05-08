package com.dao;

import com.entity.YewuzulinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YewuzulinVO;
import com.entity.view.YewuzulinView;


/**
 * 业务租赁
 * 
 * @author 
 * @email 
 * @date 2023-03-13 17:41:23
 */
public interface YewuzulinDao extends BaseMapper<YewuzulinEntity> {
	
	List<YewuzulinVO> selectListVO(@Param("ew") Wrapper<YewuzulinEntity> wrapper);
	
	YewuzulinVO selectVO(@Param("ew") Wrapper<YewuzulinEntity> wrapper);
	
	List<YewuzulinView> selectListView(@Param("ew") Wrapper<YewuzulinEntity> wrapper);

	List<YewuzulinView> selectListView(Pagination page,@Param("ew") Wrapper<YewuzulinEntity> wrapper);
	
	YewuzulinView selectView(@Param("ew") Wrapper<YewuzulinEntity> wrapper);
	

}

package com.dao;

import com.entity.DiscussyewuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussyewuxinxiVO;
import com.entity.view.DiscussyewuxinxiView;


/**
 * 业务信息评论表
 * 
 * @author 
 * @email 
 * @date 2023-03-13 17:41:23
 */
public interface DiscussyewuxinxiDao extends BaseMapper<DiscussyewuxinxiEntity> {
	
	List<DiscussyewuxinxiVO> selectListVO(@Param("ew") Wrapper<DiscussyewuxinxiEntity> wrapper);
	
	DiscussyewuxinxiVO selectVO(@Param("ew") Wrapper<DiscussyewuxinxiEntity> wrapper);
	
	List<DiscussyewuxinxiView> selectListView(@Param("ew") Wrapper<DiscussyewuxinxiEntity> wrapper);

	List<DiscussyewuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussyewuxinxiEntity> wrapper);
	
	DiscussyewuxinxiView selectView(@Param("ew") Wrapper<DiscussyewuxinxiEntity> wrapper);
	

}

package com.dao;

import com.entity.YewujiaofeiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YewujiaofeiVO;
import com.entity.view.YewujiaofeiView;


/**
 * 业务缴费
 * 
 * @author 
 * @email 
 * @date 2023-03-13 17:41:23
 */
public interface YewujiaofeiDao extends BaseMapper<YewujiaofeiEntity> {
	
	List<YewujiaofeiVO> selectListVO(@Param("ew") Wrapper<YewujiaofeiEntity> wrapper);
	
	YewujiaofeiVO selectVO(@Param("ew") Wrapper<YewujiaofeiEntity> wrapper);
	
	List<YewujiaofeiView> selectListView(@Param("ew") Wrapper<YewujiaofeiEntity> wrapper);

	List<YewujiaofeiView> selectListView(Pagination page,@Param("ew") Wrapper<YewujiaofeiEntity> wrapper);
	
	YewujiaofeiView selectView(@Param("ew") Wrapper<YewujiaofeiEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<YewujiaofeiEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YewujiaofeiEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<YewujiaofeiEntity> wrapper);



}

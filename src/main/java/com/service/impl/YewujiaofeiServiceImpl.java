package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YewujiaofeiDao;
import com.entity.YewujiaofeiEntity;
import com.service.YewujiaofeiService;
import com.entity.vo.YewujiaofeiVO;
import com.entity.view.YewujiaofeiView;

@Service("yewujiaofeiService")
public class YewujiaofeiServiceImpl extends ServiceImpl<YewujiaofeiDao, YewujiaofeiEntity> implements YewujiaofeiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YewujiaofeiEntity> page = this.selectPage(
                new Query<YewujiaofeiEntity>(params).getPage(),
                new EntityWrapper<YewujiaofeiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YewujiaofeiEntity> wrapper) {
		  Page<YewujiaofeiView> page =new Query<YewujiaofeiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YewujiaofeiVO> selectListVO(Wrapper<YewujiaofeiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YewujiaofeiVO selectVO(Wrapper<YewujiaofeiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YewujiaofeiView> selectListView(Wrapper<YewujiaofeiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YewujiaofeiView selectView(Wrapper<YewujiaofeiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<YewujiaofeiEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<YewujiaofeiEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<YewujiaofeiEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }



}

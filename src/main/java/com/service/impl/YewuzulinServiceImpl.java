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


import com.dao.YewuzulinDao;
import com.entity.YewuzulinEntity;
import com.service.YewuzulinService;
import com.entity.vo.YewuzulinVO;
import com.entity.view.YewuzulinView;

@Service("yewuzulinService")
public class YewuzulinServiceImpl extends ServiceImpl<YewuzulinDao, YewuzulinEntity> implements YewuzulinService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YewuzulinEntity> page = this.selectPage(
                new Query<YewuzulinEntity>(params).getPage(),
                new EntityWrapper<YewuzulinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YewuzulinEntity> wrapper) {
		  Page<YewuzulinView> page =new Query<YewuzulinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YewuzulinVO> selectListVO(Wrapper<YewuzulinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YewuzulinVO selectVO(Wrapper<YewuzulinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YewuzulinView> selectListView(Wrapper<YewuzulinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YewuzulinView selectView(Wrapper<YewuzulinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

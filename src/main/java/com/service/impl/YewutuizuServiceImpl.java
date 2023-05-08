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


import com.dao.YewutuizuDao;
import com.entity.YewutuizuEntity;
import com.service.YewutuizuService;
import com.entity.vo.YewutuizuVO;
import com.entity.view.YewutuizuView;

@Service("yewutuizuService")
public class YewutuizuServiceImpl extends ServiceImpl<YewutuizuDao, YewutuizuEntity> implements YewutuizuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YewutuizuEntity> page = this.selectPage(
                new Query<YewutuizuEntity>(params).getPage(),
                new EntityWrapper<YewutuizuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YewutuizuEntity> wrapper) {
		  Page<YewutuizuView> page =new Query<YewutuizuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YewutuizuVO> selectListVO(Wrapper<YewutuizuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YewutuizuVO selectVO(Wrapper<YewutuizuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YewutuizuView> selectListView(Wrapper<YewutuizuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YewutuizuView selectView(Wrapper<YewutuizuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

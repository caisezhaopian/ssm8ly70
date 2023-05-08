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


import com.dao.DiscussyewuxinxiDao;
import com.entity.DiscussyewuxinxiEntity;
import com.service.DiscussyewuxinxiService;
import com.entity.vo.DiscussyewuxinxiVO;
import com.entity.view.DiscussyewuxinxiView;

@Service("discussyewuxinxiService")
public class DiscussyewuxinxiServiceImpl extends ServiceImpl<DiscussyewuxinxiDao, DiscussyewuxinxiEntity> implements DiscussyewuxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussyewuxinxiEntity> page = this.selectPage(
                new Query<DiscussyewuxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussyewuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussyewuxinxiEntity> wrapper) {
		  Page<DiscussyewuxinxiView> page =new Query<DiscussyewuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussyewuxinxiVO> selectListVO(Wrapper<DiscussyewuxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussyewuxinxiVO selectVO(Wrapper<DiscussyewuxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussyewuxinxiView> selectListView(Wrapper<DiscussyewuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussyewuxinxiView selectView(Wrapper<DiscussyewuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

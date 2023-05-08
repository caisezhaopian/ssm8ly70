package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DiscussyewuxinxiEntity;
import com.entity.view.DiscussyewuxinxiView;

import com.service.DiscussyewuxinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 业务信息评论表
 * 后端接口
 * @author 
 * @email 
 * @date 2023-03-13 17:41:23
 */
@RestController
@RequestMapping("/discussyewuxinxi")
public class DiscussyewuxinxiController {
    @Autowired
    private DiscussyewuxinxiService discussyewuxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DiscussyewuxinxiEntity discussyewuxinxi, 
		HttpServletRequest request){

        EntityWrapper<DiscussyewuxinxiEntity> ew = new EntityWrapper<DiscussyewuxinxiEntity>();


		PageUtils page = discussyewuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussyewuxinxi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DiscussyewuxinxiEntity discussyewuxinxi, 
		HttpServletRequest request){
        EntityWrapper<DiscussyewuxinxiEntity> ew = new EntityWrapper<DiscussyewuxinxiEntity>();

		PageUtils page = discussyewuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, discussyewuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DiscussyewuxinxiEntity discussyewuxinxi){
       	EntityWrapper<DiscussyewuxinxiEntity> ew = new EntityWrapper<DiscussyewuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( discussyewuxinxi, "discussyewuxinxi")); 
        return R.ok().put("data", discussyewuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DiscussyewuxinxiEntity discussyewuxinxi){
        EntityWrapper< DiscussyewuxinxiEntity> ew = new EntityWrapper< DiscussyewuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( discussyewuxinxi, "discussyewuxinxi")); 
		DiscussyewuxinxiView discussyewuxinxiView =  discussyewuxinxiService.selectView(ew);
		return R.ok("查询业务信息评论表成功").put("data", discussyewuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DiscussyewuxinxiEntity discussyewuxinxi = discussyewuxinxiService.selectById(id);
        return R.ok().put("data", discussyewuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DiscussyewuxinxiEntity discussyewuxinxi = discussyewuxinxiService.selectById(id);
        return R.ok().put("data", discussyewuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DiscussyewuxinxiEntity discussyewuxinxi, HttpServletRequest request){
    	discussyewuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussyewuxinxi);

        discussyewuxinxiService.insert(discussyewuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DiscussyewuxinxiEntity discussyewuxinxi, HttpServletRequest request){
    	discussyewuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(discussyewuxinxi);

        discussyewuxinxiService.insert(discussyewuxinxi);
        return R.ok();
    }


    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DiscussyewuxinxiEntity discussyewuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(discussyewuxinxi);
        discussyewuxinxiService.updateById(discussyewuxinxi);//全部更新
        return R.ok();
    }
    
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        discussyewuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<DiscussyewuxinxiEntity> wrapper = new EntityWrapper<DiscussyewuxinxiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}


		int count = discussyewuxinxiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}

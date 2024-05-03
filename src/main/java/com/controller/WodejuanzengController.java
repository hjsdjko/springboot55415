package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

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

import com.entity.WodejuanzengEntity;
import com.entity.view.WodejuanzengView;

import com.service.WodejuanzengService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 我的捐赠
 * 后端接口
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@RestController
@RequestMapping("/wodejuanzeng")
public class WodejuanzengController {
    @Autowired
    private WodejuanzengService wodejuanzengService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,WodejuanzengEntity wodejuanzeng,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wodejuanzeng.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<WodejuanzengEntity> ew = new EntityWrapper<WodejuanzengEntity>();
		PageUtils page = wodejuanzengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wodejuanzeng), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,WodejuanzengEntity wodejuanzeng, 
		HttpServletRequest request){
        EntityWrapper<WodejuanzengEntity> ew = new EntityWrapper<WodejuanzengEntity>();
		PageUtils page = wodejuanzengService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, wodejuanzeng), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( WodejuanzengEntity wodejuanzeng){
       	EntityWrapper<WodejuanzengEntity> ew = new EntityWrapper<WodejuanzengEntity>();
      	ew.allEq(MPUtil.allEQMapPre( wodejuanzeng, "wodejuanzeng")); 
        return R.ok().put("data", wodejuanzengService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(WodejuanzengEntity wodejuanzeng){
        EntityWrapper< WodejuanzengEntity> ew = new EntityWrapper< WodejuanzengEntity>();
 		ew.allEq(MPUtil.allEQMapPre( wodejuanzeng, "wodejuanzeng")); 
		WodejuanzengView wodejuanzengView =  wodejuanzengService.selectView(ew);
		return R.ok("查询我的捐赠成功").put("data", wodejuanzengView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        WodejuanzengEntity wodejuanzeng = wodejuanzengService.selectById(id);
        return R.ok().put("data", wodejuanzeng);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        WodejuanzengEntity wodejuanzeng = wodejuanzengService.selectById(id);
        return R.ok().put("data", wodejuanzeng);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody WodejuanzengEntity wodejuanzeng, HttpServletRequest request){
    	wodejuanzeng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wodejuanzeng);
        wodejuanzengService.insert(wodejuanzeng);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody WodejuanzengEntity wodejuanzeng, HttpServletRequest request){
    	wodejuanzeng.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(wodejuanzeng);
        wodejuanzengService.insert(wodejuanzeng);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody WodejuanzengEntity wodejuanzeng, HttpServletRequest request){
        //ValidatorUtils.validateEntity(wodejuanzeng);
        wodejuanzengService.updateById(wodejuanzeng);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        wodejuanzengService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<WodejuanzengEntity> wrapper = new EntityWrapper<WodejuanzengEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = wodejuanzengService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}

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


import com.dao.BaomingshenqingDao;
import com.entity.BaomingshenqingEntity;
import com.service.BaomingshenqingService;
import com.entity.vo.BaomingshenqingVO;
import com.entity.view.BaomingshenqingView;

@Service("baomingshenqingService")
public class BaomingshenqingServiceImpl extends ServiceImpl<BaomingshenqingDao, BaomingshenqingEntity> implements BaomingshenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaomingshenqingEntity> page = this.selectPage(
                new Query<BaomingshenqingEntity>(params).getPage(),
                new EntityWrapper<BaomingshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaomingshenqingEntity> wrapper) {
		  Page<BaomingshenqingView> page =new Query<BaomingshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaomingshenqingVO> selectListVO(Wrapper<BaomingshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaomingshenqingVO selectVO(Wrapper<BaomingshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaomingshenqingView> selectListView(Wrapper<BaomingshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaomingshenqingView selectView(Wrapper<BaomingshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

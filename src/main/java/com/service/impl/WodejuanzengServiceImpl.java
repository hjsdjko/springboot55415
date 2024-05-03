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


import com.dao.WodejuanzengDao;
import com.entity.WodejuanzengEntity;
import com.service.WodejuanzengService;
import com.entity.vo.WodejuanzengVO;
import com.entity.view.WodejuanzengView;

@Service("wodejuanzengService")
public class WodejuanzengServiceImpl extends ServiceImpl<WodejuanzengDao, WodejuanzengEntity> implements WodejuanzengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WodejuanzengEntity> page = this.selectPage(
                new Query<WodejuanzengEntity>(params).getPage(),
                new EntityWrapper<WodejuanzengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WodejuanzengEntity> wrapper) {
		  Page<WodejuanzengView> page =new Query<WodejuanzengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WodejuanzengVO> selectListVO(Wrapper<WodejuanzengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WodejuanzengVO selectVO(Wrapper<WodejuanzengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WodejuanzengView> selectListView(Wrapper<WodejuanzengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WodejuanzengView selectView(Wrapper<WodejuanzengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

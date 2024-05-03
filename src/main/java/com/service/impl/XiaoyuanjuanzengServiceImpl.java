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


import com.dao.XiaoyuanjuanzengDao;
import com.entity.XiaoyuanjuanzengEntity;
import com.service.XiaoyuanjuanzengService;
import com.entity.vo.XiaoyuanjuanzengVO;
import com.entity.view.XiaoyuanjuanzengView;

@Service("xiaoyuanjuanzengService")
public class XiaoyuanjuanzengServiceImpl extends ServiceImpl<XiaoyuanjuanzengDao, XiaoyuanjuanzengEntity> implements XiaoyuanjuanzengService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyuanjuanzengEntity> page = this.selectPage(
                new Query<XiaoyuanjuanzengEntity>(params).getPage(),
                new EntityWrapper<XiaoyuanjuanzengEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyuanjuanzengEntity> wrapper) {
		  Page<XiaoyuanjuanzengView> page =new Query<XiaoyuanjuanzengView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyuanjuanzengVO> selectListVO(Wrapper<XiaoyuanjuanzengEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyuanjuanzengVO selectVO(Wrapper<XiaoyuanjuanzengEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyuanjuanzengView> selectListView(Wrapper<XiaoyuanjuanzengEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyuanjuanzengView selectView(Wrapper<XiaoyuanjuanzengEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

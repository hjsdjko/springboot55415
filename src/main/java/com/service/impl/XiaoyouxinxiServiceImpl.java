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


import com.dao.XiaoyouxinxiDao;
import com.entity.XiaoyouxinxiEntity;
import com.service.XiaoyouxinxiService;
import com.entity.vo.XiaoyouxinxiVO;
import com.entity.view.XiaoyouxinxiView;

@Service("xiaoyouxinxiService")
public class XiaoyouxinxiServiceImpl extends ServiceImpl<XiaoyouxinxiDao, XiaoyouxinxiEntity> implements XiaoyouxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyouxinxiEntity> page = this.selectPage(
                new Query<XiaoyouxinxiEntity>(params).getPage(),
                new EntityWrapper<XiaoyouxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyouxinxiEntity> wrapper) {
		  Page<XiaoyouxinxiView> page =new Query<XiaoyouxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyouxinxiVO> selectListVO(Wrapper<XiaoyouxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyouxinxiVO selectVO(Wrapper<XiaoyouxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyouxinxiView> selectListView(Wrapper<XiaoyouxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyouxinxiView selectView(Wrapper<XiaoyouxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

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


import com.dao.XiaoyouhuixinxiDao;
import com.entity.XiaoyouhuixinxiEntity;
import com.service.XiaoyouhuixinxiService;
import com.entity.vo.XiaoyouhuixinxiVO;
import com.entity.view.XiaoyouhuixinxiView;

@Service("xiaoyouhuixinxiService")
public class XiaoyouhuixinxiServiceImpl extends ServiceImpl<XiaoyouhuixinxiDao, XiaoyouhuixinxiEntity> implements XiaoyouhuixinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyouhuixinxiEntity> page = this.selectPage(
                new Query<XiaoyouhuixinxiEntity>(params).getPage(),
                new EntityWrapper<XiaoyouhuixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyouhuixinxiEntity> wrapper) {
		  Page<XiaoyouhuixinxiView> page =new Query<XiaoyouhuixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyouhuixinxiVO> selectListVO(Wrapper<XiaoyouhuixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyouhuixinxiVO selectVO(Wrapper<XiaoyouhuixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyouhuixinxiView> selectListView(Wrapper<XiaoyouhuixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyouhuixinxiView selectView(Wrapper<XiaoyouhuixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

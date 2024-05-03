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


import com.dao.XiaoyouhuodongDao;
import com.entity.XiaoyouhuodongEntity;
import com.service.XiaoyouhuodongService;
import com.entity.vo.XiaoyouhuodongVO;
import com.entity.view.XiaoyouhuodongView;

@Service("xiaoyouhuodongService")
public class XiaoyouhuodongServiceImpl extends ServiceImpl<XiaoyouhuodongDao, XiaoyouhuodongEntity> implements XiaoyouhuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyouhuodongEntity> page = this.selectPage(
                new Query<XiaoyouhuodongEntity>(params).getPage(),
                new EntityWrapper<XiaoyouhuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyouhuodongEntity> wrapper) {
		  Page<XiaoyouhuodongView> page =new Query<XiaoyouhuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyouhuodongVO> selectListVO(Wrapper<XiaoyouhuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyouhuodongVO selectVO(Wrapper<XiaoyouhuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyouhuodongView> selectListView(Wrapper<XiaoyouhuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyouhuodongView selectView(Wrapper<XiaoyouhuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

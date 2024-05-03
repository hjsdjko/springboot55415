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


import com.dao.XiaoyouxiangqinDao;
import com.entity.XiaoyouxiangqinEntity;
import com.service.XiaoyouxiangqinService;
import com.entity.vo.XiaoyouxiangqinVO;
import com.entity.view.XiaoyouxiangqinView;

@Service("xiaoyouxiangqinService")
public class XiaoyouxiangqinServiceImpl extends ServiceImpl<XiaoyouxiangqinDao, XiaoyouxiangqinEntity> implements XiaoyouxiangqinService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiaoyouxiangqinEntity> page = this.selectPage(
                new Query<XiaoyouxiangqinEntity>(params).getPage(),
                new EntityWrapper<XiaoyouxiangqinEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiaoyouxiangqinEntity> wrapper) {
		  Page<XiaoyouxiangqinView> page =new Query<XiaoyouxiangqinView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiaoyouxiangqinVO> selectListVO(Wrapper<XiaoyouxiangqinEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiaoyouxiangqinVO selectVO(Wrapper<XiaoyouxiangqinEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiaoyouxiangqinView> selectListView(Wrapper<XiaoyouxiangqinEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiaoyouxiangqinView selectView(Wrapper<XiaoyouxiangqinEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

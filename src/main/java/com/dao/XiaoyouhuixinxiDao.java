package com.dao;

import com.entity.XiaoyouhuixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoyouhuixinxiVO;
import com.entity.view.XiaoyouhuixinxiView;


/**
 * 校友会信息
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
public interface XiaoyouhuixinxiDao extends BaseMapper<XiaoyouhuixinxiEntity> {
	
	List<XiaoyouhuixinxiVO> selectListVO(@Param("ew") Wrapper<XiaoyouhuixinxiEntity> wrapper);
	
	XiaoyouhuixinxiVO selectVO(@Param("ew") Wrapper<XiaoyouhuixinxiEntity> wrapper);
	
	List<XiaoyouhuixinxiView> selectListView(@Param("ew") Wrapper<XiaoyouhuixinxiEntity> wrapper);

	List<XiaoyouhuixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyouhuixinxiEntity> wrapper);
	
	XiaoyouhuixinxiView selectView(@Param("ew") Wrapper<XiaoyouhuixinxiEntity> wrapper);
	

}

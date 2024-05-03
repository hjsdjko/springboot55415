package com.dao;

import com.entity.XiaoyouhuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoyouhuodongVO;
import com.entity.view.XiaoyouhuodongView;


/**
 * 校友活动
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
public interface XiaoyouhuodongDao extends BaseMapper<XiaoyouhuodongEntity> {
	
	List<XiaoyouhuodongVO> selectListVO(@Param("ew") Wrapper<XiaoyouhuodongEntity> wrapper);
	
	XiaoyouhuodongVO selectVO(@Param("ew") Wrapper<XiaoyouhuodongEntity> wrapper);
	
	List<XiaoyouhuodongView> selectListView(@Param("ew") Wrapper<XiaoyouhuodongEntity> wrapper);

	List<XiaoyouhuodongView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyouhuodongEntity> wrapper);
	
	XiaoyouhuodongView selectView(@Param("ew") Wrapper<XiaoyouhuodongEntity> wrapper);
	

}

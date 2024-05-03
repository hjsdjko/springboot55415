package com.dao;

import com.entity.XiaoyouxiangqinEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiaoyouxiangqinVO;
import com.entity.view.XiaoyouxiangqinView;


/**
 * 校友相亲
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
public interface XiaoyouxiangqinDao extends BaseMapper<XiaoyouxiangqinEntity> {
	
	List<XiaoyouxiangqinVO> selectListVO(@Param("ew") Wrapper<XiaoyouxiangqinEntity> wrapper);
	
	XiaoyouxiangqinVO selectVO(@Param("ew") Wrapper<XiaoyouxiangqinEntity> wrapper);
	
	List<XiaoyouxiangqinView> selectListView(@Param("ew") Wrapper<XiaoyouxiangqinEntity> wrapper);

	List<XiaoyouxiangqinView> selectListView(Pagination page,@Param("ew") Wrapper<XiaoyouxiangqinEntity> wrapper);
	
	XiaoyouxiangqinView selectView(@Param("ew") Wrapper<XiaoyouxiangqinEntity> wrapper);
	

}

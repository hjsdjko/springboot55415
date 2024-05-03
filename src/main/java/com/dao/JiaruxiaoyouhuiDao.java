package com.dao;

import com.entity.JiaruxiaoyouhuiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaruxiaoyouhuiVO;
import com.entity.view.JiaruxiaoyouhuiView;


/**
 * 加入校友会
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
public interface JiaruxiaoyouhuiDao extends BaseMapper<JiaruxiaoyouhuiEntity> {
	
	List<JiaruxiaoyouhuiVO> selectListVO(@Param("ew") Wrapper<JiaruxiaoyouhuiEntity> wrapper);
	
	JiaruxiaoyouhuiVO selectVO(@Param("ew") Wrapper<JiaruxiaoyouhuiEntity> wrapper);
	
	List<JiaruxiaoyouhuiView> selectListView(@Param("ew") Wrapper<JiaruxiaoyouhuiEntity> wrapper);

	List<JiaruxiaoyouhuiView> selectListView(Pagination page,@Param("ew") Wrapper<JiaruxiaoyouhuiEntity> wrapper);
	
	JiaruxiaoyouhuiView selectView(@Param("ew") Wrapper<JiaruxiaoyouhuiEntity> wrapper);
	

}

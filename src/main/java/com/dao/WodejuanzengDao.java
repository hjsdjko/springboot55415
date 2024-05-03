package com.dao;

import com.entity.WodejuanzengEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WodejuanzengVO;
import com.entity.view.WodejuanzengView;


/**
 * 我的捐赠
 * 
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
public interface WodejuanzengDao extends BaseMapper<WodejuanzengEntity> {
	
	List<WodejuanzengVO> selectListVO(@Param("ew") Wrapper<WodejuanzengEntity> wrapper);
	
	WodejuanzengVO selectVO(@Param("ew") Wrapper<WodejuanzengEntity> wrapper);
	
	List<WodejuanzengView> selectListView(@Param("ew") Wrapper<WodejuanzengEntity> wrapper);

	List<WodejuanzengView> selectListView(Pagination page,@Param("ew") Wrapper<WodejuanzengEntity> wrapper);
	
	WodejuanzengView selectView(@Param("ew") Wrapper<WodejuanzengEntity> wrapper);
	

}

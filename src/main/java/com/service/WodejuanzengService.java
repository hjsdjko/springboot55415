package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WodejuanzengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WodejuanzengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WodejuanzengView;


/**
 * 我的捐赠
 *
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
public interface WodejuanzengService extends IService<WodejuanzengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WodejuanzengVO> selectListVO(Wrapper<WodejuanzengEntity> wrapper);
   	
   	WodejuanzengVO selectVO(@Param("ew") Wrapper<WodejuanzengEntity> wrapper);
   	
   	List<WodejuanzengView> selectListView(Wrapper<WodejuanzengEntity> wrapper);
   	
   	WodejuanzengView selectView(@Param("ew") Wrapper<WodejuanzengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WodejuanzengEntity> wrapper);
   	

}


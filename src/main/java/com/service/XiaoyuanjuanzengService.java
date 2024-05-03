package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyuanjuanzengEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyuanjuanzengVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyuanjuanzengView;


/**
 * 校园捐赠
 *
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
public interface XiaoyuanjuanzengService extends IService<XiaoyuanjuanzengEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyuanjuanzengVO> selectListVO(Wrapper<XiaoyuanjuanzengEntity> wrapper);
   	
   	XiaoyuanjuanzengVO selectVO(@Param("ew") Wrapper<XiaoyuanjuanzengEntity> wrapper);
   	
   	List<XiaoyuanjuanzengView> selectListView(Wrapper<XiaoyuanjuanzengEntity> wrapper);
   	
   	XiaoyuanjuanzengView selectView(@Param("ew") Wrapper<XiaoyuanjuanzengEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyuanjuanzengEntity> wrapper);
   	

}


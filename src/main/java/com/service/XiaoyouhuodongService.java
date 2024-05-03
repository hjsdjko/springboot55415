package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyouhuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyouhuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyouhuodongView;


/**
 * 校友活动
 *
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
public interface XiaoyouhuodongService extends IService<XiaoyouhuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyouhuodongVO> selectListVO(Wrapper<XiaoyouhuodongEntity> wrapper);
   	
   	XiaoyouhuodongVO selectVO(@Param("ew") Wrapper<XiaoyouhuodongEntity> wrapper);
   	
   	List<XiaoyouhuodongView> selectListView(Wrapper<XiaoyouhuodongEntity> wrapper);
   	
   	XiaoyouhuodongView selectView(@Param("ew") Wrapper<XiaoyouhuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyouhuodongEntity> wrapper);
   	

}


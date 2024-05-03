package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyouxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyouxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyouxinxiView;


/**
 * 校友信息
 *
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
public interface XiaoyouxinxiService extends IService<XiaoyouxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyouxinxiVO> selectListVO(Wrapper<XiaoyouxinxiEntity> wrapper);
   	
   	XiaoyouxinxiVO selectVO(@Param("ew") Wrapper<XiaoyouxinxiEntity> wrapper);
   	
   	List<XiaoyouxinxiView> selectListView(Wrapper<XiaoyouxinxiEntity> wrapper);
   	
   	XiaoyouxinxiView selectView(@Param("ew") Wrapper<XiaoyouxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyouxinxiEntity> wrapper);
   	

}


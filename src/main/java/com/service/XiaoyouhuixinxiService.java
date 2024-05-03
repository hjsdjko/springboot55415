package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyouhuixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyouhuixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyouhuixinxiView;


/**
 * 校友会信息
 *
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
public interface XiaoyouhuixinxiService extends IService<XiaoyouhuixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyouhuixinxiVO> selectListVO(Wrapper<XiaoyouhuixinxiEntity> wrapper);
   	
   	XiaoyouhuixinxiVO selectVO(@Param("ew") Wrapper<XiaoyouhuixinxiEntity> wrapper);
   	
   	List<XiaoyouhuixinxiView> selectListView(Wrapper<XiaoyouhuixinxiEntity> wrapper);
   	
   	XiaoyouhuixinxiView selectView(@Param("ew") Wrapper<XiaoyouhuixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyouhuixinxiEntity> wrapper);
   	

}


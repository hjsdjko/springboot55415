package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaruxiaoyouhuiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaruxiaoyouhuiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaruxiaoyouhuiView;


/**
 * 加入校友会
 *
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
public interface JiaruxiaoyouhuiService extends IService<JiaruxiaoyouhuiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaruxiaoyouhuiVO> selectListVO(Wrapper<JiaruxiaoyouhuiEntity> wrapper);
   	
   	JiaruxiaoyouhuiVO selectVO(@Param("ew") Wrapper<JiaruxiaoyouhuiEntity> wrapper);
   	
   	List<JiaruxiaoyouhuiView> selectListView(Wrapper<JiaruxiaoyouhuiEntity> wrapper);
   	
   	JiaruxiaoyouhuiView selectView(@Param("ew") Wrapper<JiaruxiaoyouhuiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaruxiaoyouhuiEntity> wrapper);
   	

}


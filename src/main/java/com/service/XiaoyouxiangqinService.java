package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiaoyouxiangqinEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiaoyouxiangqinVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiaoyouxiangqinView;


/**
 * 校友相亲
 *
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
public interface XiaoyouxiangqinService extends IService<XiaoyouxiangqinEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiaoyouxiangqinVO> selectListVO(Wrapper<XiaoyouxiangqinEntity> wrapper);
   	
   	XiaoyouxiangqinVO selectVO(@Param("ew") Wrapper<XiaoyouxiangqinEntity> wrapper);
   	
   	List<XiaoyouxiangqinView> selectListView(Wrapper<XiaoyouxiangqinEntity> wrapper);
   	
   	XiaoyouxiangqinView selectView(@Param("ew") Wrapper<XiaoyouxiangqinEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiaoyouxiangqinEntity> wrapper);
   	

}


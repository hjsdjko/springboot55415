package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaomingshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaomingshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaomingshenqingView;


/**
 * 报名申请
 *
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
public interface BaomingshenqingService extends IService<BaomingshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaomingshenqingVO> selectListVO(Wrapper<BaomingshenqingEntity> wrapper);
   	
   	BaomingshenqingVO selectVO(@Param("ew") Wrapper<BaomingshenqingEntity> wrapper);
   	
   	List<BaomingshenqingView> selectListView(Wrapper<BaomingshenqingEntity> wrapper);
   	
   	BaomingshenqingView selectView(@Param("ew") Wrapper<BaomingshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaomingshenqingEntity> wrapper);
   	

}


package com.entity.view;

import com.entity.XiaoyouhuodongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校友活动
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@TableName("xiaoyouhuodong")
public class XiaoyouhuodongView  extends XiaoyouhuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoyouhuodongView(){
	}
 
 	public XiaoyouhuodongView(XiaoyouhuodongEntity xiaoyouhuodongEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoyouhuodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

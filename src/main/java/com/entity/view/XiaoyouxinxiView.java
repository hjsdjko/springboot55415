package com.entity.view;

import com.entity.XiaoyouxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校友信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@TableName("xiaoyouxinxi")
public class XiaoyouxinxiView  extends XiaoyouxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoyouxinxiView(){
	}
 
 	public XiaoyouxinxiView(XiaoyouxinxiEntity xiaoyouxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoyouxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

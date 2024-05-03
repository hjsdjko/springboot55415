package com.entity.view;

import com.entity.BaomingshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报名申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@TableName("baomingshenqing")
public class BaomingshenqingView  extends BaomingshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaomingshenqingView(){
	}
 
 	public BaomingshenqingView(BaomingshenqingEntity baomingshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, baomingshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

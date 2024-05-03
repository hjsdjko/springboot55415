package com.entity.view;

import com.entity.WodejuanzengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 我的捐赠
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@TableName("wodejuanzeng")
public class WodejuanzengView  extends WodejuanzengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WodejuanzengView(){
	}
 
 	public WodejuanzengView(WodejuanzengEntity wodejuanzengEntity){
 	try {
			BeanUtils.copyProperties(this, wodejuanzengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

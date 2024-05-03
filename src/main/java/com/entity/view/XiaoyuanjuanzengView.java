package com.entity.view;

import com.entity.XiaoyuanjuanzengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 校园捐赠
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@TableName("xiaoyuanjuanzeng")
public class XiaoyuanjuanzengView  extends XiaoyuanjuanzengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public XiaoyuanjuanzengView(){
	}
 
 	public XiaoyuanjuanzengView(XiaoyuanjuanzengEntity xiaoyuanjuanzengEntity){
 	try {
			BeanUtils.copyProperties(this, xiaoyuanjuanzengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

package com.entity.vo;

import com.entity.XiaoyuanjuanzengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 校园捐赠
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
public class XiaoyuanjuanzengVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 年度
	 */
	
	private String niandu;
		
	/**
	 * 项目
	 */
	
	private String xiangmu;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 捐赠用途
	 */
	
	private String juanzengyongtu;
		
	/**
	 * 捐赠详情
	 */
	
	private String juanzengxiangqing;
				
	
	/**
	 * 设置：年度
	 */
	 
	public void setNiandu(String niandu) {
		this.niandu = niandu;
	}
	
	/**
	 * 获取：年度
	 */
	public String getNiandu() {
		return niandu;
	}
				
	
	/**
	 * 设置：项目
	 */
	 
	public void setXiangmu(String xiangmu) {
		this.xiangmu = xiangmu;
	}
	
	/**
	 * 获取：项目
	 */
	public String getXiangmu() {
		return xiangmu;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：捐赠用途
	 */
	 
	public void setJuanzengyongtu(String juanzengyongtu) {
		this.juanzengyongtu = juanzengyongtu;
	}
	
	/**
	 * 获取：捐赠用途
	 */
	public String getJuanzengyongtu() {
		return juanzengyongtu;
	}
				
	
	/**
	 * 设置：捐赠详情
	 */
	 
	public void setJuanzengxiangqing(String juanzengxiangqing) {
		this.juanzengxiangqing = juanzengxiangqing;
	}
	
	/**
	 * 获取：捐赠详情
	 */
	public String getJuanzengxiangqing() {
		return juanzengxiangqing;
	}
			
}

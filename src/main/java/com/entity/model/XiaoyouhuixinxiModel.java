package com.entity.model;

import com.entity.XiaoyouhuixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 校友会信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
public class XiaoyouhuixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 校友会名称
	 */
	
	private String xiaoyouhuimingcheng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 举办意义
	 */
	
	private String jubanyiyi;
		
	/**
	 * 举办时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jubanshijian;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
				
	
	/**
	 * 设置：校友会名称
	 */
	 
	public void setXiaoyouhuimingcheng(String xiaoyouhuimingcheng) {
		this.xiaoyouhuimingcheng = xiaoyouhuimingcheng;
	}
	
	/**
	 * 获取：校友会名称
	 */
	public String getXiaoyouhuimingcheng() {
		return xiaoyouhuimingcheng;
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
	 * 设置：举办意义
	 */
	 
	public void setJubanyiyi(String jubanyiyi) {
		this.jubanyiyi = jubanyiyi;
	}
	
	/**
	 * 获取：举办意义
	 */
	public String getJubanyiyi() {
		return jubanyiyi;
	}
				
	
	/**
	 * 设置：举办时间
	 */
	 
	public void setJubanshijian(Date jubanshijian) {
		this.jubanshijian = jubanshijian;
	}
	
	/**
	 * 获取：举办时间
	 */
	public Date getJubanshijian() {
		return jubanshijian;
	}
				
	
	/**
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
	}
			
}

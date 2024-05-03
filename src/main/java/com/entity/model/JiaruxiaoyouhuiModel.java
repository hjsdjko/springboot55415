package com.entity.model;

import com.entity.JiaruxiaoyouhuiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 加入校友会
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
public class JiaruxiaoyouhuiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 校友会名称
	 */
	
	private String xiaoyouhuimingcheng;
		
	/**
	 * 加入时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jiarushijian;
		
	/**
	 * 用户账号
	 */
	
	private String yonghuzhanghao;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 毕业年份
	 */
	
	private String biyenianfen;
				
	
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
	 * 设置：加入时间
	 */
	 
	public void setJiarushijian(Date jiarushijian) {
		this.jiarushijian = jiarushijian;
	}
	
	/**
	 * 获取：加入时间
	 */
	public Date getJiarushijian() {
		return jiarushijian;
	}
				
	
	/**
	 * 设置：用户账号
	 */
	 
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：毕业年份
	 */
	 
	public void setBiyenianfen(String biyenianfen) {
		this.biyenianfen = biyenianfen;
	}
	
	/**
	 * 获取：毕业年份
	 */
	public String getBiyenianfen() {
		return biyenianfen;
	}
			
}

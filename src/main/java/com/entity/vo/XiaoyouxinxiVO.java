package com.entity.vo;

import com.entity.XiaoyouxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 校友信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
public class XiaoyouxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 毕业年份
	 */
	
	private String biyenianfen;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 所在地区
	 */
	
	private String suozaidiqu;
		
	/**
	 * 薪酬
	 */
	
	private String xinchou;
		
	/**
	 * 职业
	 */
	
	private String zhiye;
		
	/**
	 * 校友简介
	 */
	
	private String xiaoyoujianjie;
				
	
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
	 * 设置：所在地区
	 */
	 
	public void setSuozaidiqu(String suozaidiqu) {
		this.suozaidiqu = suozaidiqu;
	}
	
	/**
	 * 获取：所在地区
	 */
	public String getSuozaidiqu() {
		return suozaidiqu;
	}
				
	
	/**
	 * 设置：薪酬
	 */
	 
	public void setXinchou(String xinchou) {
		this.xinchou = xinchou;
	}
	
	/**
	 * 获取：薪酬
	 */
	public String getXinchou() {
		return xinchou;
	}
				
	
	/**
	 * 设置：职业
	 */
	 
	public void setZhiye(String zhiye) {
		this.zhiye = zhiye;
	}
	
	/**
	 * 获取：职业
	 */
	public String getZhiye() {
		return zhiye;
	}
				
	
	/**
	 * 设置：校友简介
	 */
	 
	public void setXiaoyoujianjie(String xiaoyoujianjie) {
		this.xiaoyoujianjie = xiaoyoujianjie;
	}
	
	/**
	 * 获取：校友简介
	 */
	public String getXiaoyoujianjie() {
		return xiaoyoujianjie;
	}
			
}

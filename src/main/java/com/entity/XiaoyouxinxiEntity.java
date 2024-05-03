package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 校友信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@TableName("xiaoyouxinxi")
public class XiaoyouxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoyouxinxiEntity() {
		
	}
	
	public XiaoyouxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

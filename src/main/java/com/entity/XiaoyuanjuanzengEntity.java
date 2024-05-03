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
 * 校园捐赠
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@TableName("xiaoyuanjuanzeng")
public class XiaoyuanjuanzengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoyuanjuanzengEntity() {
		
	}
	
	public XiaoyuanjuanzengEntity(T t) {
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
	 * 标题
	 */
					
	private String biaoti;
	
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
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
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

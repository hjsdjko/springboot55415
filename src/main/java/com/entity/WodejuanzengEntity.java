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
 * 我的捐赠
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@TableName("wodejuanzeng")
public class WodejuanzengEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WodejuanzengEntity() {
		
	}
	
	public WodejuanzengEntity(T t) {
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
	 * 捐赠编号
	 */
					
	private String juanzengbianhao;
	
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
	 * 捐赠金额
	 */
					
	private String juanzengjine;
	
	/**
	 * 捐赠时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date juanzengshijian;
	
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
	 * 是否支付
	 */
					
	private String ispay;
	
	
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
	 * 设置：捐赠编号
	 */
	public void setJuanzengbianhao(String juanzengbianhao) {
		this.juanzengbianhao = juanzengbianhao;
	}
	/**
	 * 获取：捐赠编号
	 */
	public String getJuanzengbianhao() {
		return juanzengbianhao;
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
	 * 设置：捐赠金额
	 */
	public void setJuanzengjine(String juanzengjine) {
		this.juanzengjine = juanzengjine;
	}
	/**
	 * 获取：捐赠金额
	 */
	public String getJuanzengjine() {
		return juanzengjine;
	}
	/**
	 * 设置：捐赠时间
	 */
	public void setJuanzengshijian(Date juanzengshijian) {
		this.juanzengshijian = juanzengshijian;
	}
	/**
	 * 获取：捐赠时间
	 */
	public Date getJuanzengshijian() {
		return juanzengshijian;
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
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}

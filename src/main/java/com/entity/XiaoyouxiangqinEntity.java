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
 * 校友相亲
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@TableName("xiaoyouxiangqin")
public class XiaoyouxiangqinEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoyouxiangqinEntity() {
		
	}
	
	public XiaoyouxiangqinEntity(T t) {
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
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 年龄
	 */
					
	private String nianling;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 图片
	 */
					
	private String tupian;
	
	/**
	 * 所在城市
	 */
					
	private String suozaichengshi;
	
	/**
	 * 是否购房
	 */
					
	private String shifougoufang;
	
	/**
	 * 对他的期待
	 */
					
	private String duitadeqidai;
	
	/**
	 * 自我介绍
	 */
					
	private String ziwojieshao;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	
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
	 * 设置：年龄
	 */
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
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
	 * 设置：所在城市
	 */
	public void setSuozaichengshi(String suozaichengshi) {
		this.suozaichengshi = suozaichengshi;
	}
	/**
	 * 获取：所在城市
	 */
	public String getSuozaichengshi() {
		return suozaichengshi;
	}
	/**
	 * 设置：是否购房
	 */
	public void setShifougoufang(String shifougoufang) {
		this.shifougoufang = shifougoufang;
	}
	/**
	 * 获取：是否购房
	 */
	public String getShifougoufang() {
		return shifougoufang;
	}
	/**
	 * 设置：对他的期待
	 */
	public void setDuitadeqidai(String duitadeqidai) {
		this.duitadeqidai = duitadeqidai;
	}
	/**
	 * 获取：对他的期待
	 */
	public String getDuitadeqidai() {
		return duitadeqidai;
	}
	/**
	 * 设置：自我介绍
	 */
	public void setZiwojieshao(String ziwojieshao) {
		this.ziwojieshao = ziwojieshao;
	}
	/**
	 * 获取：自我介绍
	 */
	public String getZiwojieshao() {
		return ziwojieshao;
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

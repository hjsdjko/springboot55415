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
 * 校友会信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@TableName("xiaoyouhuixinxi")
public class XiaoyouhuixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiaoyouhuixinxiEntity() {
		
	}
	
	public XiaoyouhuixinxiEntity(T t) {
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
	 * 校友会编号
	 */
					
	private String xiaoyouhuibianhao;
	
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
	 * 设置：校友会编号
	 */
	public void setXiaoyouhuibianhao(String xiaoyouhuibianhao) {
		this.xiaoyouhuibianhao = xiaoyouhuibianhao;
	}
	/**
	 * 获取：校友会编号
	 */
	public String getXiaoyouhuibianhao() {
		return xiaoyouhuibianhao;
	}
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

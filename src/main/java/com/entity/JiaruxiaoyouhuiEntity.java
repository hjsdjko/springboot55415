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
 * 加入校友会
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
@TableName("jiaruxiaoyouhui")
public class JiaruxiaoyouhuiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaruxiaoyouhuiEntity() {
		
	}
	
	public JiaruxiaoyouhuiEntity(T t) {
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
	 * 加入编号
	 */
					
	private String jiarubianhao;
	
	/**
	 * 校友会名称
	 */
					
	private String xiaoyouhuimingcheng;
	
	/**
	 * 加入时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
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
	 * 设置：加入编号
	 */
	public void setJiarubianhao(String jiarubianhao) {
		this.jiarubianhao = jiarubianhao;
	}
	/**
	 * 获取：加入编号
	 */
	public String getJiarubianhao() {
		return jiarubianhao;
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

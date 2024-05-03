package com.entity.vo;

import com.entity.WodejuanzengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 我的捐赠
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-13 10:28:27
 */
public class WodejuanzengVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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

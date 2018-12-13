package com.bigbigrain.lawservice.vo;

import java.util.Date;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 机关履职满意度评价
 * @author zhangy
 *
 */
public class NetEvaluate {
	/**唯一编码*/
	private String wybm;
	
	/**被评价单位*/
	private String department;
	
	/**行政区划名称*/
	private String xzqh_name;
	
	/**行政区划*/
	private String xzqh;

	/**工作业务类型*/
	private String service_type;
	/**一级指标*/
	private String overall_evaluate;

	/**数据来源*/
	private String data_sources;
	
	/**评价时间*/
	@JSONField(format="yyyy-MM-dd")
	private Date pj_time;
	
	/**数据状态*/
	private int flag;
	
	/**创建者*/
	private String create_name;

	/**创建时间*/
	@JSONField(format="yyyy-MM-dd")
	private Date create_time;

	/**修改者*/
	private String update_name;

	/**修改时间*/
	@JSONField(format="yyyy-MM-dd")
	private Date update_time;

	/**其他意见和评价*/
	private String other_evaluate;

	/**评价渠道*/
	private String pjqd;

	public String getWybm() {
		return wybm;
	}

	public void setWybm(String wybm) {
		this.wybm = wybm;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getXzqh_name() {
		return xzqh_name;
	}

	public void setXzqh_name(String xzqh_name) {
		this.xzqh_name = xzqh_name;
	}

	public String getXzqh() {
		return xzqh;
	}

	public void setXzqh(String xzqh) {
		this.xzqh = xzqh;
	}

	public String getService_type() {
		return service_type;
	}

	public void setService_type(String service_type) {
		this.service_type = service_type;
	}

	public String getOverall_evaluate() {
		return overall_evaluate;
	}

	public void setOverall_evaluate(String overall_evaluate) {
		this.overall_evaluate = overall_evaluate;
	}

	public String getData_sources() {
		return data_sources;
	}

	public void setData_sources(String data_sources) {
		this.data_sources = data_sources;
	}

	public Date getPj_time() {
		return pj_time;
	}

	public void setPj_time(Date pj_time) {
		this.pj_time = pj_time;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getCreate_name() {
		return create_name;
	}

	public void setCreate_name(String create_name) {
		this.create_name = create_name;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getUpdate_name() {
		return update_name;
	}

	public void setUpdate_name(String update_name) {
		this.update_name = update_name;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public String getOther_evaluate() {
		return other_evaluate;
	}

	public void setOther_evaluate(String other_evaluate) {
		this.other_evaluate = other_evaluate;
	}

	public String getPjqd() {
		return pjqd;
	}

	public void setPjqd(String pjqd) {
		this.pjqd = pjqd;
	}

	@Override
	public String toString() {
		return "Evaluate [wybm=" + wybm + ", department=" + department + ", xzqh_name=" + xzqh_name + ", xzqh=" + xzqh
				+ ", overall_evaluate=" + overall_evaluate + ", data_sources=" + data_sources + ", pj_time=" + pj_time
				+ ", flag=" + flag + ", create_name=" + create_name + ", create_time=" + create_time + ", update_name="
				+ update_name + ", update_time=" + update_time + ", other_evaluate=" + other_evaluate + ", pjqd=" + pjqd
				+ "]";
	}
}

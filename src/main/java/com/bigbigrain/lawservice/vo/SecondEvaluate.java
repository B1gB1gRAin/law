package com.bigbigrain.lawservice.vo;

/**
 * 机关履职满意度评价二级指标
 * @author zhangy
 *
 */
public class SecondEvaluate {
	/**唯一编码*/
	private String wybm;
	/**二级指标*/
	private String evaluate_index;
	/**二级指标*/
	private String evaluate;
	/**数据状态*/
	private int flag;
	public String getWybm() {
		return wybm;
	}
	public void setWybm(String wybm) {
		this.wybm = wybm;
	}
	public String getEvaluate_index() {
		return evaluate_index;
	}
	public void setEvaluate_index(String evaluate_index) {
		this.evaluate_index = evaluate_index;
	}
	public String getEvaluate() {
		return evaluate;
	}
	public void setEvaluate(String evaluate) {
		this.evaluate = evaluate;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	@Override
	public String toString() {
		return "SecondEvaluate [wybm=" + wybm + ", evaluate_index=" + evaluate_index + ", evaluate=" + evaluate
				+ ", flag=" + flag + "]";
	}
	
}

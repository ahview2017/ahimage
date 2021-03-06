package com.deepai.photo.bean;

/**
 * * @author huqiankai: *
 * 
 */
public class CpGroupStatistical {
	private String author; // 作者
	private Integer sendCount; // 投稿次数
	private Integer pictureCount; // 图片数量
	private Integer throughCount; // 投稿通过数量
	private Integer throughPictureCount;// 投稿通过图片数量
	private Integer siteId; //子站id
	private String startTime; // 开始时间
	private String endTime; // 结束时间
	private Integer type;// 稿件类别
	private String  place; //地域
	private String  categaryName;//分类名
	
	public String getCategaryName() {
		return categaryName;
	}
	public void setCategaryName(String categaryName) {
		this.categaryName = categaryName;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Integer getSendCount() {
		return sendCount;
	}
	public void setSendCount(Integer sendCount) {
		this.sendCount = sendCount;
	}
	public Integer getPictureCount() {
		return pictureCount;
	}
	public void setPictureCount(Integer pictureCount) {
		this.pictureCount = pictureCount;
	}
	public Integer getThroughCount() {
		if (this.throughCount==null) {
			return throughCount=0;
		}
		return throughCount;
	}
	public void setThroughCount(Integer throughCount) {
		this.throughCount = throughCount;
	}
	public Integer getThroughPictureCount() {
		if (this.throughPictureCount==null) {
			return throughPictureCount=0;
		}
		return throughPictureCount;
	}
	public void setThroughPictureCount(Integer throughPictureCount) {
		this.throughPictureCount = throughPictureCount;
	}
	public Integer getSiteId() {
		return siteId;
	}
	public void setSiteId(Integer siteId) {
		if (siteId==null) {
			this.siteId =1;
		}
		this.siteId = siteId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}

}

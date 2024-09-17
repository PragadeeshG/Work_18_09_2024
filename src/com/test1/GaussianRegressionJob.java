package com.test1;

public class GaussianRegressionJob {
	private Integer grDeviceId;
	private String grDeviceName;
	private String grDeviceRegistry;
	private String grDeviceStartTime;
	private String grDeviceApprovedTime;
	private String grDeviceOwner;
	private boolean authorizedDevice;
	private String timeOutInSeconds;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public GaussianRegressionJob() {

	}

	public GaussianRegressionJob(Integer grDeviceId, String grDeviceName, String grDeviceRegistry,
			String grDeviceStartTime, String grDeviceApprovedTime, String grDeviceOwner, boolean authorizedDevice,
			String timeOutInSeconds, String creationDate, String modifiedDate, String entityState) {
		super();
		this.grDeviceId = grDeviceId;
		this.grDeviceName = grDeviceName;
		this.grDeviceRegistry = grDeviceRegistry;
		this.grDeviceStartTime = grDeviceStartTime;
		this.grDeviceApprovedTime = grDeviceApprovedTime;
		this.grDeviceOwner = grDeviceOwner;
		this.authorizedDevice = authorizedDevice;
		this.timeOutInSeconds = timeOutInSeconds;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getGrDeviceId() {
		return grDeviceId;
	}

	public void setGrDeviceId(Integer grDeviceId) {
		this.grDeviceId = grDeviceId;
	}

	public String getGrDeviceName() {
		return grDeviceName;
	}

	public void setGrDeviceName(String grDeviceName) {
		this.grDeviceName = grDeviceName;
	}

	public String getGrDeviceRegistry() {
		return grDeviceRegistry;
	}

	public void setGrDeviceRegistry(String grDeviceRegistry) {
		this.grDeviceRegistry = grDeviceRegistry;
	}

	public String getGrDeviceStartTime() {
		return grDeviceStartTime;
	}

	public void setGrDeviceStartTime(String grDeviceStartTime) {
		this.grDeviceStartTime = grDeviceStartTime;
	}

	public String getGrDeviceApprovedTime() {
		return grDeviceApprovedTime;
	}

	public void setGrDeviceApprovedTime(String grDeviceApprovedTime) {
		this.grDeviceApprovedTime = grDeviceApprovedTime;
	}

	public String getGrDeviceOwner() {
		return grDeviceOwner;
	}

	public void setGrDeviceOwner(String grDeviceOwner) {
		this.grDeviceOwner = grDeviceOwner;
	}

	public boolean isAuthorizedDevice() {
		return authorizedDevice;
	}

	public void setAuthorizedDevice(boolean authorizedDevice) {
		this.authorizedDevice = authorizedDevice;
	}

	public String getTimeOutInSeconds() {
		return timeOutInSeconds;
	}

	public void setTimeOutInSeconds(String timeOutInSeconds) {
		this.timeOutInSeconds = timeOutInSeconds;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}

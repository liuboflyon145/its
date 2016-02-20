package edu.hpc.its.area.core;

import java.util.HashSet;
import java.util.Set;

import edu.hpc.its.area.Area;
import edu.hpc.its.area.exception.LifecycleException;

/**
 * 区域
 * 
 * @timestamp Feb 13, 2016 4:17:28 PM
 * @author smallbug
 */
public class StandardArea extends StandardEntity implements Area {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9185192675014560938L;

	@Override
	protected void startInternal() throws LifecycleException {
		// TODO Auto-generated method stub
		super.startInternal();
	}

	@Override
	protected void stopInternal() throws LifecycleException {
		// TODO Auto-generated method stub
		super.stopInternal();
	}

	@Override
	protected void initInternal() throws LifecycleException {
		// TODO Auto-generated method stub
		super.initInternal();
	}

	@Override
	protected void destroyInternal() throws LifecycleException {
		// TODO Auto-generated method stub
		super.destroyInternal();
	}

	/***************************** BEAN *****************************/
	private String name;// 区域名称
	private String ip;// 运行该区域机器的IP
	private int port;// 运行该区域机器的端口
	private double width;// 区域宽度
	private double length;// 区域长度

	private int roadNum;// 该区域道路的数量
	private int crossNum;// 该区域交叉路口的数量
	private int lightNum;// 该区域红绿灯的数量

	private Set<OpenRoad> openRoads = new HashSet<>();// 该区域与其他区域路口的交接情况

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public int getRoadNum() {
		return roadNum;
	}

	public void setRoadNum(int roadNum) {
		this.roadNum = roadNum;
	}

	public int getCrossNum() {
		return crossNum;
	}

	public void setCrossNum(int crossNum) {
		this.crossNum = crossNum;
	}

	public int getLightNum() {
		return lightNum;
	}

	public void setLightNum(int lightNum) {
		this.lightNum = lightNum;
	}

	public Set<OpenRoad> getOpenRoads() {
		return openRoads;
	}

	public void setOpenRoads(Set<OpenRoad> openRoads) {
		this.openRoads = openRoads;
	}

}

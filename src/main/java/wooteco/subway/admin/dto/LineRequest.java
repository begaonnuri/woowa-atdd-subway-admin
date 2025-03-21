package wooteco.subway.admin.dto;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import wooteco.subway.admin.domain.Line;

public class LineRequest {
	private String name;
	private String color;
	private LocalTime startTime;
	private LocalTime endTime;
	private int intervalTime;

	public LineRequest() {
	}

	public LineRequest(String name, String color, String startTime, String endTime,
			int intervalTime) {
		this.name = name;
		this.color = color;
		this.startTime = LocalTime.parse(startTime, DateTimeFormatter.ISO_LOCAL_TIME);
		this.endTime = LocalTime.parse(endTime, DateTimeFormatter.ISO_LOCAL_TIME);
		this.intervalTime = intervalTime;
	}

	public Line toLine() {
		return new Line(name, color, startTime, endTime, intervalTime);
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public LocalTime getEndTime() {
		return endTime;
	}

	public int getIntervalTime() {
		return intervalTime;
	}
}

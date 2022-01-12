package co.com.choucair.certification.starsharpreto.model;

public class RegisterNewMeeting {
    private String meetingName;
    private String meetingNumber;
    private String meetingType;
    private String startDate;
    private String startTime;
    private String endDate;
    private String endTime;
    private String location;
    private String unit;
    private String organized;
    private String reporter;
    private String attendee;

    public RegisterNewMeeting(String meetingName,
                              String meetingNumber,
                              String meetingType,
                              String startDate,
                              String startTime,
                              String endDate,
                              String endTime,
                              String location,
                              String unit,
                              String organized,
                              String reporter,
                              String attendee) {
        this.meetingName = meetingName;
        this.meetingNumber = meetingNumber;
        this.meetingType = meetingType;
        this.startDate = startDate;
        this.startTime = startTime;
        this.endDate = endDate;
        this.endTime = endTime;
        this.location = location;
        this.unit = unit;
        this.organized = organized;
        this.reporter = reporter;
        this.attendee = attendee;
    }

    public String getMeetingName() {
        return meetingName;
    }

    public void setMeetingName(String meetingName) {
        this.meetingName = meetingName;
    }

    public String getMeetingNumber() {
        return meetingNumber;
    }

    public void setMeetingNumber(String meetingNumber) {
        this.meetingNumber = meetingNumber;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getOrganized() {
        return organized;
    }

    public void setOrganized(String organized) {
        this.organized = organized;
    }

    public String getReporter() {
        return reporter;
    }

    public void setReporter(String reporter) {
        this.reporter = reporter;
    }

    public String getAttendee() {
        return attendee;
    }

    public void setAttendee(String attendee) {
        this.attendee = attendee;
    }

    public String getMeetingType() {
        return meetingType;
    }

    public void setMeetingType(String meetingType) {
        this.meetingType = meetingType;
    }
}

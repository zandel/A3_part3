package dbAccess;

import java.util.ArrayList;

public class StudentAssessment {
	private int trimesterId;
    private int courseId;
    private int studentId;
    private int assignmentId;
    private int assignmentWeightPct;
    private double assignmentMark;
    
	public int getTrimesterId() {
		return trimesterId;
	}
	public void setTrimesterId(int trimesterId) {
		this.trimesterId = trimesterId;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getAssignmentId() {
		return assignmentId;
	}
	public void setAssignmentId(int assignmentId) {
		this.assignmentId = assignmentId;
	}
	public int getAssignmentWeightPct() {
		return assignmentWeightPct;
	}
	public void setAssignmentWeightPct(int assignmentWeightPct) {
		this.assignmentWeightPct = assignmentWeightPct;
	}
	public double getAssignmentMark() {
		return assignmentMark;
	}
	public void setAssignmentMark(double assignmentMark) {
		this.assignmentMark = assignmentMark;
	}  
	
	

}

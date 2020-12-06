package deitelCapitulo3;

import javax.swing.JOptionPane;

public class GradeBook {
	private String courseName;
	private String instructorName;

	public GradeBook(String course, String instructor) {
		setCourseName(course);
		setInstructorName(instructor);
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getInstructorName() {
		return instructorName;
	}

	public void setInstructorName(String instructorName) {
		this.instructorName = instructorName;
	}

	public void displayMessage() {
		String saida = String.format("Welcome to the GradeBook for %s\nThis course is presented by: %s\n",
				this.getCourseName(), this.getInstructorName());

		JOptionPane.showMessageDialog(null, saida);
	}
}

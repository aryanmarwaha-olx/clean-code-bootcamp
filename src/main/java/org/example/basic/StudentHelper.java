package org.example.basic;

public class StudentHelper {

	/// PROBLEM 1
	///You get a grade B if marks are between 51 and 80 (both inclusive).
	/// Except for Maths where the upper limit is increased by 10 (i.e., 90).
	public boolean isGradeB(int marks, boolean isMaths) {
		int upperLimit = isMaths ? 90 : 80;
		return marks >= 51 && marks <= upperLimit;
	}

	/// PROBLEM 2
	/// Grade A: 91 to 100 (Maths: 96 to 100)
	/// Grade B: 51 to 90  (Maths: 56 to 95)
	/// Grade C: Below Grade B threshold
	public String getGrade(int mark, boolean isMaths) {
		if (isGradeA(mark, isMaths)) {
			return "A";
		}

		if (isBGrade(mark, isMaths)) {
			return "B";
		}

		return "C";
	}

	private boolean isGradeA(int mark, boolean isMaths) {
		int gradeAThreshold = isMaths ? 95 : 90;
		return mark > gradeAThreshold;
	}

	private boolean isBGrade(int mark, boolean isMaths) {
		int lowerLimit = isMaths ? 55 : 50;
		int upperLimit = isMaths ? 95 : 90;
		return mark > lowerLimit && mark <= upperLimit;
	}

	///PROBLEM 3
	/// Quiz Qualification Rules:
	/// - Return "NO" if either has poor marks (<= 20 or <= 25 in Maths)
	/// - Return "YES" if either has good marks (>= 80 or >= 85 in Maths)
	/// - Otherwise return "MAYBE"
	public String willQualifyForQuiz(int marks1, int marks2, boolean isMaths) {
		int poorThreshold = isMaths ? 25 : 20;
		int goodThreshold = isMaths ? 85 : 80;

		if (marks1 <= poorThreshold || marks2 <= poorThreshold) {
			return "NO";
		}

		if (marks1 >= goodThreshold || marks2 >= goodThreshold) {
			return "YES";
		}

		return "MAYBE";
	}
}


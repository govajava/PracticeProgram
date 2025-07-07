package com.practice.programes;

public class StringWithArray {

	public static class StudentDetails {
		int Sid;
		String Sname;
		int Smarks;
	}

	public static void main(String[] args) {

		StudentDetails s1 = new StudentDetails();
		s1.Sid = 1;
		s1.Sname = "bc";
		s1.Smarks = 88;

		StudentDetails s2 = new StudentDetails();
		s2.Sid = 2;
		s2.Sname = "fb";
		s2.Smarks = 88;

		StudentDetails s3 = new StudentDetails();
		s3.Sid = 3;
		s3.Sname = "sd";
		s3.Smarks = 88;

		StudentDetails students[] = new StudentDetails[2];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;

	}
}

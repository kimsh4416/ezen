package p0212;

import java.util.ArrayList;
import java.util.jar.Attributes.Name;

public class ListTest3 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.setName("김하나");
		s1.setGrade(1);
		s1.setSchoolName("망월초");
		
		Student s2 = new Student();
		
		s2.setName("김두식");
		s2.setGrade(2);
		s2.setSchoolName("강일초");
		
		Student s3 = new Student();
		
		s3.setName("최석삼");
		s3.setGrade(3);
		s3.setSchoolName("망월초");
		
		Student s4 = new Student();
		
		s4.setName("최너굴");
		s4.setGrade(4);
		s4.setSchoolName("강일초");
		
		Student s5 = new Student();
		
		s5.setName("김오징");
		s5.setGrade(5);
		s5.setSchoolName("이젠");
		
		ArrayList<Student> st = new ArrayList<>();
		
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);
		
		
			// 성이 최씨이거나 학교를 "이젠"으로 다니고 있는 사람만 출력
		
		for(Student s:st) {
			String name = s.getName();
			String schoolName = s.getSchoolName();
			if(name.startsWith("최")||schoolName.contains("이젠")) {
				System.out.println(s);
			}
		}
	}
}

package Comparators;

import Entity.Student;
import org.apache.commons.lang3.StringUtils;

public class StudentComparators {

    public static class FullNameComparator implements StudentCompInterface {

        @Override
        public int compare(Student s1, Student s2) {
            return StringUtils.compare(s1.getFullName(), s2.getFullName());
        }
    }

    public static class UniversityIdComparator implements StudentCompInterface {

        @Override
        public int compare(Student s1, Student s2) {
            return StringUtils.compare(s1.getUniversityid(), s2.getUniversityid());
        }
    }

    public static class CourseComparator implements StudentCompInterface {

        @Override
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.getCurrentCourseNumber(), s2.getCurrentCourseNumber());
        }
    }

    public static class AvgExamComparator implements StudentCompInterface {

        @Override
        public int compare(Student s1, Student s2) {
            return -Float.compare(s1.getAvgExamScore(), s2.getAvgExamScore());
        }
    }
}

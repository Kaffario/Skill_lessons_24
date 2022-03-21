import Comparators.*;
import Entity.*;
import Enums.*;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        List<University> universities = ReadFromFile.universitiesFromFile("src/main/resources/universityInfo.xlsx");

        UniversityCompInterface unCompID = ComparatorController.getUniversityComparator(UniversityComparatorsEnum.ID);
        UniversityCompInterface unCompFName = ComparatorController.getUniversityComparator(UniversityComparatorsEnum.FULLNAME);
        UniversityCompInterface unCompShName = ComparatorController.getUniversityComparator(UniversityComparatorsEnum.SHORTNAME);
        UniversityCompInterface unCompYear = ComparatorController.getUniversityComparator(UniversityComparatorsEnum.YEAROFFOUND);
        UniversityCompInterface unCompProf = ComparatorController.getUniversityComparator(UniversityComparatorsEnum.MAINPROFILE);

        universities.stream().sorted(unCompProf).forEach(System.out::println);

        List<Student> students = ReadFromFile.studentsFromFile("src/main/resources/universityInfo.xlsx");

        StudentCompInterface stCompName = ComparatorController.getStudentComparator(StudentComparatorsEnum.FULLNAME);
        StudentCompInterface stCompUnId = ComparatorController.getStudentComparator(StudentComparatorsEnum.UNIVERSITYID);
        StudentCompInterface stCompCourse = ComparatorController.getStudentComparator(StudentComparatorsEnum.COURSENUMBER);
        StudentCompInterface stCompAvg = ComparatorController.getStudentComparator(StudentComparatorsEnum.AVGEXAMSCORE);

        students.stream().sorted(stCompUnId).forEach(System.out::println);



    }

}

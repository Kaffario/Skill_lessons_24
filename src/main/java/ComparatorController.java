import Comparators.*;
import Enums.*;

public class ComparatorController {

    private ComparatorController() {
    }

    public static StudentCompInterface getStudentComparator(StudentComparatorsEnum sc) {

        switch (sc) {

            case FULLNAME:
                return new StudentComparators.FullNameComparator();
            case UNIVERSITYID:
                return new StudentComparators.UniversityIdComparator();
            case COURSENUMBER:
                return new StudentComparators.CourseComparator();
            case AVGEXAMSCORE:
                return new StudentComparators.AvgExamComparator();
            default:
                return new StudentComparators.FullNameComparator();
        }
    }

    public static UniversityCompInterface getUniversityComparator(UniversityComparatorsEnum un) {

        switch (un) {

            case ID:
                return new UniversityComparator.IdComparator();
            case FULLNAME:
                return new UniversityComparator.FullNameComparator();
            case SHORTNAME:
                return new UniversityComparator.ShortNameComparator();
            case YEAROFFOUND:
                return new UniversityComparator.YearComparator();
            case MAINPROFILE:
                return new UniversityComparator.ProfileComparator();

            default:
                return new UniversityComparator.IdComparator();
        }
    }
}

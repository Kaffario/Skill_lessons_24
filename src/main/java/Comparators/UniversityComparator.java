package Comparators;

import Entity.Student;
import Entity.University;
import Enums.StudyProfile;
import org.apache.commons.lang3.StringUtils;

public class UniversityComparator {

    public static class IdComparator implements UniversityCompInterface {

        @Override
        public int compare(University u1, University u2) {
            return StringUtils.compare(u1.getId(), u2.getId());
        }
    }

    public static class FullNameComparator implements UniversityCompInterface {

        @Override
        public int compare(University u1, University u2) {
            return StringUtils.compare(u1.getFullName(), u2.getFullName());
        }
    }

    public static class ShortNameComparator implements UniversityCompInterface {

        @Override
        public int compare(University u1, University u2) {
            return StringUtils.compare(u1.getShotName(), u2.getShotName());
        }
    }

    public static class YearComparator implements UniversityCompInterface {

        @Override
        public int compare(University u1, University u2) {
            return Integer.compare(u1.getYearOfFoundation(), u2.getYearOfFoundation());
        }
    }

    public static class ProfileComparator implements UniversityCompInterface {

        @Override
        public int compare(University u1, University u2) {
            return StringUtils.compare(u1.getMainProfile().name(), u2.getMainProfile().name());
        }
    }


}

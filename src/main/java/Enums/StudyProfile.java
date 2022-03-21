package Enums;

public enum StudyProfile {
    CHEMISTRY("Химия"),
    PHYSICS("Физика"),
    MUSIC("Музыка"),
    THEATER("Театральное искусство"),
    LINGUISTICS ("Лингвистика"),
    MEDICINE ("Медицина"),
    MATHEMATICS ("Математика");


    public String ProfileName;

    StudyProfile(String ProfileName) {
        this.ProfileName = ProfileName;
    }
}

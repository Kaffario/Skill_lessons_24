import Entity.Student;
import Entity.University;
import Enums.StudyProfile;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadFromFile {
    private ReadFromFile() {
    }

    public static List<Student> studentsFromFile (String file) throws IOException {

        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("Студенты");

        Iterator<Row> rows = sheet.iterator();
        rows.next();

        List<Student> students = new ArrayList<>();

        while (rows.hasNext()) {
            Row row = rows.next();
            Student student = new Student();
            student.setUniversityid(row.getCell(0).getStringCellValue());
            student.setFullName(row.getCell(1).getStringCellValue());
            student.setCurrentCourseNumber((int)row.getCell(2).getNumericCellValue());
            student.setAvgExamScore((float)row.getCell(3).getNumericCellValue());
            students.add(student);
        }

        return students;

    }

    public static List<University> universitiesFromFile (String file) throws IOException {


        FileInputStream inputStream = new FileInputStream(file);
        XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
        XSSFSheet sheet = workbook.getSheet("Университеты");

        Iterator<Row> rows = sheet.iterator();
        rows.next();

        List<University> universities = new ArrayList<>();

        while (rows.hasNext()) {
            Row row = rows.next();
            University university = new University();
            university.setId(row.getCell(0).getStringCellValue());
            university.setFullName(row.getCell(1).getStringCellValue());
            university.setShotName(row.getCell(2).getStringCellValue());
            university.setYearOfFoundation((int)row.getCell(3).getNumericCellValue());
            university.setMainProfile(StudyProfile.valueOf(StudyProfile.class, row.getCell(4).getStringCellValue()));
            universities.add(university);
        }

        return universities;

    }


}

public class Main {
    public static void main(String[] args) {

        University un1 = new University("1", "KGBU", "KGBU", 1937, StudyProfile.PHYSICS );
        University un2 = new University("2", "Gnesinka", "Gnesinka", 1900, StudyProfile.MUSIC );
        University un3 = new University("3", "Theater school im. Petuhova", "Pyatka", 1978, StudyProfile.THEATER );

        Student st1 = new Student("Ivan", "1", 1, 3.5f);
        Student st2 = new Student("Stepan", "2", 3, 4.2f);
        Student st3 = new Student("Larisa Ivanovna", "3", 4, 1.6f);

        System.out.println(un1);
        System.out.println(un2);
        System.out.println(un3);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);

    }

}

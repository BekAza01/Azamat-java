public class Main {

    // ===== Student классы =====
    static class Student {
        String name;
        int age;
        String major;

        // Әдепкі конструктор
        Student() {
            this.name = "Белгісіз";
            this.age = 0;
            this.major = "Белгісіз";
        }

        // Параметрлі конструктор + this
        Student(String name, int age, String major) {
            this.name = name;
            this.age = age;
            this.major = major;
        }

        void showInfo() {
            System.out.println("Аты: " + name);
            System.out.println("Жасы: " + age);
            System.out.println("Мамандығы: " + major);
            System.out.println("----------------");
        }

        void setMajor(String major) {
            this.major = major;
        }

        void setAge(int age) {
            this.age = age;
        }
    }

    // ===== StudentService классы =====
    static class StudentService {
        void printStudent(Student s) {
            System.out.println("StudentService арқылы:");
            s.showInfo();
        }

        void changeMajor(Student s, String newMajor) {
            s.setMajor(newMajor);
        }
    }

    // ===== MAIN =====
    public static void main(String[] args) {

        // Бірнеше объект
        Student s1 = new Student();
        Student s2 = new Student("Азамат", 18, "Программист");
        Student s3 = new Student("Айдана", 17, "Дизайнер");

        // Ақпарат шығару
        s1.showInfo();
        s2.showInfo();
        s3.showInfo();

        // Өзгерту
        s1.setAge(16);
        s1.setMajor("Студент");
        s1.showInfo();

        // Класстардың өзара әрекеті
        StudentService service = new StudentService();
        service.printStudent(s2);
        service.changeMajor(s2, "Киберқауіпсіздік");
        service.printStudent(s2);

        // Объект lifecycle
        System.out.println("Объект құрылды → қолданылды → бағдарлама аяқталды → жойылады (GC)");
    }
}
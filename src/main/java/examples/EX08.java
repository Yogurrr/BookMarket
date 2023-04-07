package examples;

public class EX08 {
    public static void main(String[] args) {
        // 학생(Student) 클래스를 선언하고 객체 초기화한 후 출력
        Student s1 = new Student();

        // setter로 변수 초기화
        s1.setHakbun(203150050);
        s1.setName("김태희");
        s1.setAddress("경기도 고양시");
        s1.setBirthDate("1985.3.22");
        s1.setMajor("컴퓨터");
        s1.setProfessor(504);

        System.out.println("<학생>");
        System.out.println(s1);

        // 교수(Professor) 클래스를 선언하고 객체 초기화한 후 출력
//        Professor p1 = new Professor(301, "이순신", "프로그래밍");
        Professor p1 = new Professor();

        p1.setProfessor(301);
        p1.setName("이순신");
        p1.setMajorField("프로그래밍");

        System.out.println("\n<교수>");
        System.out.printf("%d | %s | %s\n", p1.getProfessor(), p1.getName(), p1.getMajorField());
        System.out.println(p1);
//        System.out.printf("%d | %s | %s\n", p1.professor, p1.name, p1.majorField);
    }
}

class Student {
    private int hakbun;
    private String name;
    private String address;
    private String birthDate;
    private String major;
    private int professor;

    // public Student(int hakbun, String name, String address, String birthDate, String major, int professor) {
    //     // 학번, 이름, 주소, 생년월일, 학과명, 교수
    //     this.hakbun = hakbun;
    //     this.name = name;
    //     this.address = address;
    //     this.birthDate = birthDate;
    //     this.major = major;
    //     this.professor = professor;
    // }   // 매개변수가 있는 생성자

    public Student() {}

    // getter
    public int getHakbun() {
        return hakbun;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getMajor() {
        return major;
    }

    public int getProfessor() {
        return professor;
    }

    // setter
    public void setHakbun(int hakbun) {
        this.hakbun = hakbun;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setProfessor(int professor) {
        this.professor = professor;
    }

    @Override
    public String toString() {
        String fmt = "%d | %s | %s | %s | %s | %d\n";
        return String.format(fmt, hakbun, name, address, birthDate, major, professor);
    }
}

class Professor {
    private int professor;
    private String name;
    private String majorField;

//    public Professor(int professor, String name, String majorField) {
//        // 교수번호, 이름, 전공분야
//        this.professor = professor;
//        this.name = name;
//        this.majorField = majorField;
//    }

    public int getProfessor() {
        return professor;
    }

    public String getName() {
        return name;
    }

    public String getMajorField() {
        return majorField;
    }

    public void setProfessor(int professor) {
        this.professor = professor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMajorField(String majorField) {
        this.majorField = majorField;
    }

    @Override
    public String toString() {
        String fmt = "%d | %s | %s\n";
        return String.format(fmt, professor, name, majorField);
    }
}
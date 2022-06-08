package objectsource;

public class ManageStudent {
    public static void main(String[] args) {
        ManageStudent  manageStudent=new ManageStudent();
//        Student student[] =null;
//
//        student=manageStudent.addStudent();
//        manageStudent.printStudent(student);

        manageStudent.checkEquals();
    }
    public void printStudent(Student...student){
        for (Student data:student){
            System.out.println(data);
        }
    }
    //    public void printStudents(Student[] student) {
//        for(Student data:student) {
//            System.out.println(data);
//        }
    public Student[] addStudent(){ // 리턴타입이 객체배열
        Student[] student=new Student[3]; // 객체 배열 생성
        student[0] = new Student("Lim");
        student[1] = new Student("Min");
        student[2] = new Student("Sook", "Seoul", "01000000000", "google@google");
        return student;

    }

    public void checkEquals() {
        Student a = new Student("Min", "Seoul", "01011111111", "google@google.com");
        Student b = new Student("Min", "Seoul", "01011111111", "google@google.com");
        if (a.equals(b)) System.out.println("equal");
        else System.out.println("not equal");
    }
}

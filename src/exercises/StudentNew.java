package exercises;

public class StudentNew {

        private int studentId;
        private String studentName;
        private double studGpa = 0.0;
        private int studCredits = 0;

        public StudentNew(String studentName, int studentId, int studCredits, double studGpa) {
            this.studentName = studentName;
            this.studentId = studentId;
            this.studCredits = studCredits;
            this.studGpa = studGpa;
        }

        public void printStudent(StudentNew studObj){

            System.out.println("Student "+studObj.getStudentName()+ "\n"+  "Student ID " + studObj.getStudentId() + "\n"+  "Credits " +studObj.getStudCredits() + "\n" + "GPA "+ studObj.getStudGpa());

        }



        public void setStudentName(){
            this.studentName = studentName;
        }

        public void setStudentId(){
            this.studentId = studentId;
        }

        public void setStudGpa(){
            this.studGpa = studGpa;
        }

        public void setStudCredits(){
            this.studCredits = studCredits;
        }

        public String getStudentName(){
            return studentName;
        }

        public int getStudentId(){
            return studentId;
        }

        public double getStudGpa(){
            return studGpa;
        }

        public int getStudCredits(){
            return studCredits;
        }

        public static void main (String args[]){

            StudentNew nisha = new StudentNew("Nisha Banu", 1, 1, 4.0);
            System.out.println("test");
            nisha.printStudent(nisha);

        }


}



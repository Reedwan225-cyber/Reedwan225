package objects_classes.student_manager_v6_1;

    public class Student {
        public int matNumber;
        public String name;
        public String school;
        public int age;
        public double mark;

        public double getMark() {
            return mark;
        }

        public void setMark(double mark) {
            this.mark = mark;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getSchool() {
            return school;
        }

        public void setSchool(String school) {
            this.school = school;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Student(int matNumber, String name, String school, int age, double mark) {
            this.matNumber = matNumber;
            this.name = name;
            this.school = school;
            this.age = age;
            this.mark = mark;
        }

        public static void add(Student student) {
        }

        public int getMatNumber() {
            return matNumber;
        }

        public void setMatNumber(int matNumber) {
            this.matNumber = matNumber;
        }
    }


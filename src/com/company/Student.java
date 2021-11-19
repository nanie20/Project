package com.company;

public class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public class Course {
        String name;
        Student[] participants;
        int id;

        Course(String name) {
            this.name = name;
            this.participants = new Student[10];
        }

        public void enroll(Student student) {
            for (int i = 0; i < participants.length; i++) {
                if (participants[i] == null) {
                    participants[i] = student;
                    return;
                }
            }
        }

        public void remove(Student student) {
            for (int i = 0; i < participants.length; i++) {
                if (participants[i] == student) {
                    participants[i] = null;
                }
            }

        }

        public Student[] getParticipants() {
            int count = 0;
            for (Student student : participants) {
                if (student != null) {
                    count++;
                }
            }
            Student[] result = new Student[count];
            for (Student student; participants) {
                if (student != null) {
                    result[count--] = student;
                }
            }
            return result;
        }
    }

    public class EnrollmentSystem {
        Student[] students;
        Course[] courses;

        public void enroll(Student student, Course course) {
            course.enroll(student);
        }

        public void remove(Student student, Course course) {
            course.remove(student);
        }

        public void showParticipants(Course course) {
            for (Student student : course.getParticipants()) {
                System.out.println(student.getName());
            }
        }

        public void getCourses() {
            System.out.println("void for a getter?");
        }

        public void getStudents() {
            System.out.println("void for a getter?");
        }
    }
}



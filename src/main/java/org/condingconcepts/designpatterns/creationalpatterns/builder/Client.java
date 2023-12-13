package org.condingconcepts.designpatterns.creationalpatterns.builder;

public class Client {
    public static void main(String[] args) throws Exception {
        // This issue here is someone has to see the documentation to create StudentBuilder before creating the student obbject
//        StudentBuilder studentBuilder = new StudentBuilder();
//        studentBuilder.setAge(20);
//        studentBuilder.setName("Manoj");
//        studentBuilder.setPsp(92);
//        studentBuilder.setAddress("Delhi");
//        Student st = new Student(studentBuilder);


        // Student will create a StudentBuilder
        // Method chaining
        // build() Student will build its object and return , Student.getBuilder().setAge().setName().build()
        Student s = Student.getBuilder()
                .setName("Manoj")
                .setAddress("Delhi")
                .setGender("Male")
                .setPsp(92)
                .build(); // this build() method is returning Student obj.

//        Student st = new Student(null); // this has to be stop so make the constructor private

    }
}

package org.condingconcepts.designpatterns.creationalpatterns.builder;

public class Student {
    private String name;
    private String address;
    private double psp;
    private int age;
    private String gender;

    private Student(StudentBuilder sb) {
        this.name = sb.getName();
        this.age = sb.getAge();
        this.address = sb.getAddress();
        this.psp = sb.getPsp();
        this.gender = sb.getGender();
    }
    // No setter methods

    public static StudentBuilder getBuilder() {
        return new StudentBuilder();
    }

    // StudentBuilder as inner class
    public static class StudentBuilder {
        private String name;
        private String address;
        private double psp;
        private int age;
        private String gender;

        public String getName() {
            return name;
        }

        // Implementing method chaining here
        // Instead of returning void after setting attr. return the type class name
        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public String getAddress() {
            return address;
        }

        public StudentBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public StudentBuilder setPsp(double psp) {
            this.psp = psp;
            return  this;
        }

        public int getAge() {
            return age;
        }

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public StudentBuilder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public boolean validate() {
            if(name.length() > 100 || name.length() < 5) {
                return false;
            }
            if(age > 18 || psp < 90) {
                return  false;
            }
            if(address.isEmpty()) {
                return false;
            }
            return true;
        }

        public Student build() throws Exception {
            if(!this.validate()) {
                throw new Exception("Wrong parameters");
            }
            // StudentBuilder will not able to call this private constructor as well
            return new Student(this);
        }
    }
}

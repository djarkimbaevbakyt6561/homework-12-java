public class Main {
    public static void main(String[] args) {
        University university1 = new University();
        university1.setName("Kyrgyz National University");
        university1.setLocation("Bishkek, Kyrgyzstan");
        university1.setEstablishedYear(1951);

        University university2 = new University();
        university2.setName("Harvard University");
        university2.setLocation("Cambridge, Massachusetts, USA");
        university2.setEstablishedYear(1636);

        School school1 = new School();
        school1.setName("ABC School");
        school1.setType("Private");
        school1.setNumberOfStudents(500);

        School school2 = new School();
        school2.setName("Gorkii №11");
        school2.setType("Public");
        school2.setNumberOfStudents(3000);

        Car car1 = new Car();
        car1.setMake("Toyota");
        car1.setModel("Camry");
        car1.setYear(2020);

        Car car2 = new Car();
        car2.setMake("Honda");
        car2.setModel("Civic");
        car2.setYear(2019);

        Person person1 = new Person();
        person1.setName("John Doe");
        person1.setAge(30);
        person1.setGender("Male");

        Person person2 = new Person();
        person2.setName("Jane Smith");
        person2.setAge(25);
        person2.setGender("Female");

        System.out.println("University 1: " + university1.getName() + " " + university1.getLocation() + " " + university1.getEstablishedYear());
        System.out.println("University 2: " + university2.getName() + " " + university2.getLocation() + " " + university2.getEstablishedYear());
        System.out.println("School 1: " + school1.getName() + " " + school1.getType() + " " + school1.getNumberOfStudents());
        System.out.println("School 2: " + school2.getName() + " " + school2.getType() + " " + school2.getNumberOfStudents());
        System.out.println("Car 1: " + car1.getMake() + " " + car1.getModel() + " " + car1.getYear());
        System.out.println("Car 2: " + car2.getMake() + " " + car2.getModel() + " " + car2.getYear());
        System.out.println("Person 1: " + person1.getName() + " " + person1.getAge() + " " + person1.getGender());
        System.out.println("Person 2: " + person2.getName() + " " + person2.getAge() + " " + person2.getGender());
    }
}

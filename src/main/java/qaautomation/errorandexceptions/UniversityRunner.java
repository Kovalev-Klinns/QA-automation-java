package qaautomation.errorandexceptions;

import qaautomation.errorandexceptions.students.*;
import qaautomation.errorandexceptions.faculty.*;
import qaautomation.errorandexceptions.subjects.Subject;

//В университете есть несколько факультетов, в которых учатся студенты, объединенные в группы.
// У каждого студента есть несколько учебных предметов по которым он получает оценки.
//Необходимо реализовать иерархию студентов, групп и факультетов.

//Посчитать средний балл по всем предметам студента
//Посчитать средний балл по конкретному предмету в конкретной группе и на конкретном факультете
//Посчитать средний балл по предмету для всего университета

//Релизовать следующие исключения:
//Оценка ниже 0 или выше 10
//Отсутствие предметов у студента (должен быть хотя бы один)
//Отсутствие студентов в группе
//Отсутствие групп на факультете
//Отсутствие факультетов в университете

public class UniversityRunner {
    public static void main(String[] args) throws Exception {

        Student johan = new Student("Johan", new Subject[]{new Subject("Math", 7), new Subject("English", 6)});
        Student john = new Student("John", new Subject[]{new Subject("Math", 8), new Subject("Physics", 9)});
        Student samantha = new Student("Samantha", new Subject[]{new Subject("English", 8), new Subject("Philosophy", 9)});
        Student carl = new Student("Carl", new Subject[]{new Subject("Math", 4), new Subject("Physics", 9)});
        Student jane = new Student("Jane", new Subject[]{new Subject("Math", 7), new Subject("Philosophy", 8)});
        Student paul = new Student("Paul", new Subject[]{new Subject("Informatics", 7), new Subject("English", 9)});
        Student alice = new Student("Alice", new Subject[]{new Subject("Math", 9), new Subject("English", 9), new Subject("Physics", 10)});
        Student james = new Student("James", new Subject[]{new Subject("English", 8), new Subject("Philosophy", 6)});
        Student harry = new Student("Harry", new Subject[]{new Subject("Math", 6), new Subject("Informatics", 8)});
        Student sophia = new Student("Sophia", new Subject[]{new Subject("Math", 10), new Subject("English", 10)});
        Student george = new Student("George", new Subject[]{new Subject("Math", 9), new Subject("Informatics", 7)});

        System.out.println("Alice's grade point is " + alice.calculateGradePointForStudent());

        GroupOfStudents firstGroup = new GroupOfStudents(1, new Student[]{johan, paul});
        GroupOfStudents secondGroup = new GroupOfStudents(5, new Student[]{harry, sophia, george});
        GroupOfStudents thirdGroup = new GroupOfStudents(2, new Student[]{james, samantha, jane});

        System.out.println("Grade point for philosophy at third group is " + thirdGroup.calculateGradePointForGroup("Philosophy"));

        GroupOfStudents fourthGroup = new GroupOfStudents(3, new Student[]{john, carl});
        GroupOfStudents fifthGroup = new GroupOfStudents(4, new Student[]{alice});

        ComputerScienceFaculty computerScienceFaculty = new ComputerScienceFaculty(new GroupOfStudents[]{firstGroup, secondGroup});
        SociologyFaculty sociologyFaculty = new SociologyFaculty(new GroupOfStudents[]{thirdGroup});
        PhysicsFaculty physicsFaculty = new PhysicsFaculty(new GroupOfStudents[]{fourthGroup, fifthGroup});

        System.out.println("Grade point for a math at computer science faculty is " + computerScienceFaculty.calculateGradePointForFaculty("Math"));

        University university = new University(new Faculty[]{computerScienceFaculty, sociologyFaculty, physicsFaculty});
        System.out.println("Grade point for a math at university is " + university.calculateGradePointForUniversity("Math"));
    }
}


package lesson1_20211011.ExcerciseThree;

import java.lang.reflect.Type;
import java.io.*;
import java.io.FileReader;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Course {
    private String courseId;

    private String courseName;

    private String instructor;

    private String startDate;

    private Integer lessons;

    private Integer level;

    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public Integer getLessons() {
        return lessons;
    }

    public void setLessons(Integer lessons) {
        this.lessons = lessons;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public static void main(String[] args) {

        Gson gson = new Gson();

        try (Reader reader = new FileReader("src/lesson1_20211011/ExcerciseThree/data.json")) {
            Type objectType = new TypeToken<Object>() {
            }.getType();

            Object myObj = gson.fromJson(reader, objectType);

            System.out.println(myObj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

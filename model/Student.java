package model;

public class Student extends BaseClass{
    private String groupNumber; // String
    private double averagePoint; //double
    private int id;
    private Student(StudentBuilder builder){
        this.groupNumber = groupNumber;
        this.averagePoint = averagePoint;
        this.id = id;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public double getAveragePoint() {
        return averagePoint;
    }

    public int getId() {
        return id;
    }

    public static class StudentBuilder {
        private String groupNumber;
        private double averagePoint;
        private int id;
        public StudentBuilder setGroupNumber(String groupNumber){
            this.groupNumber = groupNumber;
            return this;
        }
        public StudentBuilder setaveragePoint(double averagePoint){
            this.averagePoint = averagePoint;
            return this;
        }
        public StudentBuilder setID(int id){
            this.id = id;
            return this;
        }
    }
}

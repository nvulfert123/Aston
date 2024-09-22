package model;

public class Student {
    private String groupNumber; // String
    private double averagePoint; //double
    private int id;
    private Student(Builder builder){
        this.groupNumber = groupNumber;
        this.averagePoint = averagePoint;
        this.id = id;
    }
    public static class Builder{
        private String groupNumber;
        private double averagePoint;
        private int id;
        public Builder setGroupNumber(String groupNumber){
            this.groupNumber = groupNumber;
            return this;
        }
        public Builder setaveragePoint(double averagePoint){
            this.averagePoint = averagePoint;
            return this;
        }
        public Builder setID(int id){
            this.id = id;
            return this;
        }
    }
}

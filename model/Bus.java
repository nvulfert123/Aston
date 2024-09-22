package model;


public class Bus extends BaseClass{
    private String number;
    private String model;
    private double milieage; //double
    private Bus(BusBuilder busBuilder) {
        this.number = busBuilder.number;
        this.model = busBuilder.model;
        this.milieage = busBuilder.milieage;
    }

    public String getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public double getMilieage() {
        return milieage;
    }

    public static class BusBuilder {
        private String number;
        private String model;
        private double milieage;
        public BusBuilder setNumber(String number){
            this.number = number;
            return this;
        }
        public BusBuilder setModel(String model){
            this.model = model;
            return this;
        }
        public BusBuilder setMilieage(double milieage){
            this.milieage = milieage;
            return this;
        }
        public Bus build(){
            return new Bus(this);
        }
    }
}

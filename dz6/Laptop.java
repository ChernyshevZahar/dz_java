package dz6;


public class Laptop {
    private String brand;  
    private int ram;  
    private int storage;  
    private String os;  
    private String color;  
  
    public Laptop(String brand, int ram, int storage, String os, String color) {  
        this.brand = brand;  
        this.ram = ram;  
        this.storage = storage;  
        this.os = os;  
        this.color = color;  
    }  

    public String getBrand(){
        return brand;
    }
    public int getRam(){
        return ram;
    }
    public int getStorage(){
        return storage;
    }
    public String getOs(){
        return os;
    }
    public String getColor(){
        return color;
    }

    public String toString() {  
        return "Бренд: " + brand + ", ОЗУ: " + ram + " ГБ, Объем ЖД: " + storage + " ГБ, Операционная система: " + os + ", Цвет: " + color;  
    }  
}  


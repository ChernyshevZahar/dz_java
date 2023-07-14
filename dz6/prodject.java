package dz6;

/**
 * prodject
 */
public class prodject {

    public static void main(String[] args) {
        LaptopStore store = new LaptopStore();  
        store.addLaptop(new Laptop("Lenovo", 8, 500, "Windows", "Черный"));  
        store.addLaptop(new Laptop("Apple", 16, 512, "1", "Серебристый"));  
        store.addLaptop(new Laptop("HP", 12, 1000, "Windows", "Синий"));  
  
        store.filterLaptops(); 
    }


}
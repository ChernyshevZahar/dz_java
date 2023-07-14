package dz6;

import java.util.*;


public class LaptopStore {
    private Set<Laptop> laptops;  
  
    public LaptopStore() {  
        laptops = new HashSet<>();  
    }  
  
    public void addLaptop(Laptop laptop) {  
        laptops.add(laptop);  
    }  
  
    public void filterLaptops() {  
        Scanner scanner = new Scanner(System.in);  
        Map<Integer, Object> filters = new HashMap<>();  
  
        System.out.println("Введите критерий фильтрации:\n1 - ОЗУ\n2 - Объем ЖД\n3 - Операционная система\n4 - Цвет");
        int filterChoice = scanner.nextInt();  
        scanner.nextLine();
        switch (filterChoice) {  
            case 1:  
                System.out.println("Введите минимальное значение ОЗУ (в ГБ): ");  
                int minRAM = scanner.nextInt();  
                filters.put(filterChoice, minRAM);  
                break;  
  
            case 2:  
                System.out.println("Введите минимальное значение объема ЖД (в ГБ): ");  
                int minStorage = scanner.nextInt();  
                filters.put(filterChoice, minStorage);  
                break;  
  
            case 3:  
                System.out.println("Введите операционную систему: ");  
                String os = scanner.nextLine();  
                filters.put(filterChoice, os);  
                break;  
  
            case 4:  
                System.out.println("Введите цвет: ");  
                String color = scanner.nextLine();  
                filters.put(filterChoice, color);  
                break;  
  
            default:  
                System.out.println("Неверный критерий фильтрации.");  
                return;  
            }  
            List<Laptop> filteredLaptops = new ArrayList<>();  
  
            for (Laptop laptop : laptops) {  
                boolean isMatching = true;  
    
                for (Map.Entry<Integer, Object> entry : filters.entrySet()) {  
                    int key = entry.getKey();  
                    Object value = entry.getValue();  
    
                    switch (key) {  
                        case 1:  
                            if (laptop.getRam() < (int) value) {  
                                isMatching = false;  
                            }  
                            break;  
    
                        case 2:  
                            if (laptop.getStorage() < (int) value) {  
                                isMatching = false;  
                            }  
                            break;  
    
                        case 3:  
                            if (!laptop.getOs().equalsIgnoreCase((String) value)) {  
                                isMatching = false;  
                            }  
                            break;  
    
                        case 4:  
                            if (!laptop.getColor().equalsIgnoreCase((String) value)) {  
                                isMatching = false;  
                            }  
                            break;  
    
                        default:  
                            System.out.println("Некорректный критерий фильтрации.");  
                            return;  
                    }  
                }  
    
                if (isMatching) {  
                    filteredLaptops.add(laptop);  
                }  
            }  
    
            if (filteredLaptops.isEmpty()) {  
                System.out.println("Ноутбуки, удовлетворяющие указанным условиям, не найдены.");  
            } else {  
                System.out.println("Результаты фильтрации:");  
                for (Laptop laptop : filteredLaptops) {  
                    System.out.println(laptop);  
                }  
            }  
        }  
}

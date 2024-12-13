package attestation.CORE;

import java.util.Scanner;
import java.util.Set;

public class Actions {
    public void filterLaptops(Filter filter, Set<Laptop> laptops) {
        for (Laptop laptop : laptops) {
            if (filter.getColor().equals("any") && filter.getOs().equals("any")) {
                if (filter.getRam() <= laptop.getRam() && filter.getHdd() <= laptop.getHdd()) {
                    System.out.println(laptop.toString());
                }
            } else if (filter.getColor().equals("any")) {
                if (filter.getOs().equalsIgnoreCase(laptop.getOs()) && filter.getRam() <= laptop.getRam() && filter.getHdd() <= laptop.getHdd()) {
                    System.out.println(laptop.toString());
                }
            } else if (filter.getOs().equals("any")) {
                if (filter.getColor().equalsIgnoreCase(laptop.getColor()) && filter.getRam() <= laptop.getRam() && filter.getHdd() <= laptop.getHdd()) {
                    System.out.println(laptop.toString());
                }
            } else {
                if (filter.getColor().equalsIgnoreCase(laptop.getColor()) && filter.getOs().equalsIgnoreCase(laptop.getOs()) && filter.getRam() <= laptop.getRam() && filter.getHdd() <= laptop.getHdd()) {
                    System.out.println(laptop.toString());
                }
            }

        }
    }

    public Filter switcher() {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        Filter filter = new Filter();

        while (flag) {
            mainMenu();
            try {
                int criterion = Integer.parseInt(scanner.nextLine());
                switch (criterion) {
                    case 1:
                        System.out.print("Введите минимальное значение ОЗУ (в ГБ): ");
                        filter.setRam(Integer.parseInt(scanner.nextLine()));
                        flag = true;
                        break;
                    case 2:
                        System.out.print("Введите минимальное значение объема ЖД (в ГБ): ");
                        filter.setHdd(Integer.parseInt(scanner.nextLine()));
                        flag = true;
                        break;
                    case 3:
                        System.out.print("Введите операционную систему: ");
                        String os = scanner.nextLine();
                        System.out.println(os);
                        filter.setOs(os);
                        flag = true;
                        break;
                    case 4:
                        System.out.print("Введите цвет: ");
                        String color = scanner.nextLine();
                        System.out.println(color);
                        filter.setColor(color);
                        flag = true;
                        break;
                    case 5:
                        System.out.println("Начинаем поиск!");
                        flag = false;
                        break;
                    default:
                        System.out.println("Некорректный критерий.");
                        flag = true;
                        break;
                }
            }catch (NumberFormatException e) {
                System.out.println("Очень некорректный критерий.");
                flag = true;
            }
        }
        return filter;
    }

    public void mainMenu() {
        System.out.println("------------------------------");
        System.out.print("""
                Меню поиска:
                1 - RAM
                2 - HDD
                3 - OS
                4 - COLOR
                5 - Начать поиск
                Выберите необходимое действие: """);
    }
}


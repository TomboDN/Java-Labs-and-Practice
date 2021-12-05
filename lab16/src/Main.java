import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        OrderManager orderManager = new OrderManager(1);
        int choice = 0;
        while (choice != 6){
            System.out.println("0. Создать/Пересоздать ресторан для обслуживания заказов");
            System.out.println("1. Создать интернет заказ на адрес");
            System.out.println("2. Создать заказ в ресторане на столик");
            System.out.println("3. Отобразить все интернет заказы");
            System.out.println("4. Отобразить все заказы в ресторане");
            System.out.println("5. Инфо/Редактировать/Удалить заказ");
            System.out.println("6. Выход");
            choice = new Scanner(System.in).nextInt();
            switch (choice) {
                case 0 -> {
                    int tables;
                    System.out.println("Сколько столов в ресторане?");
                    tables = new Scanner(System.in).nextInt();
                    orderManager = new OrderManager(tables);
                }
                case 1 -> {
                    InternetOrder internetOrder = new InternetOrder();
                    int orderChoice = 0;
                    while (orderChoice != 2) {
                        System.out.println("1. Добавить блюдо/напиток");
                        System.out.println("2. Завершить создание");
                        orderChoice = new Scanner(System.in).nextInt();
                        switch (orderChoice) {
                            case 1 -> {
                                int dishDrink;
                                double cost;
                                String name, desc;
                                System.out.println("Блюдо/Напиток? (1/2)");
                                dishDrink = new Scanner(System.in).nextInt();
                                System.out.println("Цена?");
                                cost = new Scanner(System.in).nextDouble();
                                System.out.println("Название?");
                                name = new Scanner(System.in).nextLine();
                                System.out.println("Описание?");
                                desc = new Scanner(System.in).nextLine();
                                if (dishDrink == 1) {
                                    Dish dish;
                                    if (cost > 0) {
                                        dish = new Dish(cost, name, desc);
                                    } else {
                                        dish = new Dish(name, desc);
                                    }
                                    internetOrder.add(dish);
                                } else {
                                    Drink drink;
                                    if (cost > 0) {
                                        drink = new Drink(cost, name, desc);
                                    } else {
                                        drink = new Drink(name, desc);
                                    }
                                    internetOrder.add(drink);
                                }
                            }
                            case 2 -> {
                            }
                        }
                    }
                    System.out.println("На какой адрес?");
                    String address;
                    address = new Scanner(System.in).nextLine();
                    orderManager.add(address, internetOrder);
                }
                case 2 -> {
                    RestaurantOrder restaurantOrder = new RestaurantOrder();
                    int orderChoice = 0;
                    while (orderChoice != 2) {
                        System.out.println("1. Добавить блюдо/напиток");
                        System.out.println("2. Завершить создание");
                        orderChoice = new Scanner(System.in).nextInt();
                        switch (orderChoice) {
                            case 1 -> {
                                int dishDrink;
                                double cost;
                                String name, desc;
                                System.out.println("Блюдо/Напиток? (1/2)");
                                dishDrink = new Scanner(System.in).nextInt();
                                System.out.println("Цена?");
                                cost = new Scanner(System.in).nextDouble();
                                System.out.println("Название?");
                                name = new Scanner(System.in).nextLine();
                                System.out.println("Описание?");
                                desc = new Scanner(System.in).nextLine();
                                if (dishDrink == 1) {
                                    Dish dish;
                                    if (cost > 0) {
                                        dish = new Dish(cost, name, desc);
                                    } else {
                                        dish = new Dish(name, desc);
                                    }
                                    restaurantOrder.add(dish);
                                } else {
                                    Drink drink;
                                    if (cost > 0) {
                                        drink = new Drink(cost, name, desc);
                                    } else {
                                        drink = new Drink(name, desc);
                                    }
                                    restaurantOrder.add(drink);
                                }
                            }
                            case 2 -> {
                            }
                        }
                    }
                    System.out.println("За какой стол?");
                    int table;
                    table = new Scanner(System.in).nextInt();
                    orderManager.add(restaurantOrder, table - 1);
                }
                case 3 -> {
                    System.out.println("Интернет заказы:");
                    System.out.println(orderManager.getInternetOrders());
                }
                case 4 -> {
                    System.out.println("Закакзы в ресторане:");
                    System.out.println(Arrays.toString(orderManager.getOrders()));
                }
                case 5 -> {
                    int taskChoice = 0;
                    while (taskChoice != 7) {
                        System.out.println("1. Получить инфо о заказе по адресу/столику");
                        System.out.println("2. Добавить блюдо/напиток в заказ по адресу/столику");
                        System.out.println("3. Удалить заказ по адресу/столику");
                        System.out.println("4. Вывести общую стоимость заказов");
                        System.out.println("5. Вывести количество заказов");
                        System.out.println("6. Вывести количество заказанных позиций данного напитка/блюда");
                        System.out.println("7. Выход");
                        taskChoice = new Scanner(System.in).nextInt();
                        switch (taskChoice) {
                            case 1 -> {
                                int addressTable;
                                System.out.println("Адрес/Столик? (1/2)");
                                addressTable = new Scanner(System.in).nextInt();
                                if (addressTable == 1) {
                                    String address;
                                    System.out.println("Введите адрес");
                                    address = new Scanner(System.in).nextLine();
                                    System.out.println(orderManager.getOrder(address));
                                } else {
                                    int table;
                                    System.out.println("Введите номер столика");
                                    table = new Scanner(System.in).nextInt();
                                    System.out.println(orderManager.getOrder(table - 1));
                                }
                            }
                            case 2 -> {
                                Item item;
                                int dishDrink;
                                double cost;
                                String name, desc;
                                System.out.println("Блюдо/Напиток? (1/2)");
                                dishDrink = new Scanner(System.in).nextInt();
                                System.out.println("Цена?");
                                cost = new Scanner(System.in).nextDouble();
                                System.out.println("Название?");
                                name = new Scanner(System.in).nextLine();
                                System.out.println("Описание?");
                                desc = new Scanner(System.in).nextLine();
                                if (dishDrink == 1) {
                                    if (cost > 0) {
                                        item = new Dish(cost, name, desc);
                                    } else {
                                        item = new Dish(name, desc);
                                    }
                                } else {
                                    if (cost > 0) {
                                        item = new Drink(cost, name, desc);
                                    } else {
                                        item = new Drink(name, desc);
                                    }
                                }
                                int addressTable;
                                System.out.println("Адрес/Столик? (1/2)");
                                addressTable = new Scanner(System.in).nextInt();
                                if (addressTable == 1) {
                                    String address;
                                    System.out.println("Введите адрес");
                                    address = new Scanner(System.in).nextLine();
                                    orderManager.addItem(address, item);
                                    orderManager.getOrder(address).setCustomer(Customer.MATURE_UNKNOWN_CUSTOMER);
                                } else {
                                    int table;
                                    System.out.println("Введите номер столика");
                                    table = new Scanner(System.in).nextInt();
                                    orderManager.addItem(item, table - 1);
                                    orderManager.getOrder(table-1).setCustomer(Customer.MATURE_UNKNOWN_CUSTOMER);
                                }
                            }
                            case 3 -> {
                                int addressTable;
                                System.out.println("Адрес/Столик? (1/2)");
                                addressTable = new Scanner(System.in).nextInt();
                                if (addressTable == 1) {
                                    String address;
                                    System.out.println("Введите адрес");
                                    address = new Scanner(System.in).nextLine();
                                    orderManager.removeOrder(address);
                                } else {
                                    int table;
                                    System.out.println("Введите номер столика");
                                    table = new Scanner(System.in).nextInt();
                                    orderManager.removeOrder(table - 1);
                                }
                            }
                            case 4 -> System.out.println(orderManager.ordersCostSummary());
                            case 5 -> System.out.println("Интернет заказов: " + orderManager.getInternetCount());
                            case 6 -> {
                                String name;
                                System.out.println("Название?");
                                name = new Scanner(System.in).nextLine();
                                System.out.println(orderManager.getInternetDefifiniteCount(name));
                            }
                            case 7 -> {
                            }
                        }
                    }
                }
                case 6 -> {
                }
            }
        }
    }
}

package hf_9.dinermerger;

public class MenuTestDrive {
    public static void main(String args[]) {
        Menu pancakeHouseMenu = new PancakeHouseMenu();
        Menu dinerMenu = new DinerMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);

        // with iterators
        waitress.printMenu();
    }

}

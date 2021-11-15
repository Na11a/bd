package view;

import controller.*;
import controller.impl.*;
import model.*;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class View {

    private static final String KEY_EXIT = "Q";
    private static final String TEXT_GO_BACK = "Go back or quit";
    private static final String TEXT_SELECT_MENU_OPTION = "Please choose menu option: ";
    private static final String ERROR_NO_SUCH_OPTION = "No such option found. Try again.";

    private static final Scanner input = new Scanner(System.in, StandardCharsets.UTF_8);

    public void show() {
        showTablesMenu();
    }

    /**
     * Show general tables MENU
     */
    private void showTablesMenu() {
        Map<String, String> tablesMenu = generateTablesMenu();
        Map<String, Printable> tablesMenuMethods = generateTablesMenuMethods();
        showMenuFromMaps(tablesMenu, tablesMenuMethods);
    }

    /**
     * Generate general tables MENU and MENU METHODS
     */
    private Map<String, String> generateTablesMenu() {
        Map<String, String> tablesMenu = new LinkedHashMap<>();
        tablesMenu.put("1", "Table: City");
        tablesMenu.put("2", "Table: Country");
        tablesMenu.put("3", "Table: CurrentInfo");
        tablesMenu.put("4", "Table: Owner");
        tablesMenu.put("5", "Table: OwnerHasStation");
        tablesMenu.put("6", "Table: Sale");
        tablesMenu.put("7", "Table: SolarPanel");
        tablesMenu.put("8", "Table: Station");

        return tablesMenu;
    }

    private Map<String, Printable> generateTablesMenuMethods() {
        Map<String, Printable> tablesMenuMethods = new LinkedHashMap<>();
        tablesMenuMethods.put("1", this::showCityMenu);
        tablesMenuMethods.put("2", this::showCountryMenu);
        tablesMenuMethods.put("3", this::showCurrentInfoMenu);
        tablesMenuMethods.put("4", this::showOwnerMenu);
        tablesMenuMethods.put("5", this::showOwnerHasStationMenu);
        tablesMenuMethods.put("6", this::showSaleMenu);
        tablesMenuMethods.put("7", this::showSolarPanelMenu);
        tablesMenuMethods.put("8", this::showStationMenu);
        return tablesMenuMethods;
    }

    /**
     * Show single table MENU
     */
    private void showCityMenu() {
        Map<String, String> menu = generateMenu();
        Map<String, Printable> menuMethods = generateCityMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showCountryMenu() {
        Map<String, String> menu = generateMenu();
        Map<String, Printable> menuMethods = generateCountryMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showCurrentInfoMenu() {
        Map<String, String> menu = generateMenu();
        Map<String, Printable> menuMethods = generateCurrentInfoMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showOwnerMenu() {
        Map<String, String> menu = generateMenu();
        Map<String, Printable> menuMethods = generateOwnerMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showOwnerHasStationMenu() {
        Map<String, String> menu = generateMenu();
        Map<String, Printable> menuMethods = generateOwnerHasStationMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showSaleMenu() {
        Map<String, String> menu = generateMenu();
        Map<String, Printable> menuMethods = generateSaleMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    private void showSolarPanelMenu() {
        Map<String, String> menu = generateMenu();
        Map<String, Printable> menuMethods = generateSolarPanelMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }
    private void showStationMenu() {
        Map<String, String> menu = generateMenu();
        Map<String, Printable> menuMethods = generateStationMenuMethods();
        showMenuFromMaps(menu, menuMethods);
    }

    /**
     * Generate single table MENU
     */
    private Map<String, String> generateMenu() {
        Map<String, String> menu = new LinkedHashMap<>();
        menu.put("1", "Select all");
        menu.put("2", "Select");
        menu.put("3", "Create");
        menu.put("4", "Update");
        menu.put("5", "Delete");
        return menu;
    }

    /**
     * Generate single table MENU METHODS
     */
    private Map<String, Printable> generateCityMenuMethods() {
        AbstractController<City, Integer> cityController = new CityControllerImpl();
        Formatter<City, Integer> formatter = new Formatter<>(City.class);
        ViewOperations<City, Integer> cityOperation = new ViewOperations<>(cityController, formatter, City.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<>();
        menuMethods.put("1", cityOperation::findAll);
        menuMethods.put("2", cityOperation::findById);
        menuMethods.put("3", cityOperation::create);
        menuMethods.put("4", cityOperation::update);
        menuMethods.put("5", cityOperation::delete);
        return menuMethods;
    }



    private Map<String, Printable> generateCountryMenuMethods() {
        AbstractController<Country, Integer> countryController = new CountryControllerImpl();
        Formatter<Country, Integer> formatter = new Formatter<>(Country.class);
        ViewOperations<Country, Integer> countryOperation = new ViewOperations<>(countryController, formatter, Country.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<>();
        menuMethods.put("1", countryOperation::findAll);
        menuMethods.put("2", countryOperation::findById);
        menuMethods.put("3", countryOperation::create);
        menuMethods.put("4", countryOperation::update);
        menuMethods.put("5", countryOperation::delete);
        return menuMethods;
    }

    private Map<String, Printable> generateCurrentInfoMenuMethods() {
        AbstractController<CurrentInfo, Integer> currentInfoController = new CurrentInfoControllerImpl();
        Formatter<CurrentInfo, Integer> formatter = new Formatter<>(CurrentInfo.class);
        ViewOperations<CurrentInfo, Integer> currentInfoOperation = new ViewOperations<>(currentInfoController, formatter, CurrentInfo.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<>();
        menuMethods.put("1", currentInfoOperation::findAll);
        menuMethods.put("2", currentInfoOperation::findById);
        menuMethods.put("3", currentInfoOperation::create);
        menuMethods.put("4", currentInfoOperation::update);
        menuMethods.put("5", currentInfoOperation::delete);
        return menuMethods;
    }

    private Map<String, Printable> generateOwnerMenuMethods() {
        AbstractController<Owner, Integer> ownerController = new OwnerControllerImpl();
        Formatter<Owner, Integer> formatter = new Formatter<>(Owner.class);
        ViewOperations<Owner, Integer> studentOperation = new ViewOperations<>(ownerController, formatter, Owner.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<>();
        menuMethods.put("1", studentOperation::findAll);
        menuMethods.put("2", studentOperation::findById);
        menuMethods.put("3", studentOperation::create);
        menuMethods.put("4", studentOperation::update);
        menuMethods.put("5", studentOperation::delete);
        return menuMethods;
    }

    private Map<String, Printable> generateOwnerHasStationMenuMethods() {
        AbstractController<OwnerHasStation, Integer> ownerHasStationController = new OwnerHasStationControllerImpl();
        Formatter<OwnerHasStation, Integer> formatter = new Formatter<>(OwnerHasStation.class);
        ViewOperations<OwnerHasStation, Integer> ownerHasStationOperation = new ViewOperations<>(ownerHasStationController, formatter, OwnerHasStation.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<>();
        menuMethods.put("1", ownerHasStationOperation::findAll);
        menuMethods.put("2", ownerHasStationOperation::findById);
        menuMethods.put("3", ownerHasStationOperation::create);
        menuMethods.put("4", ownerHasStationOperation::update);
        menuMethods.put("5", ownerHasStationOperation::delete);
        return menuMethods;
    }

    private Map<String, Printable> generateSaleMenuMethods() {
        AbstractController<Sale, Integer> saleController = new SaleControllerImpl();
        Formatter<Sale, Integer> formatter = new Formatter<>(Sale.class);
        ViewOperations<Sale, Integer> saleOperation = new ViewOperations<>(saleController, formatter, Sale.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<>();
        menuMethods.put("1", saleOperation::findAll);
        menuMethods.put("2", saleOperation::findById);
        menuMethods.put("3", saleOperation::create);
        menuMethods.put("4", saleOperation::update);
        menuMethods.put("5", saleOperation::delete);
        return menuMethods;
    }

    private Map<String, Printable> generateSolarPanelMenuMethods() {
        AbstractController<SolarPanel, Integer> solarPanelController = new SolarPanelControllerImpl();
        Formatter<SolarPanel, Integer> formatter = new Formatter<>(SolarPanel.class);
        ViewOperations<SolarPanel, Integer> solarOperation = new ViewOperations<>(solarPanelController, formatter, SolarPanel.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<>();
        menuMethods.put("1", solarOperation::findAll);
        menuMethods.put("2", solarOperation::findById);
        menuMethods.put("3", solarOperation::create);
        menuMethods.put("4", solarOperation::update);
        menuMethods.put("5", solarOperation::delete);
        return menuMethods;
    }
    private Map<String, Printable> generateStationMenuMethods() {
        AbstractController<Station, Integer> stationController = new StationControllerImpl();
        Formatter<Station, Integer> formatter = new Formatter<>(Station.class);
        ViewOperations<Station, Integer> stationOperation = new ViewOperations<>(stationController, formatter, Station.class);

        Map<String, Printable> menuMethods = new LinkedHashMap<>();
        menuMethods.put("1", stationOperation::findAll);
        menuMethods.put("2", stationOperation::findById);
        menuMethods.put("3", stationOperation::create);
        menuMethods.put("4", stationOperation::update);
        menuMethods.put("5", stationOperation::delete);
        return menuMethods;
    }
    /**
     * Show menu from Maps
     */
    private void showMenuFromMaps(Map<String, String> keyName, Map<String, Printable> keyMethod) {
        String keyMenu;
        do {
            printMenu(keyName);
            System.out.println(TEXT_SELECT_MENU_OPTION);
            keyMenu = input.nextLine().toUpperCase();
            Printable method = keyMethod.get(keyMenu);
            if (method != null) {
                method.print();
            } else if (!keyMenu.equals(KEY_EXIT)) {
                System.out.println(ERROR_NO_SUCH_OPTION);
            }
        } while (!keyMenu.equals(KEY_EXIT));
    }

    private void printMenu(Map<String, String> keyName) {
        keyName.entrySet().stream()
                .forEach(es -> System.out.printf("%3s - %s%n", es.getKey(), es.getValue()));
        System.out.printf("%3s - %s%n", KEY_EXIT, TEXT_GO_BACK);
    }
}

package screens;

import screens.androidScreen.*;


public class Screens {
    public Screens() {
    }

    private ApiDemosScreen apiDemosScreen;
    private MainScreen mainScreen;
    private PreferenceScreen preferenceScreen;
    private PreferenceDependenciesScreen preferenceDependenciesScreen;
    private SwitchScreen switchScreen;
    private ViewsScreen viewsScreen;
    private DragAndDropScreen dragAndDropScreen;
    private DateWidgetsScreen dateWidgetsScreen;
    private PopupMenuScreen popupMenuScreen;


    public PopupMenuScreen popupMenuScreen() {
        if (popupMenuScreen == null) {
            popupMenuScreen = new PopupMenuScreen();
        }
        return popupMenuScreen;
    }

    public DateWidgetsScreen dateWidgetsScreen() {
        if (dateWidgetsScreen == null) {
            dateWidgetsScreen = new DateWidgetsScreen();
        }
        return dateWidgetsScreen;
    }

    public DragAndDropScreen dragAndDropScreen() {
        if (dragAndDropScreen == null) {
            dragAndDropScreen = new DragAndDropScreen();
        }
        return dragAndDropScreen;
    }

    public ViewsScreen viewScreen() {
        if (viewsScreen == null) {
            viewsScreen = new ViewsScreen();
        }
        return viewsScreen;
    }

    public SwitchScreen switchScreen() {
        if (switchScreen == null) {
            switchScreen = new SwitchScreen();
        }
        return switchScreen;
    }


    public ApiDemosScreen apiDemosScreen() {
        if (apiDemosScreen == null) {
            apiDemosScreen = new ApiDemosScreen();
        }
        return apiDemosScreen;
    }

    public MainScreen mainScreen() {
        if (mainScreen == null) {
            mainScreen = new MainScreen();
        }
        return mainScreen;
    }

    public PreferenceScreen preferenceScreen() {
        if (preferenceScreen == null) {
            preferenceScreen = new PreferenceScreen();
        }
        return preferenceScreen;
    }

    public PreferenceDependenciesScreen preferenceDependenciesScreen() {
        if (preferenceDependenciesScreen == null) {
            preferenceDependenciesScreen = new PreferenceDependenciesScreen();
        }
        return preferenceDependenciesScreen;
    }

}
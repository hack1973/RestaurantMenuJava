package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private ArrayList<MenuItem> items;
    private Date dateModified;

    public Date getDateModified() {
        return dateModified;
    }

    public void setDateModified(Date dateModified) {
        this.dateModified = dateModified;
    }

    public Menu(ArrayList<MenuItem> aItems) {
        items = aItems;
        dateModified = new Date();
    }

    public Menu() {
        items = new ArrayList<MenuItem>();
        dateModified = new Date();
    }

    public void addMenuItem(MenuItem aMenuItem) {
        items.add(aMenuItem);
        setDateModified(new Date());
    }

    public ArrayList<MenuItem> getMenus() {
        return items;
    }

    public void setMenus(ArrayList<MenuItem> aItems) {
        items = aItems;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "items=" + items +
                ", dateModified=" + dateModified +
                '}';
    }

}

package src.ss16;

import java.util.ArrayList;
import java.util.List;

public class InventoryManager<T> {
    protected List<T> items = new ArrayList<>();

    public void add(T item) {
        items.add(item);
    }

    public boolean remove(T item) {
        return items.remove(item);
    }

    public List<T> getAll() {
        return items;
    }
}
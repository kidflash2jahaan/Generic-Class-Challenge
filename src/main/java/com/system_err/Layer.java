package com.system_err;

import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> implements Mappable {
    private final String name;
    private final List<T> elements;

    public Layer(String name, List<T> elements) {
        this.name = name;
        this.elements = new ArrayList<>(elements);
    }

    public Layer(String name) {
        this(name, List.of());
    }

    @Override
    public String map() {
        StringBuilder map = new StringBuilder(name.toUpperCase() + ":\n");
        for (T element : elements) {
            map.append("\t").append(element.map());
        }
        
        return String.valueOf(map);
    }
    
    public void addElements(List<T> elementsToAdd) {
        elements.addAll(elementsToAdd);
    }
    
    public void addElement(T elementToAdd) {
        elements.add(elementToAdd);
    }
}

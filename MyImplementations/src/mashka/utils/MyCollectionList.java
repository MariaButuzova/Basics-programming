/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mashka.utils;

import java.util.Arrays;

/**
 *
 * @author Mashka
 */
public class MyCollectionList implements ElementsList {
    
    /**
     * The size of the MyCollectionList (the number of elements it contains).
     */
    private int size;
    
    /**
     * The array buffer into which the elements of the MyCollectionList are
     * stored.
     * 
     */
    private Object[] myCollection;
    
    /**
     * Empty array instance.
     */
    private static final Object[] EMPTY_CAPACITY = {};
    
    /**
     * The maximum size of collection capacity to allocate.
     */
    private static final int MAX_CAPACITY = Integer.MAX_VALUE - 8;
        
    public MyCollectionList() {
        this.myCollection = EMPTY_CAPACITY;
        size = myCollection.length;
    }
    
    /**
     * Returns the number of elements in this list.
     * 
     * @return the number of elements in this list
     */
    @Override
    public int size() {
        return size;
    }
    
    private int addCapacity(int elementsNumber) {
        return (myCollection.length + elementsNumber);
    }
        
    /**
     * Adds an element to the end of the list.
     * 
     * @param e 
     */
    @Override
    public void add(Object e) {
        myCollection = Arrays.copyOf(myCollection, addCapacity(1));
        myCollection[size++] = e;
    }

    /**
     * Adds an element at the specified position in the list.
     * 
     * @param index
     * @param element
     */
    @Override
    public void add(int index, Object element) {
        
    }

    @Override
    public void addAll(Object[] c) {
        myCollection = Arrays.copyOf(myCollection, addCapacity(c.length));
        System.arraycopy(myCollection, 0, c, size, c.length);
        size = myCollection.length;
    }

    @Override
    public void addAll(int index, Object[] c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object remove(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void set(int index, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(myCollection, size);
    }
    

}

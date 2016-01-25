/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mashka.utils;

import java.util.Arrays;
import java.util.List;

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
     * The maximum size of the collection capacity to allocate.
     * Some VMs reserve some header words in an array.
     * Attempts to allocate larger arrays may result in
     * OutOfMemoryError: Requested array size exceeds VM limit
     */
    private static final int MAX_CAPACITY = Integer.MAX_VALUE - 8;
        
    public MyCollectionList() {
        this.myCollection = EMPTY_CAPACITY;
        this.size = myCollection.length;
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
    
    private Object[] addCapacity(int elementsNumber) {
        return (Arrays.copyOf(myCollection, myCollection.length + elementsNumber));
    }
        
    /**
     * Adds an element to the end of the list.
     * 
     * @param e 
     */
    @Override
    public void add(Object e) {
        myCollection = addCapacity(1);
        myCollection[size++] = e;
    }

    private void checkRange(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }

    private String outOfBoundsMsg(int index) {
        return ("index " + index + " is out of range [0.." + (size() - 1) + "]");
    }
    
    //should be implemented
    private void checkMaxCapacity(int currentCaracity) {
    }
    
    /**
     * Adds an element at the specified position in the list.
     * 
     * @param index
     * @param element
     */
    @Override
    public void add(int index, Object element) {
        checkRange(index);
        myCollection = addCapacity(1);
        System.arraycopy(myCollection, index, myCollection, index + 1, size() - index);
        myCollection[index] = element;
        size++;
    }

    @Override
    public void addAll(Object[] c) {
        int numAdd = c.length;
        myCollection = addCapacity(numAdd);
        System.arraycopy(c, 0, myCollection, size(), numAdd);
        size += numAdd;
    }
    
    public void addAll(List<? extends Object> list) {
        Object[] c = list.toArray();
        addAll(c);
    }

    @Override
    public void addAll(int index, Object[] c) {
        checkRange(index);
        int numAdd = c.length;
        myCollection = addCapacity(numAdd);
        System.arraycopy(myCollection, index, myCollection, index + numAdd, (index + numAdd) - size());
        System.out.println(index);
        System.arraycopy(c, 0, myCollection, index, numAdd);
        size += numAdd;
    }
    
    public void addAll(int index, List<? extends Object> list) {
        Object[] c = list.toArray();
        addAll(index, c);
    }

    @Override
    public Object get(int index) {
        checkRange(index);
        return myCollection[index];
    }

    @Override
    public Object remove(int index) {
        checkRange(index);
        Object deletedElement = myCollection[index];
        if ((size() - (index + 1)) > 0) {
            System.arraycopy(myCollection, index + 1, myCollection, index, size() - (index + 1));
        }
        Arrays.copyOf(myCollection, --size);
        return deletedElement;
    }

    @Override
    public void set(int index, Object element) {
        checkRange(index);
        myCollection[index] = element;
    }

    @Override
    public int indexOf(Object o) {
        for (int i = 0; i < myCollection.length; ++i) {
            if (myCollection[i] == o) return i;
        }
        return -1;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(myCollection, size());
    }
    
}

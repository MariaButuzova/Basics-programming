/*
 * 2016
 * 
 * 
 */
package mashka.utils;

/**
 *
 * @author Mashka
 */
public interface ElementsList {
    
    /**
     * Adds an element to the end of the list.
     * 
     * @param e 
     */
    void add(Object e);
    
    /**
     * Adds an element at the specified position in the list.
     * 
     * @param index
     * @param element
     */
    void add(int index, Object element);
    
    /**
     * Adds an array of elements to the end of the list.
     * 
     * @param c
     */
    void addAll(Object[] c);
    
    /**
     * Adds an array of elements at the specified position in the list.
     * 
     * @param index
     * @param c
     */
    void addAll(int index, Object[] c);
    
    /**
     * Returns the element at the specified position in this list.
     * 
     * @param index
     * @return
     */
    Object get(int index);
    
    /**
     * Removes the element at the specified position in this list.
     * 
     * @param index
     * @return
     */
    Object remove(int index);
    
    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     * 
     * @param index
     * @param element
     */
    void set(int index, Object element);
    
    /**
     * Returns the index of the first occurrence of the specified element
     * in this list, or -1 if this list does not contain the element.
     * 
     * @param o
     * @return
     */
    int indexOf(Object o);
    
    /**
     * Returns the number of elements in this list.  If this list contains
     * more than Integer.MAX_VALUE elements, returns Integer.MAX_VALUE.
     *
     * @return the number of elements in this list
     */
    int size();
    
    /**
     * Returns new array containing all of the elements in this list
     * in proper sequence (from first to last element).
     * 
     * @return
     */
    Object[] toArray();
}

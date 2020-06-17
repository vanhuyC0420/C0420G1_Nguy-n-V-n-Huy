package dsa_danh_sach_list.vidu_jame;

public interface MyArrayListInterface<E> {
    int INITIAL_CAPACITY = 16;

    void add(E object);

    /** Add a new element at the specified index */
    void add(int index, E e);

    /** Clear the list */
    void clear();

    /** Return true if this list contains the element */
    boolean contains(E e);

    /** Return the element at the specified index */
    E get(int index);

    /** Return the index of the first matching element 66 * in this list. Return -1 if no match. */
    int indexOf(E e);

    /** Return the index of the last matching element 75 * in this list. Return -1 if no match. */
    int lastIndexOf(E e);

    /** Remove the element at the specified position 84 * in this list.
     * Shift any subsequent elements to the left. 85 * Return the element that was removed from the list. */
    E remove(int index);

    /** Replace the element at the specified position
      *  in this list with the specified element. */
    E set(int index, E e);

    @Override
    String toString();

    void trimToSize();

    /** Override iterator() defined in Iterable */
    java.util.Iterator iterator();
}

package dsa_danh_sach_list.vidu_jame;

public abstract class MyAbstractList {
    public void add(){}

    /** Add a new element at the specified index */
    public abstract void add(int index, Object e);

    /** Clear the list */
    public abstract void clear();

    protected abstract int size();
}

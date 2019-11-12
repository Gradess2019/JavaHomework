package com.gradess.company;

/**
 * The wait list that can move any element to back of queue
 * @param <E>  type of content
 */
public class UnfairWaitList<E> extends WaitList<E> {

    @Override
    public E remove() {
        return super.remove();
    }

    public void moveToBack(E element)
    {
        E head = content.remove();
        content.add(head);
    }
}

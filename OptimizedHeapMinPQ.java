import java.util.*;

/**
 * Optimized binary heap implementation of the {@link MinPQ} interface.
 *
 * @param <E> the type of elements in this priority queue.
 * @see MinPQ
 */
public class OptimizedHeapMinPQ<E> implements MinPQ<E> {
    /**
     * {@link List} of {@link PriorityNode} objects representing the heap of element-priority pairs.
     */
    private final List<PriorityNode<E>> elements;
    /**
     * {@link Map} of each element to its associated index in the {@code elements} heap.
     */
    private final Map<E, Integer> elementsToIndex;
    private int n;

    /**
     * Constructs an empty instance.
     */
    public OptimizedHeapMinPQ() {
        //Your code is here
    }

    /**
     * Constructs an instance containing all the given elements and their priority values.
     *
     * @param elementsAndPriorities each element and its corresponding priority.
     */
    public OptimizedHeapMinPQ(Map<E, Double> elementsAndPriorities) {
        //Your code is here
    }

    @Override
    public void add(E element, double priority) {
        if (contains(element)) {
            throw new IllegalArgumentException("Already contains " + element);
        }

        //Your code is here
    }

    private void resize(int capacity) {
       //Your code is here
    }

    @Override
    public boolean contains(E element) {
//        //Your code is here
    }

    @Override
    public double getPriority(E element) {
        //Your code is here
    }

    @Override
    public E peekMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("PQ is empty");
        }
        //Your code is here
    }

    @Override
    public E removeMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("PQ is empty");
        }
        //Your code is here
    }

    @Override
    public void changePriority(E element, double priority) {
        if (!contains(element)) {
            throw new NoSuchElementException("PQ does not contain " + element);
        }
        //Your code is here
    }

    @Override
    public int size() {
        //Your code is here
    }

    private void swim(int k) {
        while(k > 1 && greater(k/2, k)) {
            swap(k/2, k);
            k = k/2;
        }
    }

    private void sink(int k) {
        while (2*k <= n) {
            int j = 2*k;
            if (j < n && greater(j, j+1)) j++;
            if(!greater(k, j)) break;
            swap(j, k);
            k = j;
        }
    }

    private boolean greater(int i, int j) {
        double eleI = elements.get(i).getPriority();
        double eleJ = elements.get(j).getPriority();
        return eleI > eleJ;
    }

    private void swap(int i, int j) {
        elementsToIndex.remove(elements.get(i).getElement());
        elementsToIndex.remove(elements.get(j).getElement());

        PriorityNode<E> swap = elements.get(i);
        elements.set(i, new PriorityNode<>(elements.get(j).getElement(), elements.get(j).getPriority()));
        elements.set(j, new PriorityNode<>(swap.getElement(), swap.getPriority()));

        elementsToIndex.put(elements.get(i).getElement(), i);
        elementsToIndex.put(elements.get(j).getElement(), j);
    }
}

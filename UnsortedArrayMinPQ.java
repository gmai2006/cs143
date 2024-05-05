import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Unsorted array (or {@link ArrayList}) implementation of the {@link MinPQ} interface.
 *
 * @param <E> the type of elements in this priority queue.
 * @see MinPQ
 */
public class UnsortedArrayMinPQ<E> implements MinPQ<E> {
    /**
     * {@link List} of {@link PriorityNode} objects representing the element-priority pairs in no specific order.
     */
    private final List<PriorityNode<E>> elements;

    /**
     * Constructs an empty instance.
     */
    public UnsortedArrayMinPQ() {
        elements = new ArrayList<>();
    }

    /**
     * Constructs an instance containing all the given elements and their priority values.
     *
     * @param elementsAndPriorities each element and its corresponding priority.
     */
    public UnsortedArrayMinPQ(Map<E, Double> elementsAndPriorities) {
        //Your code here
    }

    @Override
    public void add(E element, double priority) {
        if (contains(element)) {
            throw new IllegalArgumentException("Already contains " + element);
        }
        elements.add(new PriorityNode<>(element, priority));
    }

    @Override
    public boolean contains(E element) {
        return elements.contains(new PriorityNode<>(element, 0));
    }

    @Override
    public double getPriority(E element) {
      //Your code here
    }

    @Override
    public E peekMin() {
        if (isEmpty()) {
            throw new NoSuchElementException("PQ is empty");
        }
      //Your code here
    }

    @Override
    public E removeMin() {
       if (!contains(element)) {
            throw new NoSuchElementException("PQ does not contain " + element);
        }
      //Your code here
    }

    @Override
    public void changePriority(E element, double priority) {
        if (!contains(element)) {
            throw new NoSuchElementException("PQ does not contain " + element);
        }
//       Your code here
    }

    @Override
    public int size() {
//      Your code here
    }
}

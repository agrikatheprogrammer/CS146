Can we use heaps as priority queues? How so? Write an explanation, with the help of pseudocode/diagrams to support your explanation.

Given a max heap, is there a way to use the max heap as a min heap, without writing a whole min heap implementation? Is the opposite also true? Justify your answer with pseudocode, and/or python OR java code, and explain your answer.  


### Using Heaps as Priority Queues:

Yes, heaps can be used as priority queues. A priority queue is a data structure that maintains a set of elements, each associated with a priority, and allows efficient access to and removal of the element with the highest (or lowest) priority. Heaps are often used to implement priority queues due to their efficient operations for insertion, deletion, and retrieval of the maximum (or minimum) element.

#### Explanation:
A heap is a binary tree where each parent node has a higher priority than its children (in a max heap) or a lower priority (in a min heap). This property allows us to use heaps as priority queues by performing the following operations:

1. **Insertion**: Insert an element into the heap while maintaining the heap property (e.g., bubble-up operation for max heap or min heap).
2. **Extraction**: Extract the maximum (or minimum) element from the heap, which is always the root node.
3. **Modification**: Modify the priority of an element in the heap and adjust the heap structure accordingly.

#### Pseudocode for Using Heap as Priority Queue:

```plaintext
Max Heap:
- Insert(x): Add element x to the heap and perform bubble-up operation to maintain the heap property.
- ExtractMax(): Remove the root node (maximum element) and perform heapify-down operation to restore the heap property.
- PeekMax(): Return the maximum element without removing it.

Min Heap:
- Insert(x): Add element x to the heap and perform bubble-up operation to maintain the heap property.
- ExtractMin(): Remove the root node (minimum element) and perform heapify-down operation to restore the heap property.
- PeekMin(): Return the minimum element without removing it.
```

### Using Max Heap as Min Heap:

#### Explanation:
Although a max heap is inherently designed to maintain the maximum element at the root, we can use it as a min heap by negating the values of all elements. By negating the values, the relative ordering of elements is reversed, effectively transforming the max heap into a min heap.

#### Pseudocode for Using Max Heap as Min Heap:

```python
# Using max heap as min heap
def insert_min_heap(heap, x):
    # Insert element by negating its value
    heap.append(-x)
    bubble_up(heap, len(heap) - 1)

def extract_min(heap):
    # Extract min element (max in the original max heap)
    min_element = -heap[0]
    heap[0] = heap[-1]
    heap.pop()
    heapify_down(heap, 0)
    return min_element
```

### Using Min Heap as Max Heap:

#### Explanation:
Similarly, a min heap can be used as a max heap by negating the values of all elements. By negating the values, the relative ordering of elements is reversed, effectively transforming the min heap into a max heap.

#### Pseudocode for Using Min Heap as Max Heap:

```python
# Using min heap as max heap
def insert_max_heap(heap, x):
    # Insert element by negating its value
    heap.append(-x)
    bubble_up(heap, len(heap) - 1)

def extract_max(heap):
    # Extract max element (min in the original min heap)
    max_element = -heap[0]
    heap[0] = heap[-1]
    heap.pop()
    heapify_down(heap, 0)
    return max_element
```

### Justification:

Using a max heap as a min heap (by negating values) and vice versa provides a convenient way to reuse existing heap implementations without having to write separate implementations for both min and max heaps. By applying the negation operation appropriately, we can achieve the desired behavior while maintaining the efficiency of heap operations.

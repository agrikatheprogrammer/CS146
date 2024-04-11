## Other than speed, what other measures of efficiency might we need to consider in a real-world setting to analyze algorithms? 
Space efficiency is one which refers to the amount of memory an algorithm uses to execute. Some algorithms might be fast but consume a lot of memory, which could be a concern, especially in resource-constrained environments. Another one that comes to mind is energy efficiency which refers to the amount of power an algorithm uses during its execution; this is important because devices which algorithms run on have limited battery. Low-energy algorithms are desirable for prolonging battery life and reducing environmental impact.

## Select a data structure that you have seen, and discuss its strengths and limitations.

One data structure that I have seen: stack. 
Stacks are LIFO (last in first out) data structures.

# Strengths: 
- It is suitable for scenarios where you need to access the most recently added elements first. This property is beneficial in various algorithms and applications, such as function call management in programming languages.
- It has a few, simple operations (pop, push, peek) usually; making it easy to implement and use.
- It is efficient in usage of memory because it can be implemented using arrays or linked lists. Both implementations offer efficient memory usage. Arrays provide contiguous memory allocation, while linked lists dynamically allocate memory for each element, allowing for flexible memory management.
  
# Limitations:
- Having few, limited operations makes it not suitable for operations that require efficient insertion or deletion of elements in the middle (such as in a queue) or require random access to elements (such as in a list or array). Other data structures like queues or lists may be more appropriate for such scenarios.
- It has limited access to elements; you can only access the topmost element at any time (accessing or modifying elements in the middle of the stack (e.g., accessing the nth element from the top) requires popping off elements until the desired element is reached).
- Programmer has to be cautious about stack overflow error that can occur due to lack of available memory and excessive pushing operations.

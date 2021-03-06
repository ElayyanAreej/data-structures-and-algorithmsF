# Linked List

**Node class**
has properties for the value stored in the Node, and a pointer to the next Node.
 
**Linked List class**
* head property.
* Upon instantiation, an empty Linked List should be created.
* methods:
  + **insert**
Arguments: value
Returns: nothing
Adds a new node with that value to the head of the list with an O(1) Time performance.
  + **includes**
Arguments: value
Returns: Boolean
Indicates whether that value exists as a Node’s value somewhere within the list.
  + **to string**
Arguments: none
Returns: a string representing all the values in the Linked List, formatted as:
"{ a } -> { b } -> { c } -> NULL"

  + **append**
arguments: new value
adds a new node with the given value to the end of the list
  + **insert before**
arguments: value, new value
adds a new node with the given new value immediately before the first node that has the value specified
  + **insert after**
arguments: value, new value
adds a new node with the given new value immediately after the first node that has the value specified

  + **kth**
argument: a number, k, as a parameter.
Return the node’s value that is k places from the tail of the linked list.

## Approach & Efficiency
get more knowledge to deal with arrays and improve the way of thinking by breaking down the problem into small pieces
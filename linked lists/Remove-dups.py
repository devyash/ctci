"""
Remove Dups! Write code to remove duplicates from an unsorted linked list.
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?
Hints: #9, #40
"""


class Node(object):
    """
    simple node class to create linked list
    """
    def __init__ (self, cargo, next = None):
        self.data = cargo
        self.next = next

    def get_next (self):
        return self.next

    def set_next (self, next):
        self.next = next

    def get_data (self):
        return self.data

    def set_data (self, cargo):
        self.data = cargo


def printlist(root):
    """
    straightforward print function to traverse and print linked list
    """
    temp = root
    while temp != None:
        print(temp.data)
        temp = temp.next

# test
node6 = Node(1, None)
node5 = Node(2, node6)
node4 = Node(3, node5)
node3 = Node(3, node4)
node2 = Node(2, node3)
node1 = Node(1,node2)
head = Node(None, node1)


print("\nBefore deletion")
printlist(head)


# Setting a slow coounter pointing to the head
current_slow = head
while current_slow.next != None:
    current_fast = current_slow
    # Setting the fast counter to traverse over the list from slow pointer and do the magic :-)
    while current_fast.next != None:
        if current_slow.data == current_fast.next.data:

            # Here I'm checking if the node to be deleted is not the last node in the list
            # If so, then I set the previous node's next pointer to None.
            if current_fast.next.next != None:
                current_fast.next = current_fast.next.next
            else:
                current_fast.next = None
        else:
            current_fast = current_fast.next

    # After deletion(s), the list is checked as previous for faulty pointers
    # If so, then I set the previous node's next pointer to None.
    if current_slow.next != None:
        current_slow = current_slow.next
    else:
        break

print("\nafter deletion")
printlist(head)







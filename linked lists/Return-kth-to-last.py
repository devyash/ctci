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
    def __init__(self, cargo, next=None):
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
node6 = Node(6, None)
node5 = Node(5, node6)
node4 = Node(4, node5)
node3 = Node(3, node4)
node2 = Node(2, node3)
node1 = Node(1,node2)
head = Node(None, node1)

printlist(head)

def kthtolast(head, k):
    """
    Args: head node,
          k as the offset to the last element
    Return: Kth to the last element
    """
    fast = head
    slow = head

    count = 0
    
    while count < k:
        
        if fast.next != None:
            fast = fast.next
        else:
            return slow.data
        count += 1

    while fast.next != None:
        slow = slow.next
        fast = fast.next
    return slow.data

k = 6

print("\n" + str(k) + "th element to last is " + str(kthtolast(head, k)))

"""
Delete Middle Node: Implement an algorithm to delete a node in the middle (i.e., any node but
the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
that node.
EXAMPLE
lnput:the node c from the linked lista->b->c->d->e->f
Result: nothing is returned, but the new linked list looks like a->b->d->e- >f
Hints:#72
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


def delete_node(node):
    if node.next == None or node == None:
        # print(node.data)
        return False
    else:
        node.data = node.next.data
        node.next = node.next.next
        return True

# Here, one can pass a node to delete it, if it ain't head
# or the last node
print("\n" + str(delete_node(node4)), end="\n\n")
printlist(head)


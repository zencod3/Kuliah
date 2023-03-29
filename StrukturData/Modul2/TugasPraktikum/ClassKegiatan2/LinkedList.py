from ClassKegiatan2 import Node

class LinkedList:

    Node

    def add(self, data):
        new_node = self.Node(data)

        if self.head is None:
            self.head = new_node
        else:
            current = self.head
            while current.next is not None:
                current = current.next
            current.next = new_node

    def sort(self):
        current = self.head

        if current is None:
            return

        while current is not None:
            index = current.next
            while index is not None:
                if current.data > index.data:
                    current.data, index.data = index.data, current.data
                index = index.next
            print(current.data, end=" ")
            current = current.next
        print()

    def printList(self):
        current = self.head

        while current is not None:
            print(current.data, end=" ")
            current = current.next
        print()

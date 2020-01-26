package com.matt.belisle.commonmark.parser.inlineParsingUtil

class Node<T>(var element: T){
    private object SerialNumberObj{
        private var value = 0
        fun incrementAndGet() = value++
    }
    val serialNumber: Int = SerialNumberObj.incrementAndGet()
    var prev: Node<T>? = null
    var next:Node<T>? = null

    // for simplicity serial numbers will be used for determining equality
    override fun equals(other: Any?): Boolean {
        return other is Node<*> && other.serialNumber == serialNumber
    }
}

class DelimiterLinkedList<T> {
    var length = 0
    var head:Node<T>? = null
    private var tail:Node<T>? = null



    fun addAtHead(element: T){
        val h = this.head
        val newNode = Node(element)
        if(head == null){
            head = newNode
            tail = newNode
            this.length ++
            return
        }
        newNode.next = this.head
        head = newNode
        if (h == null) tail = newNode else h.prev = newNode
        this.length++
    }

    fun addAtTail(element: T){
        var h = this.head
        val newNode = Node(element)
        if(head == null){
            head = newNode
            tail = newNode
            this.length ++
            return
        }
        newNode.next = null
        while (h?.next != null){
            h = h.next
        }
        h?.next = newNode
        newNode.prev = h
        tail = newNode
        this.length++
    }

    fun getNode(index: Int): Any?{
        if (index >= this.length || index < 0) return -1
        var curr = 0
        var h = this.head
        while (curr < index){
            h = h?.next
            curr++
        }
        return h
    }

    fun addAtIndex(element: T, index: Int){
        if (index > this.length || index < 0) return
        if (index == 0) addAtHead(element)
        if (index == length) addAtTail(element)
        val newNode = Node(element)
        var h = this.head
        var curr = 0
        while (curr < index-1){
            h = h?.next
            curr++
        }
        val nextNode = h?.next
        newNode.next = nextNode
        nextNode?.prev = newNode
        h?.next = newNode
        newNode.prev = h
        this.length++
    }

    fun deleteAtIndex(index: Int){
        if (index >= length || index < 0) return
        var h = head
        var curr = 0
        while (curr < index){
            h = h?.next
            curr++
        }
        val hPrev = h?.prev
        val hNext = h?.next
        hPrev?.next = hNext
        hNext?.prev = hPrev
        length--
    }


    // works like substring
    fun removeBetween(first: Node<T>, end: Node<T>){
         //figure out length
        var next = first
        var number = 0
        while(next != end){
            number++
            next = next.next!!
        }
        first.next = end
        end.prev = first
        length -= number - 1
       }

    fun remove(node: Node<T>){
        node.next?.prev = node.prev
        node.prev?.next = node.next
        length--
    }
}
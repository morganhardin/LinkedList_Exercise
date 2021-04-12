public class Application
{
	public static void main(String[] args) 
	{
		LinkedList myLinkedList = new LinkedList();
        
        myLinkedList.addNode(6);
        myLinkedList.addNode(4);
        myLinkedList.addNode(2);
        myLinkedList.printNode();
        
        System.out.println();
        myLinkedList.addNode(5);
        myLinkedList.addNode(1);;
        myLinkedList.printNode();
	}

}

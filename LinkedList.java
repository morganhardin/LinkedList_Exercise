public class LinkedList 
{
	private Node front;
    private Node current;
    private Node last;
    private int count;
    private int data;
    
    public LinkedList()
    {
        count = 0;
    }
    public void addNode(int data)
    {
        Node myNode = new Node(data);
        myNode.setData(data);
        myNode.data = myNode.getData();
        
        if (last == null)
        {
            front = myNode;
            last = front;
            count++;
        }
        else
        {
            while (last.nextNode != null)
            {
                last = last.nextNode;
            }
            last.nextNode = myNode;
        }
    }
    public void printNode()
    {
        Node myNode = front;
        System.out.println(myNode.data);
        while (myNode.nextNode != null)
        {
            myNode = myNode.nextNode;
            System.out.println(myNode.data);
        }
    }
}

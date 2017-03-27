package net.data.technology.jraft;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import net.data.technology.jraft.MyQueue;

public class FTQueue {
HashMap<Integer, MyQueue> ftqueues;
public static int counter = 0;

public FTQueue()
{
	ftqueues = new HashMap<Integer, MyQueue>();
}

//Creates a new queue of integers; associates this queue with label and returns a queue id int
public int qCreate(int label)
{
	counter = counter + 1;
	MyQueue queue = new MyQueue(20, label);
	ftqueues.put(counter, queue);
	return counter;
}

//returns queue id of the queue associated with label
public int qId(int label)
{
	for(Map.Entry<Integer, MyQueue> mapentry : ftqueues.entrySet())
	{
		if(mapentry.getValue().getqueueLabel()==label)
    	   return mapentry.getKey();
    }
	return -1;
}

// Enter items in the queue
void qPush(int queue_id, int item)
{
	ftqueues.get(queue_id).queuePush(item);
}

// Removes an item from the queue
int qPop(int queue_id)
{
	return ftqueues.get(queue_id).queuePop();
}

// Returns the value of the first element in the queue
int qTop(int queue_id)
{
	return ftqueues.get(queue_id).queueTop();
}

// Returns the number of items in the queue
int qSize(int queue_id)
{
	return ftqueues.get(queue_id).queueSize();
}

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	FTQueue queues = new FTQueue();
	char ch;
    do{

        System.out.println("\nQueue Operations");
        
        System.out.println("0. qCreate");

        System.out.println("1. qId");

        System.out.println("2. qPush");

        System.out.println("3. qPop");

        System.out.println("4. qTop");

        System.out.println("5. qSize");
        
        System.out.println("6. qPrint");

        int choice = scan.nextInt();
        MyQueue currentQueue;
        switch (choice)
        {
        case 0 :
        	System.out.println("Enter the label for the queue");
        	queues.qCreate(scan.nextInt());
        	System.out.println("A queue with the entered label has been created");
        	break;
        case 1 :
        	System.out.println("Enter the label for the queue");
        	System.out.println("The id of queue is " + queues.qId(scan.nextInt()));
        	break;
        case 2 :
        	System.out.println("Enter the queue Id to select a queue");
        	currentQueue = queues.ftqueues.get(scan.nextInt());
        	System.out.println("Enter the item to push into the queue"+currentQueue.getqueueLabel());
        	currentQueue.queuePush(scan.nextInt());
        	break;
        case 3:
        	System.out.println("Enter the queue Id to select a queue");
        	currentQueue = queues.ftqueues.get(scan.nextInt());
        	System.out.println("Queue with label " + currentQueue.getqueueLabel() + "has been popped, value is  "+currentQueue.queuePop());
        	break;
        case 4:
        	System.out.println("Enter the queue Id to select a queue");
        	currentQueue = queues.ftqueues.get(scan.nextInt());
        	System.out.println("Queue with label " + currentQueue.getqueueLabel() + " has a top value of "+currentQueue.queueTop());
        	break;
        case 5:
        	System.out.println("Enter the queue Id to select a queue");
        	currentQueue = queues.ftqueues.get(scan.nextInt());
        	System.out.println("Queue with label " + currentQueue.getqueueLabel() + " has "+currentQueue.queueSize()+" elements in its queue");
        	break;
        case 6:
        	System.out.println("Enter the queue Id to select a queue");
        	currentQueue = queues.ftqueues.get(scan.nextInt());
        	currentQueue.printQueueElements();
        	break;
        default:
        	System.out.println("Wrong Entry");
        	break;            
        }
        System.out.println("\nDo you want to continue (Type y or n) \n");
        ch = scan.next().charAt(0);
        } while (ch == 'Y'|| ch == 'y');                                                        

    }    
}

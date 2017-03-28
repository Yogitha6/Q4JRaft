package net.data.technology.jraft;

import java.util.Arrays;

public class MyQueue {
private int maxSize;
private int[] queue;
private int top;
private int bottom;
private int label;
private int itemsCount;

public MyQueue(int size, int labelValue)
{
	maxSize = size;
	queue = new int[maxSize];
	top = 0;
	bottom = -1;
	label = labelValue;
	itemsCount = 0;
}

// Creates a new queue of integers; associates this queue with label and returns a queue id int
public MyQueue queueCreate(int label)
{
	MyQueue queueInstance = new MyQueue(20, label);
	//System.out.println("Queue created");
	return queueInstance;
}

// returns the label of this queue
public int getqueueLabel()
{
	return label;
}

// Enter items in the queue
void queuePush(int item)
{
	if(bottom == maxSize-1)
	{
		bottom = -1;
	}
	queue[++bottom] = item;
	itemsCount++;
}

// Removes an item from the queue
int queuePop()
{
	int temp = queue[top];
	queue[top]=0;
	top = top+1;
	if(top == maxSize)
		top = 0;
	itemsCount--;
	return temp;
}

// Returns the value of the first element in the queue
int queueTop()
{
	return queue[top];
}

// Returns the number of items in the queue
int queueSize()
{
	return itemsCount;
}

void printQueueElements()
{
	System.out.println(Arrays.toString(queue));
}
}

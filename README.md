*This repository was made for HW3 and HW4 in Open Source Development course - CSCI 4830/7000 at University of Colorado Boulder.*

# **Q4JRaft**
Q4JRaft is a distributed fault tolerant queue data structure built over java implementation of the RAFT distributed consensus algorithm - jraft. This code was written in an attempt to learn and understand RAFT algorithm in general and its implementation.
 
## Understanding RAFT
### Simple Introduction about RAFT consensus algorithm:
Consensus is a fundamental problem in fault-tolerant distributed systems. Consensus involves multiple servers agreeing on the same value to make decisions. Raft achieves consensus via an elected leader. A server in a raft cluster is either a leader, a candidate, or a follower. The leader is responsible for log replication to the followers. It regularly informs the followers of its existence by sending a heartbeat message. Each follower has a timeout (typically between 150 and 300 ms) in which it expects the heartbeat from the leader. The timeout is reset on receiving the heartbeat. If no heartbeat is received the follower changes its status to candidate and starts a new leader election.

More information about RAFT and various open source implementations can be found here: 
[Implementations](https://raft.github.io/) and 
[Complete Information](https://en.wikipedia.org/wiki/Raft_(computer_science))

### JRAFT implementation
jraft is a raft consensus implementation in java. Features supported by jraft implementation include:
1. Core Algorithm, safety is proven
2. Configure Change Support, add or remove servers one by one without limitation
3. Client Request Support
4. Urgent commit
5. Log Compaction

More information about jraft can be found [here](https://github.com/datatechnology/jraft) 

## Details on Q4JRaft
Q4JRaft was developed by extending jraft open source implementation of RAFT distributed consensus algorithm. Q4JRaft is a distributed fault-tolerant queue data structure, where the queue can be accessed normally as long as there are more than n/2 servers operational. (less than n/2 server crash failures in the system), where n is the number of operating servers.

jraft implementation provides a dmprinter example where the system constitutes of one client and 3 servers. Client can send messages and commands to the leader. Leader sends precommit messages followed by AppendEntries request and commit messages to all the folllowers. Followers on receiving messages from Leader print them on their terminals. jraft implementation by default provides implementation to 2 commands: `addsrv`, `rmsrv` to add and remove servers from the cluster. 

To develop queue data structure over jraft, we implemented more commands using which client can send requests to the leader for the following operations with the queue data structure:
1. Creation of a queue with a label
2. Retrieving Id of the queue with a given label
3. Pushing elements into the queue
4. Poping elements out of the queue
5. Retrieving the first top element in the queue
6. Obtaining the size - number of items in a queue

## Setup
Requirements: Java 1.8 is required; the following commands are for windows operating system.
1. Change the directory to Q4JRaft\setup

2. Run the `setup.bat` file – this will create 5 window terminals, where each terminal has a server running. The servers have Ids: 1,2,3,4,5 and they run on ports: 8001, 8002, 8003, 8004, 8005 respectively. Each server has a separate folder server1, server2, server3, server4, server 5 in the setup folder. These folders should have the cluster.json and config.properties files to work correctly.

3. Once all the 5 servers are up and running, you can start the client by running the following command:
`java -jar dmprinter.jar client Q4JRaft\setup\client`
Note: You need to provide the full path to the directory

4. Once the client is up and running, we can send messages – simple text messages from client by just typing the message. This message is handled by the leader server, which replicates it at all the followers.

5. To add a server to the cluster, you need to first start a server in the same folder by:
	1. First create a directory named server6 and copy the cluster.json and config.properties files from any other servers. Modify the entries with respect to server6.
	2. After creating the server6 folder, run the following command:
`java -jar dmprinter.jar server Q4JRaft\setup\server6 8006`

	3. Once server6 is up and running, you can add this server to the already existing cluster by typing the following message at the client:
`addsrv;6;tcp://localhost:9006`
	4. To remove a server from existing cluster, you can run the following command at the client:
`rmsrv:4`

6. Now to do operations on the queue you can execute the 
following commands at the client:
	1. To create a queue with label 1 `qCreate:1`
	2. To get id of the queue with label 1 `qId:1`
	3. To push items into the queue with id 1 `qPush:1;2`
	4. To pop items from the queue with Id 1 `qPop:1`
	5. To see the top items from queue with id 1 `qTop:1`
	6. To see the size of the queue with Id 1 `qSize:1`

Note: When you execute these commands, you see each server terminal printing details like creation of queue, results of push, pop, top, size etc.,

## Contacting us
The best way to contact us is by creating a new issue in the [issues section] (https://github.com/Yogitha6/Q4JRaft/issues/new). The issue tracker is used as a discussion forum. You can have a look at the existing discussions to get good insights on the code and features. You can also post a new issue for asking new questions about the code or for requesting any help.

You can also reach out to us at yogitha164@gmail.com (Less Preferred)
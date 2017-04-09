# *Contributor Orientation*

We welcome contributions to this open source project from anyone, in particular to students interested in learning distributed systems and consensus algorithms. One of the main objectives of Q4Jraft is to understand and learn about RAFT consensus algorithm. Here is some information that might be useful to everyone looking forward to becoming contributors for this project.

* [Knowledge required] (#knwoledge-required)
* [Getting started] (#getting-started)
* [Filing a Bug Report] (#filing-a-bug-report)
* [Suggesting new features] (#suggesting-new-features)
* [Roadmap for this project] (#roadmap-for-this-project)
* [Contact us] (#contact-us)

## Knowledge required
Knowledge of Java socket programming, theoretical understanding of RAFT consensus algorithm is required for anyone to be able to contribute to this project.

Good understanding of network systems, operating systems and distributed systems is an added advantage.
Here are some resources that can get you started:
1. [Computer Networking](https://www.udacity.com/course/computer-networking--ud436)
2. [Operating Systems](https://www.udacity.com/course/introduction-to-operating-systems--ud923)
3. [Distributed Systems](https://www.quora.com/Which-is-a-good-online-course-for-studying-distributed-systems-Video-lectures-preferred)

## Getting started
Contributing to an Open source software project requires you to explore and figure out things on your own using the extensive documentation available in the README file and using the comments in the code. You can also seek help from resources like Google, StackOverflow, discussions in the issues section. To become a Q4JRaft contributor, you need to start honing these skills.
Following list of tasks can help you become a contributor to this project:
1. Understanding Network systems and distributed systems basics using the above resources
2. Understanding consensus algorithms in general
3. Basic understanding of RAFT consensus algorithm
4. Basic understanding of data structures like Queues
5. Basic java programming knowledge
6. Understand what Q4Jraft is about by completely reading the README file.
7. Decide what contribution you want to make: adding new examples, providing implementation for other fault tolerant data structures, adding test cases, adding documentation etc.,
8. Set up Q4JRaft locally by going through the setup instructions from README file.
9. Create a fork of the project and make changes to the code.
10. Introduce yourself to the community with the following information:
	Issue Title: "New Contributor introduction <Your Github Name>"
	a) Link to your fork
	b) a brief description of your changes
	c) screenshot of the change you made
	d) Your actual name, email Id and a short self-intro (optional)
11. Steps for how to fix an issue is mentioned in the next section. New contributors are encouraged to pick up the issues labeled as FirstTimers (only for the first contribution)

## Filing a Bug Report
This project has a labelling convention for all the bugs. When reporting the bug, one should make sure that they understand how the labels are used, what they mean and appropriately choose one. Each bug can have multiple labels.
Following describes the naming convention:
1. Labels which start with *Exp* talk about expertise level:
	* `Exp.firstTimers`: very easy and straight forward; People new to open source development and to the project should be able to pick this (less than 3 hours of effort)
	* `Exp.Contributors`: moderate difficulty, can involve more than a few files (around 6 hours of effort)
	* `Exp.Committers`: very difficult issues, better left for senior developers
	
2. Labels which start with *Prty* talk about priority of the bug fix
	* `Prty:Urgent`: needs fix ASAP
	* `Prty:High`: needs fix in next release
	* `Prty:Medium`: marginal impact, fix can wait
	* `Prty:Low`: very little impact, minor fix and can wait
	* `Prty:0`: Not going to fix it 

3. Labels which start with *Catg* talk about the category of the issue
	* `Catg:CodeQuality` : code or design quality related issues
	* `Catg:Performance` : Bugs related to the performance of the current programs
	* `Catg:Scalability` : Bugs related to extending the program for a number of servers and clients
	* `Catg:Security` : Bugs related to security loop holes
	* `Catg:Docs` : User documentation, developer documentation or README, contribution reports
	* `Catg:Logic` : Bugs related to incorrect logic or unexpected behavior from code
	* `Catg:NewFeatures` : Proposing new features

## Suggesting new features
You can make suggestions on how this project can help people learn and use java RAFT implementation for various scenarios. To make a new feature suggestion you can create a new issue with the labels: `Catg:NewFeatures`, `Exp:Contributors` and appropriate priority level. Please have a look at the roadmap (next section) of this project and make sure the new feature suggestion aligns with the road map of this project before creating an issue for new features.

## Roadmap for this project
Following is a picture which talks about the scope and goals of this project:

![RoadmapforQ4Jraft.jpg](images/RoadMap.jpg)

## Contact us
The best way to contact us is by creating a new issue in the [issues section] (https://github.com/Yogitha6/Q4JRaft/issues/new). The issue tracker is used as a discussion forum. You can have a look at the existing discussions to get good insights on the code and features. You can also post a new issue for asking new questions about the code or for requesting any help.

You can also reach out to us at yogitha164@gmail.com (Less Preferred)

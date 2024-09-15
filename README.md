# Shine Printers - Special Print Job Management System

Project Description

Shine Printers is a multi-threaded system designed to manage special print jobs across multiple printers and computers. Each computer submits a special print job to the printers, and the system manages the print queue using a threading model. Both the computers and printers run as independent threads, and the system ensures smooth coordination between these threads to manage job submission, processing, and completion.

This project handles various thread-related problems, such as synchronization issues, deadlock prevention, and ensuring efficient print job processing across the machines.

Key Features
Multi-threading: Both printers and computers run in separate threads, with proper synchronization to avoid race conditions.
Job Queue Management: Print jobs are queued and processed by available printers in a controlled and orderly manner.
Thread Problem Handling: The system handles common thread issues, such as deadlock, by implementing mechanisms to ensure smooth operation and fair resource allocation.
Concurrency Control: Synchronization techniques are applied to manage the interaction between computers submitting jobs and printers processing them.
Getting Started
Prerequisites
Java Development Kit (JDK) 8 or higher.
An IDE or text editor such as IntelliJ IDEA, Eclipse, or Visual Studio Code for writing and running the code.
Installation
Clone the repository:

bash
Copy code
git clone https://github.com/rashG1/Shine_Printers.git
Open the project in your IDE.

Compile and run the program.

Running the Program
Computers submit special print jobs into the system.
Printers pick up jobs from the queue and process them one at a time.
The system is implemented with thread synchronization techniques to ensure that the computers and printers work concurrently without conflicts.
Code Structure
Main.java: The entry point of the program. It initializes the system, starts the threads for computers and printers, and handles job allocation.
Computer.java: Represents a computer thread that submits print jobs to the printer queue.
Printer.java: Represents a printer thread that processes print jobs from the queue.
JobQueue.java: Manages the queue of print jobs, ensuring that jobs are processed in the order they are submitted.
ThreadExceptionHandling.java: Handles thread-related issues such as deadlocks, synchronization problems, and thread interruptions.
Thread Problem Handling
The project focuses on handling several thread-related issues:

Deadlock Prevention: The system ensures that printers and computers do not enter a deadlocked state by using proper synchronization locks and ensuring fair resource sharing.
Starvation Prevention: The system avoids thread starvation, ensuring that no computer or printer thread is left waiting indefinitely for resources.
Exception Handling: The program handles exceptions related to thread interruptions and ensures the safe termination of threads when required.
Additional Information
Thread Synchronization: Synchronization mechanisms are used to manage shared resources (e.g., the print job queue) between threads, preventing race conditions and inconsistent states.
Concurrency Control: Java’s synchronized blocks and locks ensure that computers and printers do not conflict over shared resources.

THIS CODE IS PERFORMED ON NETBEANS

README for Hostel System Application


Overview
This project implements a simple Hostel System for Comsats University using Java. It evaluates student eligibility for hostel accommodation, handles payment verification, and allows students to select hostel services.

This program was developed and tested on NetBeans IDE.

Features
Eligibility Check

Verifies if the student is from Comsats University.
Ensures that the home distance is at least 10 km.
Allocates rooms only if available (priority given to 1st-semester students if rooms are full).
Payment Verification

Asks for the fee receipt to confirm payment status.
Service Selection

Offers two options for hostel services:
Luxury (includes AC, heater, study table, etc.)
Normal (basic facilities)
Room Availability

The system currently has a pre-configured number of available rooms (availableRooms).
How to Use
Run the program in NetBeans IDE.
Follow the on-screen instructions:
Enter your university name, distance from home, and semester.
If eligible, provide a fee receipt (yes/no).
If payment is verified, select your preferred service type.
The program will confirm your successful application if all conditions are met.
Prerequisites
Java Development Kit (JDK) version 8 or above.
NetBeans IDE installed on your machine.
Code Explanation
The program is structured as follows:

Main Class (HostelSystem)

Acts as the entry point and orchestrates the execution flow.
EligibilityFilter Class

Contains logic to check eligibility based on university name, distance, and room availability.
PaymentFilter Class

Simulates payment verification by asking the user for a fee receipt.
ServiceFilter Class

Provides options for hostel service selection.
How to Compile and Run
Open the project in NetBeans IDE.
Compile the program by clicking on Build (or pressing F11).
Run the program by clicking Run (or pressing F6).
Follow the console prompts for interaction.
Room for Improvements
Database Integration: Store student details and room data persistently.
GUI Implementation: Replace the console-based interface with a graphical user interface.
Dynamic Room Management: Handle real-time room allocation and deallocation.
Enhanced Payment System: Integrate payment gateways for real-world scenarios.







# Redscope
Tasks for Backend Development internship at Redscope Inc.
Submitted By: Yash Vardhan Choudhary 



TASK 1
To build a system that will create social circle for parents based on their child’s – school, section, class, society.
Parents will join the system and after entering the details they will be added in the social group.
 
 
Task 2 
We have to make  a Post table that stores the discussion posts made by a parent in a specific circle, a Reply table stores replies to posts or other replies (allowing us to build a thread structure). 
But the voting system is to be worked on.

Task 3
Kids move to new class every year.
To support this change, the parent entity can simply update the class_id and section_id. Introduce  an grade history table. A new entity can now be added then in the code base.
Then another service to update can be made to make methos like promoteChildToNextGrade() 
getGradeHistory()

Task 4
Parents should have the ability to create additional circles, such as neighbourhood bus groups, which other parents can choose to join voluntarily. We need to support a hierarchical structure for these circles and ensure they are easily discoverable, allowing other parents to find and join them

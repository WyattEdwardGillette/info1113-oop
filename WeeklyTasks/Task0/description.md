Given two teams' number of goals scored, your task is to write a java program that will determine the goal difference of a football match in Olympics 2020.

Input
The input contains two non-negative integers in every line which denotes the goals of two teams. 

Output
For each set of input, print the winning margin like "The match is won by <GoalDifference> goals". If both teams have scored equal number of goals, print "The match is a tie". If the user inputs anything other than non-negative integer, print "Bad input"


Example:  
$ java GoalDifference  
4 2  
The match is won by 2 goals  


$ java GoalDifference  
2 2  
The match is a tie  


$ java GoalDifference  
2.5 1  
Bad input  


$ java GoalDifference  
Four 2  
Bad input  

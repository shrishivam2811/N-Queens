# N-Queens
N-Queen problem, using backtracking.

# N Queens Problem
The N Queens problem is a classic problem of placing N chess queens on an NxN chessboard so that no two queens attack each other. This problem can be solved using the backtracking algorithm.

# Problem Statement
Given an integer N, the task is to place N queens on an NxN chessboard such that no two queens attack each other.

# Approach
We can solve this problem using the backtracking algorithm. The idea is to place queens one by one in different columns, starting from the leftmost column. When we place a queen in a column, we check for clashes with already placed queens. In the current column, if we find a row for which there is no clash, we mark this cell and recursively check for the next column. If we do not find any row in the current column, we backtrack and return false.

# Solution
This repository contains a solution to the N Queens problem. The solution is implemented in JAVA and can be found in the NQueen.java file. The program takes an integer n as input and outputs all possible solutions to the N Queens problem on an n x n chessboard.

# Usage
To use the program, simply compile the NQueen.java file and run the resulting executable. The program will prompt you to enter the value of n, and then output all possible solutions to the N Queens problem on an n x n chessboard.

# Complexity Analysis
The time complexity of the backtracking algorithm is O(N^2). The space complexity is O(N^2).

# References
Wikipedia - Eight queens puzzle
GeeksforGeeks - N-Queen Problem

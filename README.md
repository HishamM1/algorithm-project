# Algorithm Project

This project aims to solve two different job scheduling problems: 

## Problem A: Deadline and Profit

Given a set of N jobs where each job i has a deadline and profit associated with it. Each job takes 1 unit of time to complete, and only one job can be scheduled at a time. The objective is to maximize the profit by completing jobs before their deadlines. The output should include the number of jobs done and the maximum profit achieved.

### Example
Input:
Jobs = {(1, 4, 20), (2, 1, 10), (3, 1, 40), (4, 1, 30)}

## Problem B: Maximum Profit without Overlapping

Given a list of N jobs with their start time, end time, and the profit you can earn by doing each job. The goal is to find the maximum profit that can be earned by selecting a subset of jobs, ensuring that no two jobs overlap in time. If a job ends at time X, it is possible to start another job that starts at time X. The output should be the maximum achievable profit.

### Example
Input:
Jobs = {{1, 6, 6}, {2, 5, 5}, {5, 7, 5}, {6, 8, 3}}

## Implementation Details

The project is implemented using (Java, Python). The code will be structured into separate functions to handle each problem independently. The input will be provided either through predefined examples.

## Project Structure

- `algorithmq1.ipynb`: Jupyter notebook contains Problem A
- `schedule`: Java project contains problem b

## Instructions to Run

1. Clone the repository or download the source code files.
2. Open the project in your preferred IDE or text editor.
3. Locate the main file (e.g., `schedule/src/App.java` or `algorithmq1.ipynb`) and run it.
4. Follow the prompts or examine the predefined examples to see the output.

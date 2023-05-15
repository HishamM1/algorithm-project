### Job Scheduling 

## Problem
Given a list of jobs with their start time, end time, and corresponding profit, the task is to find the maximum profit that can be earned by selecting a subset of jobs without any overlap. If a job ends at time X, another job can be started at time X.

Input:
Jobs = {{1, 6, 6}, {2, 5, 5}, {5, 7, 5}, {6, 8, 3}}

| Start Time | End Time | Profit |
|------------|----------|--------|
|     1      |    6     |   6    |
|     2      |    5     |   5    |
|     5      |    7     |   5    |
|     6      |    8     |   3    |


## Approach
To solve this problem, we can follow the following approach:

1. Sort the jobs in ascending order based on their end times.
2. Initialize a TreeMap called `dp`, which will store the maximum profit at each job's end time.
3. Add an initial key-value pair to dp with key 0 and value 0, which means that no job is selected.
4. Iterate over each job in the sorted order:
   - Calculate the maximum profit for the current job by adding its profit with the value from the closest end time job.
   - If the calculated profit is greater than the maximum profit calculated so far, update `dp` with the current job's end time as the key and the profit as the value.
   
5. Return the maximum profit value, which is the value stored in the last entry of `dp`.

## Packages
The code imports the `TreeMap` class from the `java.util` package. `TreeMap` is a class that implements the `Map` interface in Java and provides a key-value mapping.

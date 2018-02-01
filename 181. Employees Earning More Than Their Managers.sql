# Write your MySQL query statement below
SELECT a.Name AS Employee from Employee AS a, Employee AS b WHERE a.Salary > b.Salary AND a.ManagerId = b.Id;
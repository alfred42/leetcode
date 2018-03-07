# Write your MySQL query statement below
SELECT weather.Id FROM Weather INNER JOIN Weather w WHERE DATEDIFF(weather.date, w.date) = 1 AND weather.Temperature  > w.Temperature;
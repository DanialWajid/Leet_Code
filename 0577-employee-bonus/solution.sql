select name , bonus from employee  LEFT JOIN Bonus on employee.empId=bonus.empId where bonus < 1000 OR bonus.bonus IS NULL;

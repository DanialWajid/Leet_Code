select e.name AS Employee from employee AS e join employee AS m on e.managerId = m.id where e.salary > m.salary ; 

select em.unique_id , e.name from employees as e LEFT Join EmployeeUni as em on e.id = em.id; 

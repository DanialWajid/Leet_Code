select name as Customers from Customers where id NOT IN (select customerID from orders); 

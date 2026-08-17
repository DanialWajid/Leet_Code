select customer_number from orders GROUP BY customer_number ORDER BY count(*) DESC LIMIT 1;

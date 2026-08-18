UPDATE salary
SET sex = 
CASE sex when 'm' then 'f'
ELSE 'm'
END;

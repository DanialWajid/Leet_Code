select email from person Group BY email HAVING count(email)>1;

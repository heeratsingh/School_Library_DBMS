# School_Library_DBMS
The Project is based on Netbeans IDE an MYSQL, so both of them are needed to run the project.

After installing Netbeans copy the project folder to your *C:\Users\Username\Documents\NetBeansProjects*

1. Go to www.oracle.com
2. Search for Netbeans
3. Open Java SE Downloads - Netbeans +JDK Bundle
4. Download according to your windows

After installing MYSQL community client, make sure the service is up and running

## To Import the mysql database

1. First of all open Command Prompt *(Admin)*
2. Then check if its working or not by typing "mysqldump"
	 - if it works
		 - Proceed to Step 3
	 - if it doesn't work
	   1. Go to the mysql folder and copy the address of the bin folder (it would be as follows just eg "C:\Program Files\MySQL\MySQL Server 5.1\bin")
	   2. Then open computer properties from there go to advance system setting 
	   3. Then click envoirnment variable there click on new in the below section and variable name as path and then paste the address in step a to variable value.
	   4. In cmd(Admin) again type mysql dump(congrats it has statred working)
3. Now  type as follows mysqldump -uroot -p (database name) > "(Save location)" *(remember double quotes here)*
6. Enter password 
	 - You have acheived back up for your mysql database
7. Create a datbase use it then type source the location of the backup file and remeber to use this "/" instead of this"\"
	 - An example for save location is as follows *d:/archit.sql* **(remember slashes and this eg is for both step 8 and step 5)**

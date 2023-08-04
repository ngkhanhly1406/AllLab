<?php
//load doi tuong connection
include_once("config.php");
// doc toan bo ban ghi
$result = mysqli_query($mysqli, "SELECT * FROM student ODER BY id DESC"); 
?>

<html>
    <head>
        <title>Student management</title>
    </head>
    <body>
        <a href="create.php">Add new student</a><br/><br/>

        <table with='90%' border=1>

        <tr>
            <th>Name</th> <th>Mobile</th> <th>Email</th> <th>Update</th>
        </tr>
        <?php
        while($student_data = mysqli_fetch_array($result)) {
            echo "<tr>";
            echo "<td>".$student_data['name']."</td>";
            echo "<td>".$student_data['mobile']."</td>";
            echo "<td>".$student_data['email']."</td>";
        }
        ?>
        
        </table>
    </body>
</html>
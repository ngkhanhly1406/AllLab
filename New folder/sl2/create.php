<?php
if(isset($_POST['Submit'])){
    $name = $_POST['name'];
    $email = $_POST['email'];
    $mobile = $_POST['mobile'];

    include_once("config.php");

    $result = mysqli_query($mysqli, "INSERT INTO student (name,email,mobile)
    VALUE('$name','email','$mobile')");

    echo "User added successfully";
} 
?>
<html>
    <head>
        <title>Add Student</title>
    </head>
<body>
    <a href="index.php">Go to home</a>
    <br/><br/>
    <form action="create" method="post" name="from">
        <table> width="25%" border="0">
            <tr>
                <td>Name</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Email</td>
                <td><input type="text" name="Email"></td>
            </tr>
            <tr>
                <td>Mobile</td>
                <td><input type="text" name="Mobile"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" name="Submit" value="Add"></td>
            </tr>
            

        </table>
    </form>
   
</html>
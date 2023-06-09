<?php
$x = 5;
function myTest() {
    echo "<p> Variable x inside function is: $x </p>";
} 
myTest();
echo "<p> Variable x outside function is: $x</p>";
?>


<?php
function myTest() { 
    $x = 5;
    echo "<p> Variable x inside function is: $x</p>";
} 
my Test();
echo "<p>Variable x outside function is: $x</p>";
?>


<?php 
$x = 5;
$y = 10;
function myTest(){
    global $x, $y;
    $y = $x + $y;
}

my myTest();
echo $y;
?>

<?php
$x = 5;
$y = 10;
function myTest(){
    $GLOBALS['Y'] = $GLOBALS['X'] + $GLOBALS['Y'];
} 
myTest();
echo $y;
?>

<?php
 function myTest() {
    static $x = 0;
    echo $x;
    $x++;
 }

 myTest();
 myTest();
 myTest();
?>

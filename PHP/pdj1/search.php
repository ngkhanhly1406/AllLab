<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Student Live search</title>
<style>
    body{
        font-family: Arial,  sans-serif;
    }
    /* formatting search box */
    .search-box{
        width: 300px;
        position: relative;
        display: inline-block;
        font-size: 14px;
    }
    .search-box input[type="text"]{
        height: 32px;
        padding: 5px, 10px;
        border: 1px solid #cccccc;
        font-size: 14px;
    }
    .result{
        position: absolute;
        z-index: 999;
        top: 100%;
        left: 0;
    }
    .search-box input [type="text"],.result{
        width: 100%;
        box-sizing: border-box;
    }
    /* formatting result item */
    .result p{
        margin: 0;
        padding: 7px 10px;
        border: 1px solid #cccccc;
        border-top: none;
        cursor: pointer;
    }
    .result p:hover{
        background: #f2f2f2;
    }
</style>
<script> scr="http://ajax.googleapis.com/ajax/libs/jquery/1.3.2/jquery.min.js "</script>
<script>
    $(document).ready(function(){
        $('.search-box input[type="text"]').on("keyup input", function(){
            /* get input value on change */
            var inputVal = $(this).val();
            var resultDropdown = $(this).siblings(".result");
            if(inputVal.length){
                $.get("backend.php", {term: inputVal}).done(function(data)){
                    //display the returned data in browser
                    resultDropdown.html(data);
                });
            } else{
                resultDropdown.empty();
            }
           
        });
        // set search input value on click of result item
        $(document).on("click",".result p", function({
            $(this).parents(".search-box").find('input[type="text"]').val($(this).text());
            $(this).parent(".result").empty();
        });
    });
    
</script>
</head>
<body>
    <div class="search-box">
        <input type="text" autocomplete="off" placeholder="Search Student..."/>
        <div class="result"></div>
    </div>
    
</body>
</html>
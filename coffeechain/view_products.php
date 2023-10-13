<?php

include 'components/connect.php';

if(isset($_COOKIE['user_id'])){
   $user_id = $_COOKIE['user_id'];
}else{
   setcookie('user_id', create_unique_id(), time() + 60*60*24*30);
}

if(isset($_POST['add_to_cart'])){

   $id = create_unique_id();
   $product_id = $_POST['product_id'];
   $product_id = filter_var($product_id, FILTER_SANITIZE_STRING);
   $qty = $_POST['qty'];
   $qty = filter_var($qty, FILTER_SANITIZE_STRING);
   
   $verify_cart = $conn->prepare("SELECT * FROM `cart` WHERE user_id = ? AND product_id = ?");   
   $verify_cart->execute([$user_id, $product_id]);

   $max_cart_items = $conn->prepare("SELECT * FROM `cart` WHERE user_id = ?");
   $max_cart_items->execute([$user_id]);

   if($verify_cart->rowCount() > 0){
      $warning_msg[] = 'Already added to cart!';
   }elseif($max_cart_items->rowCount() == 10){
      $warning_msg[] = 'Cart is full!';
   }else{

      $select_price = $conn->prepare("SELECT * FROM `products` WHERE id = ? LIMIT 1");
      $select_price->execute([$product_id]);
      $fetch_price = $select_price->fetch(PDO::FETCH_ASSOC);

      $insert_cart = $conn->prepare("INSERT INTO `cart`(id, user_id, product_id, price, qty) VALUES(?,?,?,?,?)");
      $insert_cart->execute([$id, $user_id, $product_id, $fetch_price['price'], $qty]);
      $success_msg[] = 'Added to cart!';
   }

}

?>

<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <title>View Products</title>

   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css">
   <link rel="stylesheet" href="css/footer.css">
   <link rel="stylesheet" href="css/style2.css">

</head>
<body>
   
<?php include 'components/header.php'; ?>

<section class="products">

   <h1 class="heading">Our <span>Menu</span></h1>

   <div class="box-container">

   <?php 
      $select_products = $conn->prepare("SELECT * FROM `products`");
      $select_products->execute();
      if($select_products->rowCount() > 0){
         while($fetch_prodcut = $select_products->fetch(PDO::FETCH_ASSOC)){
   ?>
   <form action="" method="POST" class="box">
      <a href="/chitietsp.php"><img  src="uploaded_files/<?= $fetch_prodcut['image']; ?>" class="image" alt="" ></a> 
      <h3 class="name"><?= $fetch_prodcut['name'] ?></h3>
      <input type="hidden" name="product_id" value="<?= $fetch_prodcut['id']; ?>">
      <div class="flex">
         <p class="price"><i class="fas fa-dollar-sign"></i><?= $fetch_prodcut['price'] ?></p>
         <input type="number" name="qty" required min="1" value="1" max="99" maxlength="2" class="qty">
      </div>
      <input type="submit" name="add_to_cart" value="add to cart" class="btn">
      <a href="checkout.php?get_id=<?= $fetch_prodcut['id']; ?>" class="delete-btn">buy now</a>
   </form>
   <?php
      }
   }else{
      echo '<p class="empty">no products found!</p>';
   }
   ?>

   </div>

</section>

    <section class="footer ">
        <div class="share ">
            <a href="# " class="fab fa-facebook-f "></a>
            <a href="# " class="fab fa-twitter "></a>
            <a href="# " class="fab fa-instagram "></a>
   
        </div>
        <div class="links ">
            <a href="/aboutus.php ">about</a>
            <a href="/view_products.php ">menu</a>
            <a href="/review.php ">review</a>
            <a href="/index.php ">home</a>
            <a href="/contact.php ">contact</a>
            <a href="/blogs.php ">blog</a>
        </div>
        <div class="credit ">created by <span>Nguyễn Khánh Ly</span> | all right reserved</div>
    </section>

<script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js"></script>

<script src="js/script2.js"></script>

<?php include 'components/alert.php'; ?>

</body>
</html>
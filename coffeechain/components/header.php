<header class="header">

   <section class="flex">
      <img src="/img/mani2-removebg-preview.png" alt="">

      <nav class="navbar">
         <a href="/index.php">Home</a>
         <!-- <a href="/admin_page.php"> add_product </a> -->
        
       
         <a href="view_products.php">Menu </a>
         <a href="orders.php">My orders</a>
         <?php
            $count_cart_items = $conn->prepare("SELECT * FROM `cart` WHERE user_id = ?");
            $count_cart_items->execute([$user_id]);
            $total_cart_items = $count_cart_items->rowCount();
         ?>
         <a href="shopping_cart.php" class="fas fa-shopping-cart"><span><?= $total_cart_items; ?></span></a>
      </nav>

      <div id="menu-btn" class="fas fa-bars"></div>
   </section>

</header>
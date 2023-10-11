<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">
    <link rel="stylesheet" href="css/style3.css">
</head>
<body>
<header class="header">
        <a href="#" class="logo">
            <img src="/img/mani2-removebg-preview.png" alt="">
        </a>
        <nav class="navbar">
            <a href="/index.php">Home</a>
            <a href="/aboutus.php">About</a>
            <a href="/view_products.php">Menu</a>
            <a href="/review.php">review</a>
            <a href="/blogs.php">Blog</a>
            <a href="/contact.php">Contact</a>
        </nav>
        <div class="icons">
            <div class="fas fa-search" id="search-btn"></div>
            <a href="/shopping_cart.php" class="fas fa-shopping-cart" id="cart-btn"></a>
            <div class="fas fa-bars" id="menu-btn"></div>
        </div>
        <div class="search-form">
            <input type="search" id="search-box" placeholder="search here...">
            <label for="search-box" class="fas fa-search"></label>
        </div>
        <div class="cart-items-container">
            <div class="cart-item">
                <span class="fas fa-times"></span>
                <img src="/img/main.jpg" alt="">
                <div class="content">
                    <h3>cart item 01</h3>
                    <div class="price">30.000 VND</div>
                </div>
            </div>
        </div>
        
    </header>
    <section class="home" id="home">
        <div class="content">
            
        </div>
    </section>
    <section class="contact" id="contact">
        <h1 class="heading"><span>contact </span>us</h1>
        <div class="row">
            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d5042.617805733923!2d105.72902523091017!3d21.0512937146778!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x313455d87cab2d35%3A0x446097bf85742bc5!2zSGF0ZWNvIEFwb2xsbyBYdcOibiBQaMawxqFuZw!5e0!3m2!1sen!2s!4v1694573846010!5m2!1sen!2s"
                allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade"></iframe>
            <form action="">
                <h3>get in touch</h3>
                <div class="inputBox">
                    <span class="fas fa-user"></span>
                    <input type="text" placeholder="name">
                </div>
                <div class="inputBox">
                    <span class="fas fa-envelope"></span>
                    <input type="email" placeholder="email">
                </div>
                <div class="inputBox">
                    <span class="fas fa-phone"></span>
                    <input type="text" placeholder="number">
                </div>
                <input type="submit" value="contact now" class="btn">
            </form>
        </div>
    </section>
    <section class="footer">
        <div class="share">
            <a href="#" class="fab fa-facebook-f"></a>
            <a href="#" class="fab fa-twitter"></a>
            <a href="#" class="fab fa-instagram"></a>
       
        </div>
        <div class="links ">
            <a href="/index.php ">home</a>
            <a href="/aboutus.php ">about</a>
            <a href="/view_products.php ">menu</a>
            <a href="/product.php ">products</a>
            <a href="/review.php ">review</a>
            <a href="/contact.php ">contact</a>
            <a href="/blogs.php ">blog</a>
        </div>
        <div class="credit">created by <span>Nguyễn Khánh Ly</span> | all right reserved</div>
    </section>
    <script src="js/script.js"></script>
</body>
</html>
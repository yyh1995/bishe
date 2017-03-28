<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Swiper demo</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">

    <!-- Link Swiper's CSS -->
    <link rel="stylesheet" href="common/swiper/css/swiper.min.css">

    <!-- Demo styles -->
    <style>
        html, body {
            position: relative;
            height: 100%;
        }
        body {
            background: #eee;
            font-family: Helvetica Neue, Helvetica, Arial, sans-serif;
            font-size: 14px;
            color:#000;
            margin: 0;
            padding: 0;
        }
        .swiper-container {
            width: 100%;
            height: 100%;
            background: #000;
        }
        .swiper-slide {
            font-size: 18px;
            color:#fff;
            -webkit-box-sizing: border-box;
            box-sizing: border-box;
            padding: 40px 60px;
        }
        .parallax-bg {
            position: absolute;
            left: 0;
            top: 0;
            width: 130%;
            height: 100%;
            -webkit-background-size: cover;
            background-size: cover;
            background-position: center;
        }
        .swiper-slide .title {
            font-size: 41px;
            font-weight: 300;
        }
        .swiper-slide .subtitle {
            font-size: 21px;
        }
        .swiper-slide .text {
            font-size: 14px;
            max-width: 400px;
            line-height: 1.3;
        }
    </style>

</head>

<body>
<!-- Swiper -->
<div class="swiper-container">
    <div class="parallax-bg" style="background-image:url(common/images/1.jpg)" data-swiper-parallax="-23%"></div>
    <div class="swiper-wrapper">
        <div class="swiper-slide">
            <div class="title" data-swiper-parallax="-100">Slide 1</div>
            <div class="subtitle" data-swiper-parallax="-200">Subtitle</div>
            <div class="text" data-swiper-parallax="-300">
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam dictum mattis velit, sit amet faucibus felis iaculis nec. Nulla laoreet justo vitae porttitor porttitor. Suspendisse in sem justo. Integer laoreet magna nec elit suscipit, ac laoreet nibh euismod. Aliquam hendrerit lorem at elit facilisis rutrum. Ut at ullamcorper velit. Nulla ligula nisi, imperdiet ut lacinia nec, tincidunt ut libero. Aenean feugiat non eros quis feugiat.</p>
            </div>
        </div>
        <div class="swiper-slide">
            <div class="title" data-swiper-parallax="-100">Slide 2</div>
            <div class="subtitle" data-swiper-parallax="-200">Subtitle</div>
            <div class="text" data-swiper-parallax="-300">
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam dictum mattis velit, sit amet faucibus felis iaculis nec. Nulla laoreet justo vitae porttitor porttitor. Suspendisse in sem justo. Integer laoreet magna nec elit suscipit, ac laoreet nibh euismod. Aliquam hendrerit lorem at elit facilisis rutrum. Ut at ullamcorper velit. Nulla ligula nisi, imperdiet ut lacinia nec, tincidunt ut libero. Aenean feugiat non eros quis feugiat.</p>
            </div>
        </div>
        <div class="swiper-slide">
            <div class="title" data-swiper-parallax="-100">Slide 3</div>
            <div class="subtitle" data-swiper-parallax="-200">Subtitle</div>
            <div class="text" data-swiper-parallax="-300">
                <p>Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam dictum mattis velit, sit amet faucibus felis iaculis nec. Nulla laoreet justo vitae porttitor porttitor. Suspendisse in sem justo. Integer laoreet magna nec elit suscipit, ac laoreet nibh euismod. Aliquam hendrerit lorem at elit facilisis rutrum. Ut at ullamcorper velit. Nulla ligula nisi, imperdiet ut lacinia nec, tincidunt ut libero. Aenean feugiat non eros quis feugiat.</p>
            </div>
        </div>
    </div>
    <!-- Add Pagination -->
    <div class="swiper-pagination swiper-pagination-white"></div>
    <!-- Add Navigation -->
    <div class="swiper-button-prev swiper-button-white"></div>
    <div class="swiper-button-next swiper-button-white"></div>
</div>

<!-- Swiper JS -->
<script src="common/swiper/js/swiper.min.js"></script>

<!-- Initialize Swiper -->
<script>
    var swiper = new Swiper('.swiper-container', {
        pagination: '.swiper-pagination',
        paginationClickable: true,
        nextButton: '.swiper-button-next',
        prevButton: '.swiper-button-prev',
        parallax: true,
        speed: 600,
    });
</script>
</body>
</html>
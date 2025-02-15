<!DOCTYPE html>
<html lang="id">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Valentine's Day Letter</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" rel="stylesheet">
    <link rel="stylesheet" href="css/style.css">
</head>
<body>
    <!-- Envelope -->
    <div class="envelope-wrapper" id="envelope">
        <div class="envelope">
            <div class="envelope-flap"></div>
            <div class="envelope-content">
Klik untuk membuka surat Valentine ❤️
            </div>
        </div>
    </div>

    <!-- Main Content (Carousel) -->
    <div class="main-content" id="mainContent">
        <div class="carousel-container">
            <button class="nav-button prev" onclick="navigate(-1)">
                <i class="fas fa-chevron-left"></i>
            </button>

            <div class="carousel">
                <!-- Card 1 -->
                <div class="card" style="transform: translateX(-100%)">
                    <div class="card-content">
                        <div class="sticker">🌹</div>
                        <div class="message">Happy Valentine's Day</div>
                        <div class="subtext">
Cintaku padamu seperti mawar yang mekar,<br>
semakin hari semakin indah
                        </div>
                        <div class="sticker">💝</div>
                    </div>
                </div>

                <!-- Card 2 -->
                <div class="card" style="transform: translateX(0%)">
                    <div class="card-content">
                        <div class="sticker">🎀</div>
                        <div class="message">Be My Valentine</div>
                        <div class="subtext">
Setiap detik bersamamu adalah hadiah terindah<br>
yang pernah kumiliki
        </div>
                        <div class="sticker">💖</div>
                    </div>
                </div>

                <!-- Card 3 -->
                <div class="card" style="transform: translateX(100%)">
                    <div class="card-content">
                        <div class="sticker">🕊️</div>
                        <div class="message">Love Is In The Air</div>
                        <div class="subtext">
Bersamamu, setiap hari terasa seperti<br>
hari Valentine yang penuh cinta
        </div>
                        <div class="sticker">💘</div>
                    </div>
                </div>
            </div>

            <button class="nav-button next" onclick="navigate(1)">
                <i class="fas fa-chevron-right"></i>
            </button>
        </div>
    </div>

    <script src="js/script.js"></script>
</body>
</html>
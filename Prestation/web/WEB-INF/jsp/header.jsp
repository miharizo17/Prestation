<%-- 
    Document   : header
    Created on : Jun 6, 2023, 8:54:31 AM
    Author     : Kanto
--%>

<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <meta name="description" content="">
        <meta name="author" content="">


        <!-- CSS FILES -->
        <link rel="preconnect" href="https://fonts.googleapis.com">

        <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>

        <link
            href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400&family=Sono:wght@200;300;400;500;700&display=swap"
            rel="stylesheet">

        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css">

        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/bootstrap-icons.css">

        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/owl.carousel.min.css">

        <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/owl.theme.default.min.css">

        <link href="${pageContext.request.contextPath}/assets/css/templatemo-pod-talk.css" rel="stylesheet">

        <!--
    
    TemplateMo 584 Pod Talk
    
    https://templatemo.com/tm-584-pod-talk
    
        -->
    </head>

    <body>

        <main>

            <nav class="navbar navbar-expand-lg">
                <div class="container">
                    <a class="navbar-brand me-lg-5 me-0" href="index.html">
                        <img src="${pageContext.request.contextPath}/assets/images/pod-talk-logo.png" class="logo-image img-fluid" alt="templatemo pod talk">
                    </a>

                    <form action="#" method="get" class="custom-form search-form flex-fill me-3" role="search">
                        <div class="input-group input-group-lg">
                            <input name="search" type="search" class="form-control" id="search" placeholder="Search Podcast"
                                   aria-label="Search">

                            <button type="submit" class="form-control" id="submit">
                                <i class="bi-search"></i>
                            </button>
                        </div>
                    </form>

                    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                            aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                    </button>

                    <div class="collapse navbar-collapse" id="navbarNav">
                        <ul class="navbar-nav ms-lg-auto">
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarLightDropdownMenuLink" role="button"
                                   data-bs-toggle="dropdown" aria-expanded="false">Lieu</a>

                                <ul class="dropdown-menu dropdown-menu-light" aria-labelledby="navbarLightDropdownMenuLink">
                                    <li><a class="dropdown-item" href="formAjoutLieu">Insertion</a></li>

                                    <li><a class="dropdown-item" href="listeLieu">Liste</a></li>
                                </ul>
                            </li>

                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarLightDropdownMenuLink" role="button"
                                   data-bs-toggle="dropdown" aria-expanded="false">Logistique</a>

                                <ul class="dropdown-menu dropdown-menu-light" aria-labelledby="navbarLightDropdownMenuLink">
                                    <li><a class="dropdown-item" href="formAjoutLogistique">Insertion</a></li>

                                    <li><a class="dropdown-item" href="listeLogistique">Liste</a></li>
                                </ul>
                            </li>


                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarLightDropdownMenuLink" role="button"
                                   data-bs-toggle="dropdown" aria-expanded="false">Artiste</a>

                                <ul class="dropdown-menu dropdown-menu-light" aria-labelledby="navbarLightDropdownMenuLink">
                                    <li><a class="dropdown-item" href="Actu/formAjoutArtiste">Insertion</a></li>

                                    <li><a class="dropdown-item" href="listeArtiste">Liste</a></li>
                                </ul>
                            </li>

                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarLightDropdownMenuLink" role="button"
                                   data-bs-toggle="dropdown" aria-expanded="false">Taxe</a>

                                <ul class="dropdown-menu dropdown-menu-light" aria-labelledby="navbarLightDropdownMenuLink">
                                    <li><a class="dropdown-item" href="formAjoutTaxe">Insertion</a></li>

                                    <li><a class="dropdown-item" href="listeTaxe">Liste</a></li>
                                </ul>
                            </li>

                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarLightDropdownMenuLink" role="button"
                                   data-bs-toggle="dropdown" aria-expanded="false">Sono</a>

                                <ul class="dropdown-menu dropdown-menu-light" aria-labelledby="navbarLightDropdownMenuLink">
                                    <li><a class="dropdown-item" href="formAjoutSono">Insertion</a></li>

                                    <li><a class="dropdown-item" href="listeSono">Liste</a></li>
                                </ul>
                            </li>
                            
                            <li class="nav-item dropdown">
                                <a class="nav-link dropdown-toggle" href="#" id="navbarLightDropdownMenuLink" role="button"
                                   data-bs-toggle="dropdown" aria-expanded="false">Depense</a>

                                <ul class="dropdown-menu dropdown-menu-light" aria-labelledby="navbarLightDropdownMenuLink">
                                    <li><a class="dropdown-item" href="formAjoutDepense">Insertion</a></li>

                                    <li><a class="dropdown-item" href="listeDepense">Liste</a></li>
                                </ul>
                            </li>

                        </ul>


                    </div>
                </div>
            </nav>


            <section class="hero-section">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-12 col-12">
                            <div class="text-center mb-5 pb-2">

                            </div>
                        </div>
                    </div>
            </section>

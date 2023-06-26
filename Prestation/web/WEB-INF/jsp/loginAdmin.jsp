<%-- 
    Document   : loginAdmin
    Created on : Jun 19, 2023, 1:29:33 PM
    Author     : Kanto
--%>

<jsp:include page='header.jsp'/>
<title>LoginAdmin</title>

            <section class="contact-section section-padding pt-0">
                <div class="container">
                    <div class="row">

                        <div class="col-lg-8 col-12 mx-auto">
                            <div class="section-title-wrap mb-5">
                                <h4 class="section-title">Connexion Admin</h4>
                            </div>

                            <form action="loginAdmin" method="post" class="custom-form contact-form" role="form">
                                <div class="row">
                                   

                                    <div class="col-lg-12 col-12">
                                        <div class="form-floating">
                                            <input type="text" name="nom" id="name" class="form-control"
                                                   placeholder="Nom" required="">

                                            <label for="floatingInput">Nom</label>
                                        </div>
                                        <div class="form-floating">
                                            <input type="text" name="mdp" id="name" class="form-control"
                                                   placeholder="Mot de passe" required="">
                                            <label for="floatingInput">Mot de passe</label>
                                        </div>

                                    </div>
                                    <div class="col-lg-4 col-12 ms-auto">
                                        <button type="submit" class="form-control">Connecter</button>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </section>
        </main>

<jsp:include page='footer.jsp'/>

       

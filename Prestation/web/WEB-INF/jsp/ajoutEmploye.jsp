<%-- 
    Document   : ajoutEmploye
    Created on : Jun 19, 2023, 10:05:32 PM
    Author     : Kanto
--%>

<!doctype html>
<jsp:include page='header.jsp'/>
<title>AjoutEmploye</title>

<section class="contact-section section-padding pt-0">
    <div class="container">
        <div class="row">

            <div class="col-lg-8 col-12 mx-auto">
                <div class="section-title-wrap mb-5">
                    <h4 class="section-title">Ajouter un employe</h4>
                </div>

                <form action="ajoutEmploye" method="post" class="custom-form contact-form" role="form">
                    <div class="row">
                        <div class="col-lg-6 col-md-6 col-12">
                            <div class="form-floating">
                                <input type="text" name="nom" id="name" class="form-control"
                                       placeholder="Nom" required="">

                                <label for="floatingInput">Nom</label>
                            </div>
                        </div>


                        <div class="col-lg-6 col-md-6 col-12">
                            <div class="form-floating">
                                <input type="text" name="prenom" id="name" class="form-control"
                                       placeholder="Prenom" required="">

                                <label for="floatingInput">Prenom</label>
                            </div>
                        </div>

                        <div class="col-lg-12 col-12">
                            <div class="form-floating">
                                <input type="text" name="mdp" id="name" class="form-control"
                                       placeholder="Mot de passe" required="">
                                <label for="floatingInput">Mot de passe</label>
                            </div>
                            <div class="form-floating">
                                <input type="text" name="adresse" id="name" class="form-control"
                                       placeholder="Adresse" required="">
                                <label for="floatingInput">Adresse</label>
                            </div>

                            <div class="form-floating">
                                <input type="text" name="contact" id="name" class="form-control"
                                       placeholder="Contact" required="">
                                <label for="floatingInput">Contact</label>
                            </div>

                            <div class="form-floating">
                                <select name="sexe" class="form-select" required="">
                                    <option value="femme">Femme</option>
                                    <option value="homme">Homme</option>
                                </select>
                            </div>

                        </div>
                        <div class="col-lg-4 col-12 ms-auto">
                            <button type="submit" class="form-control">Ajouter</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>
</main>

<jsp:include page='footer.jsp'/>


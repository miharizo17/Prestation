<%-- 
    Document   : tableau
    Created on : Jun 6, 2023, 8:19:23 AM
    Author     : Kanto
--%>
<jsp:include page='header.jsp'/>

<section class="contact-section section-padding pt-0">
    <div class="container">
        <div class="row">

            <div class="col-lg-8 col-12 mx-auto">
                <div class="section-title-wrap mb-5">
                    <h4 class="section-title"></h4>
                </div>

                <form action="#" method="post" class="custom-form contact-form" role="form">
                    <div class="row">
                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <select name="type" class="form-select" required="">
                                    <option>Happy</option>
                                    <option>Sad</option>
                                </select>
                            </div>
                        </div>

                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <select name="sexe" class="form-select" required="">
                                    <option>Femme</option>
                                    <option>Homme</option>
                                </select>
                            </div>
                        </div>

                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <select name="sexe" class="form-select" required="">
                                    <option>En couple</option>
                                    <option>Celibataire</option>
                                </select>
                            </div>
                        </div>


                        <div class="col-lg-4 col-12 ms-auto">
                            <button type="submit" class="form-control">Rechercher</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>

<section class="trending-podcast-section section-padding pt-0">
    <div class="container">
        <div class="row">
            <div class="form-floating">
                Page:<input type="number" name="company"  class="form-control-color"
                            placeholder="" required>
                <button type="submit" class="">Changer</button>
            </div>
            <table class="table">
                <tr>
                    <th>Nom</th>
                    <th>Prenom</th>
                </tr>
                <tr>
                    <td>Miary</td>
                    <td>Kanto</td>
                    <td><a href="#">Modifier</a></td>
                    <td><a href="#">Supprimer</a></td>
                </tr>
                <tr>
                    <td>Nathanael</td>
                    <td>Tafita</td>
                    <td><a href="#">Modifier</a></td>
                    <td><a href="#">Supprimer</a></td>
                </tr>
            </table>
        </div>
    </div>

    <div class="col-lg-4 col-12 mx-auto">
        <nav aria-label="Page navigation example">
            <ul class="pagination pagination-lg justify-content-center mt-5">
                <li class="page-item">
                    <a class="page-link" href="#" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
                <li class="page-item">
                    <a class="page-link" href="#" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
            </ul>
        </nav>
    </div>
</section>

</main>

<jsp:include page='footer.jsp'/>
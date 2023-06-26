<%-- 
    Document   : ajoutTaxe
    Created on : Jun 21, 2023, 8:24:14 AM
    Author     : Kanto
--%>

<!doctype html>
<jsp:include page='header.jsp'/>
<title>AjoutTaxe</title>

<section class="contact-section section-padding pt-0">
    <div class="container">
        <div class="row">

            <div class="col-lg-8 col-12 mx-auto">
                <div class="section-title-wrap mb-5">
                    <h4 class="section-title">Insertion taxe</h4>
                </div>

                <form action="ajoutTaxe" method="post" class="custom-form contact-form" role="form">
                    <div class="row">
                        <div class="col-lg-12 col-12">
                            <div class="form-floating">
                                <input type="number" name="taxe" id="name" class="form-control"
                                       placeholder="Taxe" required="">

                                <label for="floatingInput">Taxe</label>
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


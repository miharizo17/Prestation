<%-- 
    Document   : ajoutDepense
    Created on : Jun 19, 2023, 7:50:33 PM
    Author     : Kanto
--%>

<!doctype html>
<jsp:include page='header.jsp'/>
<title>AjoutDepense</title>

<section class="contact-section section-padding pt-0">
    <div class="container">
        <div class="row">

            <div class="col-lg-8 col-12 mx-auto">
                <div class="section-title-wrap mb-5">
                    <h4 class="section-title">Ajouter depense</h4>
                </div>

                <form action="ajoutDepense" method="post" class="custom-form contact-form" role="form">
                    <div class="row">
                        
                        <div class="col-lg-12 col-12">
                            <div class="form-floating">
                                <input type="text" name="type" id="name" class="form-control"
                                       placeholder="Type" required="">

                                <label for="floatingInput">Type</label>
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




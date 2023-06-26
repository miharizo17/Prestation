<%-- 
    Document   : insertion
    Created on : Jun 6, 2023, 8:14:15 AM
    Author     : Kanto
--%>

<!doctype html>
<jsp:include page='header.jsp'/>


<section class="contact-section section-padding pt-0">
    <div class="container">
        <div class="row">

            <div class="col-lg-8 col-12 mx-auto">
                <div class="section-title-wrap mb-5">
                    <h4 class="section-title">Insertion</h4>
                </div>

                <form action="#" method="post" class="custom-form contact-form" role="form">
                    <div class="row">
                        <div class="col-lg-6 col-md-6 col-12">
                            <div class="form-floating">
                                <select name="type" class="form-select" required="">
                                    <option>Happy</option>
                                    <option>Sad</option>
                                </select>
                            </div>
                        </div>

                        <div class="col-lg-6 col-md-6 col-12">
                            <div class="form-floating">
                                <select name="sexe" class="form-select" required="">
                                    <option>Femme</option>
                                    <option>Homme</option>
                                </select>
                            </div>
                        </div>

                        <div class="col-lg-12 col-12">
                            <div class="form-floating">
                                <input type="text" name="company" id="name" class="form-control"
                                       placeholder="Name" required="">

                                <label for="floatingInput">Company</label>
                            </div>
                            <div class="form-floating">
                                <input type="text" name="company" id="name" class="form-control"
                                       placeholder="Name" required="">
                            </div>

                            <div class="form-floating">
                                <textarea class="form-control" id="message" name="message"
                                          placeholder="Describe message here"></textarea>

                                <label for="floatingTextarea">Describe message here</label>
                            </div>

                        </div>
                        <div class="col-lg-4 col-12 ms-auto">
                            <button type="submit" class="form-control">Submit</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>
</main>

<jsp:include page='footer.jsp'/>


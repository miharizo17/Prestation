<%-- 
    Document   : card
    Created on : Jun 6, 2023, 8:19:15 AM
    Author     : Kanto
--%>
<!doctype html>
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
                                                <option>Autre</option>
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
                        <div class="col-lg-12 col-12">
                            <div class="section-title-wrap mb-5">
                                <h4 class="section-title">Liste</h4>
                            </div>
                        </div>

                        <div class="form-floating">
                            Page:<input type="number" name="company"  class="form-control-color"
                                        placeholder="" required>
                            <button type="submit" class="">Changer</button>
                        </div>

                        <div class="col-lg-4 col-12 mb-4 mb-lg-0">
                            <div class="custom-block custom-block-full">
                                <div class="custom-block-image-wrap">
                                    <a href="detail-page.html">
                                        <img src="${pageContext.request.contextPath}/assets/images/podcast/27376480_7326766.jpg" class="custom-block-image img-fluid"
                                             alt="">
                                    </a>
                                </div>

                                <div class="custom-block-info">
                                    <h5 class="mb-2">
                                        <a href="detail-page.html">
                                            Vintage Show
                                        </a>
                                    </h5>

                                    <div class="profile-block d-flex">
                                        <img src="${pageContext.request.contextPath}/assets/images/profile/woman-posing-black-dress-medium-shot.jpg"
                                             class="profile-block-image img-fluid" alt="">

                                        <p>Elsa
                                            <strong>Influencer</strong>
                                        </p>
                                    </div>

                                    <p class="mb-0">Lorem Ipsum dolor sit amet consectetur</p>

                                    <div class="custom-block-bottom d-flex justify-content-between mt-3">
                                        <a href="#" class="bi-headphones me-1">
                                            <span>100k</span>
                                        </a>

                                        <a href="#" class="bi-heart me-1">
                                            <span>2.5k</span>
                                        </a>

                                        <a href="#" class="bi-chat me-1">
                                            <span>924k</span>
                                        </a>
                                    </div>
                                </div>

                                <div class="social-share d-flex flex-column ms-auto">
                                    <a href="#" class="badge ms-auto">
                                        <i class="bi-heart"></i>
                                    </a>

                                    <a href="#" class="badge ms-auto">
                                        <i class="bi-bookmark"></i>
                                    </a>
                                </div>
                            </div>
                        </div>

                        <div class="col-lg-4 col-12 mb-4 mb-lg-0">
                            <div class="custom-block custom-block-full">
                                <div class="custom-block-image-wrap">
                                    <a href="detail-page.html">
                                        <img src="${pageContext.request.contextPath}/assets/images/podcast/27670664_7369753.jpg" class="custom-block-image img-fluid"
                                             alt="">
                                    </a>
                                </div>

                                <div class="custom-block-info">
                                    <h5 class="mb-2">
                                        <a href="detail-page.html">
                                            Vintage Show
                                        </a>
                                    </h5>

                                    <div class="profile-block d-flex">
                                        <img src="${pageContext.request.contextPath}/assets/images/profile/cute-smiling-woman-outdoor-portrait.jpg"
                                             class="profile-block-image img-fluid" alt="">

                                        <p>
                                            Taylor
                                            <img src="${pageContext.request.contextPath}/assets/images/verified.png" class="verified-image img-fluid" alt="">
                                            <strong>Creator</strong>
                                        </p>
                                    </div>

                                    <p class="mb-0">Lorem Ipsum dolor sit amet consectetur</p>

                                    <div class="custom-block-bottom d-flex justify-content-between mt-3">
                                        <a href="#" class="bi-headphones me-1">
                                            <span>100k</span>
                                        </a>

                                        <a href="#" class="bi-heart me-1">
                                            <span>2.5k</span>
                                        </a>

                                        <a href="#" class="bi-chat me-1">
                                            <span>924k</span>
                                        </a>
                                    </div>
                                </div>

                                <div class="social-share d-flex flex-column ms-auto">
                                    <a href="#" class="badge ms-auto">
                                        <i class="bi-heart"></i>
                                    </a>

                                    <a href="#" class="badge ms-auto">
                                        <i class="bi-bookmark"></i>
                                    </a>
                                </div>
                            </div>
                        </div>

                        <div class="col-lg-4 col-12">
                            <div class="custom-block custom-block-full">
                                <div class="custom-block-image-wrap">
                                    <a href="detail-page.html">
                                        <img src="${pageContext.request.contextPath}/assets/images/podcast/12577967_02.jpg" class="custom-block-image img-fluid"
                                             alt="">
                                    </a>
                                </div>

                                <div class="custom-block-info">
                                    <h5 class="mb-2">
                                        <a href="detail-page.html">
                                            Daily Talk
                                        </a>
                                    </h5>

                                    <div class="profile-block d-flex">
                                        <img src="${pageContext.request.contextPath}/assets/images/profile/handsome-asian-man-listening-music-through-headphones.jpg"
                                             class="profile-block-image img-fluid" alt="">

                                        <p>
                                            William
                                            <img src="${pageContext.request.contextPath}/assets/images/verified.png" class="verified-image img-fluid" alt="">
                                            <strong>Vlogger</strong>
                                        </p>
                                    </div>

                                    <p class="mb-0">Lorem Ipsum dolor sit amet consectetur</p>

                                    <div class="custom-block-bottom d-flex justify-content-between mt-3">
                                        <a href="#" class="bi-headphones me-1">
                                            <span>100k</span>
                                        </a>

                                        <a href="#" class="bi-heart me-1">
                                            <span>2.5k</span>
                                        </a>

                                        <a href="#" class="bi-chat me-1">
                                            <span>924k</span>
                                        </a>
                                    </div>
                                </div>

                                <div class="social-share d-flex flex-column ms-auto">
                                    <a href="#" class="badge ms-auto">
                                        <i class="bi-heart"></i>
                                    </a>

                                    <a href="#" class="badge ms-auto">
                                        <i class="bi-bookmark"></i>
                                    </a>
                                </div>
                            </div>
                        </div>

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
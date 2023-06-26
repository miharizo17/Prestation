<%-- 
    Document   : listeDepense
    Created on : Jun 19, 2023, 7:58:20 PM
    Author     : Kanto
--%>

<%@page import="java.util.*"%>
<%@ page import="model.*" %>
<% ArrayList<Depense> listDepense = (ArrayList<Depense>) request.getAttribute("listDepense");
%>
<jsp:include page='header.jsp'/>
<title>ListeDepense</title>

<section class="contact-section section-padding pt-0">
    <div class="container">
        <div class="row">

            <div class="col-lg-8 col-12 mx-auto">
                <div class="section-title-wrap mb-5">
                    <h4 class="section-title">Liste des depenses</h4>
                </div>

                <form action="#" method="post" class="custom-form contact-form" role="form">
                    <div class="row">
                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <input type="text" name="nom" id="name" class="form-control"
                                       placeholder="Nom artiste" required="">

                                <label for="floatingInput">Nom artiste</label>
                            </div>
                        </div>

                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <input type="number" name="prixMin" id="name" class="form-control"
                                       placeholder="Prix Minimum" required="">

                                <label for="floatingInput">Prix Minimum</label>
                            </div>
                        </div>

                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <input type="text" name="prixMax" id="name" class="form-control"
                                       placeholder="Prix Maximum" required="">

                                <label for="floatingInput">Prix Maximum</label>
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
                    <th>Id</th>
                    <th>Type</th>
                </tr>
                <%for (int i = 0; i < listDepense.size(); i++) {%>
                <tr>
                    <td><%= listDepense.get(i).getId()%></td>
                    <td><%= listDepense.get(i).getType()%></td>
                    <td><a href="deleteArtiste?id=<%= listDepense.get(i).getId()%>">Supprimer</a></td>
                    <td><a href="formModifArtiste?idModif=<%= listDepense.get(i).getId()%>">Modifier</a></td>
                </tr>
                <%}%>
            </table>
        </div>
    </div>

    <% int limit = (Integer) request.getAttribute("limit");
        int offset = (Integer) request.getAttribute("offset");
    %>

    <div class="col-lg-4 col-12 mx-auto">
        <nav aria-label="Page navigation example">
            <ul class="pagination pagination-lg justify-content-center mt-5">
                <%if (offset > 0) {%>
                <li class="page-item">
                    <a class="page-link" href="listeDepense?offset=<%= offset - limit%>&limit=<%= limit%>" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
                <%} %>
                <%if (listDepense.size() == limit) {%>
                <li class="page-item">
                    <a class="page-link" href="listeDepense?offset=<%= offset + limit%>&limit=<%= limit%>" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                    </a>
                </li>
                <%}%>
            </ul>
        </nav>
    </div>
</section>

</main>

<jsp:include page='footer.jsp'/>

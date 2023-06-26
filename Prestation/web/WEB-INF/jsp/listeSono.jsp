<%-- 
    Document   : listeSono
    Created on : Jun 19, 2023, 4:41:24 PM
    Author     : Kanto
--%>

<%@page import="java.util.*"%>
<%@ page import="model.*" %>
<% ArrayList<V_sono> listeSono = (ArrayList<V_sono>) request.getAttribute("listeSono");
 ArrayList<Typesonorisation> listType = (ArrayList<Typesonorisation>) request.getAttribute("listType");
%>
<jsp:include page='header.jsp'/>
<title>ListeSono</title>

<section class="contact-section section-padding pt-0">
    <div class="container">
        <div class="row">

            <div class="col-lg-8 col-12 mx-auto">
                <div class="section-title-wrap mb-5">
                    <h4 class="section-title">Liste des sonorisations</h4>
                </div>

                <form action="#" method="post" class="custom-form contact-form" role="form">
                    <div class="row">
                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <select name="type" class="form-select" required="">
                                    <%for (int i = 0; i < listType.size(); i++) {%>
                                    <option value="<%= listType.get(i).getId()%>"><%= listType.get(i).getType()%></option>
                                    <%}%>
                                </select>
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
                    <th>Type sonorisation</th>
                    <th>Tarif</th>
                </tr>
                <%for (int i = 0; i < listeSono.size(); i++) {%>
                <tr>
                    <td><%= listeSono.get(i).getType()%></td>
                    <td><%= listeSono.get(i).getTarif()%></td>
                    <td><a href="deleteArtiste?id=<%= listeSono.get(i).getId()%>">Supprimer</a></td>
                    <td><a href="formModifArtiste?idModif=<%= listeSono.get(i).getId()%>">Modifier</a></td>
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
                    <a class="page-link" href="listeArtiste?offset=<%= offset - limit%>&limit=<%= limit%>" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
                <%} %>
                <%if (listeSono.size() == limit) {%>
                <li class="page-item">
                    <a class="page-link" href="listeArtiste?offset=<%= offset + limit%>&limit=<%= limit%>" aria-label="Next">
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
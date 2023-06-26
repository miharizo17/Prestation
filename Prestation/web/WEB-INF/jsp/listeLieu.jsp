<%-- 
    Document   : listeLieu
    Created on : Jun 19, 2023, 9:04:13 PM
    Author     : Kanto
--%>

<%@page import="java.util.*"%>
<%@ page import="model.*" %>
<% ArrayList<V_lieu> listLieu = (ArrayList<V_lieu>) request.getAttribute("listLieu");
%>
<jsp:include page='header.jsp'/>
<title>ListeLieu</title>

<section class="contact-section section-padding pt-0">
    <div class="container">
        <div class="row">

            <div class="col-lg-8 col-12 mx-auto">
                <div class="section-title-wrap mb-5">
                    <h4 class="section-title">Liste des lieux</h4>
                </div>

                <form action="#" method="post" class="custom-form contact-form" role="form">
                    <div class="row">
                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <input type="text" name="nom" id="name" class="form-control"
                                       placeholder="Nom lieu" required="">

                                <label for="floatingInput">Nom lieu</label>
                            </div>
                        </div>

                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <select name="type" class="form-select" required="">
                                    <option>Espace</option>
                                    <option>Terrain</option>
                                </select>
                            </div>
                        </div>

                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <select name="ville" class="form-select" required="">
                                    <option>Ilafy</option>
                                    <option>Analakely</option>
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
                    <th>Image</th>
                    <th>Nom</th>
                    <th>Ville</th>
                    <th>Type</th>
                    
                </tr>
                <%for (int i = 0; i < listLieu.size(); i++) {%>
                <tr>
                    <td> <img src="${pageContext.request.contextPath}/assets/<%=listLieu.get(i).getSary() %>" width="100px" height="100px" ></td>
                    <td><%= listLieu.get(i).getNom()%></td>
                    <td><%= listLieu.get(i).getVille()%></td>
                     <td><%= listLieu.get(i).getType()%></td>
                     
                    <td><a href="deleteArtiste?id=<%= listLieu.get(i).getId()%>">Supprimer</a></td>
                    <td><a href="formModifArtiste?idModif=<%= listLieu.get(i).getId()%>">Modifier</a></td>
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
                    <a class="page-link" href="listeLieu?offset=<%= offset - limit%>&limit=<%= limit%>" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
                <%} %>
                <%if (listLieu.size() == limit) {%>
                <li class="page-item">
                    <a class="page-link" href="listeLieu?offset=<%= offset + limit%>&limit=<%= limit%>" aria-label="Next">
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

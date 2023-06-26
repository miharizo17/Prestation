<%-- 
    Document   : listePrestationDevis
    Created on : Jun 21, 2023, 10:28:51 AM
    Author     : Kanto
--%>

<%@page import="java.util.*"%>
<%@ page import="model.*" %>
<% ArrayList<V_prestationdevis> listPrestation = (ArrayList<V_prestationdevis>) request.getAttribute("listPrestation");
%>
<jsp:include page='header.jsp'/>
<title>ListePrestationDevis</title>

<section class="contact-section section-padding pt-0">
    <div class="container">
        <div class="row">

            <div class="col-lg-8 col-12 mx-auto">
                <div class="section-title-wrap mb-5">
                    <h4 class="section-title">Liste des devis</h4>
                </div>

               
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
                    <th>Type logistique</th>
                    <th>Tarif</th>
                </tr>
                <%for (int i = 0; i < listPrestation.size(); i++) {%>
                <tr>
                    <td><%= listPrestation.get(i).getType()%></td>
                    <td><%= listPrestation.get(i).getTarif()%></td>
                    <td><a href="deleteArtiste?id=<%= listPrestation.get(i).getId()%>">Supprimer</a></td>
                    <td><a href="formModifArtiste?idModif=<%= listPrestation.get(i).getId()%>">Modifier</a></td>
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
                <%if (listLogistique.size() == limit) {%>
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
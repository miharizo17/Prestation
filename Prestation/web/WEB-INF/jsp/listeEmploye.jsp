<%-- 
    Document   : listeEmploye
    Created on : Jun 19, 2023, 10:22:33 PM
    Author     : Kanto
--%>
<%@page import="java.util.*"%>
<%@ page import="model.*" %>
<% ArrayList<Employe> listEmploye = (ArrayList<Employe>) request.getAttribute("listEmploye");
%>
<jsp:include page='header.jsp'/>
<title>ListeEmploye</title>
<section class="contact-section section-padding pt-0">
    <div class="container">
        <div class="row">

            <div class="col-lg-8 col-12 mx-auto">
                <div class="section-title-wrap mb-5">
                    <h4 class="section-title">Liste des employes</h4>
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
                    <th>Nom Prenom(s)</th>
                    <th>Contact</th>
                    <th>Adresse</th>
                </tr>
                <%for(int i=0;i<listEmploye.size();i++) {%>
                <tr>
                    <td><%= listEmploye.get(i).getNom()%> <%= listEmploye.get(i).getPrenom()%></td>
                    <td><%= listEmploye.get(i).getContact()%></td>
                    <td><%= listEmploye.get(i).getAdresse()%></td>
                    <td><a href="#">Modifier</a></td>
                    <td><a href="#">Supprimer</a></td>
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
                    <a class="page-link" href="listeEmploye?offset=<%= offset - limit%>&limit=<%= limit%>" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                    </a>
                </li>
                <%} %>
                <%if (listEmploye.size() == limit) {%>
                <li class="page-item">
                    <a class="page-link" href="listeEmploye?offset=<%= offset + limit%>&limit=<%= limit%>" aria-label="Next">
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

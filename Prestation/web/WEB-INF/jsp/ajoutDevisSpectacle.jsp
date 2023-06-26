<%-- 
    Document   : ajoutDevisSpectacle
    Created on : Jun 20, 2023, 1:12:07 AM
    Author     : Kanto
--%>
<%@page import="java.util.*"%>
<%@ page import="model.*" %>
<% ArrayList<Typeprestation> listTypePrestation = (ArrayList<Typeprestation>) request.getAttribute("listTypePrestation");
    ArrayList<V_lieu> listLieu = (ArrayList<V_lieu>) request.getAttribute("listLieu");
%>
<!doctype html>
<jsp:include page='header.jsp'/>
<title>AjoutDevisSpectacle</title>

<section class="contact-section section-padding pt-0">
    <div class="container">
        <div class="row">

            <div class="col-lg-8 col-12 mx-auto">
                <div class="section-title-wrap mb-5">
                    <h4 class="section-title">Ajout devis spectacle</h4>
                </div>

                <form action="formDevisSpectcleSuivant" method="post" class="custom-form contact-form" role="form">
                    <div class="row">
                        <div class="col-lg-12 col-12">
                            <div class="form-floating">
                                <input type="date" name="date" id="name" class="form-control"
                                       placeholder="Date du spectacle" required="">

                                <label for="floatingInput">Date du spectacle</label>
                            </div>

                            <div class="form-floating">
                                <input type="time" name="heure" id="name" class="form-control"
                                       placeholder="Heure du spectacle" required="">

                                <label for="floatingInput">Heure du spectacle</label>
                            </div>
                            <div class="form-floating">
                                <input type="text" name="nom" id="name" class="form-control"
                                       placeholder="Titre prestation" required="">

                                <label for="floatingInput">Titre spectacle</label>
                            </div>

                        </div>

                        <div class="col-lg-4 col-12">
                            <div class="form-floating">
                                <select name="type" class="form-select" required="">
                                    <option value="0">Type du prestation</option>
                                    <% for (int i = 0; i < listTypePrestation.size(); i++) {%>
                                    <option value="<%= listTypePrestation.get(i).getId()%>"><%= listTypePrestation.get(i).getType()%></option>
                                    <%}%>
                                </select>
                            </div>
                        </div>

                        <div class="col-lg-4 col-12">
                            <div class="form-floating">
                                <select name="lieu" class="form-select" required="">
                                    <option value="0">Nom du lieu </option>
                                    <% for (int j = 0; j < listLieu.size(); j++) {%>
                                    <option value="<%= listLieu.get(j).getId()%>"><%= listLieu.get(j).getNom()%>-<%= listLieu.get(j).getVille()%></option>
                                    <%}%>
                                </select>
                            </div>
                        </div>

                        <div class="col-lg-4 col-12">
                            <div class="form-floating">
                                <input type="number" name="tarifLieu" id="name" class="form-control"
                                       placeholder="Tarif du lieu" required="">

                                <label for="floatingInput">Tarif du lieu</label>
                            </div>
                        </div>
                        <div class="col-lg-4 col-12 ms-auto">
                            <button type="submit" class="form-control">Suivant</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>
</main>

<jsp:include page='footer.jsp'/>



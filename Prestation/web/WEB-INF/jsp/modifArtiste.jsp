<%-- 
    Document   : modifArtiste
    Created on : Jun 19, 2023, 3:08:27 PM
    Author     : Kanto
--%>

<%@page import="java.util.*"%>
<%@ page import="model.*" %>
<% ArrayList<Unite> listUnite = (ArrayList<Unite>) request.getAttribute("listUnite");
 ArrayList<Artiste> listArtiste = (ArrayList<Artiste>) request.getAttribute("listArtiste");
 int id = (Integer) request.getAttribute("id");
%>
<!doctype html>
<jsp:include page='header.jsp'/>
<title>ModifArtiste</title>

<section class="contact-section section-padding pt-0">
    <div class="container">
        <div class="row">

            <div class="col-lg-8 col-12 mx-auto">
                <div class="section-title-wrap mb-5">
                    <h4 class="section-title">Modification artiste</h4>
                </div>

                <form action="modifArtiste" method="post" class="custom-form contact-form" role="form">
                    <div class="row">
                        <div class="col-lg-12 col-12">
                            <div class="form-floating">
                                <input type="text" name="nom" id="name" class="form-control" 
                                    value="<%= listArtiste.get(0).getNom()%>"   placeholder="<%= listArtiste.get(0).getNom()%>" required="">

                                <label for="floatingInput">Nom</label>
                            </div>

                        </div>

                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <input type="number" name="tarif" id="name" class="form-control"
                                    value="<%= listArtiste.get(0).getTarif()%>"   placeholder="<%= listArtiste.get(0).getTarif()%>" required="">

                                <label for="floatingInput">Tarif</label>
                            </div>
                        </div>

                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <input type="number" name="duree" id="name" class="form-control"
                                    value="<%= listArtiste.get(0).getDuree()%>"   placeholder="<%= listArtiste.get(0).getDuree()%>" required="">

                                <label for="floatingInput">Duree</label>
                            </div>
                        </div>
                                    <input type="hidden" name="id" value="<%= id %>">
                        <div class="col-lg-4 col-md-6 col-12">
                            <div class="form-floating">
                                <select name="unite" class="form-select" required="">
                                    <option value="0">Unite</option>
                                    <% for(int i=0;i<listUnite.size();i++){%>
                                    <option value="<%= listUnite.get(i).getId()%>"><%= listUnite.get(i).getUnite()%></option>
                                    <%}%>
                                </select>
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


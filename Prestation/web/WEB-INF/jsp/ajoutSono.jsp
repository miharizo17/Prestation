<%-- 
    Document   : ajoutSono
    Created on : Jun 19, 2023, 4:26:03 PM
    Author     : Kanto
--%>

<%@page import="java.util.*"%>
<%@ page import="model.*" %>
<% ArrayList<Unite> listUnite = (ArrayList<Unite>) request.getAttribute("listUnite");
    ArrayList<Typesonorisation> listSono = (ArrayList<Typesonorisation>) request.getAttribute("listSono");
%>
<!doctype html>
<jsp:include page='header.jsp'/>
<title>AjoutSono</title>

<section class="contact-section section-padding pt-0">
    <div class="container">
        <div class="row">

            <div class="col-lg-8 col-12 mx-auto">
                <div class="section-title-wrap mb-5">
                    <h4 class="section-title">Ajouter un sonorisation</h4>
                </div>

                <form action="ajoutSono" method="post" class="custom-form contact-form" role="form">
                    <div class="row">
                        <div class="col-lg-3 col-md-6 col-12">
                            <div class="form-floating">
                                <select name="type" class="form-select" required="">
                                    <%for (int i = 0; i < listSono.size(); i++) {%>
                                    <option value="<%= listSono.get(i).getId()%>"><%= listSono.get(i).getType()%></option>
                                    <%}%>
                                </select>
                            </div>
                        </div>

                        <div class="col-lg-3 col-md-6 col-12">
                            <div class="form-floating">
                                <input type="number" name="tarif" id="name" class="form-control"
                                       placeholder="Tarif" required="">

                                <label for="floatingInput">Tarif</label>
                            </div>
                        </div>

                        <div class="col-lg-3 col-md-6 col-12">
                            <div class="form-floating">
                                <input type="number" name="duree" id="name" class="form-control"
                                       placeholder="Duree" required="">

                                <label for="floatingInput">Duree</label>
                            </div>
                        </div>

                        <div class="col-lg-3 col-md-6 col-12">
                            <div class="form-floating">
                                <select name="unite" class="form-select" required="">
                                    <option value="0">Unite</option>
                                    <% for (int j = 0; j < listUnite.size(); j++) {%>
                                    <option value="<%= listUnite.get(j).getId()%>"><%= listUnite.get(j).getUnite()%></option>
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



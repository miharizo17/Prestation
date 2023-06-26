<%-- 
    Document   : ajoutLieu
    Created on : Jun 19, 2023, 8:29:57 PM
    Author     : Kanto
--%>
<%@page import="java.util.*"%>
<%@ page import="model.*" %>
<% ArrayList<Ville> listVille = (ArrayList<Ville>) request.getAttribute("listVille");
    ArrayList<Typelieu> listeTypeLieu = (ArrayList<Typelieu>) request.getAttribute("listeTypeLieu");
    ArrayList<Categorieplace> listCategorie = (ArrayList<Categorieplace>) request.getAttribute("listCategorie");
%>
<!doctype html>
<jsp:include page='header.jsp'/>
<title>AjoutLieu</title>

<section class="contact-section section-padding pt-0">
    <div class="container">
        <div class="row">

            <div class="col-lg-8 col-12 mx-auto">
                <div class="section-title-wrap mb-5">
                    <h4 class="section-title">Ajouter lieu</h4>
                </div>

                <form action="ajoutLieu" method="post" class="custom-form contact-form" role="form" enctype="multipart/form-data">
                    <div class="row">

                        <div class="col-lg-12 col-12">
                            <div class="form-floating">
                                <input type="text" name="nom" id="name" class="form-control"
                                       placeholder="Nom" required="">

                                <label for="floatingInput">Nom</label>
                            </div>
                        </div>
                        <div class="col-lg-12 col-12">
                            <div class="form-floating">
                                <input type="file" name="file" class="form-control" multiple="multiple" />
                            </div>
                        </div>
                        <div class="col-lg-6 col-12">
                            <div class="form-floating">
                                <input type="text" name="nbrpersonne" id="name" class="form-control"
                                       placeholder="Nombre de personnes" required="" disabled="true">

                                <label for="floatingInput">Nombre de personnes</label>
                            </div>
                        </div>
                        <div class="col-lg-6 col-12">
                            <div class="form-floating">
                                <input type="number" name="nbrpersonne" id="name" class="form-control"
                                       placeholder="Nombre de personnes" required="">


                            </div>
                        </div>
                        <%for (int k = 0; k < listCategorie.size(); k++) {%>
                        <div class="col-lg-6 col-12">
                            <div class="form-floating">
                                <input type="text"  id="name" class="form-control"
                                       placeholder="Nombre <%= listCategorie.get(k).getCategorie()%>" required="" disabled="true">

                                <label for="floatingInput">Nombre <%= listCategorie.get(k).getCategorie()%></label>
                            </div>
                        </div>
                        <div class="col-lg-6 col-12">
                            <div class="form-floating">
                                <input type="number" name="nbrReserve<%= k%>" id="name" class="form-control"
                                       placeholder="" required="">

                                <label for="floatingInput"></label>
                            </div>
                        </div>
                        <%}%>
                        <div class="col-lg-6 col-md-6 col-12">
                            <div class="form-floating">
                                <select name="type" class="form-select" required="">
                                    <option value="0">Type du lieu</option>
                                    <%for (int j = 0; j < listeTypeLieu.size(); j++) {%>
                                    <option value="<%= listeTypeLieu.get(j).getId()%>"><%= listeTypeLieu.get(j).getType()%></option>
                                    <%}%>
                                </select>
                            </div>
                        </div>

                        <div class="col-lg-6 col-md-6 col-12">
                            <div class="form-floating">
                                <select name="ville" class="form-select" required="">
                                    <option value="0">Nom Ville</option>
                                    <%for (int i = 0; i < listVille.size(); i++) {%>
                                    <option value="<%= listVille.get(i).getId()%>"><%= listVille.get(i).getVille()%></option>
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




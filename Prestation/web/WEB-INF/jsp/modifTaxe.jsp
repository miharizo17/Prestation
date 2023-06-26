<%-- 
    Document   : modifTaxe
    Created on : Jun 21, 2023, 8:43:34 AM
    Author     : Kanto
--%>

<%@page import="java.util.*"%>
<%@ page import="model.*" %>
<% ArrayList<Taxe> listTaxe = (ArrayList<Taxe>) request.getAttribute("listTaxe");
int id =(Integer) request.getAttribute("id");
%>
<!doctype html>
<jsp:include page='header.jsp'/>
<title>ModifTaxe</title>

<section class="contact-section section-padding pt-0">
    <div class="container">
        <div class="row">

            <div class="col-lg-8 col-12 mx-auto">
                <div class="section-title-wrap mb-5">
                    <h4 class="section-title">Modification taxe</h4>
                </div>

                <form action="modifTaxe" method="post" class="custom-form contact-form" role="form">
                    <div class="row">
                        <div class="col-lg-12 col-12">
                            <div class="form-floating">
                                <input type="number" name="taxe" id="name" class="form-control"
                                       placeholder="Taxe" required="" value="<%= listTaxe.get(0).getTaxe()%>">

                                <label for="floatingInput">Taxe</label>
                                <input type="hidden" value="<%= id %>" name="id">
                            </div>
                        </div>
                        <div class="col-lg-4 col-12 ms-auto">
                            <button type="submit" class="form-control">Modifier</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</section>
</main>

<jsp:include page='footer.jsp'/>

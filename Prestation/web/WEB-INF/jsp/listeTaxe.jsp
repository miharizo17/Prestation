<%-- 
    Document   : listeTaxe
    Created on : Jun 21, 2023, 8:36:43 AM
    Author     : Kanto
--%>

<%@page import="java.util.*"%>
<%@ page import="model.*" %>
<% ArrayList<Taxe> listtaxe = (ArrayList<Taxe>) request.getAttribute("listtaxe");
%>
<jsp:include page='header.jsp'/>
<title>ListeTaxe</title>

<section class="contact-section section-padding pt-0">
    <div class="container">
        <div class="row">

            <div class="col-lg-8 col-12 mx-auto">
                <div class="section-title-wrap mb-5">
                    <h4 class="section-title">Liste taxe</h4>
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
                     <th>Taxe</th>
                </tr>
                <%for (int i = 0; i < listtaxe.size(); i++) {%>
                <tr>
                    <td><%= listtaxe.get(i).getTaxe()%> </td>
                    
                    <td><a href="formModifTaxe?idModif=<%= listtaxe.get(i).getId()%>">Modifier</a></td>
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
                <%if (listtaxe.size() == limit) {%>
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
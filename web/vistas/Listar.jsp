<%-- 
    Document   : Listar
    Created on : 24/10/2020, 11:15:38 a.m.
    Author     : Josue
--%>

<%@page import="java.util.Iterator"%>
<%@page import="Modelo.Personas"%>
<%@page import="java.util.List"%>
<%@page import="ModeloDAO.PersonasDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista De Persona</title>
    </head>
    <style>
        
        h1{
            text-align: center;
        }
        
        table{ 
            position: relative;
            left: 500px;
        }
    </style>
    <body>
        <div> 
            <h1>Lista De Personas</h1>
            
            <table border="1">
                <thead>
                    <tr>
                        <th>Id</th>
                        <th>Documento</th>
                        <th>Nombres</th>
                        <th>Apellidos</th>
                        <th>Edad</th>
                        <th>Acciones</th>
                    </tr>
                </thead>
                <%
                    PersonasDAO dao=new PersonasDAO();
                    List<Personas>List=dao.Listar();
                    Iterator<Personas>iter=List.iterator();
                    Personas per=null;
                    while (iter.hasNext()){
                        per=iter.next();      
                %>
                <tbody>
                    <tr>
                        <th><%= per.getId()%></th>
                        <th><%= per.getDocumento()%></th>
                        <th><%= per.getNombres()%></th>
                        <th><%= per.getApellidos()%></th>
                        <th><%= per.getEdad()%></th>
                        <th>
                            <a>Editar</a>
                            <a>Eliminar</a>
                        </th>
                    </tr>
                    <% 
                        }
                    %>
                </tbody>
            </table>
            
            
        </div>
    </body>
</html>

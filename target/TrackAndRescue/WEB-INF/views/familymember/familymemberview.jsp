<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.sql.DriverManager" %><%--
  Created by IntelliJ IDEA.
  User: abhinacharya
  Date: 7/4/20
  Time: 3:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Family GUI</title>
    <link rel="stylesheet" href="https://unpkg.com/leaflet@1.7.1/dist/leaflet.css" />
    <script src="https://unpkg.com/leaflet@1.7.1/dist/leaflet.js"></script>
    <script >
        setTimeout(function(){
            window.location.reload(1);
        }, 10000);
    </script>
    <style type="text/css">
        #map{
            height: 600px;
            width: auto;
        }
    </style>
</head>
<body>
<c:set var = "islocation" scope = "session" value = "${location}"/>
<c:if test="${islocation==1}">
    ${usercoordinates.xCoordinates}
    ${usercoordinates.yCoordinates}

</c:if>
<c:if test="${islocation==0}">
    ${inactive}
</c:if>
<%--<c: if(${location==1}){/>--%>
<%--${usercoordinates.xCoordinates};--%>
<%--${usercoordinates.yCoordinates};--%>
<%-- <c: }else{--%>
<%--    ${inactive};--%>
<%--    }/>--%>

<%--${uid}--%>

<%--<%--%>
<%--    String driverName = "com.mysql.jdbc.Driver";--%>
<%--    String connectionUrl = "jdbc:mysql://localhost:3306/";--%>
<%--    String dbName = "TrackAndRescue";--%>
<%--    String userId = "trackandrescue";--%>
<%--    String password = "trackandrescue";--%>

<%--    try {--%>
<%--        Class.forName(driverName);--%>
<%--    } catch (ClassNotFoundException e) {--%>
<%--        e.printStackTrace();--%>
<%--    }--%>

<%--    Connection connection = null;--%>
<%--    Statement statement = null;--%>
<%--    ResultSet resultSet = null;--%>

<%--%>--%>
<%--<h1>Family Member View</h1>--%>
<%--<div>--%>


<%--    <%--%>
<%--        try {--%>
<%--            connection = DriverManager.getConnection(--%>
<%--                    connectionUrl + dbName, userId, password);--%>
<%--            statement = connection.createStatement();--%>
<%--            String sql = "SELECT * FROM user_coordinates";--%>

<%--            resultSet = statement.executeQuery(sql);--%>
<%--            while (resultSet.next()) {--%>
<%--    %>--%>
<%--    <%String uID=resultSet.getString("uid");--%>
<%--    String active=resultSet.getString("active");--%>
<%--    if (uID.equals("34")){--%>
<%--        if(active.equals("1")){--%>
<%--    %>--%>

<%--        <h1><%=resultSet.getString("id")%></h1>--%>
<%--        <h2><%=resultSet.getString("x-coordinates")%></h2>--%>
<%--        <h2><%=resultSet.getString("y-coordinates")%></h2>--%>

<%--&lt;%&ndash;<c:if test="${(nm == 'deepak') && (psw == 'deepak')}"> eg ho hae yo&ndash;%&gt;--%>



<%--    <%--%>
<%--            }else{--%>
<%--                out.println("oops!! Location Sharing has been Stopped");--%>

<%--            %>--%>
<%--              <h1>oops!! Location Sharing has been Stopped</h1>--%>

<%--&lt;%&ndash;mathi ra yo ma j garda ne hunxa&ndash;%&gt;--%>
<%--   <%  }--%>
<%--            }--%>
<%--            }--%>

<%--        } catch (Exception e) {--%>
<%--            e.printStackTrace();--%>
<%--        }--%>

<%--    %>--%>






<%--</div>--%>

<div id="map"></div>
<%@include file="../footer.jsp"%>
<script>
    let map = L.map('map').setView([${usercoordinates.xCoordinates},${usercoordinates.yCoordinates}], 20);
    L.tileLayer('https://api.maptiler.com/maps/streets/{z}/{x}/{y}.png?key=gRfDOw9mrfxrXq2cRfWt',{
        attribution: '<a href="https://www.maptiler.com/copyright/" target="_blank">&copy; MapTiler</a> <a href="https://www.openstreetmap.org/copyright" target="_blank">&copy; OpenStreetMap contributors</a>'
    }).addTo(map);

    let marker = L.marker([${usercoordinates.xCoordinates}, ${usercoordinates.yCoordinates}]).addTo(map);
</script>
</body>
</html>







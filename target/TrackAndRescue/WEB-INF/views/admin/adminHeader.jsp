<%--
  Created by IntelliJ IDEA.
  User: Maria Dhakal
  Date: 9/11/2020
  Time: 2:16 PM
  To change this template use File | Settings | File Templates.
--%>
<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
    <div class="container">
        <a class="navbar-brand" href="#">
            <img src="${pageContext.request.contextPath}/resources/img/logo1.png"  class="rounded-circle" alt="Responsive image">
        </a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
            <span class="navbar-toggler-icon"></span>

        </button>
        <div class="collapse navbar-collapse" id="collapsibleNavbar">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href="http://localhost:8080/TrackAndRescue/">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="addCustomer">Add Customer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="viewcustomer">View Customer</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="addPoliceStation">Add PoliceStation</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="viewpolicestation">View PoliceStation</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="adddevice">Add Device</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="viewdevices">View Device</a>
                </li>


            </ul>
        </div>
    </div>
</nav>

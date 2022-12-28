<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <base href="${pageContext.request.contextPath}/"/>
    <script>
        function fenye(curPage) {
            location.href="user/list?curPage="+curPage+"&username="+document.getElementById("username").value;
        }
        function update(id) {
            location.href="user/findById/"+id;
        }
        function del(id) {
            if (confirm("你确认删除吗?")){
                location.href="user/del/"+id;
            }
        }
    </script>
</head>
<body>
<table border="1" cellspacing="0" cellpadding="5">
    <tr>
        <th>序号</th>
        <th>用户名</th>
        <th>密码</th>
        <th>姓名</th>
        <th>手机</th>
        <th>地址</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="u">
        <tr>
            <td>${u.id}</td>
            <td>${u.username}</td>
            <td>${u.password}</td>
            <td>${u.name}</td>
            <td>${u.phone}</td>
            <td>${u.addr}</td>
            <td>
                <a href="/user/findById/${u.id}">修改</a>
                <a href="/user/del/${u.id}">删除</a>
            </td>
        </tr>
    </c:forEach>
    <tr>
        <td colspan="10">
            <button onclick="fenye(1)">首页</button>
            <button onclick="fenye(${page.prePage})">上一页</button>
            <button onclick="fenye(${page.nextPage})">下一页</button>
            <button onclick="fenye(${page.pages})">尾页</button>
        </td>
    </tr>
</table>
</body>
</html>

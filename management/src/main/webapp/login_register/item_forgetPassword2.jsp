<%--
  Created by IntelliJ IDEA.
  User: 沐沐
  Date: 2019/5/9
  Time: 19:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>重置密码</title>
    <style >
      /*  .mybody {
            background: url(../asserts/images/sign.jpg) no-repeat;
            background-size: 100% 100%;
            font-family: 微软雅黑;
        }*/
        input{
            height:30px;
            width:250px;
            padding-right:50px;
            background:white;
        }
        #myBtn {
            background-color: #ACCD3C;
            border: none;
            width: 250px;
            height: 30px;
        }
    </style>

    <script src="${pageContext.request.contextPath}/js/jquery.min.1.10.1.js"></script>
    <script>
        $(function(){
            $("#myBtn").click(function () {
                var url = "${pageContext.request.contextPath}/pwd/reSet";
                // alert(url);
                $.ajax(url,{
                    type:'post',
                    data:{
                        admName:$("#admName").val(),
                        admPasswordOne:$("#admPasswordOne").val(),
                        admPasswordTwo:$("#admPasswordTwo").val()
                    },
                    success:function (data) {
                        if(data && data.success){
                            alert("修改成功，将跳转到登录界面....")
                            window.location.href = "${pageContext.request.contextPath}/login.jsp";
                            return;
                        }else{
                            alert(data.msg);
                        }
                    }
                })
            });
        })
    </script>
</head>

<body class="mybody">
<span>
    <a href="${pageContext.request.contextPath}/login.jsp" style="color:black"><h2>首页</h2></a>
</span>
<div style="margin-bottom: 100px;">
    <h1 style="text-align: center; margin-top: 100px;color: white; text-shadow: 0px 1px 0px #999, 0px 2px 0px #888, 0px 3px 0px #777, 0px 4px 0px #666, 0px 5px 0px #555, 0px 6px 0px #444, 0px 7px 0px #333, 0px 8px 7px #001135;" ></h1>

    <%--margin: auto; argin-bottom:40px;--%>
    <div style="width: 30em;height: 350px; margin-top: 40px;margin: auto;;
               background:rgba(255,255,255,0.3);" >
        <br/><br/><br/>

        <div style="margin:auto;margin-left: 120px">
            <div>
                <h3>重置密码</h3>
            </div>
            <%--2--%>
            <div>
                <span style="margin-top: 5px;margin-bottom: 15px">
                    <h3>用户名</h3>
                    <input id="admName" type="text"/>
                    <span style="position:absolute;right:18px;top:2px;height:16px;width:16px;display:inline-block;" ></span>
                </span>
            </div>
            <%--5--%>
            <div style="margin-top: 10px">
                <span style="margin-top: 5px;margin-bottom: 15px">
                    <h3>重置密码：</h3>
                    <input id="admPasswordOne" type="text">
                    <span style="position:absolute;right:18px;top:2px;height:16px;width:16px;display:inline-block;" ></span>
                </span>
            </div>

            <div style="margin-top: 10px">
                <span style="margin-top: 5px;margin-bottom: 15px">
                    <h3>确认密码：</h3>
                    <input id="admPasswordTwo" type="text">
                    <span style="position:absolute;right:18px;top:2px;height:16px;width:16px;display:inline-block;" ></span>
                </span>
            </div>

            <div>
                <br/>
                <button id="myBtn">确定</button>
            </div>

        </div>
    </div>
</div>


</body>
</html>
